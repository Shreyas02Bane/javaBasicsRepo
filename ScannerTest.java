import java.util.Scanner;

public class ScannerTest{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Integer: ");
		int num1 = sc.nextInt();
		System.out.println("Enter a Float: ");
		float num2 = sc.nextFloat();
		System.out.println("Enter a Double: ");
		double num3 = sc.nextDouble();
		System.out.println("Enter a Boolean: ");
		boolean var4 = sc.nextBoolean();
		System.out.println("Enter a Character: ");
		char var5 = sc.next().charAt(0);
		System.out.println("Enter a String: ");
		String str = sc.next();
		
		
		
		System.out.println("Integer: "+num1);
		System.out.println("Float: "+num2);
		System.out.println("Double: "+num3);
		System.out.println("Boolean: "+var4);
		System.out.println("Character: "+var5);
		System.out.println("String: "+str);
	}
}