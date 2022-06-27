package com.chenweicheng.springbootmall.dao;

import com.chenweicheng.springbootmall.constant.ProductCategory;
import com.chenweicheng.springbootmall.dto.ProductRequest;
import com.chenweicheng.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {


     List<Product> getProducts(ProductCategory category,String search);





    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);
    void deleteProductById(Integer productId);

}
