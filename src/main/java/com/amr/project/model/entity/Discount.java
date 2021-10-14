package com.amr.project.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer minOrder;
    private Integer percentage;
    private Integer fixedDiscount;
    @ManyToOne
    @JoinColumn(name = "shop_id")
    @JsonIgnore
    private Shop shop;
    private User user;

    public Discount(Integer minOrder, Integer percentage, Integer fixedDiscount, Shop shop) {
        this.minOrder = minOrder;
        this.percentage = percentage;
        this.fixedDiscount = fixedDiscount;
        this.shop = shop;
    }
}
