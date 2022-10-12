package fi.vamk.e2000606.northwind;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "sales_reports")
@NamedQuery(name="SalesReports.findAll", query="SELECT p FROM SalesReports p")
public class SalesReports implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "\"group_by\"", nullable = false)
  private String groupBy;
  @Column(name = "\"display\"", nullable = true)
  private String display;
  @Column(name = "\"title\"", nullable = true)
  private String title;
  @Column(name = "\"filter_row_source\"", nullable = true)
  private String filterRowSource;
  @Column(name = "\"default\"", nullable = false)
  private boolean Default;
  public SalesReports() {
  }
  public static long getSerialversionuid() {
    return serialVersionUID;
  }
  public String getGroupBy() {
    return groupBy;
  }
  public void setGroupBy(String groupBy) {
    this.groupBy = groupBy;
  }
  public String getDisplay() {
    return display;
  }
  public void setDisplay(String display) {
    this.display = display;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getFilterRowSource() {
    return filterRowSource;
  }
  public void setFilterRowSource(String filterRowSource) {
    this.filterRowSource = filterRowSource;
  }
  public boolean isDefault() {
    return Default;
  }
  public void setDefault(boolean default1) {
    Default = default1;
  }
}