package com.yangRR.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        if("yangRR".equals(username)){
            //通过响应对象响应信息
            response.getWriter().write("<h1>NO</h1>");
        }else{
            response.getWriter().write("YES");
        }
    }
}
