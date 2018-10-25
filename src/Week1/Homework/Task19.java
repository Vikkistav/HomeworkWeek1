package Week1.Homework;

import java.util.Scanner;

//Написати програму, яка при введені числа в діапазоні від 1 до 99 додає до нього слово "копійка" в правильному форматі.
// Наприклад, 1 копійка, 2 копійки, 7 копійок.
public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть число від 1 до 99: ");
        int value = sc.nextInt();
        int check = value % 10;

        if (check == 1) {
            System.out.println("копійка");
        } else if (check == 2 || check == 3 || check == 4) {
            System.out.println("копійки");
        } else {
            System.out.println("копійок");
        }
    }
}
