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
 * Breakdown of third party integration fees
 */
@ApiModel(description = "Breakdown of third party integration fees")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-04T11:36:58.526Z")
public class ThirdPartyFeesDetails {
  @SerializedName("DeliveryIntegrationFee")
  private Double deliveryIntegrationFee = null;

  @SerializedName("DeliveryTipFee")
  private Double deliveryTipFee = null;

  @SerializedName("TotalThirdPartyFees")
  private Double totalThirdPartyFees = null;

  public ThirdPartyFeesDetails deliveryIntegrationFee(Double deliveryIntegrationFee) {
    this.deliveryIntegrationFee = deliveryIntegrationFee;
    return this;
  }

   /**
   * Third party integration delivery fee
   * @return deliveryIntegrationFee
  **/
  @ApiModelProperty(value = "Third party integration delivery fee")
  public Double getDeliveryIntegrationFee() {
    return deliveryIntegrationFee;
  }

  public void setDeliveryIntegrationFee(Double deliveryIntegrationFee) {
    this.deliveryIntegrationFee = deliveryIntegrationFee;
  }

  public ThirdPartyFeesDetails deliveryTipFee(Double deliveryTipFee) {
    this.deliveryTipFee = deliveryTipFee;
    return this;
  }

   /**
   * Third party integration delivery tip fee
   * @return deliveryTipFee
  **/
  @ApiModelProperty(value = "Third party integration delivery tip fee")
  public Double getDeliveryTipFee() {
    return deliveryTipFee;
  }

  public void setDeliveryTipFee(Double deliveryTipFee) {
    this.deliveryTipFee = deliveryTipFee;
  }

  public ThirdPartyFeesDetails totalThirdPartyFees(Double totalThirdPartyFees) {
    this.totalThirdPartyFees = totalThirdPartyFees;
    return this;
  }

   /**
   * Total third party integration fees
   * @return totalThirdPartyFees
  **/
  @ApiModelProperty(value = "Total third party integration fees")
  public Double getTotalThirdPartyFees() {
    return totalThirdPartyFees;
  }

  public void setTotalThirdPartyFees(Double totalThirdPartyFees) {
    this.totalThirdPartyFees = totalThirdPartyFees;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThirdPartyFeesDetails thirdPartyFeesDetails = (ThirdPartyFeesDetails) o;
    return Objects.equals(this.deliveryIntegrationFee, thirdPartyFeesDetails.deliveryIntegrationFee) &&
        Objects.equals(this.deliveryTipFee, thirdPartyFeesDetails.deliveryTipFee) &&
        Objects.equals(this.totalThirdPartyFees, thirdPartyFeesDetails.totalThirdPartyFees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryIntegrationFee, deliveryTipFee, totalThirdPartyFees);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartyFeesDetails {\n");
    
    sb.append("    deliveryIntegrationFee: ").append(toIndentedString(deliveryIntegrationFee)).append("\n");
    sb.append("    deliveryTipFee: ").append(toIndentedString(deliveryTipFee)).append("\n");
    sb.append("    totalThirdPartyFees: ").append(toIndentedString(totalThirdPartyFees)).append("\n");
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

