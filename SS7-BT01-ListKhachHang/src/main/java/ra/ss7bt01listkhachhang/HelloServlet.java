package ra.ss7bt01listkhachhang;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/customerList")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new Customer("1", "Mai Văn Hoàn", "1983-08-20", "Hà Nội", "ảnh 1"));
        customerList.add(new Customer("2", "Nguyễn Văn Nam", "1983-08-20", "Bắc Giang", "ảnh 2"));
        customerList.add(new Customer("3", "Nguyễn Thái Hòa", "1983-08-21", "Nam Định", "ảnh 3"));
        customerList.add(new Customer("4", "Trần Đăng Khoa", "1983-08-22", "Hà Tây", "ảnh 4"));
        customerList.add(new Customer("5", "Nguyễn Đình Thi", "1983-08-17", "Hà Nội", "ảnh 5"));

        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("customer-list.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    public void destroy() {
    }
}