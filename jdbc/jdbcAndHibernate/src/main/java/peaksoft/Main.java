package peaksoft;

import peaksoft.dao.UserDao;
import peaksoft.dao.UserDaoJdbcImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDao userDao = new UserDaoJdbcImpl();
        userDao.createUsersTable();
        userDao.saveUser("Berddibek","Kurbanbaev", (byte) 28);
        userDao.saveUser("Bayaman","Baraev", (byte) 23);
        userDao.saveUser("Zyinat","Kurbanbaeva", (byte) 29);
        userDao.saveUser("Timurlan","Kasymbev", (byte) 25);
        System.out.println(userDao.getAllUsers());;
        userDao.cleanUsersTable();

    }

}
