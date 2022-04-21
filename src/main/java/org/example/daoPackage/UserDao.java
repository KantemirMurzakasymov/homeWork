package org.example.daoPackage;

import org.example.modelPackage.Student;

import java.util.List;

public interface UserDao {

        void createUsersTable();

        void dropUsersTable();

        void saveUser(String name, String lastName, byte age);

        void removeUserByName(String name);

        List<Student> getAllUsers();

        void cleanUsersTable();


}
