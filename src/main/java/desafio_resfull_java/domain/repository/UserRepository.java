package desafio_resfull_java.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import desafio_resfull_java.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
