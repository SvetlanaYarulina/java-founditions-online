package ru.itsjava.jdbc;

import ru.itsjava.dao.EmployerDao;
import ru.itsjava.dao.EmployerJdbcImpl;

public class JdbcPractice {


    public static void main(String[] args) {
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
//             Statement statement = connection.createStatement()
//        ) {
//            ResultSet resultSet = statement.executeQuery("select name, age from schema_online_cource.employers");
//            resultSet.next();
//
//            System.out.println(resultSet.getString("name") + resultSet.getInt("Age"));
//
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();

         EmployerDao dao =  new EmployerJdbcImpl();
        System.out.println("dao.findAgeByName(\"Tanya\") = " + dao.findAgeByName("Tanya"));
    }
}


