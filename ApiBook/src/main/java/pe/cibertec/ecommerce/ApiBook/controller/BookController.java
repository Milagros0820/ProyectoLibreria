package pe.cibertec.ecommerce.ApiBook.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiBook.dto.BookDto;
import pe.cibertec.ecommerce.ApiBook.entity.Book;
import pe.cibertec.ecommerce.ApiBook.service.BookService;


@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookService BookService;
    
    @GetMapping("/findAll")
    public ResponseEntity<List<Book>> findAll() {
        return new ResponseEntity<>(
                BookService.findAll(), HttpStatus.OK);
    }
    
    @GetMapping("/findByIdBook/{idBook}")
    public ResponseEntity<Book> findByIdBook(@PathVariable String idBook) {
        return new ResponseEntity<>(
                BookService.findByIdBook(idBook), HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Book> add(@RequestBody Book book) {
        return new ResponseEntity<>(BookService.add(book),
                HttpStatus.CREATED);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Book> update(@PathVariable Long id, @RequestBody Book book) {
        return new ResponseEntity<>(BookService.update(id, book),
                HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        BookService.delete(id);
    }
    
    @GetMapping("/findById/{id}")
    public ResponseEntity<BookDto> findById(@PathVariable Long id) {
        return new ResponseEntity<>(BookService.findById(id),
                HttpStatus.OK);
    }
}
