package fi.vamk.e2000606.northwind;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "orders_status")
@NamedQuery(name="OrdersStatus.findAll", query="SELECT p FROM OrdersStatus p")
public class OrdersStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "\"id\"", nullable = false)
  private Byte id;
  @Column(name = "\"status_name\"", nullable = false)
  private String statusName;
  public OrdersStatus() {
  }
  public Byte getId() {
    return id;
  }
  public void setId(Byte id) {
    this.id = id;
  }
  public String getStatusName() {
    return statusName;
  }
  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }
}