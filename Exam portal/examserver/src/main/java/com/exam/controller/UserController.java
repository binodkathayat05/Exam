package com.exam.controller;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping(value = "/user")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserService userService;

    //creating user
    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {
        Set<UserRole> roles = new HashSet<>();
        user.setProfile("Default.png");
        Role role = new Role();
        role.setRoleName("NORMAL");
        role.setRoleID(45L);
        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);
        roles.add(userRole);
        return this.userService.createUser(user, roles);
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username)
    {
        return this.userService.getUser(username);
    }

   //delete the user by  id
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long userID){
        this.userService.deleteUser(userID);
    }

    //update the user phone number
    @PutMapping("/")
    public void updateUser(@RequestBody User user) throws Exception {
         this.userService.updateUser(user);
    }

    @PutMapping("/{userName}/{userPhone}")
    public void updateUserUpdatePhone(@PathVariable String userName,@PathVariable String userPhone) throws Exception {
         this.userService.updateUserUpdatePhone(userName,userPhone);
    }
}
