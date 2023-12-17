package com.HiSmartHome.servlet.RoomServlet;

import com.HiSmartHome.model.Devices;
import com.HiSmartHome.model.Room;
import com.HiSmartHome.service.DevicesService;
import com.HiSmartHome.service.RoomService;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RoomAddServlet",value = "roomadd")
public class RoomAddServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        RoomService roomService = new RoomService();

        String room_rid = request.getParameter("room_rid");
        String room_name = request.getParameter("room_name");
        String room_type = request.getParameter("room_type");

        Room room = new Room(Integer.parseInt(room_rid),room_name,room_type);
        int i = roomService.addRoomService(room);

        if (i>0){
            response.getWriter().println(new Gson().toJson("添加成功"));
        }

    }
}
