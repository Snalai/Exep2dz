package org.example;

import java.io.FileNotFoundException;

public class HomeWork3 {
    public static void main(String[] args) throws Exception {
        /**
         * Не правильный порядок catch, Throwable должен стоять ниже всех, т.к он имеет наибольший размах проверок ошибок
         *
         */
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(23, 234);
//            int[] abc = { 1, 2 };
//            abc[3] = 9;
//        } catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        }
//    }
//    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//        System.out.println(a + b);
//    }
        /**
         * IndexOutOfBoundsException это единственное что может обработать исключение, поэтому я убрал другие два
         */
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        }catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }


    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

}
