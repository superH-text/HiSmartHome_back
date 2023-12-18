package com.HiSmartHome.servlet.AuthorizationServlet;

import com.HiSmartHome.service.AuthorizationService;

import com.google.gson.Gson;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AuthorizationDelServlet", value = "/authorizationdelete")
public class AuthorizationDelServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        AuthorizationService authorizationService = new AuthorizationService();

        String id = request.getParameter("id");
        System.out.println(id);
        //执行删除操作
        int authorizationdelete = authorizationService.deleteAuthorizationService(Integer.parseInt(id));
        Gson gson = new Gson();
        String json = gson.toJson(authorizationdelete);
        response.getWriter().println(json);
    }
}
