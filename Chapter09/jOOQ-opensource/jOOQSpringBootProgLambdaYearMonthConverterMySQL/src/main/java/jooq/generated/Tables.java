/*
 * This file is generated by jOOQ.
 */
package jooq.generated;


import javax.annotation.processing.Generated;

import jooq.generated.tables.BankTransaction;
import jooq.generated.tables.Customer;
import jooq.generated.tables.Customerdetail;
import jooq.generated.tables.Department;
import jooq.generated.tables.Employee;
import jooq.generated.tables.Manager;
import jooq.generated.tables.Office;
import jooq.generated.tables.OfficeHasManager;
import jooq.generated.tables.Order;
import jooq.generated.tables.Orderdetail;
import jooq.generated.tables.Payment;
import jooq.generated.tables.Product;
import jooq.generated.tables.Productline;
import jooq.generated.tables.Productlinedetail;
import jooq.generated.tables.Sale;
import jooq.generated.tables.Top3product;


/**
 * Convenience access to all tables in classicmodels
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
public class Tables {

    /**
     * The table <code>classicmodels.bank_transaction</code>.
     */
    public static final BankTransaction BANK_TRANSACTION = BankTransaction.BANK_TRANSACTION;

    /**
     * The table <code>classicmodels.customer</code>.
     */
    public static final Customer CUSTOMER = Customer.CUSTOMER;

    /**
     * The table <code>classicmodels.customerdetail</code>.
     */
    public static final Customerdetail CUSTOMERDETAIL = Customerdetail.CUSTOMERDETAIL;

    /**
     * The table <code>classicmodels.department</code>.
     */
    public static final Department DEPARTMENT = Department.DEPARTMENT;

    /**
     * The table <code>classicmodels.employee</code>.
     */
    public static final Employee EMPLOYEE = Employee.EMPLOYEE;

    /**
     * The table <code>classicmodels.manager</code>.
     */
    public static final Manager MANAGER = Manager.MANAGER;

    /**
     * The table <code>classicmodels.office</code>.
     */
    public static final Office OFFICE = Office.OFFICE;

    /**
     * The table <code>classicmodels.office_has_manager</code>.
     */
    public static final OfficeHasManager OFFICE_HAS_MANAGER = OfficeHasManager.OFFICE_HAS_MANAGER;

    /**
     * The table <code>classicmodels.order</code>.
     */
    public static final Order ORDER = Order.ORDER;

    /**
     * The table <code>classicmodels.orderdetail</code>.
     */
    public static final Orderdetail ORDERDETAIL = Orderdetail.ORDERDETAIL;

    /**
     * The table <code>classicmodels.payment</code>.
     */
    public static final Payment PAYMENT = Payment.PAYMENT;

    /**
     * The table <code>classicmodels.product</code>.
     */
    public static final Product PRODUCT = Product.PRODUCT;

    /**
     * The table <code>classicmodels.productline</code>.
     */
    public static final Productline PRODUCTLINE = Productline.PRODUCTLINE;

    /**
     * The table <code>classicmodels.productlinedetail</code>.
     */
    public static final Productlinedetail PRODUCTLINEDETAIL = Productlinedetail.PRODUCTLINEDETAIL;

    /**
     * The table <code>classicmodels.sale</code>.
     */
    public static final Sale SALE = Sale.SALE;

    /**
     * The table <code>classicmodels.top3product</code>.
     */
    public static final Top3product TOP3PRODUCT = Top3product.TOP3PRODUCT;
}
