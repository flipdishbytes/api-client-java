/*
 * Flipdish Open API v1.0
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.flipdish.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Job Contact
 */
@ApiModel(description = "Job Contact")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-03-16T11:32:15.881Z")
public class JobContact {
  @SerializedName("Firstname")
  private String firstname = null;

  @SerializedName("Lastname")
  private String lastname = null;

  @SerializedName("Phone")
  private String phone = null;

  @SerializedName("Email")
  private String email = null;

  @SerializedName("Company")
  private String company = null;

  @SerializedName("CompanyName")
  private String companyName = null;

  public JobContact firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

   /**
   * Firstname
   * @return firstname
  **/
  @ApiModelProperty(value = "Firstname")
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public JobContact lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

   /**
   * Lastname
   * @return lastname
  **/
  @ApiModelProperty(value = "Lastname")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public JobContact phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Phone
   * @return phone
  **/
  @ApiModelProperty(value = "Phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public JobContact email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email
   * @return email
  **/
  @ApiModelProperty(value = "Email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public JobContact company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Company
   * @return company
  **/
  @ApiModelProperty(value = "Company")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public JobContact companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Company Name
   * @return companyName
  **/
  @ApiModelProperty(value = "Company Name")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobContact jobContact = (JobContact) o;
    return Objects.equals(this.firstname, jobContact.firstname) &&
        Objects.equals(this.lastname, jobContact.lastname) &&
        Objects.equals(this.phone, jobContact.phone) &&
        Objects.equals(this.email, jobContact.email) &&
        Objects.equals(this.company, jobContact.company) &&
        Objects.equals(this.companyName, jobContact.companyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstname, lastname, phone, email, company, companyName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobContact {\n");
    
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

