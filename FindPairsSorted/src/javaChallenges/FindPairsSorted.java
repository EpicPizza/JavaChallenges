package javaChallenges;

public class FindPairsSorted {
	private static int[] array = {1, 2, 3, 4, 5, 6, 7}; //sorted array
	private static int n = 10; //sum to check for
	
	public static void main(String[] args) {
		for(int i = 0; i < array.length - 1 && i < n; i++) { //goes through all the numbers until it is larger than n
			for(int j = i; j < array.length && array[j] + array[i] <= n; j++) { //then goes through numbers after that number until sum is greater than n
				if(array[j] + array[i] == n) { //then checks if the numbers add up to sum, and if they do, print it out
					System.out.println("(" + array[i] + ", " + array[j] + ")");
				}
			}
		}
	}
}
