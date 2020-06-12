package cn.tedu.gyf.servlet;

import com.google.gson.Gson;
import jdk.nashorn.internal.parser.JSONParser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HelloServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("into helloServlet！");
        Gson gson=new Gson();
        BufferedReader br=null;
        try{
            br=new BufferedReader(new InputStreamReader(req.getInputStream()));
            String str=null;
            StringBuilder res=new StringBuilder();
            while((str=br.readLine())!=null){
                res.append(str);
            }
            System.out.println(res);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setHeader("content-type", "text/html;charset=UTF-8");
//        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        resp.getWriter().println("<h1>Hello servlet!</h1><h2>中文</h2>");
    }
}
