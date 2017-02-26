/**
 * Created by WyFss on 2016/5/24.
 */
(function($) {
	$.ajaxSetup({
		type : 'POST',
		dataType : 'json',
		contentType : 'application/json',
		cache : false,
		async : false
	});
	$.parameter = function(opts) {
		this.opts = opts;
	};
	$.extend($.parameter.prototype, {
		searchFastViewList : function(_this) {
			var options = this.opts;
			$("#" + options.searchFastBtn + "").click(function() {
				options.pager.page = 1;
				options.callback();
			});
		},
		saveOrModifyClick : function(_this, opts) {
			var _form = $(_this).attr("id");
			if (opts.submitBtn != undefined) {
				checkForm(_form);
			}
			$("#" + opts.submitBtn + "").click(function() {
				submitData(_this, opts, _form);
			});
		},
		backClick : function() {
			var options = this.opts;
			$("#" + options.backBtn + "").click(function() {
				location.href = options.returnUrl;
			});
		},
		closeClick : function() {
			var options = this.opts;
			$("#" + options.closeBtn + "").click(function() {
				window.parent.ymPrompt.doHandler('', true);
			});
		},
		addClick:function(){
			var options = this.opts;
			$("#"+options.addBtn+"").click(function(){
				if(options.openState){
					ymPrompt.win({
						title : options.winTitle,
						fixPosition : true,
						maxBtn : false,
						minBtn : false,
						width : options.winWidth,
						height : options.winHeight,
						winPos : options.winPos,
						message : options.addUrl,
						iframe : true
					});
				}else{
					location.href = options.addUrl;
				}
			});
		}
	});
	
	//删除点击
	window.deleteClick = function(formId){
		var options = window.opts;
		var winUrl = options.deleteUrl;
		var index = winUrl.indexOf("?");
		if(index != -1){
			winUrl += "&id="+formId;
		}else{
			winUrl += "?id="+formId;
		}
		ymPrompt.confirmInfo({title:"操作确认提示框",message:"您确定要删除选中项吗？",width:280,height:160,handler:function(tp){
			
		   if(tp=='ok'){
			   $.post(winUrl,function(msg){
				   if(msg == "success"){
					   ymPrompt.succeedInfo({title:"操作成功",message:"操作成功！",width:280,height:160,handler:function(tp){
						   if(tp=='ok' || tp=='close'){
							   loadLocalPath(opts.returnUrl);
						   }
					   }});
				   }else if(msg == "faild"){
						ymPrompt.alert({title:"温馨提示",message:"操作失败，请重新操作！",width:280,height:160});
					}else{
						ymPrompt.alert({title:"温馨提示",message:"系统异常，请联系管理员！",width:280,height:160});
					}
			   });
		    }else{
		    	return false;
		    }
		}});
	};
	
	window.modifyClick = function(formId) {
		var options = window.opts;
		var winUrl = options.editorUrl;
		var index = winUrl.indexOf("?");
		var searchJson = $("#" + opts.searchFastForm + "").serializeObject();

		if (index != -1) {
			winUrl += "&id=" + formId;
		} else {
			winUrl += "?id=" + formId;
		}
		if (options.editorFrom) {
			for ( var item in searchJson) {
				var attr = searchJson[item];
				winUrl += "&" + item + "=" + attr;
			}
		}
		// alert(winUrl);
		if (options.openState) {
			ymPrompt.win({
				title : options.winTitle,
				fixPosition : true,
				maxBtn : false,
				minBtn : false,
				width : options.winWidth,
				height : options.winHeight,
				winPos : options.winPos,
				message : winUrl,
				iframe : true
			});
		} else {
			location.href = winUrl;
		}
	};
	// 编辑信息
	$.fn.loadEditData = function(opts) {
		loadEditMotion(this, opts);
		if (opts.formId != "") {
			var item = loadDetailData(opts);
			jsonToForm(item);
		}
	};
	var loadDetailData = function(opts) {
		var item = null;
		var detailUrl = opts.detailUrl;
		if (detailUrl != undefined) {
			var index = detailUrl.indexOf("?");
			if (index != -1) {
				detailUrl += "&id=" + opts.formId;
			} else {
				detailUrl += "?id=" + opts.formId;
			}
			$.getJSON(detailUrl, function(result) {
				item = result;
			});
			return item;
		}
	};
	var jsonToForm = function(item) {
		for ( var key in item) {
			var val = item[key] == null ? "" : item[key];
			if ($("[name=" + key + "]").get(0) != null) {
				var tag = $("[name=" + key + "]").get(0).tagName;
				if (tag == "INPUT") {
					var elemType = $("input[name='" + key + "']").attr("type");
					switch (elemType) {
					case "radio":
						$("input[name='" + key + "'][value='" + val + "']")
								.attr("checked", true);
						break;
					case "checkbox":
						var checkboxObj = $("input[name='" + key
								+ "']:checkbox");
						if (val != null) {
							$.each(val, function(i, o) {
								for (var i = 0; i < checkboxObj.length; i++) {
									if (checkboxObj[i].value == o) {
										checkboxObj[i].checked = true;
									}
								}
								;
							});
						}
						break;
					default:
						$("#" + key + "").attr("value", val);
						break;
					}
				}
				if (tag == "SELECT") {
					if ($("#" + key + " option[value='" + val + "']").length > 0) {
						$("#" + key + " option[value='" + val + "']").attr(
								"selected", "selected");
					} else {
						$("#" + key).append("<option>" + val + "</option>");
					}
				}
				if (tag == "TEXTAREA") {
					$("#" + key + "").text(val);
				}
				if (tag == "SPAN") {
					$("#" + key + "").text(val);
				}
				if (tag == "DIV") {
					$("#" + key + "").html(val);
				}
			}
		}
	};

	var loadViewMotion = function(_this, opts) {
		var evt = new $.parameter(opts);
		evt.searchFastViewList(_this);// 快速搜索事件
		evt.addClick();// 添加事件
	}

	var loadEditMotion = function(_this, opts) {
		var evt = new $.parameter(opts);
		evt.saveOrModifyClick(_this, opts);// 保存OR修改事件
		if (opts.openState) {
			evt.closeClick();// 关闭事件
		} else {
			evt.backClick();// 返回事件
		}
		if (opts.sel != undefined) {
			initSel(opts.sel);
		}
	};

	// 列表信息
	$.fn.loadViewList = function(opts) {
		loadViewMotion(this, opts);
		loadViewData(this, opts);
		var _this = $("#" + $(this).attr("id") + "");
		opts.callback = function() {
			loadViewData(_this, opts);
		};
	};

	var submitData = function(_this, opts, _form) {
		if (checkAll(_form)) {
			var jsonData = $.toJSON($(_this).serializeObject());
			// alert(jsonData);
			$.post(opts.submitUrl, jsonData, function(msg) {
				if (msg == "success") {
					ymPrompt.succeedInfo({
						title : "温馨提示",
						message : "恭喜您！操作成功！",
						showShadow : false,
						width : 280,
						height : 150,
						handler : function(tp) {
							if (tp == 'ok' || tp == 'close') {
								if (opts.openState) {
									window.parent.ymPrompt.doHandler('', true);
									loadLocalPath(opts.returnUrl);
								} else {
									if (opts.logout) {
										top.location.href = opts.returnUrl;
									}else{
										location.href = opts.returnUrl;
									}
								}
							}
						}
					});
				} else if (msg == "faild") {
					ymPrompt.alert({
						title : "温馨提示",
						message : "操作失败，请重新操作！",
						width : 280,
						height : 160
					});
				} else {
					ymPrompt.alert({
						title : "温馨提示",
						message : "系统异常，请联系管理员！",
						width : 280,
						height : 160
					});
				}
			});
		}
	};
})(jQuery);