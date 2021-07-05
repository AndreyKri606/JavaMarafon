package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число A");
        int a = scanner.nextInt();
        System.out.println("введите число B");
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("Некорректный вовод");
        } else {
            for (int i = a + 1; i < b; i++) {
                if (i % 5 == 0 && i % 10 != 0) {
                    System.out.print(i + " ");
                }
            }
        } System.out.println("Таких чисел не найдено");
    }
}
