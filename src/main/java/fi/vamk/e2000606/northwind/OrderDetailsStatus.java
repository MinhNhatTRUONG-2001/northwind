package fi.vamk.e2000606.northwind;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "order_details_status")
@NamedQuery(name="OrderDetailsStatus.findAll", query="SELECT p FROM OrderDetailsStatus p")
public class OrderDetailsStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"status_name\"", nullable = false)
  private String statusName;
  public OrderDetailsStatus() {
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getStatusName() {
    return statusName;
  }
  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }
}