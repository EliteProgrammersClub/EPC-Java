package starinjark;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class StarInJark {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = "Jark";

        System.out.print("Enter index: ");
        int index = input.nextInt();

//        if (index < str.length()) {
//            char rpl = str.charAt(index);
//            System.out.println(str.replace(rpl, '*'));
//        } else {
//            System.out.println("Out of bounds");
//            System.exit(0);
//        }
        
        if (index < str.length()) {
            String[] s = new String[str.length()];
            
            char[] chars = new char[str.length()];
            str.getChars(0, str.length(), chars, 0);
            
            for (int i = 0; i <= index; i++) {
                chars[index] = '*';
            }
            
            for (char c : chars) {
                System.out.print(c);
            }
            System.out.println();
            
        } else {
            System.out.println("Out of bounds");
            System.exit(0);
        }

    }

}
