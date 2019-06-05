package com.diplom5.service;

import com.diplom5.entity.User;

import java.util.List;

public interface UserService {

    User findOne(int id);
    List<User> findAll();
}
