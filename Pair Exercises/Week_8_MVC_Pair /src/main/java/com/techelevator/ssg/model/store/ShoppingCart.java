package com.techelevator.ssg.model.store;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

	public Map<Long, Integer> quantityMap; 
	
	public Map<Long, Product> productMap;
	
	
	public DollarAmount total;
	

	public ShoppingCart() {
		this.quantityMap = new HashMap<Long, Integer>(); 
		this.productMap = new HashMap<Long, Product>(); 
	}
	
	
	public Map<Long, Integer> getQuantityMap() {
		return quantityMap;
	}

	public void setQuantityMap(Map<Long, Integer> quantityMap) {
		this.quantityMap = quantityMap;
	}

	public Map<Long, Product> getProductMap() {
		return productMap;
	}

	public void setProductMap(Map<Long, Product> productMap) {
		this.productMap = productMap;
	} 
	
	public void addItemToCart(Product product, int quantity) {
	
		if(quantityMap.containsKey(product.getId()) ) {
			int oldQuantity = quantityMap.get(product.getId());  
		
			quantityMap.put(product.getId(), quantity + oldQuantity); 
		} else {
			quantityMap.put(product.getId(), quantity);
			
		}
		
		productMap.put(product.getId(), product);
		
	}
	
	public DollarAmount getTotal() {
        total = new DollarAmount(0);
        
        for(Product p : this.productMap.values()) {
        		int itemQuantity = quantityMap.get(p.getId()); 
        	
        		for(int i =0; i < itemQuantity; i++) {
        			total = total.plus(p.getPrice()); 
        		}
        }
        
        return total;
    }
	
	public DollarAmount getProductTotal(Product product) {
        total = new DollarAmount(0);
        
        
        		int itemQuantity = quantityMap.get(product.getId()); 
        	
        		for(int i =0; i < itemQuantity; i++) {
        			total = total.plus(product.getPrice()); 
        		}
      
        
        return total;
    }
	
	
	
	public void setTotal(DollarAmount total) {
		this.total = total; 
	}
	
}
