package javaChallenges;

public class FindPairsUnsorted {
	private static int[] array = {7, 5, 3, 4, 1, 2, 6};
	private static int n = 5;
	
	public static void main(String[] args) { //same as sorted except it dosen't check if it is greater than n to optimize
		for(int i = 0; i < array.length - 1; i++) { //goes through all the numbers
			for(int j = i; j < array.length; j++) { //then goes through numbers after that number 
				if(array[j] + array[i] == n) { //then checks if the numbers add up to sum, and if they do, print it out
					System.out.println("(" + array[i] + ", " + array[j] + ")");
				}
			}
		}
	}
}
