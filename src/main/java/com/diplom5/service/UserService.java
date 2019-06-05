package com.diplom5.service;

import com.diplom5.entity.ProjectRisk;
import com.diplom5.entity.User;

import java.util.Optional;

public interface UserService {

    Optional<User> findOne(int id);

    Iterable<User> findAll();
}
