//not completed

package p03;

/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

public class P3 {

	public static boolean isPrime(long n) {

	    if (n % 2 == 0) return false;

	    for(int i = 3; i * i <= n; i += 2) {
	        if(n % i == 0)
	            return false;
	    }
	    return true;
	}
	
	public static void main (String[] args) {
		
		long x = 600851475143L;		
		long primeFactor = 0;
		boolean found = false;
		long i = Math.floorDiv(600851475143L,2L);
		
		while(!found) {
			if(x % i == 0) {
				if(isPrime(i)) {
					primeFactor = i;
					found = true;
				}
			}
			else {
				i --;
				System.out.println(i);
			}
		}
		
		System.out.println("The largest prime factor is:" + primeFactor);
		
		
	}
}
