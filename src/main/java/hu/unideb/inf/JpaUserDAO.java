package hu.unideb.inf;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class JpaUserDAO implements UserDAO {
    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public void saveUser(User a) {
        entityManager.getTransaction().begin();
        entityManager.persist(a);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<User> getUser() {
        return null;
    }

    @Override
    public List<User> getUsers() {
        TypedQuery<User> query = entityManager.createQuery(
                "SELECT a FROM User a", User.class);
        List<User> users = query.getResultList();
        return users;
    }

    @Override
    public void updateUser(User a) {
        entityManager.getTransaction().begin();
        entityManager.persist(a);
        entityManager.getTransaction().commit();
        //saveAnimal(a);
    }

    @Override
    public void deleteUser(User a) {
        entityManager.getTransaction().begin();
        entityManager.remove(a);
        entityManager.getTransaction().commit();
    }

    @Override
    public void saveTars(Tars tars) {
        entityManager.getTransaction().begin();
        entityManager.remove(tars);
        entityManager.getTransaction().commit();
    }

    @Override
    public void close() throws Exception {
        entityManager.close();
        entityManagerFactory.close();
    }
}
