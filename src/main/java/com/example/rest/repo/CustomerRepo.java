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

    public void putById(Customer cust){
        for(int i = 0; i < customers.size(); i++){
            Customer c = customers.get(i);
            if(c.getId() == cust.getId()){
                customers.set(i, cust);
            }
        }
    }

    public void patchById(Customer cust){
        for(Customer c: customers){
            if(c.getId() == cust.getId()){
                if(cust.getName() != null){
                    c.setName(cust.getName());
                }

                if(cust.getEmail() != null){
                    c.setEmail(cust.getEmail());
                }
            }
        }
    }
}
