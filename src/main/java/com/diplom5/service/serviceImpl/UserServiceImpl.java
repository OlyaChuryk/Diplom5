package com.diplom5.service.serviceImpl;

import com.diplom5.entity.User;
import com.diplom5.repository.UserRepo;
import com.diplom5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;


    @Override
    public User findOne(int id) {
        return userRepo.findById(id);

    }

    @Override
    public List<User> findAll() {
        return (List<User>) userRepo.findAll();
    }


}
