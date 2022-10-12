package fi.vamk.e2000606.northwind;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "orders_tax_status")
@NamedQuery(name="OrdersTaxStatus.findAll", query="SELECT p FROM OrdersTaxStatus p")
public class OrdersTaxStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "\"id\"", nullable = false)
  private Byte id;
  @Column(name = "\"tax_status_name\"", nullable = false)
  private String taxStatusName;
  public OrdersTaxStatus() {
  }
  public Byte getId() {
    return id;
  }
  public void setId(Byte id) {
    this.id = id;
  }
  public String getTaxStatusName() {
    return taxStatusName;
  }
  public void setTaxStatusName(String taxStatusName) {
    this.taxStatusName = taxStatusName;
  }
}