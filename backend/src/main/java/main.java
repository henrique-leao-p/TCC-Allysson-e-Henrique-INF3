import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class main {
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;
    public static void main(String[] args) {

            entityManagerFactory = Persistence.createEntityManagerFactory("postgresql-home");
            entityManager = entityManagerFactory.createEntityManager();
    }
}
