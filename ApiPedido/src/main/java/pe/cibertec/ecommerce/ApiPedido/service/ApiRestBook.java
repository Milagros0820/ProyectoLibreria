
package pe.cibertec.ecommerce.ApiPedido.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.cibertec.ecommerce.ApiPedido.entity.Book;

/**
 *
 * @author aidas
 */
@FeignClient(name = "apibook")
public interface ApiRestBook {
    
    @GetMapping("/api/book/findByIdBook/{idBook}")
    Book findByIdBook(@PathVariable String idBook);
}
