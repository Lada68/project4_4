package com.amr.project.model.dto;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class UserDto {
    private Long id;
    private String username;
 //   private int age;
//    private String gender;
    private String email;
    private String phone;
 //   private AddressDto address;
//    private ImageDto images;
//    private Calendar birthday;
//    private List<OrderDto> orders = new ArrayList<>();
//    private List<ShopDto> shops = new ArrayList<>();

    public UserDto(Long id, String username, String email, String phone) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    public int getAge() {
//        return age;
//    }

//    public void setAge(int age) {
//        this.age = age;
//    }

//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

//    public AddressDto getAddress() {
//        return address;
//    }
//
//    public void setAddress(AddressDto address) {
//        this.address = address;
//    }
//
//    public ImageDto getImages() {
//        return images;
//    }
//
//    public void setImages(ImageDto images) {
//        this.images = images;
//    }
//
//    public Calendar getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(Calendar birthday) {
//        this.birthday = birthday;
//    }
//
//    public List<OrderDto> getOrders() {
//        return orders;
//    }
//
//    public void setOrders(List<OrderDto> orders) {
//        this.orders = orders;
//    }
//
//    public List<ShopDto> getShops() {
//        return shops;
//    }
//
//    public void setShops(List<ShopDto> shops) {
//        this.shops = shops;
//    }
}
