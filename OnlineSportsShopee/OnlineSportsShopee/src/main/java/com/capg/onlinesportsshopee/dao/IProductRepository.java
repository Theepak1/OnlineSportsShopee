package com.capg.onlinesportsshopee.dao;

import java.util.List;


import com.capg.onlinesportsshopee.bean.Product;

public interface IProductRepository {
	public Product addProdct(Product product);
	public Product removeProduct(long id);
	public Product updateProduct(long id, Product product);
	public Product getProduct(long id);
	public List<Product> getAllProduct();
	public List<Product> getProductsByName();
	public List<Product> getProductsBySize();
	public List<Product> getProductsByPrice();
	public List<Product> getProductsByColor();
}
