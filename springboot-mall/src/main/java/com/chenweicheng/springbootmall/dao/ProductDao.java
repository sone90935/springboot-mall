package com.chenweicheng.springbootmall.dao;

import com.chenweicheng.springbootmall.dto.ProductRequest;
import com.chenweicheng.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);
    void deleteProductById(Integer productId);

}
