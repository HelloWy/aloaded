/**
 * Created by WyFss on 2016/5/8.
 */
$(document).ready(function() {
	$.ajaxSetup( {
		cache : false,
		async : false,
		type : 'POST',
		dataType : 'json',
		contentType : 'application/json'
	});
	$(".click").click(function() {
		$(".tip").fadeIn(200);
	});
	$(".tiptop a").click(function() {
		$(".tip").fadeOut(200);
	});
	$(".sure").click(function() {
		$(".tip").fadeOut(100);
	});
	$(".cancel").click(function() {
		$(".tip").fadeOut(100);
	});
	$(".select1").uedSelect({
		width : 100
	});
});