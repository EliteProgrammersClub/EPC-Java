/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestrings;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class ReverseStrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Size of the array, please: ");
        int size = input.nextInt();

        String[] array = new String[size];
        String[] array2 = new String[size];

        System.out.println("Enter the values of the array, please: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.next();
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

        int max = array[0].length();
        String maxString = "";
        System.out.print("Longest String: ");

        for (String str : array) {
            if (str.length() > max) {
                max = str.length();
                maxString = str;
            }
        }
        System.out.println(maxString + "\t Length: " + max);

        int min = array[0].length();
        String minString = "";
        System.out.print("Smallest String: ");

        for (String str : array) {
            if (str.length() < min) {
                min = str.length();
                minString = str;
            }
        }
        System.out.println(minString + "\t Length: " + min);

        System.out.print("Duplicates: ");
        boolean noDuplicates = false;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (!array[i].equals(array[j])) {
                    noDuplicates = true;
                } else {
                    System.out.print(array[i] + " ");
                }
            }
        }

        if (noDuplicates) {
            System.out.println("none");
        }
        System.out.println();

    }

}
