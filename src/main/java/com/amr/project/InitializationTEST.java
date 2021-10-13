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
    private final ItemDao itemDao;
    private final ReviewDao reviewDao;
    private final ShopDao shopDao;

    @Autowired
    public InitializationTEST(CountryDao countryDao, CategoryDao categoryDao,
                              ItemDao itemDao, ReviewDao reviewDao, ShopDao shopDao) {
        this.countryDao = countryDao;
        this.categoryDao = categoryDao;
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
        countryDao.persist(russia);

        Country ukraine = new Country("Ukraine");
        City lvov = new City("Lvov", ukraine);
        City kiev = new City("Kiev", ukraine);
        List<City> ukr = new ArrayList<>();
        ukr.add(lvov);
        ukr.add(kiev);
        ukraine.setCities(ukr);
        countryDao.persist(ukraine);


        // Categories
        Category phoneCategory = new Category("Phone");
        Category computerCategory = new Category("Computer");
        Category otherCategory = new Category("Other");

        categoryDao.persist(phoneCategory);
        categoryDao.persist(computerCategory);
        categoryDao.persist(otherCategory);

        List<Category> phoneCategories = new ArrayList<>();
        phoneCategories.add(phoneCategory);
        List<Category> computerCategories = new ArrayList<>();
        computerCategories.add(computerCategory);
        List<Category> otherCategories = new ArrayList<>();
        otherCategories.add(otherCategory);


// Image

        Image imageforShop1 = new Image("src/main/resources/static/img/stores/mvideo.png");
        Image imageforShop2 = new Image("src/main/resources/static/img/stores/mvideo.png");
        Image imageforShop3 = new Image("src/main/resources/static/img/stores/mvideo.png");
        Image imageforShop4 = new Image("src/main/resources/static/img/stores/mvideo.png");
        Image imageforShop5 = new Image("src/main/resources/static/img/stores/mvideo.png");

        Image imageforItem1 = new Image("src/main/resources/static/img/goods/iphone.png");
        Image imageforItem2 = new Image("src/main/resources/static/img/goods/iphone.png");
        Image imageforItem3 = new Image("src/main/resources/static/img/goods/iphone.png");
        Image imageforItem4 = new Image("src/main/resources/static/img/goods/iphone.png");
        Image imageforItem5 = new Image("src/main/resources/static/img/goods/iphone.png");


        //Shops
        Shop mvideoShop = new Shop("Mvideo", "mvideo@mvideo.ru",
                "88005553535", "краткое описание", russia, 5.0, imageforShop1);
        shopDao.persist(mvideoShop);

        Shop shop1 = new Shop("shop1", "shop1@shop1.ru",
                "88005553535", "весьма краткое описание", ukraine, 3.0, imageforShop2);
        shopDao.persist(shop1);

        Shop shop2 = new Shop("shop2", "shop2@shop2.ru",
                "88005553535", "краткое описание", russia, 4.3, imageforShop3);
        shopDao.persist(shop2);

        Shop shop3 = new Shop("shop3", "shop3@shop3.ru",
                "88005553535", "краткое описание", ukraine, 2.0, imageforShop4);
        shopDao.persist(shop3);

        Shop shop4 = new Shop("shop4", "shop4@shop4.ru",
                "88005553535", "краткое описание", russia, 4.8, imageforShop5);
        shopDao.persist(shop4);


        // Item
        Item iPhone12 = new Item("IPhone12", new BigDecimal(100000),
                "cool, but very expensive", mvideoShop, 4.5, imageforItem1);
        iPhone12.setCategories(phoneCategories);
        itemDao.persist(iPhone12);

        Item iPhone13 = new Item("IPhone13", new BigDecimal(123456),
                "cool, but very expensive", shop1, 3.1, imageforItem2);
        iPhone13.setCategories(phoneCategories);
        itemDao.persist(iPhone13);

        Item trash = new Item("trash", new BigDecimal(322),
                "trash", shop2, 5.0, imageforItem3);
        trash.setCategories(otherCategories);
        itemDao.persist(trash);

        Item personalComputer = new Item("personalComputer", new BigDecimal(50000),
                " cool personal Computer", shop3, 1.1, imageforItem4);
        personalComputer.setCategories(computerCategories);
        itemDao.persist(personalComputer);

        Item personalComputerAsus = new Item("trash", new BigDecimal(80000),
                "cool personal Computer ASUS", shop4, 4.2, imageforItem5);
        personalComputerAsus.setCategories(computerCategories);
        itemDao.persist(personalComputerAsus);


        // Review ITEM
        Review reviewForIPhone12 = new Review("yes", "no", "very good", new Date(), 5, iPhone12);
        reviewDao.persist(reviewForIPhone12);
        Review review2 = new Review("yes", "no", "good", new Date(), 4, iPhone13);
        reviewDao.persist(review2);
        Review review3 = new Review("yes", "no", "norm", new Date(), 3, personalComputerAsus);
        reviewDao.persist(review3);
        Review review4 = new Review("yes", "no", "bad", new Date(), 2, personalComputer);
        reviewDao.persist(review4);
        Review review5 = new Review("yes", "no", "very bad", new Date(), 1, trash);
        reviewDao.persist(review5);


        // Review SHOP
        Review reviewShop1 = new Review("+", "-", "very bad", new Date(), 1, shop1);
        reviewDao.persist(reviewShop1);
        Review reviewShop2 = new Review("+", "-", "bad", new Date(), 2, shop2);
        reviewDao.persist(reviewShop2);
        Review reviewShop3 = new Review("+", "-", "norm", new Date(), 3, shop3);
        reviewDao.persist(reviewShop3);
        Review reviewShop4 = new Review("+", "-", "good", new Date(), 4, shop4);
        reviewDao.persist(reviewShop4);
        Review reviewShop5 = new Review("+", "-", "very good", new Date(), 5, mvideoShop);
        reviewDao.persist(reviewShop5);
    }
}
