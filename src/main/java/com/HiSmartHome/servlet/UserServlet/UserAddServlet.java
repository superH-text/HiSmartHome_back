package com.HiSmartHome.servlet.UserServlet;

import com.HiSmartHome.model.Devices;
import com.HiSmartHome.model.Users;
import com.HiSmartHome.service.DevicesService;
import com.HiSmartHome.service.UserService;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "UserAddServlet",value = "/uesradd")
public class UserAddServlet extends HttpServlet {
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

        String users_name = request.getParameter("users_name");
        String users_username = request.getParameter("users_username");
        String users_password = request.getParameter("users_password");
        String users_age = request.getParameter("users_age");
        String users_gender = request.getParameter("users_gender");
        String users_birthday = request.getParameter("users_birthday");
        String users_email = request.getParameter("users_email");
        String users_phone = request.getParameter("users_phone");

        Users users = new Users(users_name,users_username,users_password,users_age,users_gender,users_birthday,users_email,users_phone);
        int i = userService.addUsersService(users);

        if (i>0){
            response.getWriter().println(new Gson().toJson("添加成功"));
        }

    }
}
