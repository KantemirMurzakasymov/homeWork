package org.example.daoPackage;

import org.example.modelPackage.Student;
import utilPackage.JDBConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBC implements UserDao {

        public UserDaoJDBC() {

        }

        public void createUsersTable() {
                String query = " CREATE TABLE if NOT EXISTS student (id BIGINT PRIMARY KEY, first_name VARCHAR(20) NOT NULL,last_name VARCHAR(20) NOT NULL,age int )";

                try {
                        Statement statement = JDBConnector.connection().createStatement();
                        statement.execute(query);

                        System.out.println("Successfully Created");

                } catch (SQLException e) {
                        System.out.println(e.getMessage());
                }
        }

        public void dropUsersTable() {
                String dropequery = " DROP TABLE student ";
                try {
                        Statement statement = JDBConnector.connection().createStatement();
                        statement.execute(dropequery);
                } catch (SQLException e) {
                       System.out.println(e.getMessage());
                }

        }

        @Override
        public void saveUser(String name, String lastName, byte age) {
                String query = "INSERT INTO student(first_name,last_name,age)VALUES(?,?,?)";
                try (PreparedStatement preparedStatement = JDBConnector.connection().prepareStatement(query)) {
                        //preparedStatement.setLong(1, id);
                        preparedStatement.setString(1, name);
                        preparedStatement.setString(2, lastName);
                        preparedStatement.setByte(3, age);
                        preparedStatement.execute();

                } catch (SQLException e) {
                        System.out.println(e.getMessage());
                }

        }

        @Override
        public void removeUserByName(String name) {
                String sql = "DELETE FROM student WHERE first_name = ?";
                try {
                        PreparedStatement statement = JDBConnector.connection().prepareStatement(sql);
                        statement.setString(1, name);

                        int rowsDeleted = statement.executeUpdate();
                        if (rowsDeleted > 0)
                                System.out.println("A user was deleted successfully!" + name);
                } catch (SQLException e) {
                        System.out.println(e.getMessage());
                }

        }
                       public List<Student> getAllUsers () {
                        String qery = "SELECT * FROM student;";
                        List<Student> allStudents = new ArrayList<Student>();
                        try (Statement statement = JDBConnector.connection().createStatement()) {
                                ResultSet resultSet = statement.executeQuery(qery);
                                while (resultSet.next()) {
                                        Student student = new Student();
                                        //student.getId(resultSet.getLong(1));
                                        student.getFirst_name(resultSet.getString("first_name"));
                                        student.getLast_name(resultSet.getString("last_name"));
                                        student.getAge(resultSet.getByte(3));
                                        allStudents.add(student);
                                }

                        } catch (SQLException e) {
                                System.out.println(e.getMessage());
                        }
                        return allStudents;
                }
                public void cleanUsersTable() {

                String deletequery = " DELETE  FROM student ";
                        try {
                                Statement statement = JDBConnector.connection().createStatement();
                                statement.execute(deletequery);
                        } catch (SQLException e) {
                                System.out.println(e.getMessage());
                        }

        }


}


