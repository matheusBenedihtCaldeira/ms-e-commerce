package com.cloudfy.ecshoppingcart.controllers;

import com.cloudfy.ecshoppingcart.models.entities.Customer;
import com.cloudfy.ecshoppingcart.services.GetCustomerByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping(value = "/order/customer")
public class GetCustomerController {

    @Autowired
    private GetCustomerByIdService service;

    @GetMapping(value = "/{id}")
    public Customer getCustomer(@PathVariable Long id){
        Customer customer = service.getCustomer(id);
        return customer;
    }
}