package com.amr.project.webapp.controller;

import com.amr.project.model.entity.Shop;
import com.amr.project.service.abstracts.ReadWriteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MarketController {
    private ReadWriteService<Shop, Long> shopService;

    public MarketController(ReadWriteService<Shop, Long> shopService) {
        this.shopService = shopService;
    }

    @GetMapping("/market/{id}")
    public String marketHome(Model model, @PathVariable(value = "id", required = true) Long id) {
        if (shopService.existsById(Shop.class, id)) {
            return "market";
        }
        return "404";
    }
}
