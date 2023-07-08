import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repository.UserRepository;

@Component
public class main {

    @Autowired
    private static UserRepository repository;
    public static void main(String[] args) {
        User user = new User();




        user.setName("Rhuan");
        repository.insert(user);


    }
}
