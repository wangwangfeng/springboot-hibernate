package com.example.hibernate.service.impl;

import com.example.hibernate.entity.User;
import com.example.hibernate.mapper.UserMapper;
import com.example.hibernate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @time: 2022/4/22 9:48
 * @user: wwf
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void saveUser(User user) {
        userMapper.save(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.save(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteById(id);
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.findById(id).get();
    }

    @Override
    public List<User> getUser() {
        return (List<User>) userMapper.findAll();
    }
}
