package com.number1;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * Created by dell--pc on 2017/3/14.
 */
public class Servlet2 extends HttpServlet{
    void print(String content){
        System.out.println(getClass().getSimpleName()+"method name:"+content+"thread name:"+Thread.currentThread().getName());
    }
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        print("service");
    }

    @Override
    public void destroy() {
        print("destory");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        print("init");
        System.out.println("param "+config.getInitParameter("test"));
    }
}
