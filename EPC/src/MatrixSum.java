/**
 * Created by root on 8/3/17.
 */
package EPC;

import java.util.Scanner;
public class MatrixSum
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.println("Enter 1 for one dimensional and 2 for two dimensional");
        int type = in.nextInt();

        if (type == 1) {
            System.out.println("enter the size of your one dimensional matrix");
           int size = in.nextInt();
            int oneD1[] = new int[size];
            int oneD2[] = new int[size];
            int result[] = new int[size];

            System.out.println("enter the values of matrix one");

            for (int i = 0; i <size ; i++) {

                oneD1[i] = in.nextInt();

            }

            System.out.println("enter the values of matrix 2");

            for (int i = 0; i <size ; i++) {

                oneD2[i] = in.nextInt();
            }

            for (int i = 0; i <size ; i++) {

                result[i] = oneD1[i] + oneD2[i];
            }
            System.out.println("The sum of the matrices are");

            for (int i = 0; i <size ; i++) {

                System.out.println(" "+result[i]);

            }

        }

        if(type == 2)
        {
            System.out.println("Enter the size of your two dimensional array");
            int size = in.nextInt();
            int [][]twoD1 = new int[size][size];
            int[][] twoD2 = new int[size][size];
            int result[][] = new int[size][size];

            System.out.println("enter the values of matrix one");

            for (int i = 0; i <size ; i++) {

                for (int j = 0; j <size ; j++) {
                    twoD1[i][j] = in.nextInt();
                }

            }

            System.out.println("enter the values of matrix 2");

            for (int i = 0; i <size ; i++) {

                for (int j = 0; j <size ; j++) {
                    twoD2[i][j] = in.nextInt();
                }

            }

            for (int i = 0; i <size ; i++) {

                for (int j = 0; j <size ; j++) {
                    result[i][j] = twoD1[i][j] + twoD2[i][j];
                }

            }
            System.out.println("The sum of the matrices are");

            for (int i = 0; i <size ; i++) {

                for (int j = 0; j <size ; j++) {
                    System.out.print(" "+ result[i][j]);
                }
                System.out.println();
            }

            }

    }
}
