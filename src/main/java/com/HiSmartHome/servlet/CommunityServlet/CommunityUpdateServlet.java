package com.HiSmartHome.servlet.CommunityServlet;

import com.HiSmartHome.model.Community;

import com.HiSmartHome.service.CommunityService;

import com.google.gson.Gson;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CommunityUpdateServlet", value = "/communityupdate")
public class CommunityUpdateServlet extends HttpServlet {

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
        //修改操作
        String community_id = request.getParameter("community_id");
        String community_title = request.getParameter("community_title");
        String community_info = request.getParameter("community_info");
        Community community = new Community(community_id, community_title, community_info);

        int communityupdate = communityService.updateCommunityService(community);

        Gson gson = new Gson();
        String json = gson.toJson(communityupdate);
        response.getWriter().println(json);
    }
}
