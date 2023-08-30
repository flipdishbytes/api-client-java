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
 * Get Cash Payment Settings for a UserId
 */
@ApiModel(description = "Get Cash Payment Settings for a UserId")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-08-30T13:05:53.551+01:00")
public class KioskCashPaymentSettings {
  @SerializedName("IsCashVisibleToCustomer")
  private Boolean isCashVisibleToCustomer = null;

  @SerializedName("UserId")
  private Integer userId = null;

  public KioskCashPaymentSettings isCashVisibleToCustomer(Boolean isCashVisibleToCustomer) {
    this.isCashVisibleToCustomer = isCashVisibleToCustomer;
    return this;
  }

   /**
   * false :disable cash on kiosk  true :enable cash on kiosk
   * @return isCashVisibleToCustomer
  **/
  @ApiModelProperty(value = "false :disable cash on kiosk  true :enable cash on kiosk")
  public Boolean isIsCashVisibleToCustomer() {
    return isCashVisibleToCustomer;
  }

  public void setIsCashVisibleToCustomer(Boolean isCashVisibleToCustomer) {
    this.isCashVisibleToCustomer = isCashVisibleToCustomer;
  }

  public KioskCashPaymentSettings userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * HydraUser ID of the Device
   * @return userId
  **/
  @ApiModelProperty(value = "HydraUser ID of the Device")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KioskCashPaymentSettings kioskCashPaymentSettings = (KioskCashPaymentSettings) o;
    return Objects.equals(this.isCashVisibleToCustomer, kioskCashPaymentSettings.isCashVisibleToCustomer) &&
        Objects.equals(this.userId, kioskCashPaymentSettings.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isCashVisibleToCustomer, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KioskCashPaymentSettings {\n");
    
    sb.append("    isCashVisibleToCustomer: ").append(toIndentedString(isCashVisibleToCustomer)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

