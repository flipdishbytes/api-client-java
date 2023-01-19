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
 * Store Create Base
 */
@ApiModel(description = "Store Create Base")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-19T08:27:38.139Z")
public class StoreCreateBase {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("EmailAddress")
  private String emailAddress = null;

  @SerializedName("StaffLanguage")
  private String staffLanguage = null;

  public StoreCreateBase name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StoreCreateBase emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Email address (visible to customers)
   * @return emailAddress
  **/
  @ApiModelProperty(value = "Email address (visible to customers)")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public StoreCreateBase staffLanguage(String staffLanguage) {
    this.staffLanguage = staffLanguage;
    return this;
  }

   /**
   * Staff Language (used for communication with the staff)  Emails, Printouts etc
   * @return staffLanguage
  **/
  @ApiModelProperty(value = "Staff Language (used for communication with the staff)  Emails, Printouts etc")
  public String getStaffLanguage() {
    return staffLanguage;
  }

  public void setStaffLanguage(String staffLanguage) {
    this.staffLanguage = staffLanguage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreCreateBase storeCreateBase = (StoreCreateBase) o;
    return Objects.equals(this.name, storeCreateBase.name) &&
        Objects.equals(this.emailAddress, storeCreateBase.emailAddress) &&
        Objects.equals(this.staffLanguage, storeCreateBase.staffLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, emailAddress, staffLanguage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreCreateBase {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    staffLanguage: ").append(toIndentedString(staffLanguage)).append("\n");
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

