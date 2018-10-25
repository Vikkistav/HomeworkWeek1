package Week1.Homework;
//Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");

        int a = sc.nextInt();

        if (a % 7 == 0) ;
        {
            System.out.println(a * 2);


        }

    }
}
