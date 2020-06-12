package cn.tedu.gyf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "doServlet",urlPatterns = "/doServlet")
public class DoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        System.out.println("doServlet get the request and deal the requset");
        resp.getWriter().println("doServlet's response");
        resp.getWriter().println("<a href=\"hello.html\"><button>Back</button></a>");
    }
}
