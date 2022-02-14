package com.Namdeo.SportyShoes.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Namdeo.SportyShoes.entity.Product;
public interface ProductRepository extends JpaRepository<Product, Long>{
}