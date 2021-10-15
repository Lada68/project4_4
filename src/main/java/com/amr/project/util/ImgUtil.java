package com.amr.project.util;

import java.util.Base64;

import java.io.*;

public final class ImgUtil {

    /**
     * Convert a file to a byte array
     * @param url a picture file path, for example "src/static/img/name.jpg"
     * @return a byte array
     */
    public static byte[] toByteArr(String url) {
        
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(url));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {

            int byteBlock;
            while ((byteBlock = bufferedInputStream.read()) != -1) {
                byteArrayOutputStream.write((byte) byteBlock);
            }
            return byteArrayOutputStream.toByteArray();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return new byte[0];
    }

    /**
     * Build a picture of base64 string format
     * @param url a picture file path, for example "src/static/img/name.jpg"
     * @param picture a byte array
     * @return a base64 format picture
     */
    public static String toBase64img(String url, byte[] picture) {
        return new StringBuilder("data:image/")
                .append(url.substring(url.lastIndexOf(".") + 1)).append(";base64,")
                .append(Base64.getEncoder().encodeToString(picture)).toString();
    }

}
