package com.ak4.schema;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address {

    private String addressId;

    private AddressCategory addressCategory;

    private String city;

    private Long zipCode;

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public AddressCategory getAddressCategory() {
        return addressCategory;
    }

    public void setAddressCategory(AddressCategory addressCategory) {
        this.addressCategory = addressCategory;
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
