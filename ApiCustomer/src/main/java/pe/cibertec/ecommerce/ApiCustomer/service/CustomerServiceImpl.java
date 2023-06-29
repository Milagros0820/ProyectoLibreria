
package pe.cibertec.ecommerce.ApiCustomer.service;

import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.cibertec.ecommerce.ApiCustomer.dao.CustomerRepository;
import pe.cibertec.ecommerce.ApiCustomer.entity.Customer;


@Service
public class CustomerServiceImpl implements CustomerService{
    
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override    
    @Transactional(readOnly = true)
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElseThrow(()->
                new EntityNotFoundException("Not found customer with id: "+id.toString()));

    }

    @Override
    public Customer add(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer update(Long id, Customer customer) {
        Customer cust = customerRepository.findById(id).get();
        cust.setName(customer.getName());
        cust.setLastName(customer.getLastName());
        cust.setDni(customer.getDni());
        cust.setEmail(customer.getEmail());
        
        return customerRepository.save(cust);
    }

    @Override
    public void delete(Long id) {
        Customer cust = customerRepository.findById(id).get();
        customerRepository.delete(cust);
    }

    @Override
    public Customer findByIdCustomer(String idCustomer) {
        return customerRepository.findByIdCustomer(idCustomer);
    }
    
    

}
