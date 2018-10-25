package Week1.Homework;
//Вводим 2 числа. Если первое число больше второго,
// то вывести на экран разницу чисел. Если второе больше, то выводим сумму.

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a - b);
        } else if (a < b) {
            System.out.println(a + b);
        }

    }
}
