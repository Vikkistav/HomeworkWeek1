package Week1.Homework;

import java.util.Scanner;

//Ввести с клавиатуры три числа, положительные возвести в куб, а отрицательные заменить на 0.
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number1");
        int first = sc.nextInt();
        System.out.println("Enter number2");
        int second = sc.nextInt();
        System.out.println("Enter number3");
        int third = sc.nextInt();

        if (first > 0){
            System.out.println(Math.pow(first, 3));
        } else if ( first < 0) {
            System.out.println("first == 0");
        if (second > 0){
            System.out.println(Math.pow(second, 3));
        } else if ( second < 0){
                System.out.println("second == 0");
        if (third > 0){
            System.out.println(Math.pow(third, 3));
        } else if (third < 0){
            System.out.println("third == 0");
        }
            }
        }

    }
}
