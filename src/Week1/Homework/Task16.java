package Week1.Homework;

import java.util.Scanner;

//Вирахувати вартість покупки з урахуванням знижки.
// Знижка в 10% надається, якщо сума покупки перевищує 1000 грн.
public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price = 1001;

        if (price > 1000) {
            price = price * 0.9;
            System.out.println("Вартість покупки " + price + "гривень ");
        }
    }
}

