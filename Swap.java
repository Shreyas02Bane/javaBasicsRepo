import java.util.*;

public class Swap{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers: ");
		System.out.println("Num1: ");
		int num1 = sc.nextInt();
		System.out.println("Num2: ");
		int num2 = sc.nextInt();
		System.out.println("Before Swapping: "+num1+" "+num2);
		num1 += num2;
		num2 = num1 - num2;
		num1 -= num2;
		System.out.println("After Swapping: "+num1+" "+num2);
	}
}