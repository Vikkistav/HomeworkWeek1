package Week1.Homework;

import java.util.Scanner;

//Даны три числа A,B,C. Увеличить числа в два раза, если A+B+C>0, в противном случае заменить на нули.
public class Task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1");
        int first = sc.nextInt();
        System.out.println("2");
        int second = sc.nextInt();
        System.out.println("3");
        int third = sc.nextInt();


        if (first + second + third > 0) {
            first = first * 2;
            second = second * 2;
            third = third * 2;
        } else {
            first = 0;
            second = 0;
            third = 0;

        }
    }
}
