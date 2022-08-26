package org.itstep.springshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class InvoiceController {
@Autowired
    InvoiceService invoiceService;

    @GetMapping(value="/invoice")
    public List<Invoice> findAll(){
        return invoiceService.findAll();
    }

    @GetMapping(value="/invoice/{id}")
    public Optional<Invoice> findById(@PathVariable Long id){
        return invoiceService.findById(id);
    }

    @PostMapping(value="/invoice")
    Invoice createOrSave(@RequestBody Invoice invoice) {
        //System.out.println(artist.getName());
        return
                invoiceService.save
                        (invoice);
    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    class InvalidRequestException extends RuntimeException{
        public InvalidRequestException (String s){super(s);}}

    @PutMapping(value="/invoice/{id}")
    Invoice update(@RequestBody Invoice newInvoice, @PathVariable Long id) {
        return invoiceService.findById(id).map(Invoice -> {
            Invoice.setCustomer_id(newInvoice.getCustomer_id());
            Invoice.setInvoice_date(newInvoice.getInvoice_date());
            Invoice.setBilling_address(newInvoice.getBilling_address());
            Invoice.setBilling_city(newInvoice.getBilling_city());
            Invoice.setBilling_country(newInvoice.getBilling_country());
            Invoice.setBilling_postal_code(newInvoice.getBilling_postal_code());
            Invoice.setTotal(newInvoice.getTotal());
            return
                    invoiceService.save
                            (Invoice);
        }).orElse(null);
    }

    @DeleteMapping(value="/invoice/{id}")
    void deleteById(@PathVariable Long id) {
        invoiceService.deleteById(id);
        //System.out.println("delete");
    }
}
