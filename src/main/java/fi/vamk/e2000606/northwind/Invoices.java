package fi.vamk.e2000606.northwind;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;

@Entity
@Table(name = "invoices")
@NamedQuery(name="Invoices.findAll", query="SELECT p FROM Invoices p")
public class Invoices implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"order_id\"", nullable = true)
  private Integer orderId;
  @Column(name = "\"invoice_date\"", nullable = true)
  private Timestamp invoiceDate;
  @Column(name = "\"due_date\"", nullable = true)
  private Timestamp dueDate;
  @Column(name = "\"tax\"", nullable = true)
  private java.math.BigDecimal tax;
  @Column(name = "\"shipping\"", nullable = true)
  private java.math.BigDecimal shipping;
  @Column(name = "\"amount_due\"", nullable = true)
  private java.math.BigDecimal amountDue;
  public Invoices() {
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public Integer getOrderId() {
    return orderId;
  }
  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }
  public Timestamp getInvoiceDate() {
    return invoiceDate;
  }
  public void setInvoiceDate(Timestamp invoiceDate) {
    this.invoiceDate = invoiceDate;
  }
  public Timestamp getDueDate() {
    return dueDate;
  }
  public void setDueDate(Timestamp dueDate) {
    this.dueDate = dueDate;
  }
  public java.math.BigDecimal getTax() {
    return tax;
  }
  public void setTax(java.math.BigDecimal tax) {
    this.tax = tax;
  }
  public java.math.BigDecimal getShipping() {
    return shipping;
  }
  public void setShipping(java.math.BigDecimal shipping) {
    this.shipping = shipping;
  }
  public java.math.BigDecimal getAmountDue() {
    return amountDue;
  }
  public void setAmountDue(java.math.BigDecimal amountDue) {
    this.amountDue = amountDue;
  }
}