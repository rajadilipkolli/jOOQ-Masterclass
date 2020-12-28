/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.4",
        "schema version:1.1"
    },
    date = "2020-12-28T06:34:31.202Z",
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JooqProductline implements Serializable {

    private static final long serialVersionUID = 655044110;

    private String    productLine;
    private Long      code;
    private String    textDescription;
    private String    htmlDescription;
    private byte[]    image;
    private LocalDate createdOn;

    public JooqProductline() {}

    public JooqProductline(JooqProductline value) {
        this.productLine = value.productLine;
        this.code = value.code;
        this.textDescription = value.textDescription;
        this.htmlDescription = value.htmlDescription;
        this.image = value.image;
        this.createdOn = value.createdOn;
    }

    public JooqProductline(
        String    productLine,
        Long      code,
        String    textDescription,
        String    htmlDescription,
        byte[]    image,
        LocalDate createdOn
    ) {
        this.productLine = productLine;
        this.code = code;
        this.textDescription = textDescription;
        this.htmlDescription = htmlDescription;
        this.image = image;
        this.createdOn = createdOn;
    }

    @NotNull
    @Size(max = 50)
    public String getProductLine() {
        return this.productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    @NotNull
    public Long getCode() {
        return this.code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    @Size(max = 4000)
    public String getTextDescription() {
        return this.textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    public String getHtmlDescription() {
        return this.htmlDescription;
    }

    public void setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
    }

    public byte[] getImage() {
        return this.image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public LocalDate getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JooqProductline (");

        sb.append(productLine);
        sb.append(", ").append(code);
        sb.append(", ").append(textDescription);
        sb.append(", ").append(htmlDescription);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(createdOn);

        sb.append(")");
        return sb.toString();
    }
}
