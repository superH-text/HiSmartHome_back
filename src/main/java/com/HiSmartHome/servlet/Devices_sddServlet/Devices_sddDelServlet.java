package com.HiSmartHome.servlet.Devices_sddServlet;

import com.HiSmartHome.service.Devices_sddService;
import com.google.gson.Gson;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Devices_sddServlet", value = "/Devices_sddServlet")
public class Devices_sddDelServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        Devices_sddService devices_sddService = new Devices_sddService();

        String id = request.getParameter("id");
        System.out.println(id);
        //执行删除操作
        int  devices_sdddelete = devices_sddService.deleteDevices_sddService(Integer.parseInt(id));
        Gson gson = new Gson();
        String json = gson.toJson(devices_sdddelete);
        response.getWriter().println(json);
    }
}