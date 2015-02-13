package com.companyname.springapp.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.companyname.springapp.model.Product;
import com.companyname.springapp.repository.ProductDAO;
import com.companyname.springapp.service.ProductManager;

public class ProductManagerImpl implements ProductManager {

    @Autowired
    private ProductDAO productDao;

    public List<Product> getProducts() {
    	return productDao.getProductList();
    }

    public void setProductDao(ProductDAO productDao) {
        this.productDao = productDao;
    }
    
    public void increasePrice(int percentage) {
    	List<Product> products = productDao.getProductList();
        if (products != null) {
            for (Product product : products) {
                double newPrice = product.getPrice().doubleValue() * (100 + percentage)/100;
                product.setPrice(newPrice);
                productDao.saveProduct(product);
            }
        }  
    }
}
