package com.HiSmartHome.servlet.Devices_sddServlet;

import com.HiSmartHome.model.Devices;
import com.HiSmartHome.model.Devices_sdd;
import com.HiSmartHome.service.DevicesService;
import com.HiSmartHome.service.Devices_sddService;
import com.google.gson.Gson;

import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Devices_sddFindAllServlet", value = "/Devices_sddFindAllServlet")
public class Devices_sddFindAllServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        Devices_sddService devices_sddService = new Devices_sddService();
        List<Devices_sdd> devices_sddList = devices_sddService.getAllDevices_sddService();
        String json_list = new Gson().toJson(devices_sddList);
        response.getWriter().println(json_list);
    }
}