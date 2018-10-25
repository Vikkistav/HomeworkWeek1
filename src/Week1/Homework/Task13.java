package Week1.Homework;

import java.util.Scanner;

//Даны три числа a, b, c. Определить, имеется ли среди них хотя бы одна пара равных.
public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1");
        int a = sc.nextInt();

        System.out.println("Enter number 2");
        int b = sc.nextInt();

        System.out.println("Enter number 3");
        int c = sc.nextInt();

        if (a == b) {
            System.out.println("Рівні 1 і 2 числа");
        } else if (b == c) {
            System.out.println("Рівні 2 і 3 числа");
        } else if (c == a) {
            System.out.println("Рівні 3 і 1 числа");
        }
    }
}
