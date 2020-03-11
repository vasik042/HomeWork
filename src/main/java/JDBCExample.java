import java.sql.SQLException;

public class JDBCExample {
    public static void main(String[] args) throws SQLException {
        UserDao userDao = new UserDao();

        System.out.println(userDao.getAll());
        System.out.println();

        userDao.insert("Iv", "An", "em@il.com.ua.lviv", "121212");

        System.out.println(userDao.getAll());
        System.out.println();

        System.out.println(userDao.getUser("11@11", "1111"));
        System.out.println();

        userDao.delete("11@11");

        System.out.println(userDao.getAll());
        System.out.println();

    }
}
