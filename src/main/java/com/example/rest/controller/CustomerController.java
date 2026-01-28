package com.example.rest.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.service.CustomerService;

import com.example.rest.entity.Customer;

import java.util.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService service;

    public CustomerController(CustomerService service){
        this.service = service;
    }

    @PostMapping("/")
    public String addCustomer(@RequestBody Customer customer){
        service.addCustomer(customer);
        return "Customer added";
    }

    @GetMapping("/")
    public List<Customer> getAllCustomer(){
        return service.getAllCustomer();
    }

    @GetMapping("/id")
    public Customer getById(@RequestParam int id){
        return service.getById(id);
    }

    @DeleteMapping("/id")
    public void delById(@RequestParam int id){
        service.delById(id);
    }

    @PutMapping("/id")
    public void putById(@RequestParam int id, @RequestParam String name){
        service.putById(id, name);
    }
}
