package com.amr.project.model.dto;

import com.amr.project.util.ImgUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImageMainPageDto {
    private String url;
    private byte[] picture;

}
