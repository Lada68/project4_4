package com.amr.project.model.dto;

import com.amr.project.util.ImgUtil;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ImageDto {
    private Long id;
    private byte[] picture;
}
