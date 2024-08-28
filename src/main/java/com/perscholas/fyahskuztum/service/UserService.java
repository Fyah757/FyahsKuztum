package com.perscholas.fyahskuztum.service;

import com.perscholas.fyahskuztum.model.Role;
import com.perscholas.fyahskuztum.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();

    void saveUser(User user);
}
