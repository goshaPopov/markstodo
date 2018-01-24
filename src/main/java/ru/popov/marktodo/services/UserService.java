package ru.popov.marktodo.services;

import org.springframework.beans.factory.annotation.Autowired;
import ru.popov.marktodo.entity.User;
import ru.popov.marktodo.repository.UserRepository;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser( ) {
        return null;
    }

}
