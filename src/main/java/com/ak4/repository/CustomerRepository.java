package com.ak4.repository;

import com.ak4.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional(readOnly = true)
public interface CustomerRepository extends JpaRepository<CustomerEntity, String> {

    String USERNAME = "username";
    String EMAIL = "emailId";
    String CITY = "city";


    @Query("select cust from CustomerEntity cust, Credential cred " +
            "where cust.credentials.credId = cred.credId and cred.username = :username")
    CustomerEntity findByUsername(@Param(USERNAME) String username);

    @Query("select cust from CustomerEntity cust, Address a, Email e " +
            "where cust.address.addressId = a.addressId and a.city = :city " +
            "and cust.emails.emailId = e.emailId and e.emailId = :emailId")
    CustomerEntity findByEmailAndCity(@Param(EMAIL) String emailId, @Param(CITY) String city);
}
