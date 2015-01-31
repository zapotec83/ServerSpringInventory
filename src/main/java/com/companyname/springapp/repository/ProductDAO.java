package com.companyname.springapp.repository;

import java.util.List;

import com.companyname.springapp.model.Product;

public interface ProductDAO {

    public List<Product> getProductList();

    public void saveProduct(Product prod);

}
