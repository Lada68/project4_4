package com.amr.project.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(
            mappedBy = "country",
            cascade = {CascadeType.REFRESH, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REMOVE}
    )
    private List<City> cities;

    public Country(String name) {
        this.name = name;
    }

    public Country() {
    }
}
