package com.dio;

import com.dio.user.Usuario;

public class Main {

    public static void main(String[] args) {
        Usuario user1 = new Usuario("Nome","28/02/2000",1.75,90.00,"User", "123");
        System.out.println(user1.toString());

        user1.setNome("Nome2");
        user1.setAltura(1.6);
        user1.setPeso(50.00);
        System.out.println(user1.toString());


    }
}
