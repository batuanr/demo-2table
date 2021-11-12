package dao;

import config.ConnectionSingleton;
import model.Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClassDAO implements IClass{
    @Override
    public Classes findClassById(int id) {
        Connection con = ConnectionSingleton.getConnection();
        Classes classes = null;
        try {
            PreparedStatement statement = con.prepareStatement("select * from Classes where id = ?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String language = resultSet.getString("language");
                String description = resultSet.getString("description");
                classes = new Classes(id, name, language, description);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return classes;
    }
}
