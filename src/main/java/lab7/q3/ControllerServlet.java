package lab7.q3;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "ControllerServlet ", value = "/lab7/q3/ControllerServlet")
public class ControllerServlet extends HttpServlet {
    public Book[] getList(String genre){
        if(genre.equals("Fiction")){
            Book b1 = new Book("The Alchemist","xyz","Fiction",550);
            Book b2 = new Book("Life of Pi","xyz","Fiction",550);
            Book b3 = new Book("The Martian","xyz","Fiction",550);
            Book b4 = new Book("Harry Potter","xyz","Fiction",550);
            return new Book[]{b1,b2,b3,b4};
        }
        if(genre.equals("Comedy")) {
            Book b1 = new Book("Cruel Shoes","xyz","Comedy",550);
            Book b2 = new Book("You Deserve A Drink","xyz","Comedy",550);
            Book b3 = new Book("The Innocents","xyz","Comedy",550);
            Book b4 = new Book("The Book of Joan","xyz","Comedy",550);
            return new Book[]{b1,b2,b3,b4};
        }
        if(genre.equals("Motivational")) {
            Book b1 = new Book("Think and Grow Rich","xyz","Motivational",550);
            Book b2 = new Book("The Power of Positive Thinking","xyz","Motivational",550);
            Book b3 = new Book("The 5 Second Rule","xyz","Motivational",550);
            Book b4 = new Book("The ONE Thing","xyz","Motivational",550);
            return new Book[]{b1,b2,b3,b4};
        }
        if(genre.equals("Biography")){
            Book b1 = new Book("Satya ke Prayog","xyz","Biography",550);
            Book b2 = new Book("Wings of Fire","xyz","Biography",550);
            Book b3 = new Book("The Diary of a Young Girl","xyz","Biography",550);
            Book b4 = new Book("A Promised Land","xyz","Biography",550);
            return new Book[]{b1,b2,b3,b4};
        }
        if(genre.equals("History")){
            Book b1 = new Book("India's Ancient Past","xyz","History",550);
            Book b2 = new Book("The Art of War","xyz","History",550);
            Book b3 = new Book("The Guns of August","xyz","History",550);
            Book b4 = new Book("Hiroshima","xyz","History",550);
            return new Book[]{b1,b2,b3,b4};
        }
        else{
            return new Book[]{new Book()};
        }
    }   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String genre = request.getParameter("genre-select");
        Book[] arg = getList(genre);
        request.setAttribute("mybooks",arg);
        RequestDispatcher rd = request.getRequestDispatcher("/lab7/q3/DisplayTheList.jsp");
        rd.forward(request,response);
    }
}
