package Week1.Homework;

import java.util.Scanner;

//У вас есть скорость и растояние, за какое время вы приедете в пукт назначания.
public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Speed");
        double speed = sc.nextDouble();
        System.out.println("Please enter Distance");
        double distance = sc.nextDouble();

        System.out.println(distance / speed);

    }
}
