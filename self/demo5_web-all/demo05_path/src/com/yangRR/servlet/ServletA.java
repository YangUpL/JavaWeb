package com.yangRR.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;

@WebServlet("/servletA")
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servletA");
//        resp.sendRedirect("servletB");//相对
//        resp.sendRedirect("/demo05_path/servletB");//绝对

        req.getRequestDispatcher("servletB").forward(req,resp);//相对
        req.getRequestDispatcher("/servletB").forward(req,resp);//绝对

    }
}
