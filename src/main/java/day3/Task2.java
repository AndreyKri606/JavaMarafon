package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введи делимое");
            double dividend = scanner.nextDouble();
            System.out.println("Введи делитель");
            double divider = scanner.nextDouble();

            double quotient = dividend / divider;
                if (divider == 0) {
                    break;
                }
            System.out.println("quotient = " + quotient);
        }
    }
}
