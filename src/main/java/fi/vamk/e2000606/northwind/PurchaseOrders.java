package fi.vamk.e2000606.northwind;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;

@Entity
@Table(name = "purchase_orders")
@NamedQuery(name="PurchaseOrders.findAll", query="SELECT p FROM PurchaseOrders p")
public class PurchaseOrders implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"supplier_id\"", nullable = true)
  private Integer supplierId;
  @Column(name = "\"created_by\"", nullable = true)
  private Integer createdBy;
  @Column(name = "\"submitted_date\"", nullable = true)
  private Timestamp submittedDate;
  @Column(name = "\"creation_date\"", nullable = true)
  private Timestamp creationDate;
  @Column(name = "\"status_id\"", nullable = true)
  private Integer statusId;
  @Column(name = "\"expected_date\"", nullable = true)
  private Timestamp expectedDate;
  @Column(name = "\"shipping_fee\"", nullable = false)
  private java.math.BigDecimal shippingFee;
  @Column(name = "\"taxes\"", nullable = false)
  private java.math.BigDecimal taxes;
  @Column(name = "\"payment_date\"", nullable = true)
  private Timestamp paymentDate;
  @Column(name = "\"payment_amount\"", nullable = true)
  private java.math.BigDecimal paymentAmount;
  @Column(name = "\"payment_method\"", nullable = true)
  private String paymentMethod;
  @Column(name = "\"notes\"", nullable = true)
  private String notes;
  @Column(name = "\"approved_by\"", nullable = true)
  private Integer approvedBy;
  @Column(name = "\"approved_date\"", nullable = true)
  private Timestamp approvedDate;
  @Column(name = "\"submitted_by\"", nullable = true)
  private Integer submittedBy;
  public PurchaseOrders() {
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public Integer getSupplierId() {
    return supplierId;
  }
  public void setSupplierId(Integer supplierId) {
    this.supplierId = supplierId;
  }
  public Integer getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }
  public Timestamp getSubmittedDate() {
    return submittedDate;
  }
  public void setSubmittedDate(Timestamp submittedDate) {
    this.submittedDate = submittedDate;
  }
  public Timestamp getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(Timestamp creationDate) {
    this.creationDate = creationDate;
  }
  public Integer getStatusId() {
    return statusId;
  }
  public void setStatusId(Integer statusId) {
    this.statusId = statusId;
  }
  public Timestamp getExpectedDate() {
    return expectedDate;
  }
  public void setExpectedDate(Timestamp expectedDate) {
    this.expectedDate = expectedDate;
  }
  public java.math.BigDecimal getShippingFee() {
    return shippingFee;
  }
  public void setShippingFee(java.math.BigDecimal shippingFee) {
    this.shippingFee = shippingFee;
  }
  public java.math.BigDecimal getTaxes() {
    return taxes;
  }
  public void setTaxes(java.math.BigDecimal taxes) {
    this.taxes = taxes;
  }
  public Timestamp getPaymentDate() {
    return paymentDate;
  }
  public void setPaymentDate(Timestamp paymentDate) {
    this.paymentDate = paymentDate;
  }
  public java.math.BigDecimal getPaymentAmount() {
    return paymentAmount;
  }
  public void setPaymentAmount(java.math.BigDecimal paymentAmount) {
    this.paymentAmount = paymentAmount;
  }
  public String getPaymentMethod() {
    return paymentMethod;
  }
  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }
  public Integer getApprovedBy() {
    return approvedBy;
  }
  public void setApprovedBy(Integer approvedBy) {
    this.approvedBy = approvedBy;
  }
  public Timestamp getApprovedDate() {
    return approvedDate;
  }
  public void setApprovedDate(Timestamp approvedDate) {
    this.approvedDate = approvedDate;
  }
  public Integer getSubmittedBy() {
    return submittedBy;
  }
  public void setSubmittedBy(Integer submittedBy) {
    this.submittedBy = submittedBy;
  }
}