package com.amr.project;

import com.amr.project.dao.abstracts.*;
import com.amr.project.model.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class InitializationTEST implements CommandLineRunner {

    private final CountryDao countryDao;
    private final CategoryDao categoryDao;
    private final ImageDao imageDao;
    private final ItemDao itemDao;
    private final ReviewDao reviewDao;
    private final ShopDao shopDao;

    @Autowired
    public InitializationTEST(CountryDao countryDao, CategoryDao categoryDao, ImageDao imageDao,
                              ItemDao itemDao, ReviewDao reviewDao, ShopDao shopDao) {
        this.countryDao = countryDao;
        this.categoryDao = categoryDao;
        this.imageDao = imageDao;
        this.itemDao = itemDao;
        this.reviewDao = reviewDao;
        this.shopDao = shopDao;
    }

    @Override
    public void run(String... args) {

        //Страны и города
        Country russia = new Country("Russia");
        City tambov = new City("Tambov", russia);
        City voronezh = new City("Voronezh", russia);
        List<City> rus = new ArrayList<>();
        rus.add(voronezh);
        rus.add(tambov);
        russia.setCities(rus);
        countryDao.save(russia);

        Country ukraine = new Country("Ukraine");
        City lvov = new City("Lvov", ukraine);
        City kiev = new City("Kiev", ukraine);
        List<City> ukr = new ArrayList<>();
        ukr.add(lvov);
        ukr.add(kiev);
        ukraine.setCities(ukr);
        countryDao.save(ukraine);


        // Categories
        Category phoneCategory = new Category("Phone");
        Category computerCategory = new Category("Computer");
        Category otherCategory = new Category("Other");

        categoryDao.save(phoneCategory);
        categoryDao.save(computerCategory);
        categoryDao.save(otherCategory);

        List<Category> phoneCategories = new ArrayList<>();
        phoneCategories.add(phoneCategory);
        List<Category> computerCategories = new ArrayList<>();
        computerCategories.add(computerCategory);
        List<Category> otherCategories = new ArrayList<>();
        otherCategories.add(otherCategory);


        //Shops
        Shop mvideoShop = new Shop("Mvideo", "mvideo@mvideo.ru",
                "88005553535","краткое описание", russia);
        shopDao.save(mvideoShop);

        Shop shop1 = new Shop("shop1", "shop1@shop1.ru",
                "88005553535","весьма краткое описание", ukraine);
        shopDao.save(shop1);

        Shop shop2 = new Shop("shop2", "shop2@shop2.ru",
                "88005553535","краткое описание", russia);
        shopDao.save(shop2);

        Shop shop3 = new Shop("shop3", "shop3@shop3.ru",
                "88005553535","краткое описание", ukraine);
        shopDao.save(shop3);

        Shop shop4 = new Shop("shop4", "shop4@shop4.ru",
                "88005553535","краткое описание", russia);
        shopDao.save(shop4);


        // Item
        Item iPhone12 = new Item("IPhone12", new BigDecimal(100000),
                "cool, but very expensive", mvideoShop);
        iPhone12.setCategories(phoneCategories);
        itemDao.save(iPhone12);

        Item iPhone13 = new Item("IPhone13", new BigDecimal(123456),
                "cool, but very expensive", shop1);
        iPhone13.setCategories(phoneCategories);
        itemDao.save(iPhone13);

        Item trash = new Item("trash", new BigDecimal(322),
                "trash", shop2);
        trash.setCategories(otherCategories);
        itemDao.save(trash);

        Item personalComputer = new Item("personalComputer", new BigDecimal(50000),
                " cool personal Computer", shop3);
        personalComputer.setCategories(computerCategories);
        itemDao.save(personalComputer);

        Item personalComputerAsus = new Item("trash", new BigDecimal(80000),
                "cool personal Computer ASUS", shop4);
        personalComputerAsus.setCategories(computerCategories);
        itemDao.save(personalComputerAsus);


        // Review ITEM
        Review reviewForIPhone12 = new Review("yes", "no", "very good",new Date(),5,iPhone12);
        reviewDao.save(reviewForIPhone12);
        Review review2 = new Review("yes", "no", "good",new Date(),4,iPhone13);
        reviewDao.save(review2);
        Review review3 = new Review("yes", "no", "norm",new Date(),3,personalComputerAsus);
        reviewDao.save(review3);
        Review review4 = new Review("yes", "no", "bad",new Date(),2,personalComputer);
        reviewDao.save(review4);
        Review review5 = new Review("yes", "no", "very bad",new Date(),1,trash);
        reviewDao.save(review5);


        // Review SHOP
        Review reviewShop1 = new Review("+", "-", "very bad",new Date(),1,shop1);
        reviewDao.save(reviewShop1);
        Review reviewShop2 = new Review("+", "-", "bad",new Date(),2,shop2);
        reviewDao.save(reviewShop2);
        Review reviewShop3 = new Review("+", "-", "norm",new Date(),3,shop3);
        reviewDao.save(reviewShop3);
        Review reviewShop4 = new Review("+", "-", "good",new Date(),4,shop4);
        reviewDao.save(reviewShop4);
        Review reviewShop5 = new Review("+", "-", "very good",new Date(),5,mvideoShop);
        reviewDao.save(reviewShop5);
    }
}
