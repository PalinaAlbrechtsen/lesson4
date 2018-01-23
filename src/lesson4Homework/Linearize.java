package lesson4Homework;

import java.util.Arrays;

public class Linearize {
    public static void main(String[] args) {
        int[][] myArray = {{1, 2, 3, 7}, {4, 5, 6, 8}};

        System.out.println(Arrays.toString(linearizeArray(myArray)));
    }

    private static int[] linearizeArray(int[][] myArray) {
        int length = getLength(myArray);
        int[] newArray = new int[length];
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (count < newArray.length) {
                    newArray[count] = myArray[i][j];
                    count++;
                }
            }
        }
        return newArray;
    }

    private static int getLength(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count++;
            }
        }
        return count;
    }
}
