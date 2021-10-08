package com.amr.project.model.entity;

import java.math.BigDecimal;
import java.util.List;

public class Item {

    private Long id;
    private String name;
    private BigDecimal price;
    private List<Category> categories;
    private List<Image> images;
    private List<Review> reviews;
    private Integer count;
    private Double rating;
    private String description;
    private Integer discount;
    private Shop shop;
    private boolean isModerated;
    private boolean isModerateAccept;
    private String moderatedRejectReason;
    private boolean isPretendentToBeDeleted;

}
