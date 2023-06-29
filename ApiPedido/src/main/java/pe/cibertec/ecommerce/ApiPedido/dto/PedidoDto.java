/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiPedido.dto;

import lombok.Data;
import pe.cibertec.ecommerce.ApiPedido.entity.Book;
import pe.cibertec.ecommerce.ApiPedido.entity.Customer;

/**
 *
 * @author aidas
 */
@Data
public class PedidoDto {
    private Long id;
    private Customer customer;
    private Book book;
}
