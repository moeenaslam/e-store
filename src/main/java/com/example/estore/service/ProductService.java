package com.example.estore.service;

import com.example.estore.models.Product;
import com.example.estore.repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
//  @Autowired
//  private ProductRepository repo;

  List<Product> products = new ArrayList<>();
  Long idCounter = 0L;

  public List<Product> listAll() {
    return products;
  }

  public void save(Product product) {
    product.setId(++idCounter);
    products.add(product);
  }

  public Product get(Long id) {
    return products.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
  }

  public void delete(Long id) {
    products.removeIf(x -> x.getId().equals(id));
  }

  public void update(Product product, Long id){
    Product existProduct = products.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
    if(existProduct!=null){
      existProduct.update(product);
    }
  }
}
