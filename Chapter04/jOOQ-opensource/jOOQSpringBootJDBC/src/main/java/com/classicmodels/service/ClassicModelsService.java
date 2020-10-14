package com.classicmodels.service;

import com.classicmodels.model.ProductLine;
import org.springframework.stereotype.Service;
import com.classicmodels.repository.ProductlineRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClassicModelsService {

    private final ProductlineRepository productLineRepository;

    public ClassicModelsService(ProductlineRepository productLineRepository) {
        this.productLineRepository = productLineRepository;        
    }

    public Iterable<ProductLine> fetchProductLineAndProduct() {
        // Spring Data JDBC always fetches the entire aggregate via N+1 queries
        return productLineRepository.findAll();
    }
    
    @Transactional
    public void updateProductLineDescription(String id) {
    
        // Spring Data JDBC removes all products, updates the product line and insert the products back
        ProductLine classicCars = productLineRepository.findById(id).get();
        classicCars.setTextDescription("Lorem ipsum dolor sit amet via JDBC");
        
        productLineRepository.save(classicCars);
    }
        
    public void updateProductLineDescriptionJooq(String id) {
        
        // jOOQ uses a single update query to achieve the same result
        productLineRepository.updateProductLineDescriptionJooq(id);
    }
}
