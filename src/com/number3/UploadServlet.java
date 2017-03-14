package com.number3;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by dell--pc on 2017/3/14.
 */
public class UploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        // TODO Auto-generated method stub
//        req.setCharacterEncoding("UTF-8");
//        String name=req.getParameter("name");
//        String age=req.getParameter("age");
//        String file=req.getParameter("file");
//        rep.setContentType("text/html;charset=utf-8");
//        rep.getWriter().write("name:"+name+"<br>age:"+age+"<br>file:"+file);
        process(req,rep);
    }

    private void process(HttpServletRequest req, HttpServletResponse rep) throws IOException {
        rep.setContentType("text/html;charset=UTF-8");
        ServletInputStream sis=req.getInputStream();
        byte[] buf=new byte[1024];
        int flag=0;
        while((flag=sis.readLine(buf,0,1024))!=-1){
            String s=new String(buf,0,flag);
            rep.getWriter().write(s+"<br/>");
        }
        sis.close();
    }


}
