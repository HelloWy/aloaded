var Validator = {
	NotNull : /^[\s\S]+$/, // 非空
	Email : /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/, // 邮箱地址
	Zip : /^\d{6}$/, // 邮编
	Tel : /^(\d{3,4})\-\d{7,8}$/, // 带区号-固定电话
	Phone : /^(1[3|5|8])\d{9}$/, // 手机号
	Card : /^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])(\d{3}[\d|\w]{1})$/, // 18/15位身份证号
	/*Card : /^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])(\d{3}[\d|\w]{1})$|^[1-9]\d{5}\d{2}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])(\d{2}[\d|\w]{1})$/, // 18/15位身份证号*/
	Number : /^(\-)?\d+$/, // 整数 
	Float : /^(\-)?(\d+\.)\d{1,2}$/, // 两位小数
	Date : /^\d{4}(\-\d{2})(\-\d{2})$/, // 日期
	Time : /^\d{4}(\-\d{2})(\-\d{2})(\s\d{2})(\:\d{2})$/, // 日期时间
	Chinese : /^[\u4e00-\u9fa5]{2,6}$/, // 中文字符
	OldPwd : /^.{6,32}$/, // 6到32位字符
	NewPwd : /^.{6,32}$/ // 6到32位字符
};

var ValidatorText = {
	NotNull : "输入内容不能为空",
	Email : "请输入有效的邮箱地址",
	Zip : "请输入正确的邮编",
	Tel : "格式：0371-12345678",
	Phone : "请输入有效手机号码",
	Card : "请输入正确的身份证号码",
	Number : "请输入整数",
	Float : "请输入小数",
	Chinese : "请输入您的姓名",
	Date : "请输入正确的日期格式",
	Time : "请输入正确的时间格式",
	OldPwd : "请输入原始密码",
	NewPwd : "密码长度最少不能少于6位",
	Only : "输入内容已存在，请重新输入",
	Right : "输入内容不存在，请重新输入",
	CheckOnly : "已存在，请重新输入",
	CheckRight : "不正确，请重新输入"
};

$.ajaxSetup({
	cache : false,
	async : false,
	type : 'POST',
	dataType : 'json',
	contentType : 'application/json'
});

//校验表单--输入验证
var checkForm = function(form) {
	var rs = false;
	var em = $("#" + form + " [require]");
	em.each( function() {
		var require = $.trim($(this).attr("require"));
		var requireText = ValidatorText[require];
		var tag = $(this).get(0).tagName;
		if(tag == "INPUT"){
			if($(this).attr("type") == "text"){
				$(this).attr("value",requireText);
			}
			if($(this).attr("type") == "password"){
				document.getElementById(""+this.id+"").type="text";
				$(this).attr("value",requireText);
			}
		}
		if(tag == "TEXTAREA"){
			$(this).text(requireText);
		}
		$(this).focus(function(){
			var value = $(this).val();
			if(value == requireText){
				$(this).val("");
				$(this).removeClass("placeholder");
				if(require == "OldPwd" || require == "NewPwd"){
					document.getElementById(""+this.id+"").type="password";
				}
			}
		}).blur(function(){
			var value = $(this).val();
			if(value == ""){
				if(require == "OldPwd" || require == "NewPwd"){
					document.getElementById(""+this.id+"").type="text";
				}
				$(this).attr("value",requireText);
				$(this).addClass("placeholder");
			}else{
				rs = checkExp(this);
				if(!rs){
					if(require == "OldPwd" || require == "NewPwd"){
						document.getElementById(""+this.id+"").type="text";
					}
					$(this).addClass("placeholder");
				}else{
					$(this).removeClass("placeholder");
				}
				if(rs && $(this).hasClass("CheckOnly")){
					rs = checkOnly(this);
				}
				if(rs && $(this).hasClass("CheckRight")){
					rs = checkRight(this);
				}
			}
		});
	});
	return rs;
};

//校验表单--提交验证
var checkAll = function(form){
	var em = $("#" + form + " [require]");
	var rs = true;
	em.each(function(){
		rs = checkExp(this);
		if(rs){
			if($(this).hasClass("CheckOnly")){
				rs = checkOnly(this);
				return rs;
			}
			if($(this).hasClass("CheckRight")){
				rs = checkRight(this);
				return rs;
			}
		}else{
			$(this).addClass("placeholder");
			return rs;
		}
	});
	return rs;
};

//判断输入值是否符合正则表达式
var checkExp = function(elem){
	var rs = false;
	var value = $.trim(elem.value);
	var require = $.trim($(elem).attr("require"));
	var requireText = ValidatorText[require];
	if(value == requireText || value == ""){
		rs = false;
	}else{
		var regExp = new RegExp(Validator[require]);
		rs =  regExp.test(value);	
	}
	checkMark(rs,elem,requireText);
	return rs;
};

var checkMark = function(rs,elem,requireText){
	var basePath = $("#basePath").val();
	$(elem).parent().find("img").remove();
	if(rs){
		$(elem).after("<img src=\""+basePath+"/images/main/icon_ok.gif\"/>");
		//$(elem).parent().find("span").html("<img src=\""+basePath+"/skin/images/main/icon_ok.gif\"/>");
	}else{
		var tag = $(elem).get(0).tagName;
		if(tag == "INPUT"){
			$(elem).attr("value",requireText);
		}
		if(tag == "TEXTAREA"){
			$(elem).text(requireText);
		}
	}
};

//校验唯一性
var checkOnly = function(elem) {
	var basePath = $("#basePath").val();
	var rs = false;
	var checkData = {"col":elem.id,"value":elem.value};
	$.post("CheckOnly.do", $.toJSON(checkData), function(check) {
		$(elem).parent().find("div").remove();
		$(elem).parent().find("img").remove();
		if (check == 0) {
			rs = true;
			$(elem).after("<img src=\""+basePath+"/images/main/icon_ok.gif\"/>");
		}else{
			$(elem).after("<div class=\"error_msg\">"+ValidatorText["CheckOnly"]+"</div>");
		}
	});
	return rs;
};

//密码重复
var checkRight = function(elem){
	var basePath = $("#basePath").val();
	var rs = true;
	var id = $("#id").val();
	var checkData = {"id":id,"col":elem.value};
	$.post("CheckRight.do", $.toJSON(checkData), function(check) {
		$(elem).parent().find("div").remove();
		$(elem).parent().find("img").remove();
		if (check == "success") {
			rs = false;
			$(elem).after("<div class=\"error_msg\">"+ValidatorText["CheckRight"]+"</div>");
		}else{
			$(elem).after("<img src=\""+basePath+"/images/main/icon_ok.gif\"/>");
		}
	});
	return rs;
};

var repeatPwd = function(){
	document.getElementById("rePwd").type="text";
	$("#rePwd").val("请重复您的密码");
	$("#rePwd").focus(function(){
		var rePwd = $("#rePwd").val();
		if(rePwd == "请重复您的密码" || rePwd == ""){
			document.getElementById("rePwd").type="password";
			$("#rePwd").val("");
		}
	}).blur(function(){
		if(!checkPwd()){
			return;
		}
	});
};

var checkPwd = function(){
	var basePath = $("#basePath").val();
	var newPwd = $("#newPwd").val();
	var rePwd = $("#rePwd").val();
	if(rePwd == "" || rePwd == "请重复您的密码"){
		document.getElementById("rePwd").type="text";
		$("#rePwd").val("请重复您的密码");
		$("#repwd_error").text("");
		$("#rePwd").parent().find("img").remove();
		return false;
	}else if(newPwd != rePwd){
		$("#repwd_error").text("两次密码输入不一致，请重新输入");
		$("#rePwd").val("");
		$("#rePwd").focus();
		return false;
	}else{
		document.getElementById("rePwd").type="password";
		$("#repwd_error").text("");
		$("#rePwd").parent().find("img").remove();
		$("#rePwd").after("<img src=\""+basePath+"/images/main/icon_ok.gif\"/>");
		return true;
	}
};

//密码强度
//测试某个字符是属于哪一类.
function CharMode(iN) {
	if (iN >= 48 && iN <= 57) //数字
		return 1;
	if (iN >= 65 && iN <= 90) //大写字母
		return 2;
	if (iN >= 97 && iN <= 122) //小写
		return 4;
	else
		return 8; //特殊字符
}
//计算出当前密码当中一共有多少种模式
function bitTotal(num) {
	modes = 0;
	for (var i = 0; i < 6; i++) {
		if (num & 1)
			modes++;
		num >>>= 1;
	}
	return modes;
}
//返回密码的强度级别
function checkStrong(sPW) {
	if (sPW.length <= 6)
		return 0; //密码太短
	Modes = 0;
	for (var i = 0; i < sPW.length; i++) {
		//测试每一个字符的类别并统计一共有多少种模式.
		Modes |= CharMode(sPW.charCodeAt(i));
	}
	return bitTotal(Modes);
}
//当用户放开键盘或密码输入框失去焦点时,根据不同的级别显示不同的颜色
function pwStrength(pwd) {
	O_color = "#aaaaaa";
	L_color = "#FF0000";
	M_color = "#FF9200";
	H_color = "#33CC00";
	if (pwd == null || pwd == '' || pwd.length < 6) {
		Lcolor = Mcolor = Hcolor = O_color;
	} else {
		S_level = checkStrong(pwd);
		switch (S_level) {
		case 0:
			Lcolor = Mcolor = Hcolor = O_color;
		case 1:
			Lcolor = L_color;
			Mcolor = Hcolor = O_color;
			break;
		case 2:
			Lcolor = Mcolor = M_color;
			Hcolor = O_color;
			break;
		default:
			Lcolor = Mcolor = Hcolor = H_color;
		}
	}
	$("#strength_L").css("background",Lcolor);
	$("#strength_M").css("background",Mcolor);
	$("#strength_H").css("background",Hcolor);
	return;
}