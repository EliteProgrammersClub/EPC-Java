/**
 * Created by root on 8/3/17.
 */
package EPC;

import java.util.Scanner;

public class ReverseArray
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of elements you wish to enter");
        int n = in.nextInt();
        int store;

        int [] array = new int[n];

        System.out.println("enter your integers");

        for (int i = 0; i <n ; i++) {

            array[i] = in.nextInt();

        }

        for (int i = 0; i <n/2 ; i++) {

            store = array[i];
            array[i] = array[(n-1)-i];
            array[(n-1)-i] = store;
        }

        System.out.println("Your reversed array is:");

        for (int i = 0; i <n ; i++) {

            System.out.print(" "+ array[i]);

        }

        System.out.println();
    }
}
