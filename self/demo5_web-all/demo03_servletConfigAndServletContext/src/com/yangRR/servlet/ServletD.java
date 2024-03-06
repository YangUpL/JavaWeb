package com.yangRR.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;


@WebServlet("/servletD")
public class ServletD extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getMethod());
        System.out.println(req.getScheme());
        System.out.println(req.getProtocol());
        System.out.println(req.getRequestURI());
        System.out.println(req.getRequestURL());
        System.out.println(req.getLocalPort());
        System.out.println(req.getServerPort());
        System.out.println(req.getRemotePort());


        String accept = req.getHeader("Accept");
        System.out.println(accept);

        Enumeration<String> headers = req.getHeaderNames();
        while (headers.hasMoreElements()) {
            String s = headers.nextElement();
            System.out.println(s + ":" + req.getHeader(s));
        }
    }
}
