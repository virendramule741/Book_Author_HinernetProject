package com.cg.client;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.cg.entities.Author;
import com.cg.entities.Book;
import com.cg.service.AuthorServiceImpl;
import com.cg.service.BookService;
import com.cg.service.BookServiceImpl;
import com.cg.service.AuthorService;

public class Client {

	public static void main(String[] args) {
		AuthorService service = new AuthorServiceImpl();
		BookService service1 = new BookServiceImpl();
		int ch = 5;
		try (Scanner sc = new Scanner(System.in)) {
			int Author_Id;
			String first_name;
			String middle_Name;
			String last_Name;
			int phoneNumber;
			
			int bookId;
			String title;
			int price;
			int isbn;
			
			Author p1;
			Book b1;
			do {
				System.out.println("------------------Author Menu-------------");
				System.out.println("1. Insert Author");
				System.out.println("2. Update Author");
				System.out.println("3. Delete Author");
				System.out.println("4. Display Author");
				System.out.println("------------------Book Menu-------------");
				System.out.println("5. Insert Book");
				System.out.println("6. Update Book");
				System.out.println("7. Delete Book");
				System.out.println("8. Display Book");
				System.out.println("-------------------------------------------");
				System.out.println("9. Exit");
				System.out.println("-------------------------------------------");
				
				System.out.println("Enter Choice(1..9) ");
				ch = sc.nextInt();
				switch (ch) {
				case 1:
					System.out.println("Enter Author Id:\n First Name:\n Middle Name: \n Last Name: \n Phone Number:");
					Author_Id = sc.nextInt();
					first_name = sc.next();
					middle_Name = sc.next();
					last_Name = sc.next();
					phoneNumber = sc.nextInt();
					p1 = new Author();
					p1.setAuthorId(Author_Id);
					p1.setFirstName(first_name);
					p1.setMiddleName(middle_Name);
					p1.setLastName(last_Name);
					p1.setPhoneNumber(phoneNumber);
					List<Author> author = Arrays.asList(p1);
				
					service.addAuthor(p1);
					break;
					
				case 2:
					System.out.println("Enter Author Id to updated  ");
					Author_Id = sc.nextInt();
					p1 = service.getAuthorById(Author_Id);
					if (p1 == null)
						System.out.println("Author not found");
//								throw new AuthorNotFoundException();								
					else {
						System.out.println(" First Name:\n Middle Name: \n Last Name: \n Phone Number:");

						first_name = sc.next();
						middle_Name = sc.next();
						last_Name = sc.next();
						phoneNumber = sc.nextInt();

						p1.setFirstName(first_name);
						p1.setMiddleName(middle_Name);
						p1.setLastName(last_Name);
						p1.setPhoneNumber(phoneNumber);
						
						List<Author> author1 = Arrays.asList(p1);
						service.updateAuthor(p1);
					}
					break;
					
				case 3:
					System.out.println("Enter Author Id to be delete ");
					Author_Id = sc.nextInt();
					p1 = service.getAuthorById(Author_Id);
					if (p1 == null)
						System.out.println("Author not found");
//								throw new AuthorNotFoundException();
					else {
						service.removeAuthor(p1);
					}
					break;
					
				case 4:
					System.out.println("Enter Author Id to be search...");
					Author_Id = sc.nextInt();
					p1 = service.getAuthorById(Author_Id);
					if (p1 == null)
//								throw new AuthorNotFoundException();
						System.out.println("Author not found");
					else {
						System.out.println("Author id: " + p1.getAuthorId() + "\tAuthor First name: " + p1.getFirstName()
								+ "\tMiddle Nmae: " + p1.getMiddleName() + "\tLastName: " + p1.getLastName()
								+ "\tPhone No: " + p1.getPhoneNumber());
					}
					break;
				case 5:
					System.out.println("Enter Book Id:\n Enter Book Title:\n Enter Book Price: \n Enter Book ISBN:");
					bookId = sc.nextInt();
					title = sc.next();
					price = sc.nextInt();
					isbn = sc.nextInt();
					b1 = new Book();
					b1.setBookId(bookId);
					b1.setTitle(title);
					b1.setPrice(price);
					b1.setIsbn(isbn);
					List<Book> book1 = Arrays.asList(b1);
					service1.addBook(b1);
					break;
					
				case 6:
					System.out.println("Enter Book Id to updated  ");
					bookId = sc.nextInt();
					b1 = service1.getBookById(bookId);
					if (b1 == null)
						System.out.println("Book not found");
//								throw new AuthorNotFoundException();								
					else {
						System.out.println("Enter Book Title:\\n Enter Book Price: \\n Enter Book ISBN:");

						title = sc.next();
						price = sc.nextInt();
						isbn = sc.nextInt();
					
					
						b1.setTitle(title);
						b1.setPrice(price);
						b1.setIsbn(isbn);
						
						List<Book> book2 = Arrays.asList(b1);
					}
					break;
					
				case 7:
					System.out.println("Enter Book Id to be delete ");
					bookId = sc.nextInt();
					b1 = service1.getBookById(bookId);
					if (b1 == null)
						System.out.println("Author not found");
//								throw new AuthorNotFoundException();
					else {
						service1.removeBook(b1);
					}
					break;
					
				case 8:
					System.out.println("Enter Book Id to be search...");
					bookId = sc.nextInt();
					b1 = service1.getBookById(bookId);
					if (b1 == null)
//								throw new AuthorNotFoundException();
						System.out.println("Book not found");
					else {
						System.out.println("Book id: " + b1.getBookId() + "\tBook Title: " + b1.getTitle()
								+ "\tBook Price: " + b1.getPrice() + "\tBook ISBN: " + b1.getIsbn());
					}
					break;
				case 9:
					System.exit(0);

				}
			} while (ch != 9);
		} catch (Exception e) {
			System.out.println("Error..." + e.getMessage());
		}

	}
}
