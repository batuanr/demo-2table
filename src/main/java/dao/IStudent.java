package dao;

import model.Student;

import java.util.List;

public interface IStudent {
    public Student selectStudent(int id);
    public List<Student> selectAll();
}
