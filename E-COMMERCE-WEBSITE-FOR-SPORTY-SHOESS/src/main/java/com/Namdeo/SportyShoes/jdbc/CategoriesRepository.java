package com.Namdeo.SportyShoes.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Namdeo.SportyShoes.entity.Categories;
public interface CategoriesRepository extends JpaRepository<Categories, Long> {
}