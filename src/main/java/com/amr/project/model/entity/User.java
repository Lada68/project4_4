package com.amr.project.model.entity;


import com.amr.project.model.enums.Gender;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class User implements UserDetails {

    private Long id;
    private String email;
    private String username;
    private String password;
    private boolean activate;
    private String activationCode;
    private String phone;
    private String firstName;
    private String lastName;
    private int age;
    private Address address;
    private Set<Role> roles;
    private Gender gender;
    private Calendar birthday;
    private Image images;
    private List<Coupon> coupons;
    private List<CartItem> cart;
    private List<Order> orders;
    private List<Review> reviews;
    private List<Shop> shops;
    private Favorite favorite;
    private List<Discount> discounts;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return activate;
    }
}
