package com.HiSmartHome.servlet.AuthorizationServlet;

import com.HiSmartHome.model.Authorization;
import com.HiSmartHome.model.Community;
import com.HiSmartHome.service.AuthorizationService;
import com.HiSmartHome.service.CommunityService;
import com.google.gson.Gson;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AuthorizationUpdateServlet", value = "/authorizationupdate")
public class AuthorizationUpdateServlet extends HttpServlet {

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
        //修改操作
        String authorization_id = request.getParameter("authorization_id");
        String authorization_status = request.getParameter("authorization_status");
        String authorization_starttime = request.getParameter("authorization_starttime");
        String authorization_endtime = request.getParameter("authorization_endtime");

        Authorization authorization = new Authorization(Integer.parseInt(authorization_id), authorization_status, authorization_starttime,authorization_endtime);

        int authorizationupdate = authorizationService.updateAuthorizationService(authorization);

        Gson gson = new Gson();
        String json = gson.toJson(authorizationupdate);
        response.getWriter().println(json);
    }
}
