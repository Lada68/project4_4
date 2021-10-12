package com.amr.project.dao.abstracts;

import com.amr.project.model.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City,Long> {
    City findCityById(Long id);
}
