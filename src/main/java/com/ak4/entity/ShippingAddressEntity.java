package com.ak4.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ShippingAddressEntity extends AddressEntity {

    @Column(name = "SHIPPING_ADDRESS_LINE")
    private String shippingAddressLine;

    public String getShippingAddressLine() {
        return shippingAddressLine;
    }

    public void setShippingAddressLine(String shippingAddressLine) {
        this.shippingAddressLine = shippingAddressLine;
    }
}
