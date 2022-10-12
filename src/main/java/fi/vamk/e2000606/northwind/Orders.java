package fi.vamk.e2000606.northwind;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;

@Entity
@Table(name = "orders")
@NamedQuery(name="Orders.findAll", query="SELECT p FROM Orders p")
public class Orders implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"employee_id\"", nullable = true)
  private Integer employeeId;
  @Column(name = "\"customer_id\"", nullable = true)
  private Integer customerId;
  @Column(name = "\"order_date\"", nullable = true)
  private Timestamp orderDate;
  @Column(name = "\"shipped_date\"", nullable = true)
  private Timestamp shippedDate;
  @Column(name = "\"shipper_id\"", nullable = true)
  private Integer shipperId;
  @Column(name = "\"ship_name\"", nullable = true)
  private String shipName;
  @Column(name = "\"ship_address\"", nullable = true)
  private String shipAddress;
  @Column(name = "\"ship_city\"", nullable = true)
  private String shipCity;
  @Column(name = "\"ship_state_province\"", nullable = true)
  private String shipStateProvince;
  @Column(name = "\"ship_zip_postal_code\"", nullable = true)
  private String shipZipPostalCode;
  @Column(name = "\"ship_country_region\"", nullable = true)
  private String shipCountryRegion;
  @Column(name = "\"shipping_fee\"", nullable = true)
  private java.math.BigDecimal shippingFee;
  @Column(name = "\"taxes\"", nullable = true)
  private java.math.BigDecimal taxes;
  @Column(name = "\"payment_type\"", nullable = true)
  private String paymentType;
  @Column(name = "\"paid_date\"", nullable = true)
  private Timestamp paidDate;
  @Column(name = "\"notes\"", nullable = true)
  private String notes;
  @Column(name = "\"tax_rate\"", nullable = true)
  private Double taxRate;
  @Column(name = "\"tax_status_id\"", nullable = true)
  private Byte taxStatusId;
  @Column(name = "\"status_id\"", nullable = true)
  private Byte statusId;
  public Orders() {
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public Integer getEmployeeId() {
    return employeeId;
  }
  public void setEmployeeId(Integer employeeId) {
    this.employeeId = employeeId;
  }
  public Integer getCustomerId() {
    return customerId;
  }
  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }
  public Timestamp getOrderDate() {
    return orderDate;
  }
  public void setOrderDate(Timestamp orderDate) {
    this.orderDate = orderDate;
  }
  public Timestamp getShippedDate() {
    return shippedDate;
  }
  public void setShippedDate(Timestamp shippedDate) {
    this.shippedDate = shippedDate;
  }
  public Integer getShipperId() {
    return shipperId;
  }
  public void setShipperId(Integer shipperId) {
    this.shipperId = shipperId;
  }
  public String getShipName() {
    return shipName;
  }
  public void setShipName(String shipName) {
    this.shipName = shipName;
  }
  public String getShipAddress() {
    return shipAddress;
  }
  public void setShipAddress(String shipAddress) {
    this.shipAddress = shipAddress;
  }
  public String getShipCity() {
    return shipCity;
  }
  public void setShipCity(String shipCity) {
    this.shipCity = shipCity;
  }
  public String getShipStateProvince() {
    return shipStateProvince;
  }
  public void setShipStateProvince(String shipStateProvince) {
    this.shipStateProvince = shipStateProvince;
  }
  public String getShipZipPostalCode() {
    return shipZipPostalCode;
  }
  public void setShipZipPostalCode(String shipZipPostalCode) {
    this.shipZipPostalCode = shipZipPostalCode;
  }
  public String getShipCountryRegion() {
    return shipCountryRegion;
  }
  public void setShipCountryRegion(String shipCountryRegion) {
    this.shipCountryRegion = shipCountryRegion;
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
  public String getPaymentType() {
    return paymentType;
  }
  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }
  public Timestamp getPaidDate() {
    return paidDate;
  }
  public void setPaidDate(Timestamp paidDate) {
    this.paidDate = paidDate;
  }
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }
  public Double getTaxRate() {
    return taxRate;
  }
  public void setTaxRate(Double taxRate) {
    this.taxRate = taxRate;
  }
  public Byte getTaxStatusId() {
    return taxStatusId;
  }
  public void setTaxStatusId(Byte taxStatusId) {
    this.taxStatusId = taxStatusId;
  }
  public Byte getStatusId() {
    return statusId;
  }
  public void setStatusId(Byte statusId) {
    this.statusId = statusId;
  }
}