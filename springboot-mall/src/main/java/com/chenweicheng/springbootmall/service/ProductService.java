package com.chenweicheng.springbootmall.service;

import com.chenweicheng.springbootmall.dto.ProductRequest;
import com.chenweicheng.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);
}
