package com.brownsuagr.qasystem.utils;
import java.io.IOException;
import java.net.URLDecoder;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogServlet extends HttpServlet {

//	private static final long serialVersionUID = -1799429094906784897L;
//
//	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		//对get请求串解码，防止中文乱码
//		String qs = URLDecoder.decode(request.getQueryString(), "utf-8");
//		//请求串中各指标以&符号分割
//		String []  attrs = qs.split("\\&");
//		StringBuffer buf = new StringBuffer();
//		for(String attr : attrs){
//			//每个指标以kv形式存在，中间用=分割
//			String [] kv = attr.split("=");
//			String key = kv[0];		//指标名称
//			String val = kv.length == 2 ? kv[1] : "";		//指标值
//			buf.append(val + "|");							//指标以|分割
//		}
//		buf.append(request.getRemoteAddr());				//增加服务器端IP地址指标
//		String logInfo = buf.toString();
//		LogUtils.getPlatformLogger().info("输出日志"+logInfo);
//	}
//
//	public void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		doGet(request, response);
//	}
}
