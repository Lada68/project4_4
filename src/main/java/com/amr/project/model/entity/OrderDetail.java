package com.amr.project.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "orderdetails")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal total;
    private String currency;
    private String method;
    private String intent;
    private String description;
    private String country;
    private String city;
    private String zip;
    private String street;
    private String house;
    private String buyerName;
    private String buyerPhone;

}
