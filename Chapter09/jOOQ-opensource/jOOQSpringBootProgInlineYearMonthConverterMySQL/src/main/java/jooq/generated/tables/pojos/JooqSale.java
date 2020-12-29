/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.pojos;


import java.io.Serializable;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import jooq.generated.enums.SaleRate;
import jooq.generated.enums.SaleVat;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.4",
        "schema version:1.1"
    },
    date = "2020-12-29T07:38:31.604Z",
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JooqSale implements Serializable {

    private static final long serialVersionUID = 1442921362;

    private Long     saleId;
    private Integer  fiscalYear;
    private Double   sale;
    private Long     employeeNumber;
    private Byte     hot;
    private SaleRate rate;
    private SaleVat  vat;
    private String   trend;

    public JooqSale() {}

    public JooqSale(JooqSale value) {
        this.saleId = value.saleId;
        this.fiscalYear = value.fiscalYear;
        this.sale = value.sale;
        this.employeeNumber = value.employeeNumber;
        this.hot = value.hot;
        this.rate = value.rate;
        this.vat = value.vat;
        this.trend = value.trend;
    }

    public JooqSale(
        Long     saleId,
        Integer  fiscalYear,
        Double   sale,
        Long     employeeNumber,
        Byte     hot,
        SaleRate rate,
        SaleVat  vat,
        String   trend
    ) {
        this.saleId = saleId;
        this.fiscalYear = fiscalYear;
        this.sale = sale;
        this.employeeNumber = employeeNumber;
        this.hot = hot;
        this.rate = rate;
        this.vat = vat;
        this.trend = trend;
    }

    public Long getSaleId() {
        return this.saleId;
    }

    public void setSaleId(Long saleId) {
        this.saleId = saleId;
    }

    @NotNull
    public Integer getFiscalYear() {
        return this.fiscalYear;
    }

    public void setFiscalYear(Integer fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    @NotNull
    public Double getSale() {
        return this.sale;
    }

    public void setSale(Double sale) {
        this.sale = sale;
    }

    public Long getEmployeeNumber() {
        return this.employeeNumber;
    }

    public void setEmployeeNumber(Long employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Byte getHot() {
        return this.hot;
    }

    public void setHot(Byte hot) {
        this.hot = hot;
    }

    public SaleRate getRate() {
        return this.rate;
    }

    public void setRate(SaleRate rate) {
        this.rate = rate;
    }

    public SaleVat getVat() {
        return this.vat;
    }

    public void setVat(SaleVat vat) {
        this.vat = vat;
    }

    @Size(max = 10)
    public String getTrend() {
        return this.trend;
    }

    public void setTrend(String trend) {
        this.trend = trend;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JooqSale (");

        sb.append(saleId);
        sb.append(", ").append(fiscalYear);
        sb.append(", ").append(sale);
        sb.append(", ").append(employeeNumber);
        sb.append(", ").append(hot);
        sb.append(", ").append(rate);
        sb.append(", ").append(vat);
        sb.append(", ").append(trend);

        sb.append(")");
        return sb.toString();
    }
}
