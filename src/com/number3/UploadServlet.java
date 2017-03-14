package com.number3;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;
import java.util.Iterator;

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

    private void process(HttpServletRequest req, HttpServletResponse rep) throws IOException, ServletException {
        rep.setContentType("text/html;charset=UTF-8");
//        ServletInputStream sis=req.getInputStream();
//        byte[] buf=new byte[1024];
//        int flag=0;
//        while((flag=sis.readLine(buf,0,1024))!=-1){
//            String s=new String(buf,0,flag);
//            rep.getWriter().write(s+"<br/>");
//        }
//        sis.close();

        String name=req.getParameter("name");
        String age=req.getParameter("age");
        Part part=req.getPart("file");
        rep.getWriter().write("<strong>name:"+name+"<br>age:"+age+"<br></strong>");


//        String formElementName=part.getName();
//        rep.getWriter().write("formElementName"+formElementName+":");
//        String fileName=getFileName(part);
//        rep.getWriter().write("fileName:" + fileName);
//        InputStream is=part.getInputStream();
//        byte[] buf=new byte[1024];
//        int flag=0;
//        while((flag=is.read(buf,0,1024))!=-1){
//            String s=new String(buf,0,flag);
//            rep.getWriter().write(s+"<br/>");
//        }
//        is.close();

        saveUpload(part);
        rep.getWriter().write("<h3>文件上传成功</h3>");

    }

    private void saveUpload(Part part) {
        String fileName=getFileName(part);
        fileName="wy"+System.nanoTime()+"_"+fileName;
        ServletContext sct=getServletContext();
        String realPath = sct.getRealPath("/");
        System.out.println(realPath);
        File file=new File(realPath+"upload");
        if(!file.exists()){
            file.mkdir();
        }
        File upFile=new File(file,fileName);
        FileOutputStream fos=null;
        InputStream is=null;
        byte[] buf=new byte[1024];
        int flag=-1;

        try {
            fos=new FileOutputStream(upFile);
            is=part.getInputStream();
            while((flag=is.read(buf,0,1024))!=-1){
                fos.write(buf,0,flag);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private String getFileName(Part part) {
//        Iterator<String> it=part.getHeaderNames().iterator();
//        while(it.hasNext()){
//            String name=it.next();
//            System.out.println(name+"=="+part.getHeader(name));
//        }
        String s=part.getHeader("content-disposition");
        String[] strings=s.split("filename=");
//        System.out.println(strings[strings.length-1].replace("\"",""));
        return strings[strings.length-1].replace("\"","");
    }


}
