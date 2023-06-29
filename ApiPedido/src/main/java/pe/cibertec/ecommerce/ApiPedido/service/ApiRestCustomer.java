/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiPedido.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.cibertec.ecommerce.ApiPedido.entity.Customer;

/**
 *
 * @author aidas
 */

@FeignClient(name = "apicustomer")
public interface ApiRestCustomer {
    
    @GetMapping("/api/customer/findByIdCustomer/{idCustomer}")
    Customer findByIdCustomer(@PathVariable String idCustomer);


    
}
