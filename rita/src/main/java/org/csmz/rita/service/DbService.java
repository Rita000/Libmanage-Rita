package org.csmz.rita.service;

import java.util.List;

import org.csmz.rita.bean.Book;

public interface DbService {

public void showMsg();
	
	//db
	public int insert(Book book);
	
	public int delete(int id);
	
	public int update(Book book);
	
	public List<Book> getBook(int id);
}
