package lesson.recursive;

/**
 * 16 = 6 * (6-1) * (6-2) * (6-3) * (6-4) * (6-5)
 * 16 = 6 * 5		* 4	*	3	*	2	*	1	* 0 = 720
 * 
 * 
 * @author nada.matoussi
 *
 */

public class faculitet {
	
	public static void main (String[] args) {
		for (int i = 1; i < 70; i++)
		System.out.println(i + " : " +fac(i));
	}
	
	public static long fac(int n) {
		if (n == 1) {
			return 1;
		}
		return n * (n-1);
		/*
		fac(6)
			fac(6 - 1)
				fac(5 - 1)
					fac(4 - 1)
						fac(3 - 1)
							fac(2 - 1)
							return 1
						return 1 * 2
					return 3 * 2
				return 4 * 6
			return 5 * 24
		return 6 * 120
		*/
	}
}
