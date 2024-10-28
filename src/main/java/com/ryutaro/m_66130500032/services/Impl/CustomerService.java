//Trin Meesuannil (6613050032)
package com.ryutaro.m_66130500032.services.Impl;

import com.ryutaro.m_66130500032.entities.Customer;
import com.ryutaro.m_66130500032.repositories.CustomerRepository;
import com.ryutaro.m_66130500032.services.Intef.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(int customerId) {
        return customerRepository.findById(customerId).orElse(null);
    }
}
