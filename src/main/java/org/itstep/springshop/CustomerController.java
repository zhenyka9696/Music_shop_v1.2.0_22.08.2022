package org.itstep.springshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping(value="/customer")
    public List<Customer> findAll(){
        return customerService.findAll();
    }

    @GetMapping(value="/customer/{id}")
    public Optional<Customer> findById(@PathVariable Long id){
        return customerService.findById(id);
    }

    @PostMapping(value="/customer")
    Customer createOrSave(@RequestBody Customer customer) {
        //System.out.println(artist.getName());
        return
                customerService.save
                        (customer);
    }
//first_name,last_name,company,address,city,state,country,postal_code,phone
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    class InvalidRequestException extends RuntimeException{
        public InvalidRequestException (String s){super(s);}}

    @PutMapping(value="/customer/{id}")
    Customer update(@RequestBody Customer newCustomer, @PathVariable Long id) {
        return customerService.findById(id).map(Customer -> {
            Customer.setFirst_name(newCustomer.getFirst_name());
            Customer.setLast_name(newCustomer.getLast_name());
            Customer.setCompany(newCustomer.getCompany());
            Customer.setAddress(newCustomer.getAddress());
            Customer.setCity(newCustomer.getCity());
            Customer.setState(newCustomer.getState());
            Customer.setCountry(newCustomer.getCountry());
            Customer.setPostal_code(newCustomer.getPostal_code());
            Customer.setPhone(newCustomer.getPhone());
            return
                    customerService.save
                            (Customer);
        }).orElse(null);
    }

    @DeleteMapping(value="/customer/{id}")
    void deleteById(@PathVariable Long id) {
        customerService.deleteById(id);
       // System.out.println(id);
    }
}
