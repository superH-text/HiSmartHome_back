package com.HiSmartHome.servlet.LoginAndRegisterServlet;

import com.HiSmartHome.dao.UserDao;
import com.HiSmartHome.model.Users;
import com.HiSmartHome.reponse.ResponseBody;
import com.HiSmartHome.service.RegisterService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegisterServlet", value = "/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        RegisterService registerService = new RegisterService();

        String users_username = request.getParameter("users_username");
        String users_password = request.getParameter("users_password");
        String users_email = request.getParameter("users_email");
        String users_phone = request.getParameter("users_phone");

        System.out.println(users_username+"---------"+users_password+"-------"+users_email+"-----------"+users_phone);

        Users users = new Users(users_username,users_password,users_email,users_phone);


        int i = registerService.register(users);

        if (i>0){
            response.getWriter().println(new Gson().toJson("恭喜你！注册用户成功"));
        }
        else {
            response.getWriter().println(new Gson().toJson("注册失败，请重试"));
        }
        System.out.println(users);
//        String name = request.getParameter("users_username");
//        String password = request.getParameter("users_password");
//        UserDao userDao = new UserDao();
//        Users user = new Users(name, password);
//        ResponseBody body = new ResponseBody();
//        ObjectMapper mapper = new ObjectMapper();
//        if (userDao.insert(user)) {
//            body.setCode(200);
//            body.setData("success");
//        }else {
//            body.setCode(500);
//            body.setData("failed");
//        }
//        mapper.writeValue(response.getWriter(), body);
    }
}
