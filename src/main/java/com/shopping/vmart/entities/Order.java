package com.shopping.vmart.entities;

import java.time.LocalDate;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name="customer_order")
public class Order {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long orderId;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
        name = "product_orders",
        joinColumns = {@JoinColumn(name = "orderId")},
        inverseJoinColumns = {@JoinColumn(name = "productId")}
    )
    private Set<Product> products;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	
    @JoinColumn(name = "cust_id")
    //@JsonIgnore
    @JsonBackReference
    private Customer customer;
}
