package com.HiSmartHome.servlet.LoginAndRegisterServlet;

import com.HiSmartHome.dao.UserDao;
import com.HiSmartHome.model.Users;
import com.HiSmartHome.reponse.ResponseBody;
import com.HiSmartHome.service.LoginService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();

        LoginService loginService = new LoginService();

        String users_phone = request.getParameter("users_phone");
        String username = request.getParameter("users_username");
        String password = request.getParameter("users_password");

        System.out.println(username+"---------"+password);
        System.out.println(users_phone+"---------"+password);

        Users users = loginService.login(username,password);

        if (users!=null){
            response.getWriter().println(new Gson().toJson(users));
        }else {
            System.out.println("失败了哦 ~");
        }

        System.out.println(users);

//        String name = request.getParameter("users_username");
//        String password = request.getParameter("users_password");
//
//        UserDao userDao = new UserDao();
//        Users user = new Users(name, password);
//        ObjectMapper mapper = new ObjectMapper();
//        ResponseBody body = new ResponseBody();
//
//        if (userDao.select(user)) {
//            body.setCode(200);
//            body.setData("success");
//        } else {
//            body.setCode(404);
//            body.setData("failed");
//        }
//        mapper.writeValue(response.getWriter(), body);
    }
}
