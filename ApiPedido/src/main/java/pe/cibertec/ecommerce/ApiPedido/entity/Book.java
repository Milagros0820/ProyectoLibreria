/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiPedido.entity;

import lombok.Data;

/**
 *
 * @author aidas
 */
@Data
public class Book {
    private Long id;
    private String bookName;
    private String authorName;
    private Double unitPrice;
    private String idBook;
}
