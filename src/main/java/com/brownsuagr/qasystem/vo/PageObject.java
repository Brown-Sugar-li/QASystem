package com.brownsuagr.qasystem.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName:
 * @Description: 使用泛型类封装页面数据
 * @Date: 2020-09-17 08:09:55
 * @Params:
 * @Return:
 **/
@Data            		//使用lambok生成setter和getter、toString方法
@Accessors        		//生成链式加载
@NoArgsConstructor    	//生成无参构造
@AllArgsConstructor   	//生成全参构造
public class PageObject<T> implements Serializable{

	/**
	 * 当前页成员变量
	 * 1、当前页
	 * 2、页面展示数量
	 * 3、总行数(通过查询获得)
	 * 4、总页数
	 * 5、总记录
	 */
	private static final long serialVersionUID = 6780580291247550747L;
	private Integer pageCurrent=1;
    private Integer pageSize=3;
    private Integer rowCount;
    private Integer pageCount=0;
    private List<T> records;

}
