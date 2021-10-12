package com.amr.project.model.dto;

import com.amr.project.model.entity.Item;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

public interface ItemMainPageDTOMapper {
    ItemMainPageDTOMapper INSTANCE = Mappers.getMapper(ItemMainPageDTOMapper.class);

//    @Mapping(source = "name", target = "name")
//    @Mapping(source = "price", target = "price")
//    @Mapping(source = "description", target = "description")
    @Mappings({
            @Mapping(target="name", source="item.name"),
            @Mapping(target="price", source="item.price"),
            @Mapping(target="description", source="item.description")
    })
    ItemMainPageDTO toDTO(Item item);
//    List<ItemMainPageDTO> toDTO(List<Item> items);
}
