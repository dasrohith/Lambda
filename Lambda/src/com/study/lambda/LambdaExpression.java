package com.study.lambda;

public class LambdaExpression {

	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Run - r1");
				
			}
		};
		
		r1.run();
		
		Runnable r2 = () -> System.out.println("Run - r2");
		r2.run();
		
		GreetingFunctionalInterface gfi = msg ->
		System.out.println("GFI Message "+ msg);
		gfi.sayMessage("Hello, Rohith");

	}

}
