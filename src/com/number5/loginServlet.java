package com.number5;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by dell--pc on 2017/3/16.
 */
public class loginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String name=req.getParameter("name");
        String pwd=req.getParameter("password");
        if("admin".equals(name)&&"123456".equals(pwd)) {
            HttpSession session = req.getSession();
            session.setAttribute("user", name);
            session.setAttribute("password", pwd);

            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write("<strong>欢迎" + name + "访问</strong><br><a href='sessionindex.html'>返回首页</a>");
        }else {
            resp.sendRedirect("pages/login.html");
        }
    }
}
