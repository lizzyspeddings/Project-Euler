//completed

package p04;

/*
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class P4 {

	public static boolean isPalindrome(int m) {

		String x = m + "";
		boolean palindrome = false;
		int end = x.length() - 1;

		for(int i = 0; i < (x.length() / 2); i ++){
			if(x.charAt(i) == x.charAt(end)) {
				end --;
				palindrome = true;
			}
			else{
				palindrome = false;
				break;
			}
		}
		
		return palindrome;
	}

	public static void main(String[] args) {
		
		int locateI = 0;
		int locateJ = 0;
		int total = 0;
		for(int i = 999; i > 0; i --) {
			for(int j = 999; j > 0; j--) {
				if(isPalindrome(i * j)) {
					if((i * j) > total) {
						locateI = i;
						locateJ = j;
						total = i * j;
					}
				}
			}
		}
		System.out.println(locateI);
		System.out.println(locateJ);
		System.out.println(total);
	}

}
