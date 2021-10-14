package com.amr.project.model.dto;

import java.util.List;


public class ShopDto {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String description;
    private CountryDto location;
    private List<ItemDto> items;
    private ImageDto logo;
    private double rating;
    private String username;
    private boolean isModerated;
    private boolean isModerateAccept;
    private String moderatedRejectReason;
    private boolean isPretendentToBeDeleted;
    private List<ReviewDto> reviews;

}
