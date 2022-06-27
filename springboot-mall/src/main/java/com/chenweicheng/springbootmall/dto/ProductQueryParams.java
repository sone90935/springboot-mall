package com.chenweicheng.springbootmall.dto;

import com.chenweicheng.springbootmall.constant.ProductCategory;

public class ProductQueryParams {

    private ProductCategory category;
    String search;

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
