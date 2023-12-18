package com.HiSmartHome.servlet.AuthorizationServlet;

import com.HiSmartHome.model.Authorization;

import com.HiSmartHome.service.AuthorizationService;

import com.google.gson.Gson;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AuthorizationAddServlet", value = "/authorizationadd")
public class AuthorizationAddServlet extends HttpServlet {

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
        String authorization_status = request.getParameter("authorization_status");
        String authorization_starttime = request.getParameter("authorization_starttime");
        String authorization_endtime = request.getParameter("authorization_endtime");

        Authorization authorization = new Authorization(authorization_status,authorization_starttime,authorization_endtime);
        int i = authorizationService.addAuthorizationService(authorization);

        if (i>0){
            response.getWriter().println(new Gson().toJson("添加成功"));
        }

    }
    }

