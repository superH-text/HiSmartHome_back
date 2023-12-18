package com.HiSmartHome.servlet.CommunityServlet;

import com.HiSmartHome.service.CommunityService;

import com.google.gson.Gson;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CommunityDelServlet", value = "/communitydelete")
public class CommunityDelServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        CommunityService communityService = new CommunityService();

        String id = request.getParameter("id");
        System.out.println(id);
        //执行删除操作
        int communitydelete = communityService.deleteCommunityService(Integer.parseInt(id));
        Gson gson = new Gson();
        String json = gson.toJson(communitydelete);
        response.getWriter().println(json);
    }
}
