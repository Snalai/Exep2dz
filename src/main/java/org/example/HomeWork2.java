package org.example;

public class HomeWork2 {
    public static void main(String[] args) {
        /**
         * intArray обращается к не сучествующему массиву
         * т.к ArithmeticException относится к RuntimeException, то можно было сделать через if
         */
//    try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//    } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//    }
        /**
         * чтобы исправить код я добавил массив intArray
         * и сделал проверку через if
         */
        int[] intArray = new int[10];
        int d = 0;
        if (d != 0) {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } else {
            System.err.println("ArithmeticException");
        }

    }
}
