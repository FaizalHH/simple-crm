package com.example.simple_crm;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//--------------------this is from lesson 3.9--------------------------
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;



@RestController
// @RequestMapping("/v1/customers")
@RequestMapping("/customers")
public class CustomerController {

    private ArrayList<Customer> customers = new ArrayList<>();

    public CustomerController() {
      customers.add(new Customer("Bruce", "Banner"));
      customers.add(new Customer("Peter", "Parker"));
      customers.add(new Customer("Stephen", "Strange"));
      customers.add(new Customer("Steve", "Rogers"));
    }

  // Create a customer
@PostMapping("")
public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
  customers.add(customer);
  // return customer;
  return new ResponseEntity<>(customer, HttpStatus.CREATED);
}

// Read - get all customers
@GetMapping("")
public ResponseEntity<ArrayList<Customer>> getAllCustomers() {
  return new ResponseEntity<>(customers, HttpStatus.OK);
}

// Read - get one customer
// localhost:8080/customers/35623130-bade-43d6-9bf4-6ea7189301fb
@GetMapping("/{id}")
public ResponseEntity<Customer> getCustomer(@PathVariable String id) {
  try {
    int index = getCustomerIndex(id);
    return new ResponseEntity<>(customers.get(index), HttpStatus.OK);
  } catch (CustomerNotFoundException e) {
    return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404
  }
}

// Update
@PutMapping("/{id}")
public ResponseEntity<Customer> updateCustomer(@PathVariable String id, @RequestBody Customer customer) {

  try {
    int index = getCustomerIndex(id);
    // Retrieve the customer from the list
    Customer updateCustomer = customers.get(index);
    // Update the fields other than id
    updateCustomer.setFirstName(customer.getFirstName());
    updateCustomer.setLastName(customer.getLastName());
    updateCustomer.setEmail(customer.getEmail());
    updateCustomer.setContactNo(customer.getContactNo());
    updateCustomer.setJobTitle(customer.getJobTitle());
    updateCustomer.setYearOfBirth(customer.getYearOfBirth());

    customers.set(index, updateCustomer);
    return new ResponseEntity<>(updateCustomer, HttpStatus.OK);
  } catch (CustomerNotFoundException e) {
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
}

// Delete
@DeleteMapping("/{id}")
public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable String id) {
  try {
    int index = getCustomerIndex(id);
    customers.remove(index);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  } catch (CustomerNotFoundException e) {
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
}

  // Helper
  private int getCustomerIndex(String id) {
    for (Customer customer : customers) {
      if (customer.getId().equals(id)) {
        return customers.indexOf(customer);
      }
    }
    // return -1;
    throw new CustomerNotFoundException(id);
  }




//--------------this is for lesson 3.10---------------------------------------------

// @RestController
// public class CustomerController {
//     @Autowired
//     Customer customer;

//     @GetMapping("/customer")
//     public Customer getCustomer() {
//         customer.setId("1");
//         customer.setFirstName("Tony");
//         customer.setLastName("Stark");
//         customer.setEmail("tony@a.com");
//         customer.setContactNo("12345678");
//         customer.setJobTitle("Inventor");
//         customer.setYearOfBirth(1975);
//         return customer;
    
//     }
    
}
