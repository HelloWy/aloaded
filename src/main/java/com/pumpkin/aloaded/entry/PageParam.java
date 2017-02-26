package com.pumpkin.aloaded.entry;

import java.util.List;

/**
 * 通用的分页类
 * @author WyFss
 *
 * @param <T>
 */
public class PageParam<T> {

	private int currPage; // 当前页

	private int totalPage; // 总页

	private int rowCount; // 总记录数

	public static int pageSize = 10; // 一页显示的大小

	private List<T> data; // 数据

	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		int totalPage = rowCount / pageSize;
		if (rowCount % pageSize > 0) {
			totalPage += 1;
		}
		setTotalPage(totalPage);
		this.rowCount = rowCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	@SuppressWarnings("static-access")
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
}
