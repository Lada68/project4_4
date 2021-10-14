package com.amr.project.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "coupons")
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
