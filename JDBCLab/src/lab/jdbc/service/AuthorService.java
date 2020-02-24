package lab.jdbc.service;

import lab.jdbc.entity.Author;

public interface AuthorService {

	public String insertAuthor(Author a);
	public String updateAuthor(String a,double price);
	public String deleteAuthor(Long authorId);
	public Author findAuthor(Long authorId);
}