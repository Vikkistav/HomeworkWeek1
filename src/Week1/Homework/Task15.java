package Week1.Homework;

import java.util.Scanner;

//Ввести число від 1 до 12. По номеру місяця визначити пору року і вивести в консоль.
// Якщо користувач вводить недопустиме значення, показати повідомлення з помилкою.
public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int month = sc.nextInt();

        if ((month >= 1 && month <= 2) || month == 12) {
            System.out.println("winter");
        } else if (month >= 3 && month <= 5) {
            System.out.println("весна");
        } else if (month >= 6 && month <= 8) {
            System.out.println("summer");
        } else if (month >= 9 && month <= 11) {
            System.out.println("осінь");
        }
    }
}
