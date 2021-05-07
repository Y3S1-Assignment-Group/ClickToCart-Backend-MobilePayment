package com.example.clicktocartbackendmobilepaymentsimulation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mobilecustomer_tbl")
public class MobileCustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String cusname;
    String mobilenumber;
    Double accountbalance;

}
