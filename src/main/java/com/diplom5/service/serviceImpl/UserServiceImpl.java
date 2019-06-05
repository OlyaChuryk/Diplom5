package com.diplom5.service.serviceImpl;

import com.diplom5.entity.User;
import com.diplom5.repository.UserRepo;
import com.diplom5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    User userEntity;
    @Override
    public User findOne(int id) {
        return userRepo.getOne(id);

    }



    @Override
    public List<User> findAll() {
        return (List<User>) userRepo.findAll();
    }


}
