import java.util.*;

class BasicMathFunction{
	float performAdd(float num1, float num2){
		return num1+num2;
	}

	float performMult(float num1, float num2){
		return num1*num2;
	}

	float performSubt(float num1, float num2){
		return num1-num2;
	}

	float performDiv(float num1, float num2){
		if(num2==0){
			System.out.println("Cannot Divide by Zero");
			return 0;
		}else{
			return num1/num2;
		}
	}
}


public class MathBasic{
	public static void main(String[] args) {
		BasicMathFunction bmf = new BasicMathFunction();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		float num1 = sc.nextInt();
		float num2 = sc.nextInt();
		float sum = bmf.performAdd(num1,num2);
		float diff = bmf.performSubt(num1,num2);
		float multiple = bmf.performMult(num1,num2);
		float division = bmf.performDiv(num1,num2);
		System.out.println("The sum of the numbers "+num1+" and "+num2+" is: "+sum);
		System.out.println("The diff of the numbers "+num1+" and "+num2+" is: "+diff);
		System.out.println("The multiple of the numbers "+num1+" and "+num2+" is: "+multiple);
		System.out.println("The division of the numbers "+num1+" and "+num2+" is: "+division);
	}
}