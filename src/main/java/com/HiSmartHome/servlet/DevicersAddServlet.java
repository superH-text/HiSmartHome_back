package com.HiSmartHome.servlet;

import com.HiSmartHome.model.Devices;
import com.HiSmartHome.service.DevicesService;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class DevicersAddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        DevicesService devicesService = new DevicesService();

        String device_did = request.getParameter("device_did");
        String device_name = request.getParameter("device_name");
        String device_type = request.getParameter("device_type");

        Devices devices = new Devices(device_did,device_name,device_type);
        int i = devicesService.addDeviceService(devices);

        if (i>0){
            response.getWriter().println(new Gson().toJson("添加成功"));
        }

    }
}
