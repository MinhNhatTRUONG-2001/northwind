package fi.vamk.e2000606.northwind;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "strings")
@NamedQuery(name="Strings.findAll", query="SELECT p FROM Strings p")
public class Strings implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"string_id\"", nullable = false)
  private Integer stringId;
  @Column(name = "\"string_data\"", nullable = true)
  private String stringData;
  public Strings() {
  }
  public static long getSerialversionuid() {
    return serialVersionUID;
  }
  public Integer getStringId() {
    return stringId;
  }
  public void setStringId(Integer stringId) {
    this.stringId = stringId;
  }
  public String getStringData() {
    return stringData;
  }
  public void setStringData(String stringData) {
    this.stringData = stringData;
  }
}