package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:testjava.db")) {
            System.out.println("connection opened");
            Statement statement = conn.createStatement();

            //-----
            conn.setAutoCommit(false);
            // does not commit automatically
            // by default, jdbc auto commit all queries

//            statement.execute("CREATE TABLE IF NOT EXISTS contacts (name TEXT, phone INTEGER, email TEXT)");
//
//             statement.execute("INSERT INTO  contacts (name, phone, email) " +
//                     "VALUES ('Joaquim', 11964646, 'rafael@email.com')");
//
//             statement.execute("UPDATE contacts set phone=123 WHERE name='Joaquim'");
//             statement.execute("DELETE FROM contacts where name='Joaquim'");

            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();
            // can only have 1 result set associated
            while (results.next()) {
                String name = results.getString("name");
                Integer integer = results.getInt("phone");
                String email = results.getString("email");
                System.out.println(name + " " + integer + " " + email);
            }
//            System.out.println(results.getObject(1));

             conn.commit();

            if (!results.isClosed()) {
                results.close();
            }

            if (!statement.isClosed()) {
                // close the statement first
                statement.close();
                System.out.println("statement closed");
            }
            if (!conn.isClosed()) {
                conn.close();
                System.out.println("connection closed");
            }
        } catch (SQLException e) {
            System.out.println("something went wrong " + e.getMessage());
        }
    }
}