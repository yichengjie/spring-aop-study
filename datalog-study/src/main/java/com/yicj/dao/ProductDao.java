package com.yicj.dao;

import com.yicj.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Long> {
    Product findById(Long id);
}
