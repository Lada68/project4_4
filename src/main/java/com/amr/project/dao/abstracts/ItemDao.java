package com.amr.project.dao.abstracts;

import com.amr.project.model.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDao extends JpaRepository<Item,Long> {
    Item findItemById(Long id);
}
