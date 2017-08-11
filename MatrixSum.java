/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixsum;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class MatrixSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] matrix1;
        int[][] matrix2;
        int[][] sum;

        System.out.println("First Matrix");
        System.out.print("Enter # of columns: ");
        int cols = input.nextInt();
        System.out.print("Enter # of rows: ");
        int rows = input.nextInt();

        System.out.println("Second Matrix");
        System.out.print("Enter # of columns: ");
        int col = input.nextInt();
        System.out.print("Enter # of rows: ");
        int row = input.nextInt();

        if ((rows == row) && (cols == col)) {

            matrix1 = new int[rows][cols];
            matrix2 = new int[row][col];
            sum = new int[rows][cols];

            System.out.println("Please enter the values for matrix 1: ");
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    matrix1[r][c] = input.nextInt();
                }
            }
            System.out.println();            

            System.out.println("Please enter the values: ");
            for (int r = 0; r < row; r++) {
                for (int c = 0; c < col; c++) {
                    matrix2[r][c] = input.nextInt();
                }
            }
            System.out.println();
            
            System.out.println("Sum:");
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    sum[r][c] = matrix1[r][c] + matrix2[r][c];
                    
                    System.out.print(sum[r][c] + " ");
                }
                System.out.println();
            }
            
        }

    }

}
