/**
 * Created by root on 8/3/17.
 */
package EPC;

import java.util.Scanner;

public class RemoveDuplicates
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = in.nextInt();
        int array[] = new int[size];
        int duplicate[] = new int[size/2];
        int store,j,iterateDup=0;
        boolean isDup=false , isPresent=false;

        System.out.println("Enter your integers");

        for (int i = 0; i <size ; i++) {

            array[i] = in.nextInt();

        }

        for (int i = 0; i <size ; i++) {

            for (int k = 0; k <=iterateDup ; k++) {

                if(duplicate[k] == array[i]) {
                    isPresent = true;
                    break;
                }

            }
            if(isPresent == false) {
                store = array[i];
                j = i;

                while (j < size) {

                    if (++j < size) {
                        if (store == array[j]) {
                            isDup = true;
                        }
                    }

                }


                if (isDup == true) {

                    duplicate[iterateDup] = store;
                    iterateDup++;
                    isDup = false;

                }
            }

            else
                isPresent = false;

        }

        System.out.println("The NON  duplicated values are");

        for (int i = 0; i <size ; i++) {
                store = array[i];
            for (int k = 0; k <iterateDup ; k++) {

                if(store == duplicate[k]) {
                    isPresent = true;
                    break;
                }

            }

            if (isPresent == false) {

                System.out.print(" " + store);
            }
            else
                isPresent = false;

        }


    }
}


