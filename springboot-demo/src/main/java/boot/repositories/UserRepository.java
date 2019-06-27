package boot.repositories;

import boot.domain.UsersDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UsersDTO,Integer> {
}
