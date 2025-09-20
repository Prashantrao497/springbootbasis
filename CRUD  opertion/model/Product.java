package com.productapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
@Data



@Entity
//@Table(name="product_details")
public class Product {
public Product(String productName, String brand, String category, double price) {
		super();
		this.productName = productName;
		this.brand = brand;
		this.category = category;
		this.price = price;
	}
private String productName;
@Id
@GeneratedValue
private Integer productId;
@Column(length=30)
private String  brand;
@Column(length=30)
private String category;
@Column(name="cost")
private double price;

}
