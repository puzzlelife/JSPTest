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
public class creatCook extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie c1=new Cookie("test1","cookie1");
        resp.addCookie(c1);

        Cookie c2=new Cookie("test2","cookie2");
        c2.setPath("/");
        resp.addCookie(c2);

        Cookie c3=new Cookie("test3","cookie3");
        c3.setPath("/temp/");
        resp.addCookie(c3);


        resp.sendRedirect("sessionindex.html");
    }
}
