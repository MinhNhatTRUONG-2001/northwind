package fi.vamk.e2000606.northwind;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "purchase_order_status")
@NamedQuery(name="PurchaseOrderStatus.findAll", query="SELECT p FROM PurchaseOrderStatus p")
public class PurchaseOrderStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"status\"", nullable = true)
  private String status;
  public PurchaseOrderStatus() {
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }
}