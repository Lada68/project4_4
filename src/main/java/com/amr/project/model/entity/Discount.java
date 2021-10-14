package com.amr.project.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "disconts")
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer minOrder;
    private Integer percentage;
    private Integer fixedDiscount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shop_id")
    private Shop shop;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

}
