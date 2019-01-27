package com.ak4.entity;

import javax.persistence.*;

import static java.util.UUID.randomUUID;

@Entity
@Table(name = "CUST_ADDRESS")
public class AddressEntity {

    @Id
    @Column(name = "ADDRESS_ID")
    private String addressId = randomUUID().toString();

    @Enumerated
    @Column(name = "CATEGORY_ID")
    private AddressCategoryEntity addressCategoryEntity;

    @Column(name = "CITY")
    private String city;

    @Column(name = "ZIP_CODE")
    private Long zipCode;

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public AddressCategoryEntity getAddressCategoryEntity() {
        return addressCategoryEntity;
    }

    public void setAddressCategoryEntity(AddressCategoryEntity addressCategoryEntity) {
        this.addressCategoryEntity = addressCategoryEntity;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getZipCode() {
        return zipCode;
    }

    public void setZipCode(Long zipCode) {
        this.zipCode = zipCode;
    }
}
