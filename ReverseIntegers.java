/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseintegers;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author daniel
 */

/* 
* java program to reverse an array
* and the user should determine the number of values in the array
* program to determine minimum and max values of the array 
* and it determines duplicate values in the array
 */
public class ReverseIntegers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Size of the array, please: ");
        int size = input.nextInt();

        int[] array = new int[size];
        int[] array2 = new int[size];

        System.out.println("Enter the values of the array, please: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(array));

        System.out.println("Reverse:");
        for (int i = size - 1, j = 0; i >= 0; i--, j++) {
            array2[j] = array[i];
        }

        for (int i = 0; i < size; i++) {
            array[i] = array2[i];

            System.out.print(array[i] + " ");
        }
        System.out.println();

        int max = array[0];
        System.out.print("Max: ");

        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);

        int min = array[0];
        System.out.print("Min: ");

        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println(min);

        System.out.print("Duplicates: ");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                }
            }
        }
        System.out.println();

    }

}
