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
 * Fulfillment Status Information
 */
@ApiModel(description = "Fulfillment Status Information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-04T09:49:23.182+01:00")
public class OrderFulfillmentStatusBase {
  @SerializedName("StatusId")
  private String statusId = null;

  @SerializedName("StatusName")
  private String statusName = null;

  @SerializedName("Icon")
  private String icon = null;

  public OrderFulfillmentStatusBase statusId(String statusId) {
    this.statusId = statusId;
    return this;
  }

   /**
   * Fulfillment Status Id
   * @return statusId
  **/
  @ApiModelProperty(value = "Fulfillment Status Id")
  public String getStatusId() {
    return statusId;
  }

  public void setStatusId(String statusId) {
    this.statusId = statusId;
  }

  public OrderFulfillmentStatusBase statusName(String statusName) {
    this.statusName = statusName;
    return this;
  }

   /**
   * Fulfillment Status Name
   * @return statusName
  **/
  @ApiModelProperty(value = "Fulfillment Status Name")
  public String getStatusName() {
    return statusName;
  }

  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }

  public OrderFulfillmentStatusBase icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Status Icon
   * @return icon
  **/
  @ApiModelProperty(value = "Status Icon")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderFulfillmentStatusBase orderFulfillmentStatusBase = (OrderFulfillmentStatusBase) o;
    return Objects.equals(this.statusId, orderFulfillmentStatusBase.statusId) &&
        Objects.equals(this.statusName, orderFulfillmentStatusBase.statusName) &&
        Objects.equals(this.icon, orderFulfillmentStatusBase.icon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusId, statusName, icon);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderFulfillmentStatusBase {\n");
    
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    statusName: ").append(toIndentedString(statusName)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
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

