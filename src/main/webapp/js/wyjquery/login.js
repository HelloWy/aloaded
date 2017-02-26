/**
 * 登录
 */
$.ajaxSetup({
	cache : false,
	async : false,
	type : 'POST',
	dataType : 'json',
	contentType : 'application/json'
});

$.extend({
	login : function() {
		$("#submitBtn").click(
				function() {
					var username = $.trim($("#adminName").val());
					var password = $("#password").val();
					var type = $("input:[name='type']:checked").val();
					if(type == null || type == ""|| type==undefined){
						type = "0";
					}
					if (username == "") {
						ymPrompt.alert({
							title : "登录提示",
							message : "账号不能为空，请输入您的账号！",
							width : 320,
							heigth : 80,
							handler : function(tp) {
								if (tp == 'ok' || tp == 'close') {
									$("#adminName").focus();
								}
							}
						});
						return false;
					}
					if (password == "") {
						ymPrompt.alert({
							title : "登录提示",
							message : "密码不能为空，请输入您的密码！",
							width : 320,
							heigth : 80,
							handler : function(tp) {
								if (tp == 'ok' || tp == 'close') {
									$("#password").focus();
								}
							}
						});
						return false;
					}
					var opts = "{\"username\":\"" + username
							+ "\",\"password\":\"" + password
							+ "\",\"type\":\"" + type + "\"}";
//					 alert(opts);
					$.post("login.do", opts, function(msg) {
//						alert(msg);
						if (msg == "null") {
							ymPrompt.alert({
								title : "登录提示",
								message : "账号错误（不存在）！",
								width : 320,
								heigth : 80,
								handler : function(tp) {
									if (tp == 'ok' || tp == 'close') {
										$("#adminName").attr("value", "");
										$("#password").attr("value", "");
										$("#adminName").focus();
									}
								}
							});
							return false;
						} else if (msg == "fail") {
							ymPrompt.alert({
								title : "登录提示",
								message : "输入的密码不正确，请重新输入！",
								width : 320,
								heigth : 80,
								handler : function(tp) {
									if (tp == 'ok' || tp == 'close') {
										$("#adminName").attr("value", "");
										$("#password").attr("value", "");
										$("#password").focus();
									}
								}
							});
							return false;
						} else {
							if (type == "1") {
								location.href = "main.do";
							} else if(type == "0"){
								location.href = "uMain.do";
							}
						}
					});
				});
	}
});