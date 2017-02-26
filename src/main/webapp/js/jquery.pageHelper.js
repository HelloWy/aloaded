/**
 * 分页处理类
 * 
 * @author wy
 */
(function($) {
	$.Pagination = function(opts) {
		this.opts = opts;
	}
	$.extend($.Pagination.prototype,
					{
						createPages : function() {
							var options = this.opts;
							var total = options.total; // 总信息数量
							var pageNum = options.pageNum; // 当前页码
							var hasPreviousPage = options.hasPreviousPage; // 是否前上一页
							var hasNextPage = options.hasNextPage; // 是否有下一页
							var navigatepageNums = options.navigatepageNums; // 所有导航页号
							var pages = "<div class=\"message\">";
							pages += "共<i class=\"blue\">" + total
									+ "</i>条记录，当前显示第&nbsp;<i class=\"blue\">"
									+ pageNum + "&nbsp;</i>页</div>";
							pages += "<ul class=\"paginList\">";
							if (hasPreviousPage) {
								pages += "<li class=\"paginItem\"><a id=\"prev\" href=\"javascript:void(-1)\"><span class=\"pagepre\"></span></a></li>";
							}
							for (var i = 0; i < navigatepageNums.length; i++) {
								if (navigatepageNums[i] == pageNum) {
									pages += "<li class=\"paginItem\"><span class=\"current\">"
											+ navigatepageNums[i] + "</span></li>";
								} else {
									pages += "<li class=\"paginItem\"><a id=\""
											+ navigatepageNums[i]
											+ "\" href=\"javascript:void(-1)\">"
											+ navigatepageNums[i] + "</a></li>";
								}
							}
							if (hasNextPage) {
								pages += "<li class=\"paginItem\"><a id=\"next\" href=\"javascript:void(-1)\"><span class=\"pagenxt\"></span></a></li>";
							}
							pages += "</ul>";
							return pages;
						},
						createLink : function() {
							var options = this.opts;
							var prePage = options.prePage; // 当前页面的前一页
							var nextPage = options.nextPage; // 当前页面的后一页
							$("ul a").each(function(index) {
								$(this).click(function() {
									var page = this.id;
									if (!isNaN(page)) {
										options.callback(page);
									} else {
										if (page == "prev") {
											options.callback(prePage);
										}
										if (page == "next") {
											options.callback(nextPage);
										}
									}
								});
							});
						}
					});
	$.fn.loadPager = function(opts) {
		var evt = new $.Pagination(opts);
		var pages = evt.createPages();
		this.empty();
		$(pages).appendTo(this);
		evt.createLink();
	};
})(jQuery);