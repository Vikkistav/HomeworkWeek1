package Week1.Homework;

//Известны площади круга и квадрата. определить:
//а) поместится круга в квадрат
//б) поместится квдрат в круга

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть площу квадрата");
        int square = sc.nextInt();

        System.out.println("Введіть площу круга");
        int circle = sc.nextInt();

        if (square < circle){
            System.out.println("Квадрат поміститься в круг");
        } else if (circle < square){
            System.out.println("Круг поміститься в квадрат");
        }

    }
}
