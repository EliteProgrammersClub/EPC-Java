import java.util.Scanner;

/**
 * Created by tenas on 8/3/17.
 */
public class ArrayzTest {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of array");
		int length = input.nextInt();
		System.out.println("Enter elements of array");
		int[] x = new int[length];
		for (int i = 0; i < x.length; i++){
			x[i] = input.nextInt();
		}

		Arrayz array = new Arrayz(x);
		//array.reverseArray(x);
		//array.minAndMax(x);
		//array.commonElements(x,y); to use this, create another array y
		array.removeDuplicates(x);
	}
}



