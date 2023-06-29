/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiPedido.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiPedido.dao.PedidoRepository;
import pe.cibertec.ecommerce.ApiPedido.dto.PedidoDto;
import pe.cibertec.ecommerce.ApiPedido.entity.Book;
import pe.cibertec.ecommerce.ApiPedido.entity.Customer;
import pe.cibertec.ecommerce.ApiPedido.entity.Pedido;

/**
 *
 * @author aidas
 */

@Service
public class PedidoServiceImpl implements PedidoService{

    @Autowired
    private PedidoRepository pedidoRepository;
    
    @Autowired
    private ApiRestCustomer apiRestCustomer;
    
    @Autowired
    private ApiRestBook apiRestBook;
    
    @Override
    public Pedido add(Pedido pedido) {
        return  pedidoRepository.save(pedido);
    }

    @Override
    public PedidoDto findById(Long id) {
        Pedido pedido = pedidoRepository.findById(id).get();
        Customer customer = apiRestCustomer.findByIdCustomer(pedido.getIdCustomer());
        Book book = apiRestBook.findByIdBook(pedido.getIdBook());
        
        PedidoDto pedidoDto = new PedidoDto();
        pedidoDto.setId(pedido.getId());
        pedidoDto.setCustomer(customer);
        pedidoDto.setBook(book);
        
        return pedidoDto;
    }
    

    
}
