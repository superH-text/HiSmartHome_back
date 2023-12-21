package com.HiSmartHome.servlet.UserServlet;

import com.HiSmartHome.model.Users;
import com.HiSmartHome.service.UserService;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UserFindAllServlet",value = "/userfindAll")
public class UserFindAllServlet extends HttpServlet {
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

        List<Users> usersList = userService.getAllUsersService();
        String json_list = new Gson().toJson(usersList);
        response.getWriter().println(json_list);

    }
}
