package lab7.q1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "LoginVerifierServlet", value = "/LoginVerifierServlet")
public class LoginVerifierServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter out = response.getWriter();

        if(username.equals("dhrumil") && password.equals("1234")){

            out.print("Successful login<br>");
        }
        else {
            out.println("Sorry Username or password error");
            RequestDispatcher rd = request.getRequestDispatcher("/lab7/q1/Login.html");
            rd.include(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
