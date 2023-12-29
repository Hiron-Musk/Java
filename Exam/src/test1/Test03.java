package test1;

public class Test03 {

	public static void main(String[] args) {
		
		int num=1;
		int result=0;
		
		result=num++;//result 1
		System.out.println("result: "+result);
		
		result=++num; //result 3
		System.out.println("result: "+result);
		
		result=num--; //result 3
		System.out.println("result: "+result);
		
		result=--num; //result 1
		System.out.println("result: "+result);
		

	}

}
