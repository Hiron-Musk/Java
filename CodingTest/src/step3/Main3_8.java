package step3;

import java.util.Scanner;

public class Main3_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		
		for(int i=1;i<=t;i++) {
			int n1=sc.nextInt();
			int n2=sc.nextInt();
		
			System.out.printf("Case #%d: %d + %d = %d\n",i,n1,n2,n1+n2);
			
		}

	}

}
