package com.karmerdero;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        //Create next array of Integers with values: 2,3,1,7,11.
        // Sort them by DESC(reverseOrder).

        Integer[] myArray = new Integer[] {2, 3, 1, 7, 11};
        Arrays.sort(myArray);
        System.out.println("Task#1");
        System.out.println("Sorted array " + Arrays.toString(myArray));
        Arrays.sort(myArray, Collections.reverseOrder());
        System.out.println("Array in reverse order " + Arrays.toString(myArray) + "\n");

        /*
        You get an array of numbers(should contain both positive and negative numbers),
         and return the sum of all the positive ones.
         (If there are nothing to sum, sum should be 0)
         */
        int[] positiveArr = {5, -3, 8, -12, 7};
        int sumPositive = 0;
        for (int i = 0; i < positiveArr.length; i++) {
            if (positiveArr[i] > 0){
                sumPositive += positiveArr[i];
            }
        }
        System.out.println("Task # 2");
        System.out.println("Sum of positive values: " + sumPositive + "\n");

        /*
        You get an array of numbers, return the average of a list of numbers
         in this array. (Example -  array{1,2,4,1} -> avg = 2)
         */
        int[] avarArr = {3, 9, 2, 6};
        double sumAvarArr = 0;
        for (int i = 0; i < avarArr.length; i++) {
            sumAvarArr += avarArr[i];
        }
        int avarageAvarArr = sumAvarArr / avarArr.length;
        System.out.println("Task #3");
        System.out.println("Average of a list of numbers {3, 9, 2, 6} is: "
                + avarageAvarArr + "\n");

        /*
         *You have array {3,2,3,1,4,2,8,3}.
         Replace all duplicated values by 0.
         Result should be  next: {3,2,0,1,4,0,8,0}
         */
        int[] lastArr = {3,2,3,1,4,2,8,3};
        for (int i = 0; i < lastArr.length; i++) {
            if (lastArr[i] !=0){
                for (int j = i + 1; j < lastArr.length; j++){
                    if (lastArr[i] == lastArr[j])
                        lastArr[j] = 0;
                }
            }
        }
        System.out.println("Task #4");
        System.out.println("Array with replaced duplicated value by 0: "
                + Arrays.toString(lastArr));
    }
}
