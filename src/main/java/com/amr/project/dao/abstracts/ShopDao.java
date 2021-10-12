package com.amr.project.dao.abstracts;

import com.amr.project.model.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopDao extends JpaRepository<Shop,Long> {
}
