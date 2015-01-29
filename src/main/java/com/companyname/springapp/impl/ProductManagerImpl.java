package com.companyname.springapp.impl;

import java.util.List;

import com.companyname.springapp.model.Product;
import com.companyname.springapp.service.ProductManager;

public class ProductManagerImpl implements ProductManager {

	private List<Product> products;
	
    public List<Product> getProducts() {
        return products;       
    }
    
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void increasePrice(int percentage) {
        if (products != null) {
            for (Product product : products) {
                double newPrice = product.getPrice().doubleValue() * (100 + percentage)/100;
                product.setPrice(newPrice);
            }
        }  
    }
}
