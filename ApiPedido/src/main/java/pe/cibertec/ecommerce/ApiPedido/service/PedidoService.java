/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiPedido.service;

import pe.cibertec.ecommerce.ApiPedido.dto.PedidoDto;
import pe.cibertec.ecommerce.ApiPedido.entity.Pedido;

/**
 *
 * @author aidas
 */
public interface PedidoService {
    
    public Pedido add(Pedido pedido);
    public PedidoDto findById(Long id);
    
}
