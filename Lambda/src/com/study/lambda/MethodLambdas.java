package com.study.lambda;

import java.math.BigInteger;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MethodLambdas {
	
	public static void main(String[] args) {
		IntFunction<String> intFn = num ->Integer.toString(num);
		System.out.println(intFn.apply(10));
		
		//static method as Lambda
		intFn = Integer::toString;
		System.out.println(intFn.apply(11));
		
		//constructor as Lambda
		Function<String, BigInteger> fn = BigInteger::new;
		System.out.println(fn.apply("123456"));
		
		//constructor as Lambda - Multiple Params
		System.out.println(new BigInteger("12345",36));
		BiFunction<String, Integer, BigInteger> biFn = BigInteger::new;
		System.out.println(biFn.apply("12345",36));
		
		//instance method as Lambda
		Consumer<String> consumer = System.out::println;
		consumer.accept("Print me");
		
		//static method as Lambda using Function
		Function<String, String> fn1 = "Hello, "::concat;
		System.out.println(fn1.apply("World"));
		
		//static method as Lambda using UnaryOperator
		UnaryOperator<String> unOp = s->"Hello, ".concat(s);
		System.out.println(unOp.apply("World"));
		
		//static method as Lambda using UnaryOperator
		UnaryOperator<String> unOp2 = "Hello, "::concat;
		System.out.println(unOp2.apply("World"));

		
		
		
	        
	}

}
