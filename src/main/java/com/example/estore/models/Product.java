package com.example.estore.models;


//@Entity
public class Product {

//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private String skuNumber;
  private int quantity;

  public Product() {
  }

  public Product(Long id, String name, String skuNumber, int quantity) {
    this.id = id;
    this.name = name;
    this.skuNumber = skuNumber;
    this.quantity = quantity;
  }

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
