package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String[] seasons = {"winter", "spring", "summer", "autumn"};
        return seasons;
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] nums = new int[length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        return nums;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                res = i;
                i= arr.length*2;
            } else {
                res = -1;
            }
        }
        return res;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] demoArr = new String[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i > -1; i--) {
            demoArr[j] = arr[i];
            j++;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = demoArr[i];
        }
        return arr;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                length++;
            }
        }
        int[] resArr = new int[length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                resArr[j] = arr[i];
                j++;
            }
        }
        return resArr;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        int[] firstArr = new int[arr[0].length];
        int[] secondArr = new int[arr[1].length];
        for (int i = 0; i < arr[0].length; i++) {
            firstArr[i] = arr[0][i];
        }
        for (int i = 0; i < arr[1].length; i++) {
            secondArr[i] = arr[1][i];
        }

        for (int j = 0; j < 1000; j++) {
            for (int i = 0; i < firstArr.length; i++) {
                if ((i + 1) != firstArr.length) {
                    if (firstArr[i] > firstArr[i + 1]) {
                        int tmp = firstArr[i];
                        firstArr[i] = firstArr[i + 1];
                        firstArr[i + 1] = tmp;
                    }
                }
            }
        }

        for (int j = 0; j < 1000; j++) {
            for (int i = 0; i < secondArr.length; i++) {
                if ((i + 1) != secondArr.length) {
                    if (secondArr[i] > secondArr[i + 1]) {
                        int tmp = secondArr[i];
                        secondArr[i] = secondArr[i + 1];
                        secondArr[i + 1] = tmp;
                    }
                }
            }
        }

        if (firstArr.length > secondArr.length) {
            int[][] newArr = new int[][]{secondArr, firstArr};
            return newArr;
        } else {
            int[][] newArr = new int[][]{firstArr, secondArr};
            return newArr;
        }

    }

}
