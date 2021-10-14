package com.amr.project.converter;

import com.amr.project.model.dto.CategoryMainPageDto;
import com.amr.project.model.dto.ItemMainPageDTO;
import com.amr.project.model.dto.ShopMainPageDTO;
import com.amr.project.model.entity.Category;
import com.amr.project.model.entity.Item;
import com.amr.project.model.entity.Shop;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MainPageShowConverter {

    private final ShowMainPageDTOMapper mapper = Mappers.getMapper(ShowMainPageDTOMapper.class);

    public List<ItemMainPageDTO> itemListToListItemMainPageDTO(List<Item> list) {
        return mapper.itemListToListItemMainPageDTO(list);
    }

    public List<ShopMainPageDTO> shopListToListShopMainPageDTO(List<Shop> list) {
        return mapper.shopListToListShopMainPageDTO(list);
    }

    public List<CategoryMainPageDto> categoryListToListCategoryMainPageDTO(List<Category> list) {
        return mapper.categoryListToListCategoryMainPageDTO(list);
    }
}
