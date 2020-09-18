package com.classicmodels.repository;

import com.classicmodels.pojo.ProductLineDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;
import static jooq.generated.tables.Productline.PRODUCTLINE;
import static jooq.generated.tables.Product.PRODUCT;
import org.jooq.DSLContext;
import org.simpleflatmapper.jdbc.JdbcMapper;
import org.simpleflatmapper.jdbc.JdbcMapperFactory;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    private final JdbcMapper<ProductLineDTO> productMapper;
    private final DSLContext create;

    public ProductRepository(DSLContext create) {
        this.create = create;
        this.productMapper = JdbcMapperFactory
                .newInstance()
                // .addKeys("productLine") // I use @Key in ProductLineDTO
                .newMapper(ProductLineDTO.class);
    }

    public List<ProductLineDTO> findProductLineWithProducts() {

        try ( ResultSet rs
                = create.select(PRODUCTLINE.PRODUCT_LINE.as("productLine"), 
                                PRODUCTLINE.TEXT_DESCRIPTION,
                                PRODUCT.PRODUCT_NAME.as("products_productName"),
                                PRODUCT.PRODUCT_VENDOR.as("products_productVendor"),
                                PRODUCT.QUANTITY_IN_STOCK.as("products_quantityInStock"))
                        .from(PRODUCTLINE)
                        .innerJoin(PRODUCT).using(PRODUCT.PRODUCT_LINE)
                        .orderBy(PRODUCTLINE.PRODUCT_LINE)
                        .fetchResultSet()) {

                    Stream<ProductLineDTO> stream = productMapper.stream(rs);

                    return stream.collect(toList());

                } catch (SQLException ex) {
                    // handle exception (for example, wrap it into a unchecked exception)
                }

                return Collections.emptyList();
    }
}
