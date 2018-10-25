package Week1.Homework;
//Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("number 1");
        int number1 = sc.nextInt();

        System.out.println("number 2");
        int number2 = sc.nextInt();

        int sum = number1 + number2;

        if (sum > 11 && sum < 19) {
            System.out.println(sum);
        }
    }
}
