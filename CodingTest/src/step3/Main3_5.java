package step3;

import java.util.Scanner;

public class Main3_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int x=n/4;
		
		for(int i=0;i<x;i++) {
			System.out.print("long ");
		}
		System.out.print("int");

	}

}
