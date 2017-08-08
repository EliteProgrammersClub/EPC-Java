import java.util.ArrayList;
import java.util.Random;

/*
 Created by tenas on 8/3/17.
	 */
public class Arrayz {

		private int[] a;

		public Arrayz(int[] a) {
			this.a = a;
		}

		public int[] getA() {
			return a;
		}

		public void reverseArray(int[] b) {
			int temporal;
			for(int i=0; i<b.length; i++){
				System.out.println(b[b.length-1-i]);
			}
		}

		public void minAndMax(int[] d) {
			int max = d[0];
			int min = d[0];

			for(int a: d){
				if(a>max) {
					max = a;
				}
			}
			for(int a: d){
				if(a<min) {
					min = a;
				}
			}
			System.out.println("The Maximum is: " + max + " and the minimum is: " + min);
		}

		public void commonElements(int[] a, int[] b){
			ArrayList<Integer> commonElements = new ArrayList<>();
			int counter = 0;
			for(int i=0; i<a.length; i++){
				for(int k=0; k<b.length; k++){
					if(a[i]==b[k])
						commonElements.add(a[i]);
				}
			}
			System.out.println("Common elements are: ");
			for(int c: commonElements) {
				System.out.println( c + "  ");
			}
		}

		public void removeDuplicates(int[] a){
			Random change = new Random();
			for(int i=0; i<a.length; i++){
				for(int k=i+1; k<a.length; k++) {
					if (a[i] == a[k]) {
						a[k] = 1 + change.nextInt(100);//changing one of the duplicates to any random value from 1-100
						//hopefully this wouldnt cause another duplicate. Cannot remove the value completly from the array since arrays are not dynamic.
					}
				}
			}
			for(int c: a) {
				System.out.println( c + "  ");
			}
		}

	}



