package service;

import dao.StudentDAO;
import dao.StudentDAOImpl;
import model.Student;

import java.util.List;

public class StudentService {

    private final StudentDAO studentDAO;

    public StudentService() {
        studentDAO = new StudentDAOImpl();
    }

    public void addStudent(Student student) {
        studentDAO.addStudent(student);
    }

    public Student searchStudent(int id) {
        return studentDAO.getStudentById(id);
    }

    public List<Student> displayStudents() {
        return studentDAO.getAllStudents();
    }

    public void updateStudent(Student student) {
        studentDAO.updateStudent(student);
    }

    public void deleteStudent(int id) {
        studentDAO.deleteStudent(id);
    }
}
