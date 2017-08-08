import java.util.Scanner;

/**
 * Created by tenas on 8/3/17.
 */
public class ReplaceLetter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word");
		String name = input.nextLine();
		char[] a = new char[name.length()];
		for (int i = 0; i < a.length; i++)
			a[i] = name.charAt(i);
		System.out.println("Enter a position of therletter in the word which you want to change");
		int n = input.nextInt();
		a[n-1] ='*';
		System.out.print("Modified word becomes ");
		for(char c: a){

			System.out.print(c + " ");
		}
	}
}
