package com.example.simple_crm;

import java.util.ArrayList;

/*-------------------------------------from lesson 3.10--------------------------------------- */
// import org.springframework.stereotype.Service;

// @Service
// public interface CustomerService {
// // public class CustomerService {
//     private CustomerRepository customerRepository = new CustomerRepository();

//     public Customer createCustomer(Customer customer) {
//       return customerRepository.createCustomer(customer);
//     }
  
//     public Customer getCustomer(String id) {
//       return customerRepository.getCustomer(getCustomerIndex(id));
//     }
  
//     public ArrayList<Customer> getAllCustomers() {
//       return customerRepository.getAllCustomers();
//     }
  
//     public Customer updateCustomer(String id, Customer customer) {
//       return customerRepository.updateCustomer(getCustomerIndex(id), customer);
//     }
  
//     public void deleteCustomer(String id) {
//       customerRepository.deleteCustomer(getCustomerIndex(id));
//     }
  
//     // Helper
//     private int getCustomerIndex(String id) {
//       for (Customer customer : customerRepository.getAllCustomers()) {
//         if (customer.getId().equals(id)) {
//           return customerRepository.getAllCustomers().indexOf(customer);
//         }
//       }
//       // return -1;
//       throw new CustomerNotFoundException(id);
//     }
/*-------------------------------------from lesson 3.10--------------------------------------- */
public interface CustomerService {
    Customer createCustomer(Customer customer);
      
    Customer getCustomer(String id);
      
    ArrayList<Customer> getAllCustomers();
      
    Customer updateCustomer(String id, Customer customer);
      
    void deleteCustomer(String id);
          
  
}
