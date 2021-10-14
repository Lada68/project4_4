package com.amr.project.dao.abstracts;

import com.amr.project.model.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewDao extends ReadWriteDao<Review,Long> {
}
