package week1.day1;

public class Fibonacci {
public static void main(String[] args) {
	int range = 8;
	int firstNum = 0;
	int secNum = 1;
	int sum;
	System.out.println(firstNum);
	for (int i=1; i<=8; i++)
	{
		sum= firstNum+secNum;
	    firstNum=secNum;
	    secNum=sum;
	    		System.out.println(sum);
	}	
}

}
