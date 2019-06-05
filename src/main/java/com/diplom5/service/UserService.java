package com.diplom5.service;

import com.diplom5.entity.User;

public interface UserService {

    User findOne(int id);

    Iterable<User> findAll();
}
