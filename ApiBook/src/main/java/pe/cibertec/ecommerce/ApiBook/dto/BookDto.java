package pe.cibertec.ecommerce.ApiBook.dto;

import lombok.Data;
import pe.cibertec.ecommerce.ApiBook.entity.Category;

@Data
public class BookDto {
    private Long id;
    private String bookName;
    private String authorName;
    private Double unitPrice;
    private String idBook;
    private Category category;
}
