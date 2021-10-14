package com.amr.project.converter;

import com.amr.project.model.dto.CategoryMainPageDto;
import com.amr.project.model.dto.ItemMainPageDTO;
import com.amr.project.model.dto.ShopMainPageDTO;
import com.amr.project.model.entity.Category;
import com.amr.project.model.entity.Item;
import com.amr.project.model.entity.Shop;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ShowMainPageDTOMapper {
    List<ItemMainPageDTO> itemListToListItemMainPageDTO(List<Item> list);

    List<ShopMainPageDTO> shopListToListShopMainPageDTO(List<Shop> list);

    List<CategoryMainPageDto> categoryListToListCategoryMainPageDTO(List<Category> list);
}
