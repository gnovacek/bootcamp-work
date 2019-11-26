package com.techelevator.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.shopping.dao.IItemDao;
import com.techelevator.shopping.model.Item;
import com.techelevator.shopping.exception.ItemNotFoundException;

@RestController
@CrossOrigin
@RequestMapping("/api/groceries")
public class ShoppingApiController {

	@Autowired
	private IItemDao dao;

	@GetMapping
	public List<Item> get() {
		return dao.list();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Item create(@RequestBody Item newItem) {
		Item itemToReturn = dao.create(newItem);
		return itemToReturn;
	}

	@GetMapping("/{id}")
	public Item getById(@PathVariable int id) {

		Item myItem = dao.read(id);
		
		if(myItem == null) {
			String message = "Sorry, that item wasn't found in our system my friend";
			throw new ItemNotFoundException(id, message);
		}
			return myItem;
	}

	@PutMapping("/{id}")
	public Item updateItem(@PathVariable int id, @RequestBody Item itemToUpdate) {
		Item updatedItem = dao.update(itemToUpdate);
		return updatedItem;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		dao.delete(id);
	}

}
