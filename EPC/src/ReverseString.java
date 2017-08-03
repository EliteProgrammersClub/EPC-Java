/**
 * Created by root on 8/3/17.
 */
package EPC;

import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String text;

        System.out.println("Enter your String");

        text = in.nextLine();

        char array[] = text.toCharArray();
        char c;
        int len = array.length;

        for (int i = 0; i < len / 2; i++) {

            c = array[i];
            array[i] = array[(len - 1) - i];
            array[(len - 1) - i] = c;

        }


        System.out.println("Your reverse string is");

        for (int i = 0; i <len ; i++) {

            System.out.print(array[i]);

        }

        System.out.println();

    }
}
