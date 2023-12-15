package com.HiSmartHome.servlet.UserServlet;

import com.HiSmartHome.service.DevicesService;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class UserDelServlet extends HttpServlet {
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

        String id = request.getParameter("id");
        System.out.println(id);
        //执行删除操作
        int devicesdelete = devicesService.deleteDeviceService(Integer.parseInt(id));
        Gson gson = new Gson();
        String json = gson.toJson(devicesdelete);
        response.getWriter().println(json);
    }
}
