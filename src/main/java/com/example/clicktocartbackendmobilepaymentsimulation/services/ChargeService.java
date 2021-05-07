package com.example.clicktocartbackendmobilepaymentsimulation.services;

import com.example.clicktocartbackendmobilepaymentsimulation.model.Charge;
import com.example.clicktocartbackendmobilepaymentsimulation.repository.ChargeRepository;
import com.example.clicktocartbackendmobilepaymentsimulation.repository.MobileCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChargeService {

    @Autowired
    private ChargeRepository chargeRepository;
    @Autowired
    private MobileCustomerRepository mobileCustomerRepository;

    public Boolean addCharge(Charge charge){
        Double CusAccBalance = mobileCustomerRepository.getAccountBalance(charge.getMobilenumber());
        if (CusAccBalance>=charge.getAmount()){
            chargeRepository.save(charge);
            mobileCustomerRepository.deductAmount(charge.getAmount(),charge.getMobilenumber());
            return true;

        }else {
            return false;
        }

    }


}
