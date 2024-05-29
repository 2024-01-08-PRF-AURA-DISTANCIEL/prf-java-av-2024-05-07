package fr.maboite.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="CustomHeader", urlPatterns="/custom-header", loadOnStartup = 1)
public class CustomHeaderServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set content type
        response.setContentType("text/plain");

        // Add custom headers
        response.addHeader("Custom-Header", "This is a custom header");
        response.addHeader("Another-Header", "Another header value");

        // Get request parameters
        String name = request.getParameter("name");
        if (name == null) {
            name = "World";
        }

        // Write response
        try (PrintWriter out = response.getWriter()) {
            out.println("Hello, " + name + "!");
        }
    }

    @Override
    public String getServletInfo() {
        return "Servlet that demonstrates custom headers and request parameters.";
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("CustomHeaderServlet initialized");
    }
}
