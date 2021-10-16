package com.amr.project.service.impl;

import com.amr.project.dao.abstracts.RoleDao;
import com.amr.project.dao.abstracts.UserDao;
import com.amr.project.model.entity.Role;
import com.amr.project.model.entity.User;
import com.amr.project.service.abstracts.UserService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl extends ReadWriteServiceImpl<User, Long> implements UserService {
    private UserDao userDao;
    private RoleDao roleDao;

    public UserServiceImpl(UserDao userDao) {
        super(userDao);
    }

    public User findUserByUsername(String username) {
        return userDao.findUserByUsername(username);
    }

    public boolean registerNewUser(User user){
        if(userDao.findUserByUsername(user.getUsername()) != null){
            return false;
        }
        Set<Role> role = new HashSet<>();
        role.add(roleDao.getRoleById(2L));
        user.setRoles(role);
        userDao.persist(user);
        return true;
    }

}
