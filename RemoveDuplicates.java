/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removeduplicates;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Size: ");
        int size = input.nextInt();

        String[] array = new String[size];

        System.out.println("Enter the values of the array, please: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.next();
        }

//        System.out.print("Duplicates: ");
//        boolean noDuplicates = false;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[size - 1];
                    size--; j--;
                }
            }
        }
        
        String[] array2 = Arrays.copyOf(array, size);
        System.out.print("New Array: " + Arrays.toString(array2));

        System.out.println();

    }

}
