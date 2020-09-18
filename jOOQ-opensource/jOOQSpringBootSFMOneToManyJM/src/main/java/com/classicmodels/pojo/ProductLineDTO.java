package com.classicmodels.pojo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import org.simpleflatmapper.map.annotation.Key;

public class ProductLineDTO implements Serializable {

    private static final long serialVersionUID = 1;

    @Key
    private String productLine;
    private String textDescription;   
    private List<ProductDTO> products;

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    public List<ProductDTO> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDTO> products) {
        this.products = products;
    }

    @Override
    public int hashCode() {
        
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.productLine);
        hash = 37 * hash + Objects.hashCode(this.textDescription);
        
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if (this == obj) {
            return true;
        }
        
        if (obj == null) {
            return false;
        }
        
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final ProductLineDTO other = (ProductLineDTO) obj;
        if (!Objects.equals(this.productLine, other.productLine)) {
            return false;
        }
        
        if (!Objects.equals(this.textDescription, other.textDescription)) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return "ProductLineDTO{" + "productLine=" + productLine 
                + ", textDescription=" + textDescription + ", products=" + products + '}';
    }
           
}