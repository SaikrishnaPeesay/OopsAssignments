package com.objects.basics;

public class Book {
	String title;
	String author;
	int price;
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void getDetails() {
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("price: "+price);
	}
	void checkBookType() {
		if(price>500)
			System.out.println("premium books");
		else {
			System.out.println("book");
		}
	}

}
