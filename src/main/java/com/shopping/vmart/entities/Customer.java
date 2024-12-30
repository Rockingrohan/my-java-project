package com.shopping.vmart.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer custId;
    private String custName;
    private Integer tier;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Order> orders;
}
