package com.henriqueborba.userdept.controllers;

import com.henriqueborba.userdept.entities.User;
import com.henriqueborba.userdept.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    private final UserRepository repository;

    @GetMapping
    public List<User> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PostMapping
    public User insert(@RequestBody User user) {
        return repository.save(user);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PutMapping
    public User update(@RequestBody User user) {
        return repository.save(user);
    }
}
