package week1.day1;

public class primeNumber {

	public static void main(String[] args) {
int input = 70;
 int count=3;

for (int i=1; i<=input; i++) {
	if (input% i==0) {
		count++;
		
	}
}
	if (count==2) {
		System.out.println("it is  a prime number");
		
	}
	else  
	{
		System.out.println("the number not is prime");
		
	}
}

	}


