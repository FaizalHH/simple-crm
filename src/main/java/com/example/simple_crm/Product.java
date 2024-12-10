package com.example.simple_crm;

import java.util.ArrayList;
import java.util.UUID;

import org.slf4j.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private final String id = UUID.randomUUID().toString();
    private String name;
    private String description;
    private int price;


}
