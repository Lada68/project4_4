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

    public String toBase24() {
        return "data:image/" + url.substring(url.lastIndexOf(".") + 1) + ";base64," + ImgUtil.byteArrToBase24(picture);
    }

}
