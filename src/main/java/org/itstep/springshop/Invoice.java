package org.itstep.springshop;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "invoice")
public class Invoice {
    @Id
    @Column(name = "invoice_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long invoice_id;
    @Column(name="customer_id")
    private Long customer_id;
    @Column(name="invoice_date")
    private String invoice_date;
    @Column(name="billing_address")
    private String billing_address;
    @Column(name="billing_city")
    private String billing_city;
    @Column(name="billing_country")
    private String billing_country;
    @Column(name="billing_postal_code")
    private String billing_postal_code;
    @Column(name="total")
    private float total;
}
