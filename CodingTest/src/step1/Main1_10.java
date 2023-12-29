package step1;

import java.util.Scanner;

public class Main1_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String b=sc.next();
		
		String b1=String.valueOf(b.charAt(2)) ;
		int x1=Integer.parseInt(b1);
		String b2=String.valueOf(b.charAt(1)) ;
		int x2=Integer.parseInt(b2);
		String b3=String.valueOf(b.charAt(0)) ;
		int x3=Integer.parseInt(b3);
		
		int result1=a*x1;	
		int result2=a*x2;	
		int result3=a*x3;
		
		int result4=result1+(result2*10)+(result3*100);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
				
		
		

	}

}
