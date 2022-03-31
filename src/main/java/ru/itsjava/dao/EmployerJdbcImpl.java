package ru.itsjava.dao;

import java.sql.*;

public class EmployerJdbcImpl implements EmployerDao {

    @Override
    public int findAgeByName(String name) {
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
//             Statement statement = connection.createStatement()
//        ) {
//            ResultSet resultSet = statement.executeQuery("select age from schema_online_cource.employers " +
//                            "where name = '" + name + "'");
//            resultSet.next();
//
////            System.out.println(resultSet.getString("name") + resultSet.getInt("Age"));
//        return resultSet.getInt("age");
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return -1;

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("select age from schema_online_cource.employers " +
                     "where name = ?");
        ) {
            preparedStatement.setString(1,"Tanya");
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();

//            System.out.println(resultSet.getString("name") + resultSet.getInt("Age"));
            return resultSet.getInt("age");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return -1;
    }
}
