package com.amr.project.webapp.rest_controller;

import com.amr.project.converter.UserMapper;
import com.amr.project.model.dto.UserDto;
import com.amr.project.model.entity.User;
import com.amr.project.service.abstracts.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserRestController {
private final UserService userService;
private final UserMapper mapper;

    public UserRestController(UserService userService, UserMapper mapper) {
        this.userService = userService;
        this.mapper = mapper;
    }

    @PostMapping(value = "/signup")
    public boolean register (@RequestBody UserDto userDto) {
        User user = mapper.toModel(userDto);
      return userService.registerNewUser(user);
    }
}
