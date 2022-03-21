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
 * Revenue Adjustments breakdown
 */
@ApiModel(description = "Revenue Adjustments breakdown")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-21T11:49:31.050Z")
public class RevenueAdjustmentsDetails {
  @SerializedName("OnlineSalesRefundedAmount")
  private Double onlineSalesRefundedAmount = null;

  @SerializedName("CashSalesRefundedAmount")
  private Double cashSalesRefundedAmount = null;

  @SerializedName("CustomerCashFees")
  private Double customerCashFees = null;

  @SerializedName("RefundsCount")
  private Integer refundsCount = null;

  @SerializedName("TotalOnlineRevenueAdjustments")
  private Double totalOnlineRevenueAdjustments = null;

  public RevenueAdjustmentsDetails onlineSalesRefundedAmount(Double onlineSalesRefundedAmount) {
    this.onlineSalesRefundedAmount = onlineSalesRefundedAmount;
    return this;
  }

   /**
   * Online sales refunds
   * @return onlineSalesRefundedAmount
  **/
  @ApiModelProperty(value = "Online sales refunds")
  public Double getOnlineSalesRefundedAmount() {
    return onlineSalesRefundedAmount;
  }

  public void setOnlineSalesRefundedAmount(Double onlineSalesRefundedAmount) {
    this.onlineSalesRefundedAmount = onlineSalesRefundedAmount;
  }

  public RevenueAdjustmentsDetails cashSalesRefundedAmount(Double cashSalesRefundedAmount) {
    this.cashSalesRefundedAmount = cashSalesRefundedAmount;
    return this;
  }

   /**
   * Cash sales refunds
   * @return cashSalesRefundedAmount
  **/
  @ApiModelProperty(value = "Cash sales refunds")
  public Double getCashSalesRefundedAmount() {
    return cashSalesRefundedAmount;
  }

  public void setCashSalesRefundedAmount(Double cashSalesRefundedAmount) {
    this.cashSalesRefundedAmount = cashSalesRefundedAmount;
  }

  public RevenueAdjustmentsDetails customerCashFees(Double customerCashFees) {
    this.customerCashFees = customerCashFees;
    return this;
  }

   /**
   * Customer cash fees
   * @return customerCashFees
  **/
  @ApiModelProperty(value = "Customer cash fees")
  public Double getCustomerCashFees() {
    return customerCashFees;
  }

  public void setCustomerCashFees(Double customerCashFees) {
    this.customerCashFees = customerCashFees;
  }

  public RevenueAdjustmentsDetails refundsCount(Integer refundsCount) {
    this.refundsCount = refundsCount;
    return this;
  }

   /**
   * Number of refunds
   * @return refundsCount
  **/
  @ApiModelProperty(value = "Number of refunds")
  public Integer getRefundsCount() {
    return refundsCount;
  }

  public void setRefundsCount(Integer refundsCount) {
    this.refundsCount = refundsCount;
  }

  public RevenueAdjustmentsDetails totalOnlineRevenueAdjustments(Double totalOnlineRevenueAdjustments) {
    this.totalOnlineRevenueAdjustments = totalOnlineRevenueAdjustments;
    return this;
  }

   /**
   * Total revenue adjustments
   * @return totalOnlineRevenueAdjustments
  **/
  @ApiModelProperty(value = "Total revenue adjustments")
  public Double getTotalOnlineRevenueAdjustments() {
    return totalOnlineRevenueAdjustments;
  }

  public void setTotalOnlineRevenueAdjustments(Double totalOnlineRevenueAdjustments) {
    this.totalOnlineRevenueAdjustments = totalOnlineRevenueAdjustments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevenueAdjustmentsDetails revenueAdjustmentsDetails = (RevenueAdjustmentsDetails) o;
    return Objects.equals(this.onlineSalesRefundedAmount, revenueAdjustmentsDetails.onlineSalesRefundedAmount) &&
        Objects.equals(this.cashSalesRefundedAmount, revenueAdjustmentsDetails.cashSalesRefundedAmount) &&
        Objects.equals(this.customerCashFees, revenueAdjustmentsDetails.customerCashFees) &&
        Objects.equals(this.refundsCount, revenueAdjustmentsDetails.refundsCount) &&
        Objects.equals(this.totalOnlineRevenueAdjustments, revenueAdjustmentsDetails.totalOnlineRevenueAdjustments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onlineSalesRefundedAmount, cashSalesRefundedAmount, customerCashFees, refundsCount, totalOnlineRevenueAdjustments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevenueAdjustmentsDetails {\n");
    
    sb.append("    onlineSalesRefundedAmount: ").append(toIndentedString(onlineSalesRefundedAmount)).append("\n");
    sb.append("    cashSalesRefundedAmount: ").append(toIndentedString(cashSalesRefundedAmount)).append("\n");
    sb.append("    customerCashFees: ").append(toIndentedString(customerCashFees)).append("\n");
    sb.append("    refundsCount: ").append(toIndentedString(refundsCount)).append("\n");
    sb.append("    totalOnlineRevenueAdjustments: ").append(toIndentedString(totalOnlineRevenueAdjustments)).append("\n");
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

