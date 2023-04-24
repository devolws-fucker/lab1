package com.example.bootstrap.boooootstrap;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class BootstrapServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = request.getServletPath();
        if (path.equals("/")) {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } else if (path.equals("/contacts")) {
            request.getRequestDispatcher("/contacts.jsp").forward(request, response);
        } else if (path.equals("/about")) {
            request.getRequestDispatcher("/about.jsp").forward(request, response);
        } else if (path.equals("/feedback")) {
            request.getRequestDispatcher("/feedback.jsp").forward(request, response);
        } else {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}