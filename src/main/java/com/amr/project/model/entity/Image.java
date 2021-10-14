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
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;

    private byte[] picture;
    private Boolean isMain = false;
    @Transient
    private User user;

    @ManyToOne
    @JoinColumn(name = "item_id")
    @JsonIgnore
    private Item item;

    @OneToOne(mappedBy = "logo", cascade = CascadeType.ALL)
    private Item itemLogo;

    @OneToOne(mappedBy = "logo", cascade = CascadeType.ALL)
    private Shop shop;

    public Image(String url, byte[] picture) {
        this.url = url;
        this.picture = picture;
    }

    public Image(String url, Item item) {
        this.url = url;
        this.item = item;
    }

    public Image(String url, Shop shop) {
        this.url = url;
        this.shop = shop;
    }

    public Image(String url) {
        this.url = url;
    }
}
