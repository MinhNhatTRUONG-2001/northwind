package fi.vamk.e2000606.northwind;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;

@Entity
@Table(name = "inventory_transactions")
@NamedQuery(name="InventoryTransactions.findAll", query="SELECT p FROM InventoryTransactions p")
public class InventoryTransactions implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"transaction_type\"", nullable = false)
  private Byte transactionType;
  @Column(name = "\"transaction_created_date\"", nullable = true)
  private Timestamp transactionCreatedDate;
  @Column(name = "\"transaction_modified_date\"", nullable = true)
  private Timestamp transactionModifiedDate;
  @Column(name = "\"product_id\"", nullable = false)
  private Integer productId;
  @Column(name = "\"quantity\"", nullable = false)
  private Integer quantity;
  @Column(name = "\"purchase_order_id\"", nullable = true)
  private Integer purchaseOrderId;
  @Column(name = "\"customer_order_id\"", nullable = true)
  private Integer customerOrderId;
  @Column(name = "\"comments\"", nullable = true)
  private String comments;
  public InventoryTransactions() {
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public Byte getTransactionType() {
    return transactionType;
  }
  public void setTransactionType(Byte transactionType) {
    this.transactionType = transactionType;
  }
  public Timestamp getTransactionCreatedDate() {
    return transactionCreatedDate;
  }
  public void setTransactionCreatedDate(Timestamp transactionCreatedDate) {
    this.transactionCreatedDate = transactionCreatedDate;
  }
  public Timestamp getTransactionModifiedDate() {
    return transactionModifiedDate;
  }
  public void setTransactionModifiedDate(Timestamp transactionModifiedDate) {
    this.transactionModifiedDate = transactionModifiedDate;
  }
  public Integer getProductId() {
    return productId;
  }
  public void setProductId(Integer productId) {
    this.productId = productId;
  }
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }
  public Integer getPurchaseOrderId() {
    return purchaseOrderId;
  }
  public void setPurchaseOrderId(Integer purchaseOrderId) {
    this.purchaseOrderId = purchaseOrderId;
  }
  public Integer getCustomerOrderId() {
    return customerOrderId;
  }
  public void setCustomerOrderId(Integer customerOrderId) {
    this.customerOrderId = customerOrderId;
  }
  public String getComments() {
    return comments;
  }
  public void setComments(String comments) {
    this.comments = comments;
  }
}