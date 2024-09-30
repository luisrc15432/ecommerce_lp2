/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.ecommerce.app.service;

import upeu.edu.pe.ecommerce.app.repository.ProductRepository;
import upeu.edu.pe.ecommerce.infrastructure.entity.ProductEntity;
import upeu.edu.pe.ecommerce.infrastructure.entity.UserEntity;

/**
 *
 * @author tpp
 */
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public Iterable<ProductEntity> getProducts() {
       return productRepository.getProducts();
    }

    public Iterable<ProductEntity> getProductsByUser(UserEntity userEntity) {
      return productRepository.getProductsByUser(userEntity);
    }

    public ProductEntity getProductById(Integer id) {
      return productRepository.getProductById(id);
    }

    public ProductEntity saveProduct(ProductEntity productEntity) {
      return productRepository.saveProduct(productEntity);
    }

    public boolean deleteProductById(Integer id) {
      return productRepository.deleteProductById(id);
    }
}
