/**
 * Created by root on 8/3/17.
 */
package EPC;

import java.util.Scanner;

public class MinMaxValue
{
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        System.out.println("enter the amount of elements to enter");

        int size = in.nextInt();
        int[] array = new int[size];
        int min, max;

        System.out.println("Enter your integers");

        for (int i = 0; i <size ; i++) {

            array[i] = in.nextInt();

        }

        min = max = array[0];

        for (int i = 0; i <size ; i++) {

            if(max < array[i])
                max= array[i];

            if(min > array[i])
                min = array[i];

        }

        System.out.println("Your min is " + min +" and your max is " + max);

    }
}
