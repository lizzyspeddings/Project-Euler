//completed

package p07;

/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */

public class P7 {

	public static boolean isPrime(int x) {

		boolean prime = true;

		for(int i = (x - 1); i > 1; i --) {
			if(x % i == 0) {
				prime = false;
			}
		}

		return prime;
	}

	public static void main(String[] args) {
		int count = 1;
		int i = 3;
		while(count != 10001) {
			if(isPrime(i)) {
				count ++;
			}
			i ++;
		}
		i--;
		System.out.println(i); ;

	}

}
