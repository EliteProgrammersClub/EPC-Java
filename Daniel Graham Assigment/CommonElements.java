/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commonelements;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class CommonElements {

    public static void main(String[] args) {

        String[] types = {"integers", "strings"};

        System.out.println("Datatypes: " + Arrays.toString(types));
      
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.print("Datatype: ");
        String dataType = input.next();

        if (dataType.equalsIgnoreCase("integers")) {

            System.out.print("Size of the first array, please: ");
            int size = input.nextInt();

            int[] array = new int[size];
            
            System.out.println("Please, enter the values for this array: ");
            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt();
            }
            
            System.out.print("Size of the second array, please: ");
            int size2 = input.nextInt();
            
            int[] array2 = new int[size];
            
            System.out.println("Please, enter the values for this array: ");
            for (int i = 0; i < size2; i++) {
                array2[i] = input.nextInt();
            }
            
            System.out.print("Common elements: ");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size2; j++) {
                    if (array[i] == array2[j]) {
                        System.out.print(array[i] + " ");
                    }
                }
            }
            System.out.println("\n");

        } else if (dataType.equalsIgnoreCase("strings")) {

            System.out.print("Size of the array, please: ");
            int size = input.nextInt();

            String[] array = new String[size];
            
            System.out.println("Please, enter the values for this array: ");
            for (int i = 0; i < size; i++) {
                array[i] = input.next();
            }
            
            System.out.print("Size of the second array, please: ");
            int size2 = input.nextInt();
            
            String[] array2 = new String[size];
            
            System.out.println("Please, enter the values for this array: ");
            for (int i = 0; i < size2; i++) {
                array2[i] = input.next();
            }
            
            System.out.print("Common elements: ");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size2; j++) {
                    if (array[i].equals(array2[j])) {
                        System.out.print(array[i] + " ");
                    }
                }
            }
            System.out.println("\n");

        }
    }

}
