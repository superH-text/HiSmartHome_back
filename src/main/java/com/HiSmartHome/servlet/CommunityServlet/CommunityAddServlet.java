package com.HiSmartHome.servlet.CommunityServlet;

import com.HiSmartHome.model.Community;
import com.HiSmartHome.service.CommunityService;
import com.google.gson.Gson;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CommunityAddServlet", value = "/communityadd")
public class CommunityAddServlet extends HttpServlet {

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

       // String community_id = request.getParameter("community_id");
        String community_title = request.getParameter("community_title");
        String community_info = request.getParameter("community_info");

        Community community = new Community(community_title,community_info);
        int i = communityService.addCommunityService(community);

        if (i>0){
            response.getWriter().println(new Gson().toJson("添加成功"));
        }

    }
    }

