package com.ak4.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.UUID.randomUUID;

@Entity
@Table(name = "CUST")
public class CustomerEntity {

    @Id
    @Column(name = "CUST_ID")
    private String customerId = randomUUID().toString();

    @Column(name = "CUST_NAME")
    private String customerName;

    @OneToMany(mappedBy = "customerEntity")
    private Set<EmailEntity> emailEntities;

    @OneToOne
    @JoinColumn(name = "ADDRESS_ID")
    private AddressEntity addressEntity;

    @OneToOne
    @JoinColumn(name = "CRED_ID")
    private CredentialEntity credentialEntity;

    @OneToMany(mappedBy = "customerEntity")
    private List<PhoneNumberEntity> phoneNumberEntityList;

    @OneToMany(mappedBy = "customerEntity")
    @MapKey(name = "vehicleId")
    private Map<String, VehicleEntity> vehicleMap;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Set<EmailEntity> getEmailEntities() {
        return emailEntities;
    }

    public void setEmailEntities(Set<EmailEntity> emailEntities) {
        this.emailEntities = emailEntities;
    }

    public AddressEntity getAddressEntity() {
        return addressEntity;
    }

    public void setAddressEntity(AddressEntity addressEntity) {
        this.addressEntity = addressEntity;
    }

    public CredentialEntity getCredentialEntity() {
        return credentialEntity;
    }

    public void setCredentialEntity(CredentialEntity credentialEntity) {
        this.credentialEntity = credentialEntity;
    }

    public List<PhoneNumberEntity> getPhoneNumberEntityList() {
        return phoneNumberEntityList;
    }

    public void setPhoneNumberEntityList(List<PhoneNumberEntity> phoneNumberEntityList) {
        this.phoneNumberEntityList = phoneNumberEntityList;
    }

    public Map<String, VehicleEntity> getVehicleMap() {
        return vehicleMap;
    }

    public void setVehicleMap(Map<String, VehicleEntity> vehicleMap) {
        this.vehicleMap = vehicleMap;
    }
}
