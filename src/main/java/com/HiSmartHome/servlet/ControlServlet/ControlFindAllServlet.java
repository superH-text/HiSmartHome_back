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
import java.util.List;

@WebServlet(name = "ControlFindAllServlet",value = "/controlfindAll")
public class ControlFindAllServlet extends HttpServlet {

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

        List<Control> controlList = controlService.getAllControlService();
        String json_list = new Gson().toJson(controlList);
        response.getWriter().println(json_list);

    }
}
