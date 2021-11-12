package dao;

import config.ConnectionSingleton;
import model.Address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddressDAO implements IAddress{
    @Override
    public Address findAddressById(int id) {
        Connection connection = ConnectionSingleton.getConnection();
        Address address = null;
        try {
            PreparedStatement statement = connection.prepareStatement("select * from Address where id = ?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                String addresss = resultSet.getString("address");
                address = new Address(id, addresss);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return address;
    }
}
