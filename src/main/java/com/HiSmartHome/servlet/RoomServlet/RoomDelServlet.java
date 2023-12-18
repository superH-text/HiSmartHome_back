package com.HiSmartHome.servlet.RoomServlet;

import com.HiSmartHome.service.DevicesService;
import com.HiSmartHome.service.RoomService;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RoomDelServlet",value = "/roomdelete")
public class RoomDelServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        RoomService roomService = new RoomService();

        String id = request.getParameter("id");
        System.out.println(id);
        //执行删除操作
        int roomdelete = roomService.deleteRoomService(Integer.parseInt(id));
        Gson gson = new Gson();
        String json = gson.toJson(roomdelete);
        response.getWriter().println(json);
    }
}
