/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiBook.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import pe.cibertec.ecommerce.ApiBook.entity.Book;


public interface BookRepository extends JpaRepository<Book, Long>{
        Book findByIdBook(String idBook);     
}
