package com.kodoma.mapper;



import com.kodoma.datasource.User;
import com.kodoma.datasource.UsersList;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class Mapper {
    private UsersList usersList = new UsersList();
    private Map<Integer, User> map = usersList.getMap();

    public UsersList mapToUser(ResultSet resultSet) {
        map.clear();
        User user;
        try {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String fname = resultSet.getString("first_name");
                String lname = resultSet.getString("last_name");
                String address = resultSet.getString("address");
                int phoneNumber = resultSet.getInt("phone_number");
                String groupName = resultSet.getString("group_name");

                user = new User(id, fname, lname, address, phoneNumber, groupName);
                map.put(id, user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usersList;
    }

    public String mapToGroup(ResultSet resultSet) {
        StringBuilder result = new StringBuilder();
        try {
            while (resultSet.next()) {
                result.append(resultSet.getString("group_name") + "\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}
