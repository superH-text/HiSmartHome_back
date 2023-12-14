package com.HiSmartHome.servlet;

import com.HiSmartHome.model.Devices;
import com.HiSmartHome.service.DevicesService;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "DevicesFindAllServlet", value = "/DevicesFindAllServlet")
public class DevicesFindAllServlet extends HttpServlet {
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
        List<Devices> devicesList = devicesService.getAllDevicesService();
        String json_list = new Gson().toJson(devicesList);
        response.getWriter().println(json_list);

    }
}
