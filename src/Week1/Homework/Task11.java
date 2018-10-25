package Week1.Homework;

import java.util.Scanner;

//Дано трехзначное число. Определить:
//	а) верно ли, что все его цифры одинаковые;
//	б) есть ли среди его цифр одинаковые.
public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();

        int lastNumber = number % 10;
        number = number / 10;
        int secondNumber = number % 10;
        number = number / 10;

        if (number == secondNumber && secondNumber == lastNumber) {
            System.out.println("Всі між собою рівні");
        } else if (lastNumber == secondNumber) {
            System.out.println("Рівні 2 і 3 число");
        } else if (lastNumber == number) {
            System.out.println("Рівні 3 і 1 число");
        } else if (number == secondNumber) {
            System.out.println("Рівні 1 і 2 число");
        }
    }
}
