package com.number4;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by dell--pc on 2017/3/15.
 */
public class dispServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("Servlet2 doGet()");
//        String s=(String)req.getAttribute("test");
//        req.setAttribute("test","abc");
//        resp.getWriter().write("test:"+s+"<br>");
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("servlet2 你好");
    }
}
