package com.example.rest.service;

import org.springframework.stereotype.Service;

import com.example.rest.entity.Customer;
import com.example.rest.repo.CustomerRepo;

import java.util.*;

@Service
public class CustomerService {
    private final CustomerRepo repo;

    public CustomerService(CustomerRepo custRepo){
        this.repo = custRepo;
    }

    public void addCustomer(Customer c){
        repo.addCustomer(c);
    }

    public List<Customer> getAllCustomer(){
        return repo.getAllCustomer();
    }

    public Customer getById(int id){
        return repo.getById(id);
    }

    public void delById(int id){
        repo.delById(id);
    }

    public void putById(int id, String name, String email){
        repo.putById(id, name, email);
    }

    public void patchById(int id, String name){
        repo.patchById(id, name);
    }
}
