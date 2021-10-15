package com.amr.project.model.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CountryDto {
    private Long id;
    private String name;
   // private List<CityDto> cities;
}
