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
public class readCook extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        Cookie[] cookies=req.getCookies();
        StringBuilder sb=new StringBuilder();
        for(Cookie c:cookies){
            sb.append("<li>").append(c.getName()).append(":").append(c.getValue()+" age").append(c.getMaxAge());
        }

        resp.setContentType("text/html,charset=utf-8");
        resp.getWriter().write(sb.toString());
    }
}
