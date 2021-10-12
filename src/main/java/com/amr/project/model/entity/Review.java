package com.amr.project.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dignity; //плюсы
    private String flaw; //минусы
    private String text;
    private Date date;
    private Integer rating;
    private User user;
    @ManyToOne
    @JoinColumn(name = "shop_id")
    @JsonIgnore
    private Shop shop;
    @ManyToOne
    @JoinColumn(name = "item_id")
    @JsonIgnore
    private Item item;
    private boolean isModerated;
    private boolean isModerateAccept;
    private String moderatedRejectReason;

    public Review(String dignity, String flaw, String text, Date date, Integer rating, Item item) {
        this.dignity = dignity;
        this.flaw = flaw;
        this.text = text;
        this.date = date;
        this.rating = rating;
        this.item = item;
    }

    public Review(String dignity, String flaw, String text, Date date, Integer rating, Shop shop) {
        this.dignity = dignity;
        this.flaw = flaw;
        this.text = text;
        this.date = date;
        this.rating = rating;
        this.shop = shop;
    }
}
