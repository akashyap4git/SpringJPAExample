package com.ak4.schema;

public class ShippingAddress extends Address {

    private String shippingAddressLine;

    public String getShippingAddressLine() {
        return shippingAddressLine;
    }

    public void setShippingAddressLine(String shippingAddressLine) {
        this.shippingAddressLine = shippingAddressLine;
    }
}
