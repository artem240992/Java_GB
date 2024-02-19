package lesson1;

import java.security.spec.RSAOtherPrimeInfo;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }


    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
       int a=2;
       int b=35;
if (a+b>=0) {
    System.out.println("Сумма положительная");
}
else
    System.out.println("Сумма отрицательная");


    }


    static void printColor() {

        int value=0;
        if (value<=0){
            System.out.println("Красный");
        }
        else if ((value>0)&&(value<=100)) {
            System.out.println("Желтый");
            }
        else if (value>100) {
            System.out.println("Зеленый");

            }

    }

    static void compareNumbers() {
        int a = 15;
        int b = 16;
        if (a>=b){
            System.out.println("a >= b");
        }
        else System.out.println("a < b");

    }
}
