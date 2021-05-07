package com.example.clicktocartbackendmobilepaymentsimulation.controller;

import com.example.clicktocartbackendmobilepaymentsimulation.model.MobileCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.clicktocartbackendmobilepaymentsimulation.services.MobileCustomerService;


@CrossOrigin("*")
@RequestMapping(value = "/api/mobileCustomer")
@RestController
public class MobileCustomerController {

    @Autowired
    private MobileCustomerService mobileCustomerService;

    @PostMapping
    public MobileCustomer addMobiileCustomer (@RequestBody MobileCustomer mobileCustomer){
        return mobileCustomerService.addMobileCustomer(mobileCustomer);
    }

}