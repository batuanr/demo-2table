package dao;

import config.ConnectionSingleton;
import model.Address;
import model.Classes;
import model.Student;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements IStudent{
    private static final String SELECT_ALL = "select * from Students";
    IClass iClass = new ClassDAO();
    IAddress iaddress = new AddressDAO();
    private Connection connection = ConnectionSingleton.getConnection();
    @Override
    public Student selectStudent(int id) {
        return null;
    }

    @Override
    public List<Student> selectAll() {
        List<Student> studentList = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("fullName");
                int addressID = resultSet.getInt("addressID");
                int classesID = resultSet.getInt("classID");
                Classes classes = iClass.findClassById(classesID);
                String phone = resultSet.getString("phone");

                Address address = iaddress.findAddressById(addressID);
                studentList.add(new Student(id, name, address, phone, classes));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentList;
    }
}
