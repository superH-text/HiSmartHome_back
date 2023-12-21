package com.HiSmartHome.servlet.UserServlet;

import com.HiSmartHome.service.DevicesService;
import com.HiSmartHome.service.UserService;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "UserDelServlet",value = "/uesrdelete")
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

        UserService userService = new UserService();

        String id = request.getParameter("id");
        System.out.println(id);
        //执行删除操作
        int usersdelete = userService.deleteUsersService(Integer.parseInt(id));
        Gson gson = new Gson();
        String json = gson.toJson(usersdelete);
        response.getWriter().println(json);
    }
}
