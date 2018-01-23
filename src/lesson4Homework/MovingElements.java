package lesson4Homework;

import java.util.Arrays;

public class MovingElements {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7};
        moveElementsRight(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    private static void moveElementsRight(int[] array) {
        int storage = array[array.length - 1];
        for (int i = (array.length - 1); i >= 0; i--) {
            if (i == 0) {
                array[i] = storage;
            } else {
                array[i] = array[i - 1];
            }
        }
    }
}
