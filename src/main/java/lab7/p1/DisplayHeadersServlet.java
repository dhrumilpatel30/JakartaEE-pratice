package lab7.p1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "DisplayHeadersServlet", value = "/lab7/p1/DisplayHeadersServlet")
public class DisplayHeadersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Enumeration<String> headernames = request.getHeaderNames();
        while (headernames.hasMoreElements()){
            out.print(request.getHeader(headernames.nextElement()) + "<br>");
        }
        RequestDispatcher rd = request.getRequestDispatcher("index.html");
        rd.include(request,response);
    }
}
