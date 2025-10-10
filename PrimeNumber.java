import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number : ");
		int num = sc.nextInt();

		boolean isPrime = true;

		if(num <= 1)
			isPrime = false;
		else{
			for(int i=2 ; i<=num/2 ; i++)
				if (num % 2 == 0){
					isPrime = false;
					break;
				}
		}
		System.out.println(isPrime ? (num + " is Prime Number"):(num + " is NOT a prime number"));
	}
}