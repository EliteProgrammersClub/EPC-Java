/**
 * Created by root on 8/3/17.
 */
package EPC;

import java.util.Scanner;

public class ReplaceCharWithStar
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        int position,junk;

        char[] array;

        System.out.println("enter the String");
        name = in.nextLine();

        System.out.println("enter the position to replace with *");

        position = in.nextInt();

        array = name.toCharArray();

        if(position > array.length-1)
            System.out.println("position doesn't exist");
        else
        {
            array[position] = '*';
            System.out.println(array);
        }



    }
}
