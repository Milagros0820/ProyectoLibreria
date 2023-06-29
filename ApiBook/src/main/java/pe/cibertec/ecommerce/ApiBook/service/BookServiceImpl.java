/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiBook.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiBook.dao.BookRepository;
import pe.cibertec.ecommerce.ApiBook.dto.BookDto;
import pe.cibertec.ecommerce.ApiBook.entity.Book;
import pe.cibertec.ecommerce.ApiBook.entity.Category;

@Service
public class BookServiceImpl implements BookService{
    
    @Autowired
    private BookRepository bookRepository;
    
    @Autowired
    private ApiRestCategory apiRestCategory;

    @Override
    public List<Book> findAll() {
        return (List<Book>) bookRepository.findAll();
    }

    @Override
    public Book findByIdBook(String idBook) {
        return bookRepository.findByIdBook(idBook);
    }

    @Override
    public Book add(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book update(Long id, Book book) {
        Book bkupdate = bookRepository.findById(id).get();

        bkupdate.setIdBook(book.getIdBook());
        bkupdate.setBookName(book.getBookName());
        bkupdate.setAuthorName(book.getAuthorName());
        bkupdate.setUnitPrice(book.getUnitPrice());

        return bookRepository.save(bkupdate);
    }

    @Override
    public void delete(Long id) {
        Book bkdelete = bookRepository.findById(id).get();
        bookRepository.delete(bkdelete);
    }

    @Override
    public BookDto findById(Long id) {
        Book bk = bookRepository.findById(id).get();
        Category cate = apiRestCategory.findByIdCategory(bk.getIdCategory());
        
        BookDto bkDto = new BookDto();
        bkDto.setId(bk.getId());
        bkDto.setBookName(bk.getBookName());
        bkDto.setAuthorName(bk.getAuthorName());
        bkDto.setUnitPrice(bk.getUnitPrice());
        bkDto.setIdBook(bk.getIdBook());
        bkDto.setCategory(cate);
        
        return bkDto;
    }
    
}
