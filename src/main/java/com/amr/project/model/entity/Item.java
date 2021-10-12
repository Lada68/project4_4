package com.amr.project.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal price;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(name = "item_categories", joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categories = new ArrayList<>();

    @OneToMany(mappedBy = "item",
            cascade = CascadeType.PERSIST)
    @ToString.Exclude
    private List<Image> images; // вернусь в конце

    @OneToMany(mappedBy = "item",
            cascade = CascadeType.PERSIST)
    @ToString.Exclude
    private List<Review> reviews;

    private Integer count;

    private Double rating;

    private String description;

    private Integer discount;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    @JsonIgnore
    private Shop shop;

    private boolean isModerated;
    private boolean isModerateAccept;
    private String moderatedRejectReason;
    private boolean isPretendentToBeDeleted;

    public Item(String name, BigDecimal price,String description, Shop shop) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.shop = shop;
    }
}
