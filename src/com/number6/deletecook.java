package com.number6;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by dell--pc on 2017/3/27.
 */
public class deletecook extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie c1=new Cookie("test1","cookie1");
        c1.setMaxAge(0);
        resp.addCookie(c1);
        resp.sendRedirect("/");
    }
}
