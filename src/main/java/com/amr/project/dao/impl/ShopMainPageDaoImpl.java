package com.amr.project.dao.impl;

import com.amr.project.dao.abstracts.ShopMainPageDao;
import com.amr.project.model.entity.Shop;

import java.util.List;

public class ShopMainPageDaoImpl extends ReadWriteDaoImpl<Shop, Long> implements ShopMainPageDao {

    @Override
    public List<Shop> findPopularShops() {
        return em.createQuery("Select u from Shop u order by u.rating DESC", Shop.class)
                .setMaxResults(5)
                .getResultList();
    }
}
