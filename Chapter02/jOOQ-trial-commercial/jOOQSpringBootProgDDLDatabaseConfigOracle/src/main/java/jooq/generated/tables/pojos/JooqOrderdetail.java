/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.NotNull;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JooqOrderdetail implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long       orderId;
    private Long       productId;
    private Long       quantityOrdered;
    private BigDecimal priceEach;
    private Integer    orderLineNumber;

    public JooqOrderdetail() {}

    public JooqOrderdetail(JooqOrderdetail value) {
        this.orderId = value.orderId;
        this.productId = value.productId;
        this.quantityOrdered = value.quantityOrdered;
        this.priceEach = value.priceEach;
        this.orderLineNumber = value.orderLineNumber;
    }

    public JooqOrderdetail(
        Long       orderId,
        Long       productId,
        Long       quantityOrdered,
        BigDecimal priceEach,
        Integer    orderLineNumber
    ) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantityOrdered = quantityOrdered;
        this.priceEach = priceEach;
        this.orderLineNumber = orderLineNumber;
    }

    /**
     * Getter for <code>ORDERDETAIL.ORDER_ID</code>.
     */
    @NotNull
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * Setter for <code>ORDERDETAIL.ORDER_ID</code>.
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * Getter for <code>ORDERDETAIL.PRODUCT_ID</code>.
     */
    @NotNull
    public Long getProductId() {
        return this.productId;
    }

    /**
     * Setter for <code>ORDERDETAIL.PRODUCT_ID</code>.
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * Getter for <code>ORDERDETAIL.QUANTITY_ORDERED</code>.
     */
    @NotNull
    public Long getQuantityOrdered() {
        return this.quantityOrdered;
    }

    /**
     * Setter for <code>ORDERDETAIL.QUANTITY_ORDERED</code>.
     */
    public void setQuantityOrdered(Long quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    /**
     * Getter for <code>ORDERDETAIL.PRICE_EACH</code>.
     */
    @NotNull
    public BigDecimal getPriceEach() {
        return this.priceEach;
    }

    /**
     * Setter for <code>ORDERDETAIL.PRICE_EACH</code>.
     */
    public void setPriceEach(BigDecimal priceEach) {
        this.priceEach = priceEach;
    }

    /**
     * Getter for <code>ORDERDETAIL.ORDER_LINE_NUMBER</code>.
     */
    @NotNull
    public Integer getOrderLineNumber() {
        return this.orderLineNumber;
    }

    /**
     * Setter for <code>ORDERDETAIL.ORDER_LINE_NUMBER</code>.
     */
    public void setOrderLineNumber(Integer orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JooqOrderdetail (");

        sb.append(orderId);
        sb.append(", ").append(productId);
        sb.append(", ").append(quantityOrdered);
        sb.append(", ").append(priceEach);
        sb.append(", ").append(orderLineNumber);

        sb.append(")");
        return sb.toString();
    }
}