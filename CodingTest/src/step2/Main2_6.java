package step2;

import java.util.Scanner;

public class Main2_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int h=sc.nextInt();//시
		int m=sc.nextInt();//분
		int x=sc.nextInt();//요리소요시간
		
		//분 조건
		if(m+x>60) {
			h=h+(m+x)/60;
			m=(m+x)%60;
			
		}else if(m+x<60) {
			m=m+x;
			
		}else {
			h++;
			m=0;
		}
		//시 조건
		if(h>24) {
			h=h-24;
			
		} else if(h==24) {
			h=0;
		}
		
		System.out.printf("%d %d",h,m);
		

	}

}
