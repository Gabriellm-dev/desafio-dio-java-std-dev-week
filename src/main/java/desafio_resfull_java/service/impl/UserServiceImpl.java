package desafio_resfull_java.service.impl;

import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

import desafio_resfull_java.domain.model.User;
import desafio_resfull_java.domain.repository.UserRepository;
import desafio_resfull_java.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exist.");
        }

        return userRepository.save(userToCreate);    
    }

    

    
}
