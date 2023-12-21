package com.HiSmartHome.servlet.CommunityServlet;

import com.HiSmartHome.model.Community;
import com.HiSmartHome.service.CommunityService;
import com.google.gson.Gson;
import java.io.*;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CommunityFindAllServlet", value = "/communityfindAll")
public class CommunityFindAllServlet extends HttpServlet {

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
        List<Community> communityList = communityService.getAllCommunityService();
        String json_list = new Gson().toJson(communityList);
        response.getWriter().println(json_list);
        System.out.println(communityList);
    }
}
