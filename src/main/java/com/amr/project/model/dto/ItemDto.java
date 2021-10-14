package com.amr.project.model.dto;

import org.mapstruct.Mapper;

import java.math.BigDecimal;
import java.util.List;


public class ItemDto {
    private Long id;
    private String name;
    private String[] categoriesName;
    private Integer count;
    private BigDecimal price;
    private List<ImageDto> images;
    private Double rating;
    private String description;
    private String shopName;
    private boolean isModerateAccept;
    private boolean isModerated;
    private boolean isPretendentToBeDeleted;
    private String moderatedRejectReason;
    private List<CategoryDto> categories;
    private List<ReviewDto> reviews;
    private Long shopId;
}
