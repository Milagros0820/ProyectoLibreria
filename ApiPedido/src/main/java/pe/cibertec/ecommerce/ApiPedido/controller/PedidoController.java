/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiPedido.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiPedido.dto.PedidoDto;
import pe.cibertec.ecommerce.ApiPedido.entity.Pedido;
import pe.cibertec.ecommerce.ApiPedido.service.PedidoService;

/**
 *
 * @author aidas
 */

@RestController
@RequestMapping("/api/pedido")
public class PedidoController {
    
    @Autowired
    private PedidoService pedidoService;
    
    @PostMapping("/add")
    public ResponseEntity<Pedido> add(@RequestBody Pedido pedido) {
        return new ResponseEntity<>(pedidoService.add(pedido),
                HttpStatus.CREATED);
    }
    
    @GetMapping("/findById/{id}")
    public ResponseEntity<PedidoDto> findById(@PathVariable Long id) {
        return new ResponseEntity<>(pedidoService.findById(id),
                HttpStatus.OK);
    }
    
}
