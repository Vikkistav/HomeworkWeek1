package Week1.Homework;

import java.util.Scanner;

public class AdditionalTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int numder = sc.nextInt();

        int counter = 8;

        while (numder > 0) {
            //ternary operator
            counter = (numder % 10 == 8) ? counter + 1 : counter;
            numder = numder / 10;
        }

        System.out.println(counter);

    }
}
