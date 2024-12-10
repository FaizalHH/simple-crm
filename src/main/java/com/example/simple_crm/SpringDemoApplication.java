package com.example.simple_crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args)
        System.out.println("👋👋👋 My first Spring Boot Appplication 🎉🎉" );

			// public static void main(String[] args) {
		// logger.info("🟢 Starting SpringDemoApplication");
		// logger.warn("🟠 Test Warning");
		// logger.error("🔴 Test Error");

		SpringApplication.run(SpringDemoApplication.class, args);
		System.out.println("👋👋👋 My first Spring Boot Application! ✅");
	
	}

	// @GetMapping("/hello")
	// public String hello() {
	// 	return "Hello World!!";
	// }

	// // Get mapping with query parameters using @RequestParam
	// // e.g. localhost:8080/greet?name=Tony&role=inventor
	// @GetMapping("/greet")
	// public String greet(@RequestParam(defaultValue = "unknown") String name,
	// 		@RequestParam(defaultValue = "unknown") String role) {
	// 	return "Hello " + name + "! You are a " + role + "!";
	// }
	
	// // @GetMapping("/greet")
	// // public String greet(@RequestParam(defaultValue = "Hello World") String name) {
	// // 	return "Hello " + name + "!";

 	// // }

	// // Get mapping with path parameters using @PathVariable
	// @GetMapping("/user/{id}")
	// public String getUser(@PathVariable int id) {
	// 	return "User ID: " + id;
	// }

	
	// @GetMapping("/products")
	// public String getProducts(@RequestParam(required = false) String search) {
	// 	if (search == null) {
	// 		return "This is the product page.";
	// 	}
	// 	return "You have searched for: " + search;
	// }

	// @GetMapping("/products/{id}")
	// public String getProduct(@PathVariable int id) {
	// 	return "You have requested for product with id: " + id;
	// }
}
