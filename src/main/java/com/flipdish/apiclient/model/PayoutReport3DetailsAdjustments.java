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
 * PayoutReport3DetailsAdjustments
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-26T10:46:12.007Z")
public class PayoutReport3DetailsAdjustments {
  @SerializedName("OpeningBalance")
  private Double openingBalance = null;

  @SerializedName("RefundsOnCardOrders")
  private Double refundsOnCardOrders = null;

  @SerializedName("RefundsOnCashOrders")
  private Double refundsOnCashOrders = null;

  @SerializedName("CashCustomerFees")
  private Double cashCustomerFees = null;

  @SerializedName("Chargebacks")
  private Double chargebacks = null;

  @SerializedName("OtherTransactions")
  private Double otherTransactions = null;

  @SerializedName("ClosingBalance")
  private Double closingBalance = null;

  public PayoutReport3DetailsAdjustments openingBalance(Double openingBalance) {
    this.openingBalance = openingBalance;
    return this;
  }

   /**
   * Get openingBalance
   * @return openingBalance
  **/
  @ApiModelProperty(value = "")
  public Double getOpeningBalance() {
    return openingBalance;
  }

  public void setOpeningBalance(Double openingBalance) {
    this.openingBalance = openingBalance;
  }

  public PayoutReport3DetailsAdjustments refundsOnCardOrders(Double refundsOnCardOrders) {
    this.refundsOnCardOrders = refundsOnCardOrders;
    return this;
  }

   /**
   * Get refundsOnCardOrders
   * @return refundsOnCardOrders
  **/
  @ApiModelProperty(value = "")
  public Double getRefundsOnCardOrders() {
    return refundsOnCardOrders;
  }

  public void setRefundsOnCardOrders(Double refundsOnCardOrders) {
    this.refundsOnCardOrders = refundsOnCardOrders;
  }

  public PayoutReport3DetailsAdjustments refundsOnCashOrders(Double refundsOnCashOrders) {
    this.refundsOnCashOrders = refundsOnCashOrders;
    return this;
  }

   /**
   * Get refundsOnCashOrders
   * @return refundsOnCashOrders
  **/
  @ApiModelProperty(value = "")
  public Double getRefundsOnCashOrders() {
    return refundsOnCashOrders;
  }

  public void setRefundsOnCashOrders(Double refundsOnCashOrders) {
    this.refundsOnCashOrders = refundsOnCashOrders;
  }

  public PayoutReport3DetailsAdjustments cashCustomerFees(Double cashCustomerFees) {
    this.cashCustomerFees = cashCustomerFees;
    return this;
  }

   /**
   * Get cashCustomerFees
   * @return cashCustomerFees
  **/
  @ApiModelProperty(value = "")
  public Double getCashCustomerFees() {
    return cashCustomerFees;
  }

  public void setCashCustomerFees(Double cashCustomerFees) {
    this.cashCustomerFees = cashCustomerFees;
  }

  public PayoutReport3DetailsAdjustments chargebacks(Double chargebacks) {
    this.chargebacks = chargebacks;
    return this;
  }

   /**
   * Get chargebacks
   * @return chargebacks
  **/
  @ApiModelProperty(value = "")
  public Double getChargebacks() {
    return chargebacks;
  }

  public void setChargebacks(Double chargebacks) {
    this.chargebacks = chargebacks;
  }

  public PayoutReport3DetailsAdjustments otherTransactions(Double otherTransactions) {
    this.otherTransactions = otherTransactions;
    return this;
  }

   /**
   * Get otherTransactions
   * @return otherTransactions
  **/
  @ApiModelProperty(value = "")
  public Double getOtherTransactions() {
    return otherTransactions;
  }

  public void setOtherTransactions(Double otherTransactions) {
    this.otherTransactions = otherTransactions;
  }

  public PayoutReport3DetailsAdjustments closingBalance(Double closingBalance) {
    this.closingBalance = closingBalance;
    return this;
  }

   /**
   * Get closingBalance
   * @return closingBalance
  **/
  @ApiModelProperty(value = "")
  public Double getClosingBalance() {
    return closingBalance;
  }

  public void setClosingBalance(Double closingBalance) {
    this.closingBalance = closingBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutReport3DetailsAdjustments payoutReport3DetailsAdjustments = (PayoutReport3DetailsAdjustments) o;
    return Objects.equals(this.openingBalance, payoutReport3DetailsAdjustments.openingBalance) &&
        Objects.equals(this.refundsOnCardOrders, payoutReport3DetailsAdjustments.refundsOnCardOrders) &&
        Objects.equals(this.refundsOnCashOrders, payoutReport3DetailsAdjustments.refundsOnCashOrders) &&
        Objects.equals(this.cashCustomerFees, payoutReport3DetailsAdjustments.cashCustomerFees) &&
        Objects.equals(this.chargebacks, payoutReport3DetailsAdjustments.chargebacks) &&
        Objects.equals(this.otherTransactions, payoutReport3DetailsAdjustments.otherTransactions) &&
        Objects.equals(this.closingBalance, payoutReport3DetailsAdjustments.closingBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openingBalance, refundsOnCardOrders, refundsOnCashOrders, cashCustomerFees, chargebacks, otherTransactions, closingBalance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutReport3DetailsAdjustments {\n");
    
    sb.append("    openingBalance: ").append(toIndentedString(openingBalance)).append("\n");
    sb.append("    refundsOnCardOrders: ").append(toIndentedString(refundsOnCardOrders)).append("\n");
    sb.append("    refundsOnCashOrders: ").append(toIndentedString(refundsOnCashOrders)).append("\n");
    sb.append("    cashCustomerFees: ").append(toIndentedString(cashCustomerFees)).append("\n");
    sb.append("    chargebacks: ").append(toIndentedString(chargebacks)).append("\n");
    sb.append("    otherTransactions: ").append(toIndentedString(otherTransactions)).append("\n");
    sb.append("    closingBalance: ").append(toIndentedString(closingBalance)).append("\n");
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

