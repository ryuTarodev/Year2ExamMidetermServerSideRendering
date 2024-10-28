//Trin Meesuannil (6613050032)
package com.ryutaro.m_66130500032.services.Intef;

import com.ryutaro.m_66130500032.entities.Customer;

import java.util.List;

public interface ICustomerService {

    public List<Customer> getAllCustomer();

    public Customer getCustomerById(int customerId);
}
