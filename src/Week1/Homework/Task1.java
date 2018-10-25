package Week1.Homework;

//Пользователь вводит параметр с консоли (текущий час от 0 до 24).
// Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         System.out.println("enter time");
         int time = sc.nextInt();

         if (9 <= time && 18 >= time) {
             System.out.println("Я на роботі");

         } else {
             System.out.println("Я відпочиваю");
         }

    }

}
