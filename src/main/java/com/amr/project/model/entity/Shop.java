package com.amr.project.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String description;
    private Country location;
    private List<Item> items = new ArrayList<>();
    private List<Review> reviews;
    private Image logo;
    private int count;
    private double rating;
    private User user;
    private List<Discount> discounts;
    private boolean isModerated;
    private boolean isModerateAccept;
    private String moderatedRejectReason;
    private boolean isPretendentToBeDeleted = false;

}
