//completed

package p09;

/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

public class P9 {
	
	public static boolean comparison(int a, int b, int c) {
		if(a < b && b < c) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	public static boolean isPythagorean(int a, int b, int c) {
		if (((a*a) + (b*b)) == (c*c)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isPythagoreanTriplet(int a, int b, int c) {

		if(isPythagorean(a, b, c) && comparison(a, b, c)) return true;

		else return false;
	}

	public static boolean equals(int a, int b, int c) {
		if (a + b + c == 1000) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		int a;
		int b;
		int total = 0;
		int aFin = 0;
		int bFin = 0;
		int cFin = 0;
		
		for(a = 1; a < 500; a ++) {
			for(b = 1; b < 500; b ++) {
				total = (a*a) + (b*b);
				int totalRoot = (int)Math.sqrt(total);
				System.out.println(((int)Math.sqrt(total)));
					if(equals(a, b, totalRoot)) {
						if(isPythagoreanTriplet(a, b, totalRoot)) {
							aFin = a;
							bFin = b;
							cFin = totalRoot;
						}
					}
			}
		}
		
		System.out.println(aFin * bFin * cFin);
	}

}
