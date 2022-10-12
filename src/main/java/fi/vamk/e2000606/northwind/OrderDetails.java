package fi.vamk.e2000606.northwind;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;

@Entity
@Table(name = "order_details")
@NamedQuery(name="OrderDetails.findAll", query="SELECT p FROM OrderDetails p")
public class OrderDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"order_id\"", nullable = false)
  private Integer orderId;
  @Column(name = "\"product_id\"", nullable = true)
  private Integer productId;
  @Column(name = "\"quantity\"", nullable = false)
  private java.math.BigDecimal quantity;
  @Column(name = "\"unit_price\"", nullable = true)
  private java.math.BigDecimal unitPrice;
  @Column(name = "\"discount\"", nullable = false)
  private Double discount;
  @Column(name = "\"status_id\"", nullable = true)
  private Integer statusId;
  @Column(name = "\"date_allocated\"", nullable = true)
  private Timestamp dateAllocated;
  @Column(name = "\"purchase_order_id\"", nullable = true)
  private Integer purchaseOrderId;
  @Column(name = "\"inventory_id\"", nullable = true)
  private Integer inventoryId;
  public OrderDetails() {
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
  public Integer getProductId() {
    return productId;
  }
  public void setProductId(Integer productId) {
    this.productId = productId;
  }
  public java.math.BigDecimal getQuantity() {
    return quantity;
  }
  public void setQuantity(java.math.BigDecimal quantity) {
    this.quantity = quantity;
  }
  public java.math.BigDecimal getUnitPrice() {
    return unitPrice;
  }
  public void setUnitPrice(java.math.BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }
  public Double getDiscount() {
    return discount;
  }
  public void setDiscount(Double discount) {
    this.discount = discount;
  }
  public Integer getStatusId() {
    return statusId;
  }
  public void setStatusId(Integer statusId) {
    this.statusId = statusId;
  }
  public Timestamp getDateAllocated() {
    return dateAllocated;
  }
  public void setDateAllocated(Timestamp dateAllocated) {
    this.dateAllocated = dateAllocated;
  }
  public Integer getPurchaseOrderId() {
    return purchaseOrderId;
  }
  public void setPurchaseOrderId(Integer purchaseOrderId) {
    this.purchaseOrderId = purchaseOrderId;
  }
  public Integer getInventoryId() {
    return inventoryId;
  }
  public void setInventoryId(Integer inventoryId) {
    this.inventoryId = inventoryId;
  }
}