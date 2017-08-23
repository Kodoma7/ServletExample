package com.kodoma.servlets;

import com.kodoma.dao.ContactDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        System.out.println("start");
        ContactDAO dao = ContactDAO.getInstance();
        System.out.println("stop");

        PrintWriter pw = resp.getWriter();
        pw.println("<H1>Hello:)</H1>");
    }
}
