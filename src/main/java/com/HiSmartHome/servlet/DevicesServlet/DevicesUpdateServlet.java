package com.HiSmartHome.servlet.DevicesServlet;

import com.HiSmartHome.model.Devices;
import com.HiSmartHome.service.DevicesService;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name="DevicesUpdateServlet",value="/devicesupdate")
public class DevicesUpdateServlet extends HttpServlet {
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
        //修改操作
        String device_id = request.getParameter("device_id");
        String device_did = request.getParameter("device_did");
        String device_name = request.getParameter("device_name");
        String device_type = request.getParameter("device_type");
        Devices devices = new Devices(Integer.parseInt(device_id), device_did, device_name, device_type);

        int deviceupdate = devicesService.updateDeviceService(devices);

        Gson gson = new Gson();
        String json = gson.toJson(deviceupdate);
        response.getWriter().println(json);
    }
}
