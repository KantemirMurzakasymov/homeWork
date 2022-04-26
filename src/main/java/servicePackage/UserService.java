package servicePackage;

import org.example.modelPackage.Student;

import java.util.List;

public interface UserService {

        void createUsersTable();

        void dropUsersTable();

        void saveUser(String name, String lastName, byte age, long id);

        void removeUserById(long id);


        List<Student> getAllUsers();

        void cleanUsersTable();
}


