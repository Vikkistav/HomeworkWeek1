package Week1.Homework;

import java.util.Scanner;

//Визначити, чи являється 6-значне число "щасливим" (сума перших трьох цифр дорівнює сумі останніх трьох).

public class Task22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 6-digit number: ");
        int sum1 = 0;
        int sum2 = 0;
        int number = sc.nextInt();
        int length = String.valueOf(number).length();
        if (length != 6) {
            System.out.print("Value should be with 6 digits");
        } else {
            for (int i = 0; i < 3; i++) {
                sum1 = (int) (sum1 + number / Math.pow(10, 5 - i));
                number = (int) (number % Math.pow(10, 5 - i));
            }
            for (int i = 3; i < 6; i++) {
                sum2 = (int) (sum2 + number / Math.pow(10, 5 - i));
                number = (int) (number % Math.pow(10, 5 - i));
            }
        }
        boolean result = sum1 == sum2;
        System.out.println(result);

    }
}
