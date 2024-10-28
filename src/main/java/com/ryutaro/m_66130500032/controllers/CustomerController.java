//Trin Meesuannil (6613050032)
package com.ryutaro.m_66130500032.controllers;

import com.ryutaro.m_66130500032.services.Impl.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/66130500032")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("customers")
    public String getAllCustomer(Model model){
        model.addAttribute("customers", customerService.getAllCustomer());
        return "customer_list";
    }
}
