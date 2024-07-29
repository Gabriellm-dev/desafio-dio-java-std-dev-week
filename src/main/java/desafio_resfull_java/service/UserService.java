package desafio_resfull_java.service;

import desafio_resfull_java.domain.model.User;

public interface UserService {
    
    User findById(Long id);

    User create(User userToCreate);

    
    
}
