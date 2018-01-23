package lesson4Homework;

import java.util.Arrays;

public class DeletingIdenticalNumbers {
    public static void main(String[] args) {
        int[] myArray = {5, 10, 1, 5, 3, 3, 4, 6, 1, 7};
        deleteIdenticalNumbers(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    private static void deleteIdenticalNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
            }
        }
    }
}
