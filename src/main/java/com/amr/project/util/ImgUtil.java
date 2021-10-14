package com.amr.project.util;

import java.util.Base64;

import java.io.*;

public class ImgUtil {

    /**
     * Convert file to byte array
     * @param url – file path
     * @return byte array
     */
    public static byte[] toByteArray(String url) {
        
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
     * Convert byte array to base24 image format
     * @param byteArr – byte array
     * @return base24 string
     */
    public static String byteArrToBase24(byte[] byteArr) {
        return Base64.getEncoder().encodeToString(byteArr);
    }

}
