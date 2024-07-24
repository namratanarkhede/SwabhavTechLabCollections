package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.model.Book;
import com.aurionpro.model.BookComparator;
import com.aurionpro.model.BookComparator.BookAuthorComparator;
import com.aurionpro.model.BookComparator.BookPriceComparator;
import com.aurionpro.model.BookComparator.BookPublicationYearComparator;
import com.aurionpro.model.BookComparator.BookTitleComparator;

public class BookTest {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of books you want to add : \n");
		int n = scanner.nextInt();
		
		readBooks(books, scanner, n);
		System.out.println("\nAll book details\n");
		printBookDetails(books);
		
		System.out.println("\nSorting by Title\n");
		sortByTitle(books);
		
		System.out.println("\nSorting by Author\n");
		sortByAuthor(books);
		
		System.out.println("\nSorting by Price\n");
		sortByPrice(books);
		
		System.out.println("\nSorting by Publication Year\n");
		sortByPublicationYear(books);
		
		System.out.println("\nSorting in Order author -> title -> price");
		sortAuthorTitlePrice(books);

		System.out.println("\nSorting in Order Publication Year -> price -> author");
		sortPublicationYearPriceAuthor(books);
		
		
		
		
	}

	private static void sortPublicationYearPriceAuthor(List<Book> books) {
		BookPublicationYearComparator publishYearComparator = new BookComparator.BookPublicationYearComparator();
		BookPriceComparator priceComparator = new BookComparator.BookPriceComparator();
		BookAuthorComparator authorComparator = new BookComparator.BookAuthorComparator();
		
		Collections.sort(books, publishYearComparator.thenComparing(priceComparator).thenComparing(authorComparator));
		for(Book book:books) {
			System.out.println(book);
		}
	}

	private static void sortAuthorTitlePrice(List<Book> books) {

		BookAuthorComparator authorComparator = new BookComparator.BookAuthorComparator();
		BookTitleComparator titleComparator = new BookComparator.BookTitleComparator();
		BookPriceComparator priceComparator = new BookComparator.BookPriceComparator();
		
		Collections.sort(books, authorComparator.thenComparing(titleComparator).thenComparing(priceComparator));
		for(Book book:books) {
			System.out.println(book);
		}
	}

	private static void sortByPublicationYear(List<Book> books) {
		Collections.sort(books, new BookComparator.BookPublicationYearComparator());
		for(Book book:books) {
			System.out.println(book);
		}
	}

	private static void sortByPrice(List<Book> books) {
		Collections.sort(books, new BookComparator.BookPriceComparator());
		for(Book book:books) {
			System.out.println(book);
		}
	}

	private static void sortByAuthor(List<Book> books) {
		Collections.sort(books, new BookComparator.BookAuthorComparator());
		for(Book book:books) {
			System.out.println(book);
		}
		
	}

	private static void sortByTitle(List<Book> books) {
		Collections.sort(books, new BookComparator.BookTitleComparator());
		for(Book book:books) {
			System.out.println(book);
		}
		
	}

	private static void printBookDetails(List<Book> books) {
		for(Book book:books) {
			System.out.println(book);
			
		}
		
	}

	private static void readBooks(List<Book> books,Scanner scanner,int n) {
		System.out.println("Enter the Book Details\n");
		for(int i = 0 ; i < n; i++) {
			System.out.println("Book " + (i+1) +" : ");
			System.out.println("Enter the Book Title : " );
			String title = scanner.next();
			System.out.println("Enter the Book's Author Name : ");
			String author = scanner.next();
			System.out.println("Enter the Book Price : ");
			double price = scanner.nextDouble();
			System.out.println("Enter the Book Publication Year :");
			int publicationYear = scanner.nextInt();
			books.add(new Book(title, author, price, publicationYear));
			
			
		}
		// TODO Auto-generated method stub
		
	}
}
