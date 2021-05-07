package com.example.clicktocartbackendmobilepaymentsimulation.repository;

import com.example.clicktocartbackendmobilepaymentsimulation.model.Charge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface ChargeRepository extends JpaRepository<Charge,Integer> {

}
