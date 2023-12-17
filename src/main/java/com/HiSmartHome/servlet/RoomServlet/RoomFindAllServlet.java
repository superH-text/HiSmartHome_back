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
import java.util.List;

@WebServlet(name = "RoomFindAllServlet",value = "roomfindAll")
public class RoomFindAllServlet extends HttpServlet {
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
        List<Room> roomList = roomService.getAllRoomService();
        String json_list = new Gson().toJson(roomList);
        response.getWriter().println(json_list);

    }
}
