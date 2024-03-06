package com.yangRR.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/servletE")
public class ServletE extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        System.out.println(username);
        String userPwd = req.getParameter("userPwd");
        System.out.println(userPwd);
        String[] hobbies = req.getParameterValues("hobby");
        System.out.println(Arrays.toString(hobbies));


        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String s = parameterNames.nextElement();
            String[] parameterValues = req.getParameterValues(s);
            if (parameterValues.length > 1) {
                System.out.println(s + "=" + Arrays.toString(parameterValues));
            }else {
                System.out.println(s + "=" + parameterValues[0]);
            }
        }

        Map<String, String[]> parameterMap = req.getParameterMap();
        Set<Map.Entry<String, String[]>> entries = parameterMap.entrySet();
        for (Map.Entry<String, String[]> entry : entries) {
            String key = entry.getKey();
            String[] value = entry.getValue();

            if (value.length > 1) {
                System.out.println(key + "=" + Arrays.toString(value));
            }else {
                System.out.println(key + "=" + value[0]);
            }
        }
    }
}
