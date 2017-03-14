package com.number3;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by dell--pc on 2017/3/14.
 */
public class OtherServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String hidden=req.getParameter("hidden");
        String gender=req.getParameter("gender");
        String[] course=req.getParameterValues("course");
        String city=req.getParameter("city");

        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("hidden:"+hidden+" 性别："+gender+" 城市："+city+" courses:"+ Arrays.toString(course));

    }
}
