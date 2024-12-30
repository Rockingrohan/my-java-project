package com.shopping.vmart.entities;



import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long productId;
	private String productName;
	private String category;
	private double price;
	
	@ManyToMany(mappedBy = "products",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JsonManagedReference
	@JsonIgnore
	private Set<Order> orders;
}
