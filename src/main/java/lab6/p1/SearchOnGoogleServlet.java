package lab6.p1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

@WebServlet(name = "SearchOnGoogleServlet", value = "/lab6/p1/SearchOnGoogleServlet")
public class SearchOnGoogleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String searchTerm = request.getParameter("search");
        String searchURL = "https://www.google.com/search?q="+searchTerm;
        Document doc =  Jsoup.connect(searchURL).userAgent("Mozilla/5.0").get();
        Elements links = doc.select("a[href]");
        response.sendRedirect(links.attr("href"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
