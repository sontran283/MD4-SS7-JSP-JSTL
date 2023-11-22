package com.ra.controller;

import com.ra.model.Student;

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
    private List<Student> students = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        students.add(new Student("A01", "tran van a", "ha noi", 18, "lv01", true));
        students.add(new Student("A02", "tran van b", "ho chi minh", 10, "lv02", false));
        students.add(new Student("A03", "tran van c", "da nang", 19, "lv03", true));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            showStudent(req, resp);
        } else {
            switch (action) {
                case "add":
                    // dieu huong ve trang add-student
                    resp.sendRedirect("views/add-student.jsp");
                    break;
                case "update":
                    // lay ve id tren url bang cach khai bao
                    String studentCode = req.getParameter("id");
                    // khai bao doi tuong
                    Student student = findByStudentCode(studentCode);
                    // mang du lieu di
                    req.setAttribute("student", student);
                    req.getRequestDispatcher("views/update-student.jsp").forward(req, resp);
                    break;
                case "delete":
                    String idDelete = req.getParameter("id");
                    students.remove(findByStudentCode(idDelete));
                    showStudent(req, resp);
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // format phông chữ
        req.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");

        // lay du lieu cua constroll tren form
        String studentCode = req.getParameter("studentCode");
        String studentName = req.getParameter("studentName");
        String address = req.getParameter("address");
        int age = Integer.parseInt(req.getParameter("age"));
        String classRoom = req.getParameter("classRoom");
        boolean sex = Boolean.parseBoolean(req.getParameter("sex"));

        if (action == null) {
            // khoi tao doi tuong student
            Student student = new Student(studentCode, studentName, address, age, classRoom, sex);
            students.add(student);
            showStudent(req, resp);
        } else {
            Student studentEdit = findByStudentCode(studentCode);
            studentEdit.setName(studentName);
            studentEdit.setAddress(address);
            studentEdit.setAge(age);
            studentEdit.setClassroom(classRoom);
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
            if (student.getStudentCode().equals(studentCode)) {
                return student;
            }
        }
        return null;
    }
}
