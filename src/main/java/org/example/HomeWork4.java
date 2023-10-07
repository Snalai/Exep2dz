package org.example;

import java.util.Scanner;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//        Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class HomeWork4 {
    public static void main(String[] args) {
        try {
            System.out.println(ex());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String ex() throws Exception {

        Scanner scanner = new Scanner(System.in);
        String mess = scanner.nextLine();
       if (mess == ""){
          throw  new Exception("Пустые строки вводить нельзя.");

       }else return mess;


    }
}
