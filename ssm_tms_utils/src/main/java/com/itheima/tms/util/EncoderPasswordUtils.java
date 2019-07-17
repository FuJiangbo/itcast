package com.itheima.tms.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncoderPasswordUtils {

    private static BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public static String encoder(String password){
        return passwordEncoder.encode(password);
    }

    public static void main(String[] args) {
        String encoder = encoder("123");
        System.out.println(encoder);
        System.out.println(encoder.length());
    }
}
