import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountCalculatorServlet",urlPatterns = "/display-discount")
public class DiscountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDes = request.getParameter("productDes");
        int listPrice = Integer.parseInt(request.getParameter("listPrice"));
        int discountPer = Integer.parseInt(request.getParameter("discountPercent"));
        double discountAmount = (listPrice*discountPer*0.01);
        double discountPrice = listPrice - discountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("Product Description: "+productDes+"<br><br>");
        writer.println("List Price: "+listPrice+"<br><br>");
        writer.println("Discount Percent: " + discountPer+"<br><br>");
        writer.println("Discount Amount: " + discountAmount+"<br><br>");
        writer.println("Discount price: " + discountPrice+"<br><br>");
        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
