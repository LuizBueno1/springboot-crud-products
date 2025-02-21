package com.api.product.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.api.product.model.ModelProduct;

public interface ProductRepository extends CrudRepository<ModelProduct, Integer>{
     
    //List all the products
    List<ModelProduct> findAll();

    //Search by the id
    ModelProduct findByIdentifier(int identifier);

    //Remove the product
    void delete(ModelProduct product);

    //Create/Alter product
    <ProdMod extends ModelProduct> ProdMod save(ProdMod product);
}
