package com.api.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.api.product.model.ModelProduct;
import com.api.product.model.ResponseModel;
import com.api.product.repository.ProductRepository;

import java.util.List;


@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    //List products
    @RequestMapping(value="/products", method = RequestMethod.GET)
    public @ResponseBody List<ModelProduct> listAll(){
        return repository.findAll();
    }

    //Create Products
    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public @ResponseBody ModelProduct create(@RequestBody ModelProduct product){
        return repository.save(product);
    }

    //Filter Products
    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public @ResponseBody ModelProduct filter(@PathVariable Integer id){
        return repository.findByIdentifier(id);
    }

    //Alter products
    @RequestMapping(value = "/products", method = RequestMethod.PUT)
    public @ResponseBody ModelProduct alter(@RequestBody ModelProduct product){
        return repository.save(product);
    }

    //Remove products
    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    public @ResponseBody ResponseModel remover(@PathVariable Integer id){
        ResponseModel response = new ResponseModel();

        try {
            ModelProduct product = filter(id);
            this.repository.delete(product);
            response.setMessage("Product removed successfully.");
        } catch (Exception error){
            response.setMessage("Failed to remove: " + error.getMessage());
        }

        return response;
    }


}
