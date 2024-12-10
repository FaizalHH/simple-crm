package com.example.simple_crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
  // SampleItem item = new SampleItem();
  // Autowired is used to inject the bean into the class
  @Autowired
  SampleItem item;

  @Value("${spring.application.name:Demo Spring Boot App}")
  private String appName;

  @Value("${server.port}")
  private String port;

  @GetMapping("/item")
  public SampleItem getItem() {
    item.setId(1);
    item.setName("Apple");
    item.setPrice(1999);
    item.setDesc("An Apple iPhone.");
    return item;
  }

  @GetMapping("/app-info")
  public String getAppInfo() {
    return "App " + appName + " is running on port: " + port + ".";
  }

  @GetMapping("/hello")
  public String hello() {
    return "Hello World!";
  }

  // Get mapping with query parameters using @RequestParam
  // e.g. localhost:8080/greet?name=Tony&role=inventor
  @GetMapping("/greet")
  public String greet(@RequestParam(defaultValue = "unknown") String name,
      @RequestParam(defaultValue = "unknown") String role) {
    return "Hello " + name + "! You are a " + role + "!";
  }

  // Get mapping with path parameters using @PathVariable
  @GetMapping("/users/{id}")
  public String getUser(@PathVariable int id) {
    return "User ID: " + id;
  }

  @GetMapping("/products")
  public String getProducts(@RequestParam(required = false) String search) {
    if (search == null) {
      return "This is the product page.";
    }
    return "You have searched for: " + search;
  }

  @GetMapping("/products/{id}")
  public String getProduct(@PathVariable int id) {
    return "You have requested for product with id: " + id;
  }

}
