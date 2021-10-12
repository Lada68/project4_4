package com.amr.project.dao.abstracts;

import com.amr.project.model.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageDao extends JpaRepository<Image, Long> {
}
