package com.number3;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by dell--pc on 2017/3/14.
 */
public class ReqInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuilder sb=new StringBuilder();
        sb.append("<h3>request中信息</h3><br/>");
        sb.append("request uri:").append(req.getRequestURI()).append("<br/>");
        sb.append("content length:").append(req.getContentLength()).append("<br/>");
        sb.append("method:").append(req.getMethod()).append("<br/>");
        sb.append("<hr/>----------------------------------------------<br/>");
        Enumeration<String> emt=req.getHeaderNames();
        while(emt.hasMoreElements()){
            String name=emt.nextElement();
            sb.append(name).append("->").append(req.getHeader(name)).append("<br/>");
        }
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write(sb.toString());
    }
}
