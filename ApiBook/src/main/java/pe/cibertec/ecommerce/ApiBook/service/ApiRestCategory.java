/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiBook.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.cibertec.ecommerce.ApiBook.entity.Category;

@FeignClient (name = "apicategory" )
public interface ApiRestCategory {
    
    @GetMapping("/api/category/findByIdCategory/{idCategory}")
    Category findByIdCategory(@PathVariable String idCategory);
}
