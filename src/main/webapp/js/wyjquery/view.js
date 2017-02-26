/**
 * Created by WyFss on 2016/5/23.
 */
/**
 * 视图列表数据
 */
var loadViewData = function(_this, opts) {
	window.opts = opts;
	// 保存接受到的json数据
//	var json = eval("(" + jsonStr + ")");
	var jsonStr ;
	// 得到页面信息
	var jsonPage ;
	// 得到需要搜索的条件
	var jsonUnit;
	//填充传递给后台的json数据
	var searchJson = $.toJSON($("#"+opts.searchFastForm+"").serializeObject());
	var paramsJson = $.toJSON($.extend({},opts.pager,$.parseJSON(searchJson)));
	
	// 填充表中的数据
	var containers = "<thead><tr>";
	// 填充th
	if (opts.orderNum) {
		containers += "<th>序号<i class=\"sort\"><img src=\"../images/px.gif\" /></i></th>";
	}
	$.each(opts.colNames, function(key, value) {
		if (value != "") {
			containers += "<th>" + value + "</th>";
		}
	});
	if (opts.operateState) {
		containers += "<th>操作</th>";
	}
	containers += "</tr></thead>";
	// 得到list中的各个对象，并对其进行操作
	// 填充tbody
	$.post(opts.viewUrl,paramsJson,function(rs){
		jsonStr = eval("(" + rs + ")");
		jsonPage = jsonStr.pageInfo;
		var data = jsonPage.list;
		if (data != null) {
			$.each(jsonPage.list,function(key, item) {
								containers += "<tr>";
								// 判断是否有序号列
								if (opts.orderNum) {
									containers += "<td>" + (key + 1) + "</td>";
								}
								// 为列表中每行进行数据填充
								$.each(opts.colModels, function(i, o) {
									if (item["" + o.name + ""] == undefined) {
										containers += "<td>无</td>";
									} else {
										containers += "<td>"
												+ item["" + o.name + ""] + "</td>";
									}
								});
								// 判断是否有操作列
								containers += "<td>";
								if (opts.operateState) {
									$.each(opts.operate,function(key, operate) {
														//详情
														if (operate == "modify") {
															containers += "<a href=\"javascript:modifyClick('"+item.id+"');\" class=\"tablelink seeStuInfo\">详情</a>";
														}
														//回复
														if (operate == "reply") {
															containers += "<a href=\"javascript:modifyClick('"+item.id+"');\" class=\"tablelink seeStuInfo\">回复</a>";
														}
														//删除
														if (operate == "delete") {
															containers += "<a href=\"javascript:deleteClick('"+item.id+"');\" class=\"tablelink deletStu\"> 删除</a>";
														}
													})
								}
								containers += "</td>";
								containers += "</tr>";
							});
		}
	});
	_this.empty();
	$(containers).appendTo(_this);
	
	// 添加底部导航页码
	if (jsonPage.total != 0) {
		var op = {
			total : jsonPage.total,
			pageNum : jsonPage.pageNum,
			hasPreviousPage : jsonPage.hasPreviousPage,
			hasNextPage : jsonPage.hasNextPage,
			navigatepageNums : jsonPage.navigatepageNums,
			prePage : jsonPage.prePage,
			nextPage : jsonPage.nextPage,
			callback : function(pageIndex) {
				var page = parseInt(pageIndex);
				opts.pager.page = page;
				loadViewData(_this,opts);
			}
		};
		$("#pager").loadPager(op);
	}
};