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
import com.flipdish.apiclient.model.DepositReturnFeesSummary;
import com.flipdish.apiclient.model.PreviousOrder;
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
import org.threeten.bp.OffsetDateTime;

/**
 * GetReceiptByOrderIdQueryResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T12:34:31.769Z")
public class GetReceiptByOrderIdQueryResponse {
  @SerializedName("PreviousOrder")
  private PreviousOrder previousOrder = null;

  @SerializedName("DepositReturnFeesSummary")
  private List<DepositReturnFeesSummary> depositReturnFeesSummary = null;

  @SerializedName("TsRequestedForLocal")
  private OffsetDateTime tsRequestedForLocal = null;

  @SerializedName("TsOrderPlacedLocal")
  private OffsetDateTime tsOrderPlacedLocal = null;

  @SerializedName("LogoUrl")
  private String logoUrl = null;

  @SerializedName("Address")
  private String address = null;

  @SerializedName("VatNumber")
  private String vatNumber = null;

  @SerializedName("PaymentMethodDescription")
  private String paymentMethodDescription = null;

  public GetReceiptByOrderIdQueryResponse previousOrder(PreviousOrder previousOrder) {
    this.previousOrder = previousOrder;
    return this;
  }

   /**
   * Get previousOrder
   * @return previousOrder
  **/
  @ApiModelProperty(value = "")
  public PreviousOrder getPreviousOrder() {
    return previousOrder;
  }

  public void setPreviousOrder(PreviousOrder previousOrder) {
    this.previousOrder = previousOrder;
  }

  public GetReceiptByOrderIdQueryResponse depositReturnFeesSummary(List<DepositReturnFeesSummary> depositReturnFeesSummary) {
    this.depositReturnFeesSummary = depositReturnFeesSummary;
    return this;
  }

  public GetReceiptByOrderIdQueryResponse addDepositReturnFeesSummaryItem(DepositReturnFeesSummary depositReturnFeesSummaryItem) {
    if (this.depositReturnFeesSummary == null) {
      this.depositReturnFeesSummary = new ArrayList<DepositReturnFeesSummary>();
    }
    this.depositReturnFeesSummary.add(depositReturnFeesSummaryItem);
    return this;
  }

   /**
   * Get depositReturnFeesSummary
   * @return depositReturnFeesSummary
  **/
  @ApiModelProperty(value = "")
  public List<DepositReturnFeesSummary> getDepositReturnFeesSummary() {
    return depositReturnFeesSummary;
  }

  public void setDepositReturnFeesSummary(List<DepositReturnFeesSummary> depositReturnFeesSummary) {
    this.depositReturnFeesSummary = depositReturnFeesSummary;
  }

  public GetReceiptByOrderIdQueryResponse tsRequestedForLocal(OffsetDateTime tsRequestedForLocal) {
    this.tsRequestedForLocal = tsRequestedForLocal;
    return this;
  }

   /**
   * Get tsRequestedForLocal
   * @return tsRequestedForLocal
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTsRequestedForLocal() {
    return tsRequestedForLocal;
  }

  public void setTsRequestedForLocal(OffsetDateTime tsRequestedForLocal) {
    this.tsRequestedForLocal = tsRequestedForLocal;
  }

  public GetReceiptByOrderIdQueryResponse tsOrderPlacedLocal(OffsetDateTime tsOrderPlacedLocal) {
    this.tsOrderPlacedLocal = tsOrderPlacedLocal;
    return this;
  }

   /**
   * Get tsOrderPlacedLocal
   * @return tsOrderPlacedLocal
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTsOrderPlacedLocal() {
    return tsOrderPlacedLocal;
  }

  public void setTsOrderPlacedLocal(OffsetDateTime tsOrderPlacedLocal) {
    this.tsOrderPlacedLocal = tsOrderPlacedLocal;
  }

  public GetReceiptByOrderIdQueryResponse logoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * Get logoUrl
   * @return logoUrl
  **/
  @ApiModelProperty(value = "")
  public String getLogoUrl() {
    return logoUrl;
  }

  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }

  public GetReceiptByOrderIdQueryResponse address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public GetReceiptByOrderIdQueryResponse vatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
    return this;
  }

   /**
   * Get vatNumber
   * @return vatNumber
  **/
  @ApiModelProperty(value = "")
  public String getVatNumber() {
    return vatNumber;
  }

  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }

  public GetReceiptByOrderIdQueryResponse paymentMethodDescription(String paymentMethodDescription) {
    this.paymentMethodDescription = paymentMethodDescription;
    return this;
  }

   /**
   * Get paymentMethodDescription
   * @return paymentMethodDescription
  **/
  @ApiModelProperty(value = "")
  public String getPaymentMethodDescription() {
    return paymentMethodDescription;
  }

  public void setPaymentMethodDescription(String paymentMethodDescription) {
    this.paymentMethodDescription = paymentMethodDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetReceiptByOrderIdQueryResponse getReceiptByOrderIdQueryResponse = (GetReceiptByOrderIdQueryResponse) o;
    return Objects.equals(this.previousOrder, getReceiptByOrderIdQueryResponse.previousOrder) &&
        Objects.equals(this.depositReturnFeesSummary, getReceiptByOrderIdQueryResponse.depositReturnFeesSummary) &&
        Objects.equals(this.tsRequestedForLocal, getReceiptByOrderIdQueryResponse.tsRequestedForLocal) &&
        Objects.equals(this.tsOrderPlacedLocal, getReceiptByOrderIdQueryResponse.tsOrderPlacedLocal) &&
        Objects.equals(this.logoUrl, getReceiptByOrderIdQueryResponse.logoUrl) &&
        Objects.equals(this.address, getReceiptByOrderIdQueryResponse.address) &&
        Objects.equals(this.vatNumber, getReceiptByOrderIdQueryResponse.vatNumber) &&
        Objects.equals(this.paymentMethodDescription, getReceiptByOrderIdQueryResponse.paymentMethodDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previousOrder, depositReturnFeesSummary, tsRequestedForLocal, tsOrderPlacedLocal, logoUrl, address, vatNumber, paymentMethodDescription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetReceiptByOrderIdQueryResponse {\n");
    
    sb.append("    previousOrder: ").append(toIndentedString(previousOrder)).append("\n");
    sb.append("    depositReturnFeesSummary: ").append(toIndentedString(depositReturnFeesSummary)).append("\n");
    sb.append("    tsRequestedForLocal: ").append(toIndentedString(tsRequestedForLocal)).append("\n");
    sb.append("    tsOrderPlacedLocal: ").append(toIndentedString(tsOrderPlacedLocal)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
    sb.append("    paymentMethodDescription: ").append(toIndentedString(paymentMethodDescription)).append("\n");
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

