/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.pojos;


import java.io.Serializable;

import javax.annotation.processing.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.14.4",
        "schema version:1.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProductOfProductLine implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long   pId;
    private String pName;
    private String pLine;

    public ProductOfProductLine() {}

    public ProductOfProductLine(ProductOfProductLine value) {
        this.pId = value.pId;
        this.pName = value.pName;
        this.pLine = value.pLine;
    }

    public ProductOfProductLine(
        Long   pId,
        String pName,
        String pLine
    ) {
        this.pId = pId;
        this.pName = pName;
        this.pLine = pLine;
    }

    /**
     * Getter for <code>public.product_of_product_line.p_id</code>.
     */
    public Long getPId() {
        return this.pId;
    }

    /**
     * Setter for <code>public.product_of_product_line.p_id</code>.
     */
    public void setPId(Long pId) {
        this.pId = pId;
    }

    /**
     * Getter for <code>public.product_of_product_line.p_name</code>.
     */
    public String getPName() {
        return this.pName;
    }

    /**
     * Setter for <code>public.product_of_product_line.p_name</code>.
     */
    public void setPName(String pName) {
        this.pName = pName;
    }

    /**
     * Getter for <code>public.product_of_product_line.p_line</code>.
     */
    public String getPLine() {
        return this.pLine;
    }

    /**
     * Setter for <code>public.product_of_product_line.p_line</code>.
     */
    public void setPLine(String pLine) {
        this.pLine = pLine;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProductOfProductLine (");

        sb.append(pId);
        sb.append(", ").append(pName);
        sb.append(", ").append(pLine);

        sb.append(")");
        return sb.toString();
    }
}