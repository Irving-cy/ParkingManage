package com.chinasoft.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {

    /**
     * 给密码加密(encode)
     * @param password
     * @return
     */
    public static String setBCryptPasswordEncoder(String password){
        BCryptPasswordEncoder bc = new BCryptPasswordEncoder();
        String encode = bc.encode(password);
        return encode;
    }

    public static void main(String[] args) {
        System.out.println(setBCryptPasswordEncoder("123456"));
    }
}
