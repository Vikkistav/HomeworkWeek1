package Week1.Homework;

import java.util.Scanner;

//Написати програму для визначення іделаьної ваги користувача (зріст - 100).
// Надати рекомендації стосовно того, необхідно набрати чи скинути вагу.

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weith ");
        int weith = sc.nextInt();

        System.out.println("Enter height ");
        int height = sc.nextInt();
        height = height - 100;

        if (height == weith){
            System.out.println("Ідеальна вага");
        } else if (height < weith) {
            System.out.println("Потрібно скинути вагу");
        } else if (height > weith){
            System.out.println("Потрібно набрати вагу");
        }

    }
}
