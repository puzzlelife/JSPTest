package com.number5;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by dell--pc on 2017/3/21.
 */
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession=req.getSession(false);
        if (httpSession==null||httpSession.getAttribute("user")==null){
            resp.sendRedirect("pages/login.html");
        }
        else {
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write("<h3>欢迎"+httpSession.getAttribute("user")+"访问TestServlet</h3>");
        }
    }
}
