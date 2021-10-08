package com.amr.project.model.entity;

import java.util.List;

public class Chat {

    private Long id;
    private List<User> members;
    private List<Message> messages;
    private Long hash;
}
