package ch06.sec08.exam01;

public class Calculator {
	void turnOn() {System.out.println("전원을 켭니다.");}
	void turnOff() {System.out.println("전원을 끕니다.");}
	
	int plus(int x,int y) {
		int result=x+y;
		return result;
	}
	
	double divide(int x,int y) {
		double result=(double)x/(double)y;
		return result;
	}

}
