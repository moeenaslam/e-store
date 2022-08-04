package com.example.estore;

import com.example.estore.api.ProductController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class EStoreApplicationTests {

  @Autowired
  private ProductController productController;

  @Test
  void contextLoads() {
  }


  @Test
  void basicTest(){
    assertThat(productController).isNotNull();
  }

}
