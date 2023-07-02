/*
 * Дан следующий код, исправьте его там, где требуется:
 */
package Seminar2;

public class Task3 {

    public static void main(String[] args) { // убрано объявление throws Exception 
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) { // удален следующий блок кода: catch (Throwable ex)
            System.out.println("Указатель не может указывать на null!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Выход за пределы массива!");
        }
    }

    public static void printSum(Integer a, Integer b) { // удалено объявление throws FileNotFoundException 
        System.out.println(a + b);
    }
}
