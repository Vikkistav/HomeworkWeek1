package Week1.Homework;

import java.util.Scanner;

//Написати програму для розрахунку вартості переговорів, якщо по суботам та неділям надається скидка в 20%.
// Ввести тривалість розмови та день неділі (до 1 до 7).
public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть тривалість розмови");
        int talkTime = sc.nextInt();

        System.out.println("Введіть день неділі");
        int day = sc.nextInt();
        int price = 5066;

        if (day == 6 || day == 7) {
            System.out.println("Твоя знижка " + price / 5);
        } else {
        }
    }
}
