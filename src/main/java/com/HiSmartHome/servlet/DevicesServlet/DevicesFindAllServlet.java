package com.HiSmartHome.servlet.DevicesServlet;

import com.HiSmartHome.model.Devices;
import com.HiSmartHome.service.DevicesService;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
