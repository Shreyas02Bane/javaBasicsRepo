import java.util.Scanner;

public class Calculator{
	public static void main(String [] args){
		System.out.println("Welcome to Basic Calculator: ");
		System.out.println("=====================================================================");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("PRESS 1: ADDITION; 2: SUBTRACTION; 3: MULTIPLICATION; 4: DIVISION");
		int opt = sc.nextInt();
		switch(opt){
			case 1: System.out.println("The sum of "+num1+" and "+num2+" is: "+(num1+num2));
					break;
			case 2: System.out.println("The subtraction of "+num1+" and "+num2+" is: "+(num1-num2));
					break;
			case 3: System.out.println("The multiplication of "+num1+" and "+num2+" is: "+(num1*num2));
					break;
			case 4: if(num2!=0){System.out.println("The division of "+num1+" and "+num2+" is: "+(num1/num2));}else{System.out.println("Cannot Divide by Zero");}
					break;
			default: System.out.println("You've Entered a wrong choice");
		}
	}
}