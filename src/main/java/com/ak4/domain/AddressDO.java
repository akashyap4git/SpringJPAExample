package com.ak4.domain;

public class AddressDO {

    private String addressId;

    private AddressCategoryDO addressCategoryDO;

    private String city;

    private Long zipCode;

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public AddressCategoryDO getAddressCategoryDO() {
        return addressCategoryDO;
    }

    public void setAddressCategoryDO(AddressCategoryDO addressCategoryDO) {
        this.addressCategoryDO = addressCategoryDO;
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
