//Trin Meesuannil (6613050032)
package com.ryutaro.m_66130500032.controllers;

import com.ryutaro.m_66130500032.entities.Customer;
import com.ryutaro.m_66130500032.services.Impl.CustomerService;
import com.ryutaro.m_66130500032.services.Impl.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/66130500032/customers")
public class OrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private CustomerService customerService;

    @GetMapping("/orders")
    public String getAllOrderByID(@RequestParam int id, Model model){
        Customer customer = customerService.getCustomerById(id);
        model.addAttribute("orders", orderService.getAllOrderByCustomer(customer));
        model.addAttribute("customer" , customer);
        return "order_list";
    }
}
