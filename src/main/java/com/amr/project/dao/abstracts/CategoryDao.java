package com.amr.project.dao.abstracts;

import com.amr.project.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Long> {
}
