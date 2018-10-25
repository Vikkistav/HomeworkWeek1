package Week1.Homework;
//Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");
        double number = sc.nextDouble();

        if (number > 0 && number < 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
