public class Table2{
	public static void main(String [] args){
		for(int i=1; ;i++){
			if(i<=20){
				if(i%2 != 0)
					continue;
				System.out.println(i);
			}else{
				break;
			}
		}
	}
}