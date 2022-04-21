package servicePackage;

import org.example.modelPackage.Student;

import java.util.List;

public interface UserService {

        void createUsersTable();

        void dropUsersTable();

        void saveUser(String name, String lastName, byte age);

        void removeUserByNmae(String name );

        List<Student> getAllUsers();

        void cleanUsersTable();
}


