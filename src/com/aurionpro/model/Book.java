package com.aurionpro.model;

public class Book {
	private String title;
	private String author;
	private double price;
	private int publicationYear;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	public Book(String title, String author, double price, int publicationYear) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publicationYear = publicationYear;
	}
	@Override
	public String toString() {
		return "Book [Book Title = " + title + ", Book Author = " + author + ", Book Price = " + price + ", Book Publication Year = "
				+ publicationYear + "]";
	}
	
	

}
