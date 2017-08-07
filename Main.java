package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            String  word;
            int n;
            String choice;
            char temp;  //  variable to temporary store the

            Scanner input = new Scanner(System.in);
            System.out.println("This program is to insert an asterisk(*) at the position indexed by the user in a particular string. ");

            System.out.println("Enter a string:");
            word = input.next();
            System.out.println("Enter the index(integer):");
            n = input.nextInt();

                // Changing the character with an * using the charAt method to locate
                // the character at that particular location

            temp = '*';

            // strings are immutable thus we store each character of the string in an array so as to
            // the individual characters

           char[] stringArray = new char[word.length()];

           for (int i=0 ; i < stringArray.length ; i++){

               stringArray[i] = word.charAt(i);

                    if(i == n-1){
                        stringArray[i] = temp;
                    }
           }

           // reconverting array back to a string and storing it in the variable word.

            word = new String(stringArray);
            System.out.println(word);

             // /*********************************************************/
            //        EXTRA: Replacing a * at every index that is even   /
           //  *********************************************************/
            System.out.println("Press yes or no to continue the program.");
            choice = input.next();

            switch (choice) {

                case "yes": {
                    System.out.println("\tThanks for continuing to use the program");
                    System.out.println("\tThe program replaces an asterisk in every even index ;).");
                    System.out.println("Enter a string:");
                    word = input.next();

                    char[] newStringArray = new char[word.length()];

                    for (int i = 0; i < newStringArray.length; i++) {

                        newStringArray[i] = word.charAt(i);
                        if (i % 2 == 0) {
                            newStringArray[i] = temp;
                        }
                    }
                    word = new String(newStringArray);
                    System.out.println(word);

                    break;
                }

                case "no":{
                    System.out.println("Oops thanks for using the program. ;).");
                    break;
                }

                default:
                    System.out.println("Your request is invalid!\nThanks for using the Program");
                    break;
            }

    }
}
