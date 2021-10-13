package com.amr.project.model.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopMainPageDTO {
    private String name;
    private String description;
    private ImageMainPageDto logo;
}
