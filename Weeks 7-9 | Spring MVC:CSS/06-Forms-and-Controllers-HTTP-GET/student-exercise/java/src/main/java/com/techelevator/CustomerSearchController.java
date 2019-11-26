package com.techelevator;

import com.techelevator.dao.CustomerDao;
import com.techelevator.dao.model.Actor;
import com.techelevator.dao.model.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerSearchController {

    @Autowired
    private CustomerDao customerDao;

    @RequestMapping("/customers")
	public String showSearchSortCustomerForm() {
		
		return "customerList";
		
	}

	@RequestMapping("/customerResults")
	public String searchSortCustomers(@RequestParam String searchTerm, @RequestParam String sort, ModelMap modelHolder){
		/* Call the model and pass values to the jsp */
		
		List<Customer> results = customerDao.searchAndSortCustomers(searchTerm, sort); 
		
		modelHolder.put("customers", results); 
		
		return "customerList";
	}
    
    
}