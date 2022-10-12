package fi.vamk.e2000606.northwind;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "privileges")
@NamedQuery(name="Privileges.findAll", query="SELECT p FROM Privileges p")
public class Privileges implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"privilege_name\"", nullable = true)
  private String privilegeName;
  public Privileges() {
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getPrivilegeName() {
    return privilegeName;
  }
  public void setPrivilegeName(String privilegeName) {
    this.privilegeName = privilegeName;
  }
}