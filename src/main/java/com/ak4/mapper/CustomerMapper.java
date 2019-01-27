package com.ak4.mapper;

import com.ak4.domain.*;
import com.ak4.schema.*;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class CustomerMapper {

    public Customer from(CustomerDO customerDO) {
        Customer customer = new Customer();

        Credential credential = new Credential();
        credential.setUsername(customerDO.getCredentialDO().getUsername());
        credential.setPassword(customerDO.getCredentialDO().getPassword());

        Address address = new Address();

        AddressCategoryDO addressCategoryDO = AddressCategoryDO.valueOf(customerDO.getAddressDO().getAddressCategoryDO().name());
        AddressCategory addressCategory = AddressCategory.valueOf(addressCategoryDO.name());
        address.setAddressCategory(addressCategory);
        address.setCity(customerDO.getAddressDO().getCity());
        address.setZipCode(customerDO.getAddressDO().getZipCode());

        Set<Email> emailSet = new HashSet<>();
        for(EmailDO emailDO : customerDO.getEmailDO()) {
            Email email = new Email();
            email.setEmailId(emailDO.getEmailId());
            emailSet.add(email);
        }

        List<PhoneNumber> phoneNumbers = new ArrayList<>();
        for(PhoneNumberDO phoneNumberDO : customerDO.getPhoneNumberDOList()) {
            PhoneNumber phoneNumber = new PhoneNumber();
            phoneNumber.setPhoneNumber(phoneNumberDO.getPhoneNumber());
            phoneNumbers.add(phoneNumber);
        }

        Map<String, Vehicle> vehicleMap = new HashMap<>();
        for(Map.Entry<String, VehicleDO> vehicleDOEntry : customerDO.getVehicleMap().entrySet()) {
            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleId(vehicleDOEntry.getKey());
            vehicle.setVehicleName(vehicleDOEntry.getValue().getVehicleName());
            vehicleMap.put(vehicle.getVehicleId(), vehicle);
        }

        customer.setAddress(address);
        customer.setCredential(credential);
        customer.setCustomerId(customerDO.getCustomerId());
        customer.setCustomerName(customerDO.getCustomerName());
        customer.setEmail(emailSet);
        customer.setPhoneNumberList(phoneNumbers);
        customer.setVehicleMap(vehicleMap);

        return customer;

    }

    public CustomerDO from(Customer customer) {
        CustomerDO customerDO = new CustomerDO();

        CredentialDO credentialDO = new CredentialDO();
        credentialDO.setUsername(customer.getCredential().getUsername());
        credentialDO.setPassword(customer.getCredential().getPassword());

        AddressDO addressDO = new AddressDO();
        AddressCategory addressCategory = AddressCategory.valueOf(customer.getAddress().getAddressCategory().name());
        AddressCategoryDO addressCategoryDO = AddressCategoryDO.valueOf(addressCategory.name());
        addressDO.setAddressCategoryDO(addressCategoryDO);
        addressDO.setCity(customer.getAddress().getCity());
        addressDO.setZipCode(customer.getAddress().getZipCode());

        Set<EmailDO> emailDOSet = new HashSet<>();
        for(Email email : customer.getEmail()) {
            EmailDO emailDO = new EmailDO();
            emailDO.setEmailId(email.getEmailId());
            emailDOSet.add(emailDO);
        }

        List<PhoneNumberDO> phoneNumberDOList = new ArrayList<>();
        for(PhoneNumber phoneNumber : customer.getPhoneNumberList()) {
            PhoneNumberDO phoneNumberDO = new PhoneNumberDO();
            phoneNumberDO.setPhoneNumber(phoneNumber.getPhoneNumber());
            phoneNumberDOList.add(phoneNumberDO);
        }

        Map<String, VehicleDO> vehicleDOMap = new HashMap<>();
        for(Map.Entry<String, Vehicle> vehicleEntry : customer.getVehicleMap().entrySet()) {
            VehicleDO vehicleDO = new VehicleDO();
            vehicleDO.setVehicleId(vehicleEntry.getKey());
            vehicleDO.setVehicleName(vehicleEntry.getValue().getVehicleName());
            vehicleDOMap.put(vehicleDO.getVehicleId(), vehicleDO);
        }

        customerDO.setCustomerId(customer.getCustomerId());
        customerDO.setEmailDO(emailDOSet);
        customerDO.setVehicleMap(vehicleDOMap);
        customerDO.setPhoneNumberDOList(phoneNumberDOList);
        customerDO.setCustomerName(customer.getCustomerName());
        customerDO.setCredentialDO(credentialDO);
        customerDO.setAddressDO(addressDO);

        return customerDO;
    }
}
