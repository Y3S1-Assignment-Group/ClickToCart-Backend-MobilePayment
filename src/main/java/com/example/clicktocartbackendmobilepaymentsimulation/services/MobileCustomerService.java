package com.example.clicktocartbackendmobilepaymentsimulation.services;

import com.example.clicktocartbackendmobilepaymentsimulation.model.MobileCustomer;
import com.example.clicktocartbackendmobilepaymentsimulation.repository.MobileCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobileCustomerService {
    @Autowired
    private MobileCustomerRepository mobileCustomerRepository;

    public MobileCustomer addMobileCustomer(MobileCustomer mobileCustomer){
        return mobileCustomerRepository.save(mobileCustomer);
    }
}
