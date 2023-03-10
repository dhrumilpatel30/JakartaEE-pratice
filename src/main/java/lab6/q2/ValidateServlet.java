package lab6.q2;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.sql.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ValidateServlet", value = "/lab6/q2/ValidateServlet")
public class ValidateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter out = response.getWriter();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student-registration", "root", "")) {
            PreparedStatement ps = con.prepareStatement("select * from student where username=? and password=?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ps.setString(1,username);
            ps.setString(2,password);
            ResultSet rs = ps.executeQuery();
            rs.last();
            if(0 == rs.getRow()){
                out.println("Sorry Username or password error");
                RequestDispatcher rd = request.getRequestDispatcher("/lab6/q2/index.jsp");
                rd.include(request,response);
            }
            else {
                RequestDispatcher rd = request.getRequestDispatcher("/WelcomeServlet");
                rd.forward(request,response);
            }
         } catch (SQLException e) {
            throw new RuntimeException(e);
        }
//        out.println(username+password);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
