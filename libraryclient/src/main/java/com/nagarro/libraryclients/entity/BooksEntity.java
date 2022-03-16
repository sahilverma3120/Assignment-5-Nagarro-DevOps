package com.nagarro.libraryclients.entity;

import java.io.Serializable;

public class BooksEntity  implements Serializable {
	private static final long serialVersionUID = 1L;
	private int BookCode;
	private String BookName;
	private String Author;
	private String AddDate;
	public int getBookCode() {
		return BookCode;
	}
	public void setBookCode(int bookCode) {
		BookCode = bookCode;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getAddDate() {
		return AddDate;
	}
	public void setAddDate(String addDate) {
		AddDate = addDate;
	}
	@Override
	public String toString() {
		return "booksData [BookCode=" + BookCode + ", BookName=" + BookName + ", Author=" + Author + ", AddDate="
				+ AddDate + "]";
	}
	


}
