package Week1.Homework;

import java.util.Scanner;

//Известны две скорости, одна в километрах в час, другая в метрах в секунду. Какая из них больше?
public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter km/h speed");
        double kmH = sc.nextDouble();
        System.out.println("Enter m/s speed");
        double mS = sc.nextDouble();

        mS = (mS / 1000) * 3600;

        if (mS < kmH) {
            System.out.println("Мс менше");
        } else if  (kmH < mS) {
            System.out.println("КмЧ менше");
        } else {
            System.out.println("Мс і КмЧ однакові");
        }
    }
}
