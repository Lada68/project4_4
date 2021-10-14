package com.amr.project.util;

import java.util.Base64;

import java.io.*;

public class ImgUtil {

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

}
