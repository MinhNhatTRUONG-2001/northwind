package fi.vamk.e2000606.northwind;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "employee_privileges")
@NamedQuery(name="EmployeePrivileges.findAll", query="SELECT p FROM EmployeePrivileges p")
@IdClass(EmployeePrivilegesId.class)
public class EmployeePrivileges implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "\"employee_id\"", nullable = false)
  private Integer employeeId;
  @Id
  @Column(name = "\"privilege_id\"", nullable = false)
  private Integer privilegeId;
  public EmployeePrivileges() {
  }
  public Integer getEmployeeId() {
    return employeeId;
  }
  public void setEmployeeId(Integer employeeId) {
    this.employeeId = employeeId;
  }
  public Integer getPrivilegeId() {
    return privilegeId;
  }
  public void setPrivilegeId(Integer privilegeId) {
    this.privilegeId = privilegeId;
  }
}

class EmployeePrivilegesId implements Serializable {
    Integer employeeId;
    Integer privilegeId;
}