package com.perscholas.fyahskuztum.service;

import com.perscholas.fyahskuztum.model.User;

import java.util.List;

public interface UserService {

    User findByEmail(String email);
    User saveUser(User user);

}
