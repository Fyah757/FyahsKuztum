package com.perscholas.fyahskuztum.service.impl;

import com.perscholas.fyahskuztum.model.User;
import com.perscholas.fyahskuztum.repository.UserRepository;
import com.perscholas.fyahskuztum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    //@Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
