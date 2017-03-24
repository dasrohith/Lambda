package com.study.lambda;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfaces {
	
	public static void main(String[] args) {
		
		String inputS = "Apple";
		
		Predicate<String> stringLen = (s) -> s.length()<10;
		System.out.println(inputS+"'s length is less than 10 - "+stringLen.test(inputS));
		
		Consumer<Integer>	consumer = (s) -> System.out.println("Input Number is "+s);
		consumer.accept(1);
		
		
		Function<Integer, String> function = (input) -> Integer.toString(input);
		Integer input = 26;
		System.out.println("Length of "+ input + " is - "+function.apply(input).length());
		
		Supplier<String> supplier = () -> "Supplier generated String";
		System.out.println(supplier.get());
		
		BinaryOperator<Integer> biOp= (a,b)-> a+b;
		int a = 1;
		int b = 3;
		System.out.println("The sum of "+ a +" and "+ b + " is - "+ biOp.apply(a, b));
		
		UnaryOperator<String> unOp = (msg) -> msg.toUpperCase();
		String msg = "i haVe No CasE";
		System.out.println("Converting '"+msg+"' to upper case -"+unOp.apply(msg));
		
		BiFunction<String, String, String> biFn = (arg1,arg2) -> arg1+arg2;
		System.out.println(biFn.apply("Hello", ", World"));
		
		Consumer<String> helloConsumer = (name) -> System.out.println("Hello, "+name);
		for(String name: Arrays.asList("Mickey","Minnie","Duck")){
			helloConsumer.accept(name);
		}
		
	}

}
