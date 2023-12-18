package com.HiSmartHome.servlet.AuthorizationServlet;

import com.HiSmartHome.model.Authorization;

import com.HiSmartHome.service.AuthorizationService;

import com.google.gson.Gson;

import java.io.*;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AuthorizationFindAllServlet", value = "/authorizationfindAll")
public class AuthorizationFindAllServlet extends HttpServlet {

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
        List<Authorization> authorizationList = authorizationService.getAllAuthorizationService();
        String json_list = new Gson().toJson(authorizationList);
        response.getWriter().println(json_list);
    }
}
