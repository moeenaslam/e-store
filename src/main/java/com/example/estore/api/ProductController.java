package com.example.estore.api;

import com.example.estore.models.Product;
import com.example.estore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin
@RequestMapping(value="products")
public class ProductController {


  @Autowired
  private ProductService service;


  @GetMapping("")
  public List<Product> list() {
    return service.listAll();
  }

  @GetMapping("/{id}")
  public ResponseEntity<Product> get(@PathVariable Long id) {
    try {
      Product product = service.get(id);
      return new ResponseEntity<Product>(product, HttpStatus.OK);
    } catch (NoSuchElementException e) {
      return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping("")
  public void add(@RequestBody Product product) {
    service.save(product);
  }

  @PutMapping("/{id}")
  public ResponseEntity<?> update(@RequestBody Product product, @PathVariable Long id) {
    try {
      service.update(product,id);

      return new ResponseEntity<>(HttpStatus.OK);
    } catch (NoSuchElementException e) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    service.delete(id);
  }
}
