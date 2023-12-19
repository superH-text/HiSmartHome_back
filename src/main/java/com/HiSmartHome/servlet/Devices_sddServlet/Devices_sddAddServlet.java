package com.HiSmartHome.servlet.Devices_sddServlet;

import com.HiSmartHome.model.Devices;
import com.HiSmartHome.model.Devices_sdd;
import com.HiSmartHome.service.DevicesService;
import com.HiSmartHome.service.Devices_sddService;
import com.google.gson.Gson;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Devices_sddAddServlet", value = "/Devices_sddAddServlet")
public class Devices_sddAddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        Devices_sddService devices_sddService = new Devices_sddService();

        String devices_sdd_type = request.getParameter("devices_sdd_type");
        String devices_sdd_starttime = request.getParameter("devices_sdd_starttime");
        String devices_sdd_endtime = request.getParameter("devices_sdd_endtime");
        String devices_sdd_info = request.getParameter("devices_sdd_info");

        Devices_sdd devices_sdd = new Devices_sdd(devices_sdd_type,devices_sdd_starttime,devices_sdd_endtime,devices_sdd_info);
        int i = devices_sddService.addDevices_sddService(devices_sdd);

        if (i>0){
            response.getWriter().println(new Gson().toJson("添加成功"));
        }

    }
}