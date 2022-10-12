package fi.vamk.e2000606.northwind;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "customers")
@NamedQuery(name="Customers.findAll", query="SELECT p FROM Customers p")
public class Customers implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"company\"", nullable = true)
  private String company;
  @Column(name = "\"last_name\"", nullable = true)
  private String lastName;
  @Column(name = "\"first_name\"", nullable = true)
  private String firstName;
  @Column(name = "\"email_address\"", nullable = true)
  private String emailAddress;
  @Column(name = "\"job_title\"", nullable = true)
  private String jobTitle;
  @Column(name = "\"business_phone\"", nullable = true)
  private String businessPhone;
  @Column(name = "\"home_phone\"", nullable = true)
  private String homePhone;
  @Column(name = "\"mobile_phone\"", nullable = true)
  private String mobilePhone;
  @Column(name = "\"fax_number\"", nullable = true)
  private String faxNumber;
  @Column(name = "\"address\"", nullable = true)
  private String address;
  @Column(name = "\"city\"", nullable = true)
  private String city;
  @Column(name = "\"state_province\"", nullable = true)
  private String stateProvince;
  @Column(name = "\"zip_postal_code\"", nullable = true)
  private String zipPostalCode;
  @Column(name = "\"country_region\"", nullable = true)
  private String countryRegion;
  @Column(name = "\"web_page\"", nullable = true)
  private String webPage;
  @Column(name = "\"notes\"", nullable = true)
  private String notes;
  @Column(name = "\"attachments\"", nullable = true)
  private String attachments;
  public Customers() {
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getCompany() {
    return company;
  }
  public void setCompany(String company) {
    this.company = company;
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }
  public String getJobTitle() {
    return jobTitle;
  }
  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }
  public String getBusinessPhone() {
    return businessPhone;
  }
  public void setBusinessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
  }
  public String getHomePhone() {
    return homePhone;
  }
  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }
  public String getMobilePhone() {
    return mobilePhone;
  }
  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }
  public String getFaxNumber() {
    return faxNumber;
  }
  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }
  public String getStateProvince() {
    return stateProvince;
  }
  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }
  public String getZipPostalCode() {
    return zipPostalCode;
  }
  public void setZipPostalCode(String zipPostalCode) {
    this.zipPostalCode = zipPostalCode;
  }
  public String getCountryRegion() {
    return countryRegion;
  }
  public void setCountryRegion(String countryRegion) {
    this.countryRegion = countryRegion;
  }
  public String getWebPage() {
    return webPage;
  }
  public void setWebPage(String webPage) {
    this.webPage = webPage;
  }
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }
  public String getAttachments() {
    return attachments;
  }
  public void setAttachments(String attachments) {
    this.attachments = attachments;
  }
}