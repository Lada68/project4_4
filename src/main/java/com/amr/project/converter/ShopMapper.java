package com.amr.project.converter;

import com.amr.project.model.dto.*;
import com.amr.project.model.entity.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ShopMapper {
    ShopMapper INSTANCE = Mappers.getMapper(ShopMapper.class);

    @Mapping(target = "username", source = "user.username")
    ShopDto shopToDto(Shop shop);

    CountryDto countryToDto(Country country);

    ItemDto itemToDto(Item item);

    ReviewDto reviewToDto(Review review);

    ImageDto imageToDto(Image image);

    CategoryDto categoryDto(Category category);
}
