package com.yangRR.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/servletF")
public class ServletF extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String info = "<h1>hello<h1/>";

        resp.setStatus(200);

        resp.setHeader("Content-Type","text/html");
        resp.setHeader("Content-Length","1111");
        resp.setContentType("text/html");
        resp.setContentLength(info.getBytes().length);

        resp.getWriter().write("<h1>hello<h1/>");
    }
}
