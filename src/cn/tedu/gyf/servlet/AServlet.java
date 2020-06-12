package cn.tedu.gyf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AServlet",urlPatterns = "/AServlet")
public class AServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("AServlet");
        resp.setContentType("text/html; charset=UTF-8");
        resp.getWriter().println("<h1>AServlet</h1>");
        resp.getWriter().println("<p>AServlet get the request and return a response(this)</p>");
        resp.getWriter().println("<a href=\"hello.html\"><button>Back</button></a>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      doGet(req,resp);
    }
}
