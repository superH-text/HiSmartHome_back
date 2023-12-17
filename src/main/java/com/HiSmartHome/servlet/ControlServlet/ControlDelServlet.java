package com.HiSmartHome.servlet.ControlServlet;

import com.HiSmartHome.service.ControlService;
import com.HiSmartHome.service.DevicesService;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ControlDelServlet",value = "/controldelete")
public class ControlDelServlet extends HttpServlet {

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

        String id = request.getParameter("id");
        System.out.println(id);
        //执行删除操作
        int controlsdelete = controlService.deleteControlService(Integer.parseInt(id));
        Gson gson = new Gson();
        String json = gson.toJson(controlsdelete);
        response.getWriter().println(json);
    }
}
