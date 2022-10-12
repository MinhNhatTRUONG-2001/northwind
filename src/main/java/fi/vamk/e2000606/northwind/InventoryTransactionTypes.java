package fi.vamk.e2000606.northwind;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "inventory_transaction_types")
@NamedQuery(name="InventoryTransactionTypes.findAll", query="SELECT p FROM InventoryTransactionTypes p")
public class InventoryTransactionTypes implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "\"id\"", nullable = false)
  private Byte id;
  @Column(name = "\"type_name\"", nullable = false)
  private String typeName;
  public InventoryTransactionTypes() {
  }
  public Byte getId() {
    return id;
  }
  public void setId(Byte id) {
    this.id = id;
  }
  public String getTypeName() {
    return typeName;
  }
  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }
}