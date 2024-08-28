package com.perscholas.fyahskuztum.controller;

import com.perscholas.fyahskuztum.model.User;
import com.perscholas.fyahskuztum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String listUsers(Model model) {
        List<User> users = userService.getUsers();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/user/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/user/register")
    public String registerUser(@ModelAttribute("user") User user, Model model) {
        userService.saveUser(user);
        model.addAttribute("success", "User registered successfully");
        return "redirect:/users";
    }

    @PostMapping("/user/addRole")
    public String addRoleToUser(@RequestParam String username, @RequestParam String roleName, Model model) {
        userService.addRoleToUser(username, roleName);
        model.addAttribute("success", "Role added to user successfully");
        return "redirect:/users";
    }

    @GetMapping("/user")
    public String getUser(@RequestParam String username, Model model) {
        User user = userService.getUser(username);
        model.addAttribute("user", user);
        return "user-details";
    }
}
