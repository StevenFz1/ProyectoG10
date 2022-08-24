
package com.tienda.Tienda;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class Encriptar {
    public static void main(String[] args){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        var claveRosa = encoder.encode("123");
        var claveAndy = encoder.encode("456");
        var claveOscar= encoder.encode("789");
        System.out.println("Rosa (123): "+claveRosa);
        System.out.println("Andy (456): "+claveAndy);
        System.out.println("Oscar (789): "+claveOscar);
    }
}
