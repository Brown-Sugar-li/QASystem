package com.brownsuagr.qasystem.utils;

import com.brownsuagr.qasystem.vo.PageObject;

import java.util.List;

public class PagesUtil {
	//alt+shift+m
	public static <T> PageObject<T> newInstance(
			Integer pageCurrent,
			int rowCount,
			int pageSize,
			List<T> records) {
		PageObject<T> po=new PageObject<>();
		po.setRowCount(rowCount);
		po.setRecords(records);
		po.setPageCurrent(pageCurrent);
		po.setPageSize(pageSize);
		int pageCount=(rowCount-1)/pageSize+1;
		po.setPageCount(pageCount);
		return po;
	}

}
