/*
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
 * Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

package Seminar2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Введите дробное число: ");
        Scanner sc = new Scanner(System.in);
        float number;

        while (true) {
            try {
                number = sc.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("Неверный формат ввода, пожалуйста, повторите: ");
                sc.nextLine(); 
            }
        }

        System.out.println("Ваше число: " + number);
    }
}
