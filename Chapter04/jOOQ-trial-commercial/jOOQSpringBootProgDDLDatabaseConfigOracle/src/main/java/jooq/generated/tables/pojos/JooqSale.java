/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.pojos;


import java.io.Serializable;
import java.math.BigInteger;

import javax.validation.constraints.NotNull;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JooqSale implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigInteger saleId;
    private Integer    fiscalYear;
    private Double     sale;
    private Long       employeeNumber;
    private Byte       hot;

    public JooqSale() {}

    public JooqSale(JooqSale value) {
        this.saleId = value.saleId;
        this.fiscalYear = value.fiscalYear;
        this.sale = value.sale;
        this.employeeNumber = value.employeeNumber;
        this.hot = value.hot;
    }

    public JooqSale(
        BigInteger saleId,
        Integer    fiscalYear,
        Double     sale,
        Long       employeeNumber,
        Byte       hot
    ) {
        this.saleId = saleId;
        this.fiscalYear = fiscalYear;
        this.sale = sale;
        this.employeeNumber = employeeNumber;
        this.hot = hot;
    }

    /**
     * Getter for <code>SALE.SALE_ID</code>.
     */
    @NotNull
    public BigInteger getSaleId() {
        return this.saleId;
    }

    /**
     * Setter for <code>SALE.SALE_ID</code>.
     */
    public void setSaleId(BigInteger saleId) {
        this.saleId = saleId;
    }

    /**
     * Getter for <code>SALE.FISCAL_YEAR</code>.
     */
    @NotNull
    public Integer getFiscalYear() {
        return this.fiscalYear;
    }

    /**
     * Setter for <code>SALE.FISCAL_YEAR</code>.
     */
    public void setFiscalYear(Integer fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    /**
     * Getter for <code>SALE.SALE</code>.
     */
    @NotNull
    public Double getSale() {
        return this.sale;
    }

    /**
     * Setter for <code>SALE.SALE</code>.
     */
    public void setSale(Double sale) {
        this.sale = sale;
    }

    /**
     * Getter for <code>SALE.EMPLOYEE_NUMBER</code>.
     */
    public Long getEmployeeNumber() {
        return this.employeeNumber;
    }

    /**
     * Setter for <code>SALE.EMPLOYEE_NUMBER</code>.
     */
    public void setEmployeeNumber(Long employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    /**
     * Getter for <code>SALE.HOT</code>.
     */
    public Byte getHot() {
        return this.hot;
    }

    /**
     * Setter for <code>SALE.HOT</code>.
     */
    public void setHot(Byte hot) {
        this.hot = hot;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JooqSale (");

        sb.append(saleId);
        sb.append(", ").append(fiscalYear);
        sb.append(", ").append(sale);
        sb.append(", ").append(employeeNumber);
        sb.append(", ").append(hot);

        sb.append(")");
        return sb.toString();
    }
}
