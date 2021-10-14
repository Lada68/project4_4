package com.amr.project;

import com.amr.project.dao.abstracts.ItemDao;
import com.amr.project.dao.impl.ItemDaoImpl;
import com.amr.project.model.entity.Item;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.Optional;

@SpringBootApplication(exclude = {SessionAutoConfiguration.class, SecurityAutoConfiguration.class})
@EnableAsync
public class ProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
        System.err.println("    APP START");
    }

}