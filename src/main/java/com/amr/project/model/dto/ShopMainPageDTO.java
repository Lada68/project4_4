package com.amr.project.model.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopMainPageDTO {
    private Long id;
    private String name;
    private String description;
    private ImageMainPageDto logo;
}
