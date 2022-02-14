package com.Namdeo.SportyShoes.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Namdeo.SportyShoes.entity.Categories;
import com.Namdeo.SportyShoes.entity.Product;
import com.Namdeo.SportyShoes.jdbc.ProductRepository;
@Service
public class ProductService {
@Autowired
public ProductRepository prodrepo;
public List<Product> listAll(){
return prodrepo.findAll();
}
public void save(Product product){
prodrepo.save(product);
}
}
