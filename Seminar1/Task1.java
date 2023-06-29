/*
 *  Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */

package Seminar1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите нечетное число от 1 до 100, некратное трём: ");
        int number = sc.nextInt();
        method1(number);
        method2(number);
        method3(number);

    }

    public static void method1(int number) throws InputMismatchException {
        if (number > 0 && number < 100) {
            System.out.println("Спасибо за участие =)");
        } else {
            throw new InputMismatchException("Введено число за пределами диапазона!");
        }
    }

    public static void method2(int number) throws IllegalArgumentException {
    if (number % 2 == 0) {
        throw new IllegalArgumentException("Число является четным!");
    } else {
        System.out.println("Число является нечетным.");
    }
}

    public static void method3(int number) throws UnsupportedOperationException {
        if (number % 3 == 0) {
            throw new UnsupportedOperationException("Число кратно трём!");
        } else {
            System.out.println("Число не кратно трём.");
        }
    }

}
