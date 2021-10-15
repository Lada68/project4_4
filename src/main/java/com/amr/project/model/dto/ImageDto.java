package com.amr.project.model.dto;

import com.amr.project.util.ImgUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImageDto {
    private Long id;
    private String url;
    private byte[] picture;

    public String toBase64() {
        return ImgUtil.toBase64img(url, picture);
    }

}
