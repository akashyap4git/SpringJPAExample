package com.ak4.entity;

import javax.persistence.*;

import static java.util.UUID.randomUUID;

@Entity
@Table(name = "CUST_PHONE")
public class PhoneNumberEntity {

    @Id
    @Column(name = "PHONE_ID")
    private String phoneId = randomUUID().toString();

    @Column(name = "PHONE_NUMBER")
    private Long phoneNumber;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CUST_ID")
    private CustomerEntity customerEntity;

    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CustomerEntity getCustomerEntity() {
        return customerEntity;
    }

    public void setCustomerEntity(CustomerEntity customerEntity) {
        this.customerEntity = customerEntity;
    }
}
