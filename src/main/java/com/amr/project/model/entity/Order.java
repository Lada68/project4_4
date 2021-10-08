package com.amr.project.model.entity;

import com.amr.project.model.enums.Status;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

public class Order {

    private Long id;
    private List<Item> items;
    private Calendar date;
    private Status status;
    private Address address;
    private BigDecimal total;
    private User user;
    private String buyerName;
    private String buyerPhone;

}
