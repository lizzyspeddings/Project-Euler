//completed

package p05;

/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class P5 {

	public static void main(String[] args) {
		
		boolean divisible = false;
		int i = 2520;
		int count = 0;
		
		while(!divisible) {
			System.out.print(i + ": \t");
			
			for(int j = 20; j > 10; j --) {
				if(i % j == 0) {
					count ++;
					System.out.print(count + "\t");
				}
				else {
					count = 0;
					break;
				}
			}
			if(count == 10) {
				divisible = true;
			}
			i +=20;
			System.out.println("");

		}
		
		System.out.println(i);

	}

}
