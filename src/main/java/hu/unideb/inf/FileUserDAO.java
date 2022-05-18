package hu.unideb.inf;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class FileUserDAO implements UserDAO{


    private List<User> users;

    public FileUserDAO() {
        //deserialization
        try (FileInputStream fis = new FileInputStream("users.ser");
             ObjectInputStream ois = new ObjectInputStream(fis);){
            users = (List<User>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            users = new ArrayList<>();
        }
    }

    /**

     */
    private void serialize(){
        try (FileOutputStream fos = new FileOutputStream("users.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos);){
            oos.writeObject(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveUser(User a) {
        if (!users.contains(a)) users.add(a);
        serialize();
    }

    @Override
    public List<User> getUser() {
        return null;
    }

    @Override
    public void deleteUser(User a) {
        users.remove(a);
        serialize();
    }

    @Override
    public void saveTars(Tars tars) {

    }

    @Override
    public void updateUser(User a) {
        users.remove(a); //change the equals method of the Animal to have a proper working
        users.add(a);
        serialize();
    }




    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public void close() throws Exception {
        serialize();
    }

}
