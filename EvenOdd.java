import java.util.*;

public class EvenOdd{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int no_ = sc.nextInt();
		String res = (no_%2==0)? "Even" : "Odd" ;
		System.out.println("The number "+no_ +" is "+res);
	}
}