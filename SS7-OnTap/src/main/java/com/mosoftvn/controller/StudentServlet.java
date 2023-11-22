package com.mosoftvn.controller;

import com.mosoftvn.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "studentServlet", value = "/student")
public class StudentServlet extends HttpServlet {
    private List<Student> students = new ArrayList<Student>();

    @Override
    public void init() throws ServletException {
        students.add(new Student("B1", "nguyen van a", "ha tay", 18, "LV01", true));
        students.add(new Student("B2", "nguyen van b", "ha noi", 19, "LV02", false));
    }

    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            showStudent(req, resp);
        } else {
            switch (action) {
                case "add":
                    resp.sendRedirect("views/add-student.jsp");
                    break;
                case "update":
                    // lay ve id tren url bang cach khai bao
                    String studentCode = req.getParameter("id");
                    System.out.println(studentCode);
                    Student student = findByStudentCode(studentCode);
                    req.setAttribute("student", student);
                    req.getRequestDispatcher("views/update-student.jsp").forward(req, resp);
                    break;
                case "delete":
                    String studentCodee = req.getParameter("id");
                    students.remove(findByStudentCode(studentCodee));
                    showStudent(req, resp);
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");

        // lay du lie tu form gui len
        String studentCode = req.getParameter("studentCode");
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        int age = Integer.parseInt(req.getParameter("age"));
        String classroom = req.getParameter("classroom");
        boolean sex = Boolean.parseBoolean(req.getParameter("age"));
        if (action == null) {
            students.add(new Student(studentCode, name, address, age, classroom, sex));
            showStudent(req, resp);
        } else {
            Student studentEdit = findByStudentCode(studentCode);
            studentEdit.setName(name);
            studentEdit.setAddress(address);
            studentEdit.setAge(age);
            studentEdit.setClassroom(classroom);
            studentEdit.setSex(sex);
        }
        showStudent(req, resp);
    }

    public void showStudent(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("students", students);
        req.getRequestDispatcher("views/student.jsp").forward(req, resp);
    }

    public Student findByStudentCode(String studentCode) {
        for (Student student : students) {
            if (student.getStudentCode().equals(studentCode))
                return student;
        }
        return null;
    }
}
