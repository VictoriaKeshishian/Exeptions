package Seminar1;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) throws IllegalArgumentException {
        int[] array1 = {1, 2, 3, 5};
        int[] array2 = {4, 5, 6};

        int[] result = subtractArrays(array1, array2);
        System.out.println(Arrays.toString(result));
    }


    public static int[] subtractArrays(int[] array1, int[] array2) throws IllegalArgumentException {
    if (array1.length != array2.length) {
        throw new IllegalArgumentException("Длины массивов не равны!");
    }

    int[] result = new int[array1.length];
    for (int i = 0; i < array1.length; i++) {
        result[i] = array1[i] - array2[i];
    }

    return result;
}
}
