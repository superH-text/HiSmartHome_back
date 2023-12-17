package com.HiSmartHome.servlet.ControlServlet;

import com.HiSmartHome.model.Control;
import com.HiSmartHome.model.Devices;
import com.HiSmartHome.service.ControlService;
import com.HiSmartHome.service.DevicesService;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "ControlAddServlet",value = "/controladd")
public class ControlAddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        ControlService controlService = new ControlService();

        String control_record_image = request.getParameter("control_record_image");
        String control_record_time = request.getParameter("control_record_time");
        String control_record_status = request.getParameter("control_record_status");
        String control_record_instruction = request.getParameter("control_record_instruction");

        Control control = new Control(Integer.parseInt(control_record_image),control_record_status,control_record_instruction,control_record_time);
        int i = controlService.addControlService(control);

        if (i>0){
            response.getWriter().println(new Gson().toJson("添加成功"));
        }

    }
}
