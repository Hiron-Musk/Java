package step2;

import java.util.Scanner;

public class Main2_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int h=sc.nextInt();
		int m=sc.nextInt();
		
		if(h==0) {
			h=24;
		} 
		if(m>=45) {
			m=m-45;
		} else {
			m=15+m;
			h--;
		}
		
		if(h==24) {
			h=0;
		}
		
		System.out.printf("%d %d",h,m);
		
		

	}

}
