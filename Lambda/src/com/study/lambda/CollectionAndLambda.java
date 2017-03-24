package com.study.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionAndLambda {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Jackfruit", "Mango", "Apple", "Pomergranate");

		System.out.println("========Unsorted========");
		printFruits(fruits);

		Collections.sort(fruits, new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				// TODO Auto-generated method stub
				return a.compareTo(b);
			}
		});
		System.out.println("********Sorted********");
		printFruits(fruits);

		fruits = Arrays.asList("Jackfruit", "Mango", "Apple", "Pomergranate");
		System.out.println("========Unsorted========");
		printFruits(fruits);

		// first iteration with lambda
		Collections.sort(fruits, (String a, String b) -> {
			return a.compareTo(b);
		});

		System.out.println("********Sorted********");
		printFruits(fruits);

		fruits = Arrays.asList("Jackfruit", "Mango", "Apple", "Pomergranate");
		System.out.println("========Unsorted========");
		printFruits(fruits);

		Collections.sort(fruits, (a, b) -> a.compareTo(b));

		System.out.println("********Sorted********");
		printFruits(fruits);

		//////// Book Examples

		Book book1 = new Book("Sapiens", "Yuval", "Harari", 100);
		Book book2 = new Book("Peppa Pig: Little Library", "Lady", "Bird", 123);
		Book book3 = new Book("Indian Superfoods", "Rujuta", "Diwekar", 82);

		List<Book> books = Arrays.asList(book1, book2, book3);

		System.out.println("Total Pages - " + books.stream().collect(Collectors.summingInt(Book::getPages)));

		List<String> list = books.stream().map(Book::getAuthorFName).collect(Collectors.toList());
		System.out.println(list);

		list = books.stream().map(Book::getAuthorFName).filter((name) -> name.length() > 4)
				.collect(Collectors.toList());
		System.out.println(list);

		List<Book> books2 = books.stream().filter((book) -> book.getAuthorFName().length() > 4)
				.collect(Collectors.toList());

		System.out.println(books2);

		books.stream().filter((book) -> book.getAuthorFName().length() > 4).forEach(book -> System.out.println(book));

		IntStream.range(1, 4).forEach(System.out::println);

		// find the average of the numbers squared
		Arrays.stream(new int[] { 1, 2, 3, 4 }).map(n -> n * n).average().ifPresent(System.out::println);

		// map doubles to ints
		Stream.of(1.5, 2.3, 3.7).mapToInt(Double::intValue).forEach(System.out::println);

	}

	public static void printFruits(List<String> fruits) {
		for (Iterator iterator = fruits.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();

			System.out.println(string);

		}
	}

}
