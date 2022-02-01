import java.util.*;

public class IfElse1{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int no_ = sc.nextInt();
		if(no_%2==0){
			System.out.println("The number "+no_ +" is Even");
		} else{
			System.out.println("The number "+no_ +" is Odd");
		}
	}
}