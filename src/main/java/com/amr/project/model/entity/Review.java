package com.amr.project.model.entity;

import java.util.Date;

public class Review {

    private Long id;
    private String dignity; //плюсы
    private String flaw; //минусы
    private String text;
    private Date date;
    private Integer rating;
    private User user;
    private Shop shop;
    private Item item;
    private boolean isModerated;
    private boolean isModerateAccept;
    private String moderatedRejectReason;
}
