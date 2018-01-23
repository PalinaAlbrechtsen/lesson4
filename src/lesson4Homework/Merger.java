package lesson4Homework;

import java.util.Arrays;

public class Merger {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 8, 11, 34};
        int[] secondArray = {5, 6, 7, 9, 5};
        System.out.println(Arrays.toString(combineFirstAndSecondArrays(firstArray, secondArray)));

    }

    private static int[] combineFirstAndSecondArrays(int[] firstArray, int[] secondArray) {
        int[] thirdArray = new int[firstArray.length + secondArray.length];
        int counter = 0;
        for (int j = 0; j < thirdArray.length; j++) {
            for (int k = j; k < thirdArray.length; ) {
                for (int i = counter; counter < thirdArray.length; ) {
                    if (j < firstArray.length) {
                        thirdArray[i] = firstArray[j];
                        counter = ++i;
                    }
                    if (k < secondArray.length) {
                        thirdArray[i] = secondArray[k];
                        counter = ++i;
                    }
                    break;
                }
                break;
            }
        }
        return thirdArray;
    }

}


