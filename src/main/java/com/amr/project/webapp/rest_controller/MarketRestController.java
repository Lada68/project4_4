package com.amr.project.webapp.rest_controller;

import com.amr.project.converter.ShopMapper;
import com.amr.project.model.dto.ShopDto;
import com.amr.project.model.entity.Shop;
import com.amr.project.service.abstracts.ReadWriteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/market/api")
public class MarketRestController {
    private ReadWriteService<Shop, Long> shopService;

    public MarketRestController(ReadWriteService<Shop, Long> shopService) {
        this.shopService = shopService;
    }

    @GetMapping("/info/{id}")
    public ShopDto getMarketInfo(@PathVariable(value = "id", required = true) Long id) {
        return shopService.getByKey(Shop.class, id).map(ShopMapper.INSTANCE::shopToDto).orElse(new ShopDto());
    }
}
