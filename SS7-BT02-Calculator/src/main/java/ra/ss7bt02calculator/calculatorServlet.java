package ra.ss7bt02calculator;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "calculatorServlet", value = "/calculatorServlet")
public class calculatorServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("calculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        double a = Double.parseDouble(request.getParameter("numberA"));
        double b = Double.parseDouble(request.getParameter("numberB"));
        double result = a + b;

        request.setAttribute("NUMBER_A", a);
        request.setAttribute("NUMBER_B", b);
        request.setAttribute("ACTION", action);
        request.setAttribute("RESULT", result);

        switch (action) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
        }

        // Đưa kết quả vào attribute để hiển thị trên trang JSP
        request.setAttribute("RESULT", result);

        // Chuyển hướng đến trang kết quả
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }

    public void destroy() {
    }
}