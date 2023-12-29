package step2;

import java.util.Scanner;

public class Main2_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int h=sc.nextInt();//시
		int m=sc.nextInt();//분
		int x=sc.nextInt();//요리소요시간
		
		
		int xh,xm=0;
		xh=x/60;//0
		xm=x%60;//

		h=h+xh;//23
		m=xm+m;//48
		
		if(m==60) {
			h++;
			m=0;
		}
		
		System.out.printf("%d %d",h,m);
		
		//다시하기

	}

}
