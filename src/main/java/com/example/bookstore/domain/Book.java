package com.example.bookstore.domain;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String title;
	private String author;
	private String releaseYear;
	private String isbn;

	
	

	public Book() {}
	
	public Book(String title, String author, String releaseYear, String isbn) {
		super();
		this.title = title;
		this.author = author;
		this.releaseYear = releaseYear;
		this.isbn = isbn;
		//this.category = category;
	}

	public void setId(long id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	
	public long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getReleaseYear() {
		return releaseYear;
	}
	public String getIsbn() {
		return isbn;
	}

	
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", year=" + releaseYear + ", isbn=" + isbn
				+ ", price="  + "]";
	}
	


}