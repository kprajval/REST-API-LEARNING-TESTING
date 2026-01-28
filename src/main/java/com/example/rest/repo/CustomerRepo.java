package com.example.rest.repo;

import org.springframework.stereotype.Repository;

import com.example.rest.entity.Customer;

import java.util.*;

@Repository
public class CustomerRepo {
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public List<Customer> getAllCustomer(){
        return customers;
    }

    public Customer getById(int id){
        for(Customer c: customers){
            if(c.getId() == id){
                return c;
            }
        }

        return new Customer();
    }

    public void delById(int id){
        for(Customer c: customers){
            if(c.getId() == id){
                customers.remove(c);
            }
        }
    }

    public void putById(int id, String name){
        for(Customer c: customers){
            if(c.getId() == id){
                c.setName(name);
            }
        }
    }
}
