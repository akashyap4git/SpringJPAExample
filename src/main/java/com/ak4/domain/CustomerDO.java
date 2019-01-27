package com.ak4.domain;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CustomerDO {

    private String customerId;

    private String customerName;

    private Set<EmailDO> emailDO;

    private AddressDO addressDO;

    private CredentialDO credentialDO;

    private List<PhoneNumberDO> phoneNumberDOList;

    private Map<String, VehicleDO> vehicleMap;

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

    public Set<EmailDO> getEmailDO() {
        return emailDO;
    }

    public void setEmailDO(Set<EmailDO> emailDO) {
        this.emailDO = emailDO;
    }

    public AddressDO getAddressDO() {
        return addressDO;
    }

    public void setAddressDO(AddressDO addressDO) {
        this.addressDO = addressDO;
    }

    public CredentialDO getCredentialDO() {
        return credentialDO;
    }

    public void setCredentialDO(CredentialDO credentialDO) {
        this.credentialDO = credentialDO;
    }

    public List<PhoneNumberDO> getPhoneNumberDOList() {
        return phoneNumberDOList;
    }

    public void setPhoneNumberDOList(List<PhoneNumberDO> phoneNumberDOList) {
        this.phoneNumberDOList = phoneNumberDOList;
    }

    public Map<String, VehicleDO> getVehicleMap() {
        return vehicleMap;
    }

    public void setVehicleMap(Map<String, VehicleDO> vehicleMap) {
        this.vehicleMap = vehicleMap;
    }
}
