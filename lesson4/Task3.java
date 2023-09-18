package ua.ithillel.lesson4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Введите числа (для завершения введите 0):");

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
        }

        System.out.println("Сумма введенных чисел: " + sum);
    }
}


