import java.util.Scanner;

public class EvenOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter a non-zero number: ");
		
		int num = (int)key.nextDouble();
		
		//check if the number is even or not
		
		//input validation
		if(num == 0) {
			
			System.out.println("Invalid value entered!");
			System.exit(0);  //exits program
		}
		
		//check if the number is even or not
		
		if(num%2 == 0) {
			
			System.out.println("The number is even!");
		}
		else {
			System.out.println("The number is odd!");
		}
		/*  
		double num1 = 5.5;
		//type casting
		int num2 = (int)num1;
		
		*/

	}

}
