package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введи количество этажей в доме");
        int numberOfFloors = sc.nextInt();

            if (numberOfFloors <= 4) {
                System.out.println("Малоэтажный дом");

                } else if (numberOfFloors >= 5 && numberOfFloors <= 8) {
                    System.out.println("Среднеэтажный дом");

                    } else if (numberOfFloors >= 9) {
                        System.out.println("Многоэтажный дом");
                    }
    }
}