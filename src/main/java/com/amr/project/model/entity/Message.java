package com.amr.project.model.entity;

public class Message {

    private Long id;
    private Chat chat;
    private User to;
    private User from;
    private String textMessage;
    private boolean viewed;
}
