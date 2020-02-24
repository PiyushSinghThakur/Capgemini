package lab.jdbc.service;

import lab.jdbc.dao.AuthorDao;
import lab.jdbc.dao.AuthorDaoImpl;
import lab.jdbc.entity.Author;

public class AuthorServiceImpl implements AuthorService{
	private AuthorDao dao=new AuthorDaoImpl();
	
	@Override
	public String insertAuthor(Author a) {
		return dao.insertAuthor(a);
	}
	
	@Override
	public String updateAuthor(String a, double price) {
		return dao.updateAuthor(a, price);
	}

	@Override
	public String deleteAuthor(Long authorId) {
		return dao.deleteAuthor(authorId);
	}

	@Override
	public Author findAuthor(Long authorId) {
		return dao.findAuthor(authorId);
	}

}
