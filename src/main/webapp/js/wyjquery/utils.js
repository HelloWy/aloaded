
var initIFrameStyle = function(initWidth,initHeight) {
	var mainFrame = parent.$("#mainFrame");
	var mainWidth = mainFrame.width() - initWidth;
	var mainHeight = mainFrame.height() - initHeight;
	$("#viewFrame").width(mainWidth);
	$("#treeFrame,#viewFrame").height(mainHeight);
};

var loadTableScroll = function(){
	var winHeight = initWinHeight(37);
	$("#scrollTable").height(winHeight);
	$("#scrollTable").css({"overflow-y":"auto","overflow-x": "hidden"});
};

var initWinHeight = function(initHeight) {
	var mainFrame = top.$("#mainFrame");
	var viewFrame = mainFrame.contents().find("#viewFrame");
	var winHeight = 0;
	if (viewFrame.attr("id") == undefined) {
		winHeight = mainFrame.height() - initHeight;
	} else {
		winHeight = viewFrame.height() - initHeight;
	}
	return winHeight;
};

var loadLocalPath = function(url) {
	var viewFrame = $("#rightFrame",window.top.document);
		viewFrame.contents().empty();
		viewFrame.removeAttr("src");
		viewFrame.attr("src", url);
};

$.fn.serializeObject = function() {
	var o = {};
	var a = this.serializeArray();
	$.each(a, function() {
		if (o[this.name]) {
			if (!o[this.name].push) {
				o[this.name] = [ o[this.name] ];
			}
			o[this.name].push(this.value || '');
		} else {
			o[this.name] = this.value || '';
		}
	});
	return o;
};

var wechatMsgType = {"text":"文本消息","news":"图文消息","image":"图片消息","voice":"语音消息","video":"视频消息","music":"音乐消息"};
var wechatMenuType = {"click":"消息触发类","view":"网页链接类","pic_sysphoto":"微信拍照发图","scancode_waitmsg":"微信扫码"};