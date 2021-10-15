package com.amr.project.service.impl;

import com.amr.project.dao.abstracts.UserDao;
import com.amr.project.model.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ReadWriteServiceImpl<User, Long> {
    private UserDao userDao;

    public UserService(UserDao userDao) {
        super(userDao);
    }

    public User findUserByUsername(String username) {
        return userDao.findUserByUsername(username);
    }
}
