package com.amr.project.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String phone;

    private String description;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country location;

    @OneToMany(mappedBy = "shop",
            cascade = CascadeType.PERSIST)
    @ToString.Exclude
    private List<Item> items = new ArrayList<>();

    @OneToMany(mappedBy = "shop",
            cascade = CascadeType.PERSIST)
    @ToString.Exclude
    private List<Review> reviews;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "image_id", referencedColumnName = "id")
    private Image logo;

    private int count;

    private double rating;

    @Transient
    private User user;

    @OneToMany(mappedBy = "shop",
            cascade = CascadeType.PERSIST)
    @ToString.Exclude
    private List<Discount> discounts;

    private boolean isModerated;
    private boolean isModerateAccept;
    private String moderatedRejectReason;
    private boolean isPretendentToBeDeleted = false;


    public Shop(String name, String email, String phone, String description, Country location) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.description = description;
        this.location = location;
    }
}
