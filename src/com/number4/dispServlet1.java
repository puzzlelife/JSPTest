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
public class dispServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("Servlet1 doGet()");
//        resp.setContentType("text/html;charset=utf-8");
//        resp.getWriter().write("<strong>servlet1 !</strong>");
//        RequestDispatcher rd=req.getRequestDispatcher("d2");
//        req.setAttribute("test","aaa");
//        rd.forward(req,resp);
//        rd.include(req,resp);
//        String s=(String)req.getAttribute("test");
//        resp.getWriter().write("servlet2 你好 "+s);
        resp.sendRedirect("d2");
    }
}
