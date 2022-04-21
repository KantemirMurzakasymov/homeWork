package org.example;

import org.example.daoPackage.UserDaoJDBC;
import utilPackage.JDBConnector;

public class App {
    public static void main( String[] args ) {

        JDBConnector.connection();
        UserDaoJDBC dao = new UserDaoJDBC();

        dao.createUsersTable();

//        dao.saveUser("Omke","Babanov", (byte) 22);
//        dao.saveUser("Arzibek","Almash", (byte) 43);
//        dao.saveUser("Gulmira","Malikova", (byte) 21);
//        dao.saveUser("Ainash","Almashova", (byte) 46);

        //dao.removeUserByName("Arzibek");

        //dao.getAllUsers().forEach(System.out::println);

        //dao.cleanUsersTable();

        //dao.dropUsersTable();


    }
}
