package fi.vamk.e2000606.northwind;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "products")
@NamedQuery(name="Products.findAll", query="SELECT p FROM Products p")
public class Products implements Serializable {
  private static final long serialVersionUID = 1L;

  @Column(name = "\"supplier_ids\"", nullable = true)
  private String supplierIds;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"product_code\"", nullable = true)
  private String productCode;
  @Column(name = "\"product_name\"", nullable = true)
  private String productName;
  @Column(name = "\"description\"", nullable = true)
  private String description;
  @Column(name = "\"standard_cost\"", nullable = true)
  private java.math.BigDecimal standardCost;
  @Column(name = "\"list_price\"", nullable = false)
  private java.math.BigDecimal listPrice;
  @Column(name = "\"reorder_level\"", nullable = true)
  private Integer reorderLevel;
  @Column(name = "\"target_level\"", nullable = true)
  private Integer targetLevel;
  @Column(name = "\"quantity_per_unit\"", nullable = true)
  private String quantityPerUnit;
  @Column(name = "\"discontinued\"", nullable = false)
  private boolean discontinued;
  @Column(name = "\"minimum_reorder_quantity\"", nullable = true)
  private Integer minimumReorderQuantity;
  @Column(name = "\"category\"", nullable = true)
  private String category;
  @Column(name = "\"attachments\"", nullable = true)
  private String attachments;
  public Products() {
  }
  public String getSupplierIds() {
    return supplierIds;
  }
  public void setSupplierIds(String supplierIds) {
    this.supplierIds = supplierIds;
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getProductCode() {
    return productCode;
  }
  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }
  public String getProductName() {
    return productName;
  }
  public void setProductName(String productName) {
    this.productName = productName;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public java.math.BigDecimal getStandardCost() {
    return standardCost;
  }
  public void setStandardCost(java.math.BigDecimal standardCost) {
    this.standardCost = standardCost;
  }
  public java.math.BigDecimal getListPrice() {
    return listPrice;
  }
  public void setListPrice(java.math.BigDecimal listPrice) {
    this.listPrice = listPrice;
  }
  public Integer getReorderLevel() {
    return reorderLevel;
  }
  public void setReorderLevel(Integer reorderLevel) {
    this.reorderLevel = reorderLevel;
  }
  public Integer getTargetLevel() {
    return targetLevel;
  }
  public void setTargetLevel(Integer targetLevel) {
    this.targetLevel = targetLevel;
  }
  public String getQuantityPerUnit() {
    return quantityPerUnit;
  }
  public void setQuantityPerUnit(String quantityPerUnit) {
    this.quantityPerUnit = quantityPerUnit;
  }
  public boolean isDiscontinued() {
    return discontinued;
  }
  public void setDiscontinued(boolean discontinued) {
    this.discontinued = discontinued;
  }
  public Integer getMinimumReorderQuantity() {
    return minimumReorderQuantity;
  }
  public void setMinimumReorderQuantity(Integer minimumReorderQuantity) {
    this.minimumReorderQuantity = minimumReorderQuantity;
  }
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }
  public String getAttachments() {
    return attachments;
  }
  public void setAttachments(String attachments) {
    this.attachments = attachments;
  }
}