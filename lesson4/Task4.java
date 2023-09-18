package ua.ithillel.lesson4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "EnterYourPassword";

        do {
            System.out.print("Введите пароль: ");
            String enteredPassword = scanner.nextLine();
            if (enteredPassword.equals(correctPassword)) {
                System.out.println("Вы ввели верный пароль.");
                break;
            } else {
                System.out.println("Пароль неверный( Попробуйте ещё.");
            }
        } while (true);
    }
}
