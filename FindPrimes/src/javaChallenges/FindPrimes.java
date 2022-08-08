package javaChallenges;

public class FindPrimes {
	public static void main(String[] args) {
		int number = 1;
		int total = 2; //only even number that is prime and continues to add to this for total
		int counter = 1; // counts the number of prime numbers found
		while(counter < 100) { //continues finding prime numbers until 100 found
			number = number + 2; //check next odd number, starts with 3
			for(int checker = 2; checker < number + 1; checker++) { //checks if divisible by any number before it
				if(checker == number) {
					total += number; //adds prime number
					counter++;
				} else if(number % checker == 0) { //if it is it will set isComposite to true
					break;
				}
			}
		}
		System.out.println(total); //prints out total after;
	}
}
