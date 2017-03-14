package com.number3;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by dell--pc on 2017/3/14.
 */
public class ProcessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        String name=req.getParameter("name");
        String age=req.getParameter("age");
        //name=new String(name.getBytes("ISO-8859-1"),"UTF-8");
        System.out.println("name:"+name+" age:"+age);
        rep.setHeader("Content-Type","text/html;charset=UTF-8");
        rep.getWriter().write("name:"+name+" age:"+age);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name=req.getParameter("name");
        String age=req.getParameter("age");
        System.out.println("name:"+name+" age:"+age);
        rep.setHeader("Content-Type","text/html;charset=UTF-8");
        rep.getWriter().write("name:"+name+" age:"+age);
    }
}
