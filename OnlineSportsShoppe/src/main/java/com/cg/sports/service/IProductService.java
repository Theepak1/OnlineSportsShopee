package com.cg.sports.service;

import java.util.List;

import com.cg.sports.bean.Product;

public interface IProductService {
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
