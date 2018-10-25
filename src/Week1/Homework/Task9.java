package Week1.Homework;
//Ввести с клавиатуры значения трех сторон треугольника a, b и c и определить,
// является ли он прямоугольным. Ответ вывести в виде сообщения.

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number1");
        double a = sc.nextDouble();
        System.out.println("enter number2");
        double b = sc.nextDouble();
        System.out.println("enter number3");
        double c = sc.nextDouble();

        a = Math.pow(a, 2);
        b = Math.pow(b, 2);
        c = Math.pow(c, 2);

        if (a + b == c) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
