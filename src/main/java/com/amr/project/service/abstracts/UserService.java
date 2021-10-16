package com.amr.project.service.abstracts;


import com.amr.project.model.entity.User;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserService {
    UserDetails findUserByUsername(String username);
    boolean registerNewUser(User user);
}
