package com.amex.customerapi.models

import jakarta.persistence.*





@Entity
@Table(name="Address")
data class Address(@Id @GeneratedValue(strategy= GenerationType.IDENTITY) @Column(name="Address_Id")var addressId:Long,
                   @Column(name="Door_No", nullable = false,length=5) var doorNo: String,
                   @Column(name="Street_Name",nullable = false,length=50)var streetName: String,
                   @Column(name="City",nullable = false,length=50) var city: String,
                   @Column(name="State",nullable = false,length=5) var state:String,
                   @Column(name="Pincode")  var postCode:Long,
                   @ManyToOne(fetch = FetchType.LAZY)
                   @JoinColumn(foreignKey = ForeignKey(name = "Account_No"), name = "Account_No")
                   var customer: Customer
)


