package dao;

import config.ConnectionSingleton;
import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements IStudent{
    private static final String SELECT_ALL = "select S.id, S.fullName,S.phone, C.name, address from Students S" +
            " join Address A on A.id = S.addressID" +
            " join Classes C on C.id = S.classID";
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
                String address = resultSet.getString("address");
                String phone = resultSet.getString("phone");
                String classes = resultSet.getString("name");
                studentList.add(new Student(id, name, address, phone, classes));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentList;
    }
}
