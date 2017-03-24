package com.study.lambda;

public class CalculateLambda {
	
	public static void main(String[] args) {
		Calculate add = (a,b) -> a+b;
		Calculate diff = (a,b) -> a-b;
		Calculate divide = (a,b) -> a/b;
		Calculate multiply = (x,y) -> x*y;

		System.out.println(add.calc(10, 2));
		System.out.println(diff.calc(10, 2));
		System.out.println(divide.calc(10, 2));
		System.out.println(multiply.calc(10, 2));

	}
	
	

}
