package Week1.Homework;

import java.util.Scanner;

//Написати програму, яка в залежності від характеру вітру (в м/c) виводить повідомлення про його силу.
// 1-4 - слабкий, 5-10 - помірний, 9-18 - сильний, більше 19 - ураганний.

public class Task20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть швидкість вітру" );
        int speed = sc.nextInt();

        if (speed >= 1 && speed <= 4) {
            System.out.println("Вітер слабкий");
        } else if (speed >= 5 && speed <= 10) {
            System.out.println("Вітер помірний");
        } else if (speed >= 9 && speed <= 18) {
            System.out.println("Вітер сильний");
        } else {
            System.out.println("Вітер ураганний");
        }
    }
}
