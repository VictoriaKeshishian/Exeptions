/*
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
package Seminar2;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;

        try {
            System.out.print("Введите текст: ");
            text = sc.nextLine();

            if (empty(text)) {
                throw new Exception("Пустые строки вводить нельзя!");
            }

            System.out.println("Вы ввели: " + text);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static boolean empty(final String text) {
        return text == null || text.trim().isEmpty();
    }
}

