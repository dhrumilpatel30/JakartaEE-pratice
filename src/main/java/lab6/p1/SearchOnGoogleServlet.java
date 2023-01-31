package lab6.p1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "SearchOnGoogleServlet", value = "lab6/p1/SearchOnGoogleServlet")
public class SearchOnGoogleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String searchTerm = request.getParameter("search");
        response.sendRedirect("https://www.google.co.in/#q="+searchTerm);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String searchTerm = request.getParameter("search");
        response.sendRedirect("https://www.google.co.in/#q="+searchTerm);
    }
}
