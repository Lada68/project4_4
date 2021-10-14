package com.amr.project.model.entity;

import com.amr.project.util.ImgUtil;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "images")
public class Image extends ImgUtil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;

    @Column(columnDefinition = "mediumblob")
    private byte[] picture;

    private Boolean isMain = false;

    public Image(String url) {
        this.url = url;
        this.picture = toByteArray(url);
    }

    public Image() {

    }

}
