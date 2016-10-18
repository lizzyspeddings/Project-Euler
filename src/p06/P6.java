//completed

package p06;

/*
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

public class P6 {

	public static void main(String[] args) {
		int sumOfSquares = 0;
		for(int i = 1; i < 101; i ++) {
			sumOfSquares += (i * i);
		}
		
		int squareOfSums = 0;
		for(int i = 1; i < 101; i ++) {
			squareOfSums += i;
		}
		int temp = squareOfSums * squareOfSums;
		squareOfSums = temp;

		int diff = squareOfSums - sumOfSquares;
		
		System.out.println(diff);
	}

}
