package com.example.estore.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private String skuNumber;
  private int quantity;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSkuNumber() {
    return skuNumber;
  }

  public void setSkuNumber(String skuNumber) {
    this.skuNumber = skuNumber;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void update(Product product) {
    this.name = product.getName();
    this.quantity = product.getQuantity();
    this.skuNumber = product.getSkuNumber();
  }
}
