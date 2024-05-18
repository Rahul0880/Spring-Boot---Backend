package com.example.demo3.controller;
import com.example.demo3.Services.UsersDAOService;
import com.example.demo3.entities.Users;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name="ListUserController")
public class ListUsersController {

    @Autowired(required = true)
    private UsersDAOService dao;

    @GetMapping(path="ListUser")
    public List<Users> getUsers()
    {
        return dao.getAllUsers();
    }

    @PostMapping(path="/add")
    public Users addUser(@Validated @RequestBody Users user)
    {
        return dao.add(user);
    }

    @GetMapping(path="ListUser/{id}")

    public Users getUserSpecefic(@PathVariable long id)
    {
        return dao.getUser(id);
    }

    @DeleteMapping(path="remove/{id}")
    public Users removeUser(@PathVariable long id)
    {
        return dao.deleting(id);
    }

    @PutMapping(path = "Listuser/{id}")
    @Operation(summary = "Update user by ID")
    public String updateUserById(@PathVariable long id, @RequestBody Users updatedUser) {
        boolean updated = dao.updateUser(id, updatedUser.getName(), updatedUser.getDob());
        if (updated) {
            return "User with ID " + id + " has been updated successfully.";
        } else {
            return "User with ID " + id + " not found.";
        }
    }

}
