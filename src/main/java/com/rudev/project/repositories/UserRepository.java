
import org.springframework.data.jpa.repository.JpaRepository;
import com.rudev.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
