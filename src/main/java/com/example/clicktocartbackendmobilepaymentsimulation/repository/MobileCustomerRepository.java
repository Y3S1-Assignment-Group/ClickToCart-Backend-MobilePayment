package com.example.clicktocartbackendmobilepaymentsimulation.repository;

import com.example.clicktocartbackendmobilepaymentsimulation.model.MobileCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface MobileCustomerRepository extends JpaRepository<MobileCustomer,Integer> {

    @Query(value = "SELECT accountbalance from mobilecustomer_tbl mc WHERE  mc.mobilenumber = ?1 ",nativeQuery = true)
    public Double getAccountBalance(String mobileNumber);

    @Query("UPDATE MobileCustomer SET accountbalance = accountbalance - ?1 WHERE mobilenumber = ?2")
    @Modifying
    public void deductAmount(Double charge ,String mobilenumber);
}
