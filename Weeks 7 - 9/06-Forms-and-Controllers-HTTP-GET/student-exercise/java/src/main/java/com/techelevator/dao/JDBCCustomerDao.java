package com.techelevator.dao;

import com.techelevator.dao.model.Actor;
import com.techelevator.dao.model.Customer;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

/**
 * JDBCCustomerDao
 */
@Component
public class JDBCCustomerDao implements CustomerDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JDBCCustomerDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    private String getSortColumn(String sort) {
    		if("last_name".contentEquals(sort)) {
    			return "last_name";
    		} else if ("email".contentEquals(sort)) {
    			return "email"; 
    		} else if ("activebool".contentEquals(sort)) {
    			return "activebool"; 
    		}
    		else {
    			return "last_name";
    		}
    }
    
    @Override
	public List<Customer> searchAndSortCustomers(String search, String sort) {
		List<Customer> customers = new ArrayList<>();
		String customerSearchSql = "SELECT first_name, last_name, email, activebool FROM customer WHERE first_name ILIKE ? OR last_name ILIKE ? ORDER BY " + getSortColumn(sort);
		SqlRowSet results = jdbcTemplate.queryForRowSet(customerSearchSql, "%" + search.toUpperCase() + "%", "%" + search.toUpperCase() + "%");
		while(results.next()) {
			customers.add(mapRowToCustomer(results));
		}
		return customers;
	}

	private Customer mapRowToCustomer(SqlRowSet results) {
		Customer customerRow = new Customer();
		customerRow.setFirstName(results.getString("first_name"));
		customerRow.setLastName(results.getString("last_name"));
		customerRow.setEmail(results.getString("email"));
		customerRow.setActive(results.getBoolean("activebool"));
	
        return customerRow;
	}
    
    
}