package com.example.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.bookstore.domain.Book;
import com.example.bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(BookRepository brepository ) {
		return (args) -> {

			
			Book b1 = new Book("Harry Potter", "JK Rowling", "2005", "9785343463212");
			Book b2 = new Book("Lord of the rings", "J.R.R. Tolkien", "1954", "9785348768678");
			
			brepository.save(b1);
			brepository.save(b2);

		};
	}

}
