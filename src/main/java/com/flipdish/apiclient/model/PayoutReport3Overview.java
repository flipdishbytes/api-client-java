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
import com.flipdish.apiclient.model.PayoutReport3OverviewHeader;
import com.flipdish.apiclient.model.PayoutReport3Store;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PayoutReport3Overview
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-11-13T12:22:11.768Z")
public class PayoutReport3Overview {
  @SerializedName("PayoutReport3OverviewHeader")
  private PayoutReport3OverviewHeader payoutReport3OverviewHeader = null;

  @SerializedName("PayoutStores")
  private List<PayoutReport3Store> payoutStores = null;

  public PayoutReport3Overview payoutReport3OverviewHeader(PayoutReport3OverviewHeader payoutReport3OverviewHeader) {
    this.payoutReport3OverviewHeader = payoutReport3OverviewHeader;
    return this;
  }

   /**
   * Get payoutReport3OverviewHeader
   * @return payoutReport3OverviewHeader
  **/
  @ApiModelProperty(value = "")
  public PayoutReport3OverviewHeader getPayoutReport3OverviewHeader() {
    return payoutReport3OverviewHeader;
  }

  public void setPayoutReport3OverviewHeader(PayoutReport3OverviewHeader payoutReport3OverviewHeader) {
    this.payoutReport3OverviewHeader = payoutReport3OverviewHeader;
  }

  public PayoutReport3Overview payoutStores(List<PayoutReport3Store> payoutStores) {
    this.payoutStores = payoutStores;
    return this;
  }

  public PayoutReport3Overview addPayoutStoresItem(PayoutReport3Store payoutStoresItem) {
    if (this.payoutStores == null) {
      this.payoutStores = new ArrayList<PayoutReport3Store>();
    }
    this.payoutStores.add(payoutStoresItem);
    return this;
  }

   /**
   * Get payoutStores
   * @return payoutStores
  **/
  @ApiModelProperty(value = "")
  public List<PayoutReport3Store> getPayoutStores() {
    return payoutStores;
  }

  public void setPayoutStores(List<PayoutReport3Store> payoutStores) {
    this.payoutStores = payoutStores;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutReport3Overview payoutReport3Overview = (PayoutReport3Overview) o;
    return Objects.equals(this.payoutReport3OverviewHeader, payoutReport3Overview.payoutReport3OverviewHeader) &&
        Objects.equals(this.payoutStores, payoutReport3Overview.payoutStores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payoutReport3OverviewHeader, payoutStores);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutReport3Overview {\n");
    
    sb.append("    payoutReport3OverviewHeader: ").append(toIndentedString(payoutReport3OverviewHeader)).append("\n");
    sb.append("    payoutStores: ").append(toIndentedString(payoutStores)).append("\n");
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

