
package pe.cibertec.ecommerce.ApiCustomer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ApiCustomer.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByIdCustomer(String idCustomer);
}
