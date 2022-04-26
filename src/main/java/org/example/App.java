package org.example;

import org.example.daoPackage.UserDaoJDBC;
import utilPackage.JDBConnector;

public class App {
    public static void main( String[] args ) {

        JDBConnector.connection();
        UserDaoJDBC dao = new UserDaoJDBC();

        //dao.createUsersTable();

//        dao.saveUser("Omke","Babanov", (byte) 22,1);
//        dao.saveUser("Arzibek","Almash", (byte) 43,2);
//        dao.saveUser("Gulmira","Malikova", (byte) 21,3);
//        dao.saveUser("Ainash","Almashova", (byte) 46,4);

        //dao.removeUserById(1);

        //dao.getAllUsers().forEach(System.out::println);

        //dao.cleanUsersTable();

        //dao.dropUsersTable();


    }
}
