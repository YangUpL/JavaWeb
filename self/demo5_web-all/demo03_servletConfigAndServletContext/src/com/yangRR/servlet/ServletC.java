package com.yangRR.servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ServletC extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("-------路径相关--------");

        ServletContext application = getServletContext();

        String upload = application.getRealPath("upload");
        System.out.println(upload);

        System.out.println("=================");

        String contextPath = application.getContextPath();
        System.out.println(contextPath);


        System.out.println("-------域对象--------");
        application.setAttribute("ka","va");
        application.setAttribute("ka","vaa");
        Object ka = application.getAttribute("ka");
        String strKa = (String) ka;
        System.out.println(strKa);

    }
}
