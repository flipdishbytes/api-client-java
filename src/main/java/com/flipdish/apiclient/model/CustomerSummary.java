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
 * Customer summary
 */
@ApiModel(description = "Customer summary")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-16T10:11:06.563Z")
public class CustomerSummary {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("EmailAddress")
  private String emailAddress = null;

  @SerializedName("PhoneNumberLocalFormat")
  private String phoneNumberLocalFormat = null;

  @SerializedName("PhoneNumber")
  private String phoneNumber = null;

  public CustomerSummary id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Customer identifier
   * @return id
  **/
  @ApiModelProperty(value = "Customer identifier")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CustomerSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Customer name
   * @return name
  **/
  @ApiModelProperty(value = "Customer name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomerSummary emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Customer email address
   * @return emailAddress
  **/
  @ApiModelProperty(value = "Customer email address")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public CustomerSummary phoneNumberLocalFormat(String phoneNumberLocalFormat) {
    this.phoneNumberLocalFormat = phoneNumberLocalFormat;
    return this;
  }

   /**
   * Customer local phone number
   * @return phoneNumberLocalFormat
  **/
  @ApiModelProperty(value = "Customer local phone number")
  public String getPhoneNumberLocalFormat() {
    return phoneNumberLocalFormat;
  }

  public void setPhoneNumberLocalFormat(String phoneNumberLocalFormat) {
    this.phoneNumberLocalFormat = phoneNumberLocalFormat;
  }

  public CustomerSummary phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Customer phone number
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Customer phone number")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerSummary customerSummary = (CustomerSummary) o;
    return Objects.equals(this.id, customerSummary.id) &&
        Objects.equals(this.name, customerSummary.name) &&
        Objects.equals(this.emailAddress, customerSummary.emailAddress) &&
        Objects.equals(this.phoneNumberLocalFormat, customerSummary.phoneNumberLocalFormat) &&
        Objects.equals(this.phoneNumber, customerSummary.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, emailAddress, phoneNumberLocalFormat, phoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    phoneNumberLocalFormat: ").append(toIndentedString(phoneNumberLocalFormat)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

