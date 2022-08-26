package org.itstep.springshop;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {
      @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
        @JoinTable(name = "customer_invoice",
                joinColumns = @JoinColumn(name = "customer_customer_id"),
                inverseJoinColumns = @JoinColumn(name = "invoice_invoice_id"))
        private Invoice invoice;
        @Id
        @Column(name = "customer_id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long customer_id;
        @Column(name = "first_name")
        private String first_name;
        @Column(name = "last_name")
        private String last_name;
        @Column(name = "company")
        private String company;
        @Column(name = "address")
        private String address;
        @Column(name = "city")
        private String city;
        @Column(name = "state")
        private String state;
        @Column(name = "country")
        private String country;
        @Column(name = "postal_code")
        private String postal_code;
        @Column(name = "phone")
        private String phone;
    @OneToMany(mappedBy = "customer_id")
        private Set<Invoice> invoices;

  public Customer(long l, String jo, String silv, String s, String s1, String san, String cp, String roc, String s2, String s3) {
  }
}


