/**You are given an array (which will have a length of at least 3, but could be very large) containing integers. 
 * The array is either entirely comprised of odd integers or entirely comprised of even integers except for a 
 * single integer N. Write a method that takes the array as an argument and returns this "outlier" N.
 * 
 * 
 * @author Jeremy Latham
 * @date Apr 29, 2023
 *
 */
public class Parity {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] input = {-21,3,1719,19,11,13,160};
		System.out.println(find(input));

	}
	
	static int find(int[] integers){
		int even = 0;
		int odd = 0;
		int lasteven = 0;
		int lastodd = 0;
		
		
		for (int i = 0; i < integers.length; i++) {
			int num = integers[i]; //current number
			if (num % 2 == 0) {
				even++;
				lasteven = i;
				//if its even increment the count and save the index 
			}
			else {
				odd++;
				lastodd = i;
				//if its odd increment the count and save the index
			}
			if (odd >= 2 && even == 1) { //when there is only one even and 2 or more odds the last even index is the answer
				return integers[lasteven];
			}
			else if (odd == 1 && even >=2) {//when there is only one odd and 2 or more even the last odd index is the answer
				return integers[lastodd];
			}
		}
		return 0;
	}

}
