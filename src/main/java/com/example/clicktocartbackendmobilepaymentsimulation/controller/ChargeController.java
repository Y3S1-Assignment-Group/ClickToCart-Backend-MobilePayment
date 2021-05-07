package com.example.clicktocartbackendmobilepaymentsimulation.controller;

import com.example.clicktocartbackendmobilepaymentsimulation.model.Charge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.clicktocartbackendmobilepaymentsimulation.services.ChargeService;


@CrossOrigin("*")
@RequestMapping(value = "/api/mobilePayment")
@RestController
public class ChargeController {

    @Autowired
    private ChargeService chargeService;

    @PostMapping
    public Boolean addCharge (@RequestBody Charge charge){
        return chargeService.addCharge(charge);
    }


}
