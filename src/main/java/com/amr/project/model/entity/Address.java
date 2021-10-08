package com.amr.project.model.entity;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Address {

    private Long id;
    private String cityIndex;
    private Country country;
    private City city;
    private String street;
    private String house;
    private User user;

}
