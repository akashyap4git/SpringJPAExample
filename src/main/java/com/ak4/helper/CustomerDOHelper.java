package com.ak4.helper;

import com.ak4.domain.*;
import com.ak4.entity.*;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class CustomerDOHelper {

    public CustomerEntity createCustomerEntity(CustomerDO customerDO) {
        CustomerEntity customerEntity = new CustomerEntity();

        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setCity(customerDO.getAddressDO().getCity());
        addressEntity.setZipCode(customerDO.getAddressDO().getZipCode());
        AddressCategoryDO addressCategoryDO = AddressCategoryDO.valueOf(customerDO.getAddressDO().getAddressCategoryDO().name());
        AddressCategoryEntity addressCategoryEntity = AddressCategoryEntity.valueOf(addressCategoryDO.name());
        addressEntity.setAddressCategoryEntity(addressCategoryEntity);


        CredentialEntity credentialEntity = new CredentialEntity();
        credentialEntity.setUsername(customerDO.getCredentialDO().getUsername());
        credentialEntity.setPassword(customerDO.getCredentialDO().getPassword());

        Set<EmailEntity> emailEntitySet = new HashSet<>();

        for (EmailDO emailDO : customerDO.getEmailDO()) {
            EmailEntity emailEntity = new EmailEntity();
            emailEntity.setEmailId(emailDO.getEmailId());
            emailEntitySet.add(emailEntity);
        }

        List<PhoneNumberEntity> phoneNumberEntities = new ArrayList<>();

        for (PhoneNumberDO phoneNumberDO : customerDO.getPhoneNumberDOList()) {
            PhoneNumberEntity phoneNumberEntity = new PhoneNumberEntity();
            phoneNumberEntity.setPhoneNumber(phoneNumberDO.getPhoneNumber());
            phoneNumberEntities.add(phoneNumberEntity);
        }

        Map<String, VehicleEntity> vehicleEntityMap = new HashMap<>();

        for (Map.Entry<String, VehicleDO> vehicleDO : customerDO.getVehicleMap().entrySet()) {
            VehicleEntity vehicleEntity = new VehicleEntity();
            vehicleEntity.setVehicleId(vehicleDO.getKey());
            vehicleEntity.setVehicleName(vehicleDO.getValue().getVehicleName());
            vehicleEntityMap.put(vehicleEntity.getVehicleId(), vehicleEntity);
        }

        customerEntity.setAddressEntity(addressEntity);
        customerEntity.setCredentialEntity(credentialEntity);
        customerEntity.setCustomerName(customerDO.getCustomerName());
        customerEntity.setEmailEntities(emailEntitySet);
        customerEntity.setPhoneNumberEntityList(phoneNumberEntities);
        customerEntity.setVehicleMap(vehicleEntityMap);

        return customerEntity;
    }


    public CustomerDO createCustomerDO(CustomerEntity customerEntity) {
        CustomerDO customerDO = new CustomerDO();

        AddressDO addressDO = new AddressDO();
        AddressCategoryEntity addressCategoryEntity = AddressCategoryEntity.valueOf(customerEntity.getAddressEntity().getAddressCategoryEntity().name());
        AddressCategoryDO addressCategoryDO = AddressCategoryDO.valueOf(addressCategoryEntity.name());
        addressDO.setAddressCategoryDO(addressCategoryDO);
        addressDO.setCity(customerEntity.getAddressEntity().getCity());
        addressDO.setZipCode(customerEntity.getAddressEntity().getZipCode());

        CredentialDO credentialDO = new CredentialDO();
        credentialDO.setUsername(customerEntity.getCredentialEntity().getUsername());
        credentialDO.setPassword(customerEntity.getCredentialEntity().getPassword());

        Set<EmailDO> emailDOSet = new HashSet<>();
        for (EmailEntity emailEntity : customerEntity.getEmailEntities()) {
            EmailDO emailDO = new EmailDO();
            emailDO.setEmailId(emailEntity.getEmailId());
            emailDOSet.add(emailDO);
        }

        List<PhoneNumberDO> phoneNumberDOList = new ArrayList<>();
        for(PhoneNumberEntity phoneNumberEntity : customerEntity.getPhoneNumberEntityList()) {
            PhoneNumberDO phoneNumberDO = new PhoneNumberDO();
            phoneNumberDO.setPhoneNumber(phoneNumberEntity.getPhoneNumber());
            phoneNumberDOList.add(phoneNumberDO);
        }

        Map<String, VehicleDO> vehicleDOMap = new HashMap<>();
        for(Map.Entry<String, VehicleEntity> vehicleEntity : customerEntity.getVehicleMap().entrySet()) {
            VehicleDO vehicleDO = new VehicleDO();
            vehicleDO.setVehicleId(vehicleEntity.getKey());
            vehicleDO.setVehicleName(vehicleEntity.getValue().getVehicleName());
            vehicleDOMap.put(vehicleDO.getVehicleId(), vehicleDO);
        }

        customerDO.setAddressDO(addressDO);
        customerDO.setCredentialDO(credentialDO);
        customerDO.setCustomerName(customerEntity.getCustomerName());
        customerDO.setPhoneNumberDOList(phoneNumberDOList);
        customerDO.setVehicleMap(vehicleDOMap);
        customerDO.setEmailDO(emailDOSet);
        customerDO.setCustomerId(customerEntity.getCustomerId());

        return customerDO;
    }

}
