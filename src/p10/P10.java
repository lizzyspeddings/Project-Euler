//completed

package p10;

import java.math.BigInteger;

/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */

public class P10 {

	public static boolean isPrime(int n) {

		 if (n % 2 == 0) return false;

		    for(int i = 3; i * i <= n; i += 2) {
		        if(n % i == 0)
		            return false;
		    }
		    return true;
	}
	
	public static void main(String[] args) {
		
		BigInteger sum = new BigInteger("2");
		
		for(int i = 3; i < 2000000; i = i + 2) {
			
			if(isPrime(i)) {
				String s = i + "";
				BigInteger x = new BigInteger(s);
				sum = sum.add(x);
				System.out.println(i);
				//System.out.println(sum);
			}
		}
		
		System.out.println(sum);
	}

}
