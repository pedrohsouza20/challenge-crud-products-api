package com.pedro.challenge_crud_products_api.controllers;

import com.pedro.challenge_crud_products_api.dtos.ProductRecordDto;
import com.pedro.challenge_crud_products_api.models.ProductModel;
import com.pedro.challenge_crud_products_api.repositories.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @PostMapping("/products")
    public ResponseEntity<ProductModel> saveProduct(@RequestBody @Valid ProductRecordDto productRecordDto){
        System.out.println("teste");
        var productModel = new ProductModel();

       BeanUtils.copyProperties(productRecordDto, productModel);
        System.out.print("aqui" + productRecordDto.active() + productModel.getActive());
        return ResponseEntity.status(HttpStatus.CREATED).body(productRepository.save(productModel));
    }

    /*@PostMapping("/products")
    public ResponseEntity<ProductModel> saveProduct(@RequestBody @Valid ProductRecordDto productRecordDto) {
        var productModel = new ProductModel();
        BeanUtils.copyProperties(productRecordDto, productModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(productRepository.save(productModel));
    }*/

}
