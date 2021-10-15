package com.amr.project.dao.impl;

import com.amr.project.dao.abstracts.UserDao;
import com.amr.project.model.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends ReadWriteDaoImpl<User, Long> implements UserDao {
    @Override
    public User findUserByUsername(String username) {
        return em.createQuery("select User from User as u where u.username=:username", User.class).setParameter("username", username).getSingleResult();
    }
}
