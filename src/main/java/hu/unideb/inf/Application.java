package hu.unideb.inf;

import org.h2.tools.Server;

import java.sql.SQLException;

public class Application {

    public static void main(String[] args) throws SQLException {
        startDatabase();


        try(UserDAO aDAO = new JpaUserDAO();) {
            User a = new User();
            a.setName("Tibike");
            a.setAge(21);
            a.setGender(User.GenderType.MALE);


            Tars tars = new Tars();
            tars.setName("Rebeka");
            tars.getUsers().add(a);
            aDAO.saveTars(tars);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void startDatabase() throws SQLException {
        new Server().runTool("-tcp", "-web", "-ifNotExists");
    }
}
