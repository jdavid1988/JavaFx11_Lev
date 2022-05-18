package hu.unideb.inf;

import java.util.List;

public interface UserDAO extends AutoCloseable {
    public void saveUser(User a); //CLEAT
    public List<User> getUser(); //READ

    List<User> getUsers();

    public void updateUser(User a); //UPDATE



    public void deleteUser(User a); //DELETE

    public void saveTars(Tars tars);



}
