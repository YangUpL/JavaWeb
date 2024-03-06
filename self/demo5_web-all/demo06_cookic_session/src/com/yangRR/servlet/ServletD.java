 package com.yangRR.servlet;

 import jakarta.servlet.ServletException;
 import jakarta.servlet.annotation.WebServlet;
 import jakarta.servlet.http.HttpServlet;
 import jakarta.servlet.http.HttpServletRequest;
 import jakarta.servlet.http.HttpServletResponse;
 import jakarta.servlet.http.HttpSession;

 import java.io.IOException;

 @WebServlet("/servletD")
 public class ServletD extends HttpServlet {
     @Override
     protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         // 获取session对象
         HttpSession session = req.getSession();
         // 获取Session的ID
         String jSessionId = session.getId();
         System.out.println(jSessionId);
         // 判断session是不是新创建的session
         boolean isNew = session.isNew();
         System.out.println(isNew);
         // 从session中取出数据
         String username = (String)session.getAttribute("username");
         System.out.println(username);
     }
 }
