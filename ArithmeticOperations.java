import java.util.*;

public class ArithmeticOperations{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the numbers:");
		System.out.println("Num1:");
		int num1 = sc.nextInt();
		System.out.println("Num2:");
		int num2 = sc.nextInt();
		int sum = num1+num2;
		int subt = num1-num2;
		int mult = num1*num2;
		float div = (float)num1/(float)num2;
		int mod = num1%num2;
		System.out.println("The sum of the 2 numbers is: "+sum);
		System.out.println("The difference of the 2 numbers is: "+subt);
		System.out.println("The multiple of the 2 numbers is: "+mult);
		System.out.println("The division of the 2 numbers is: "+div);
		System.out.println("The mod of the 2 numbers is: "+mod);
	}
}