package org.example;

import java.util.Scanner;


//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
//Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
public class HomeWork1 {
    public static void main(String[] args) {
        ex();
    }
    public static float ex() {
        float num = 0;
        System.out.println("Введите дробное число: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextFloat()) {
            num = scanner.nextFloat();
            System.out.print(num);
        } else ex();

        return num;
    }


}