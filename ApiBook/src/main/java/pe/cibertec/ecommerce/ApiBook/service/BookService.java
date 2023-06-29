/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiBook.service;

import java.util.List;
import pe.cibertec.ecommerce.ApiBook.dto.BookDto;
import pe.cibertec.ecommerce.ApiBook.entity.Book;


public interface BookService {
    public List<Book> findAll();
    public BookDto findById(Long id);
    public Book findByIdBook(String idBook);
    public Book add(Book book);
    public Book update(Long id, Book book);
    public void delete(Long id);
    
}
