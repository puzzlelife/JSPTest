package com.number7;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by dell--pc on 2017/3/28.
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String password=req.getParameter("password");
        System.out.println(name);
        if ("哈哈".equals(name)&&"123456".equals(password)){
            HttpSession session=req.getSession();
            session.setAttribute("user name",name);
            resp.sendRedirect("sessionindex.html");
        }else{
            resp.sendRedirect("pages/login.html");
        }
    }
}
