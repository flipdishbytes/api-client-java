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
import org.threeten.bp.OffsetDateTime;

/**
 * PayoutReport3DetailsAdjustments
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-01-28T11:16:53.429Z")
public class PayoutReport3DetailsAdjustments {
  @SerializedName("OpeningBalanceDate")
  private OffsetDateTime openingBalanceDate = null;

  @SerializedName("ClosingBalanceDate")
  private OffsetDateTime closingBalanceDate = null;

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

  @SerializedName("BalanceRepaid")
  private Double balanceRepaid = null;

  @SerializedName("RefundsOnCardOrdersBracketsAmount")
  private Double refundsOnCardOrdersBracketsAmount = null;

  @SerializedName("RefundsOnCardOrdersBracketsOutOfAmount")
  private Double refundsOnCardOrdersBracketsOutOfAmount = null;

  @SerializedName("RefundsOnCashOrdersBracketsAmount")
  private Double refundsOnCashOrdersBracketsAmount = null;

  @SerializedName("RefundsOnCashOrdersBracketsOutOfAmount")
  private Double refundsOnCashOrdersBracketsOutOfAmount = null;

  @SerializedName("CashCustomerFeesBracketsAmount")
  private Double cashCustomerFeesBracketsAmount = null;

  @SerializedName("CashCustomerFeesBracketsOutOfAmount")
  private Double cashCustomerFeesBracketsOutOfAmount = null;

  @SerializedName("BalanceChange")
  private Double balanceChange = null;

  @SerializedName("PreviousPayoutId")
  private Integer previousPayoutId = null;

  @SerializedName("NextPayoutId")
  private Integer nextPayoutId = null;

  @SerializedName("RefundedFeesOnChargebacks")
  private Double refundedFeesOnChargebacks = null;

  @SerializedName("TotalChargebackCost")
  private Double totalChargebackCost = null;

  public PayoutReport3DetailsAdjustments openingBalanceDate(OffsetDateTime openingBalanceDate) {
    this.openingBalanceDate = openingBalanceDate;
    return this;
  }

   /**
   * Get openingBalanceDate
   * @return openingBalanceDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getOpeningBalanceDate() {
    return openingBalanceDate;
  }

  public void setOpeningBalanceDate(OffsetDateTime openingBalanceDate) {
    this.openingBalanceDate = openingBalanceDate;
  }

  public PayoutReport3DetailsAdjustments closingBalanceDate(OffsetDateTime closingBalanceDate) {
    this.closingBalanceDate = closingBalanceDate;
    return this;
  }

   /**
   * Get closingBalanceDate
   * @return closingBalanceDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getClosingBalanceDate() {
    return closingBalanceDate;
  }

  public void setClosingBalanceDate(OffsetDateTime closingBalanceDate) {
    this.closingBalanceDate = closingBalanceDate;
  }

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

  public PayoutReport3DetailsAdjustments balanceRepaid(Double balanceRepaid) {
    this.balanceRepaid = balanceRepaid;
    return this;
  }

   /**
   * Get balanceRepaid
   * @return balanceRepaid
  **/
  @ApiModelProperty(value = "")
  public Double getBalanceRepaid() {
    return balanceRepaid;
  }

  public void setBalanceRepaid(Double balanceRepaid) {
    this.balanceRepaid = balanceRepaid;
  }

  public PayoutReport3DetailsAdjustments refundsOnCardOrdersBracketsAmount(Double refundsOnCardOrdersBracketsAmount) {
    this.refundsOnCardOrdersBracketsAmount = refundsOnCardOrdersBracketsAmount;
    return this;
  }

   /**
   * Get refundsOnCardOrdersBracketsAmount
   * @return refundsOnCardOrdersBracketsAmount
  **/
  @ApiModelProperty(value = "")
  public Double getRefundsOnCardOrdersBracketsAmount() {
    return refundsOnCardOrdersBracketsAmount;
  }

  public void setRefundsOnCardOrdersBracketsAmount(Double refundsOnCardOrdersBracketsAmount) {
    this.refundsOnCardOrdersBracketsAmount = refundsOnCardOrdersBracketsAmount;
  }

  public PayoutReport3DetailsAdjustments refundsOnCardOrdersBracketsOutOfAmount(Double refundsOnCardOrdersBracketsOutOfAmount) {
    this.refundsOnCardOrdersBracketsOutOfAmount = refundsOnCardOrdersBracketsOutOfAmount;
    return this;
  }

   /**
   * Get refundsOnCardOrdersBracketsOutOfAmount
   * @return refundsOnCardOrdersBracketsOutOfAmount
  **/
  @ApiModelProperty(value = "")
  public Double getRefundsOnCardOrdersBracketsOutOfAmount() {
    return refundsOnCardOrdersBracketsOutOfAmount;
  }

  public void setRefundsOnCardOrdersBracketsOutOfAmount(Double refundsOnCardOrdersBracketsOutOfAmount) {
    this.refundsOnCardOrdersBracketsOutOfAmount = refundsOnCardOrdersBracketsOutOfAmount;
  }

  public PayoutReport3DetailsAdjustments refundsOnCashOrdersBracketsAmount(Double refundsOnCashOrdersBracketsAmount) {
    this.refundsOnCashOrdersBracketsAmount = refundsOnCashOrdersBracketsAmount;
    return this;
  }

   /**
   * Get refundsOnCashOrdersBracketsAmount
   * @return refundsOnCashOrdersBracketsAmount
  **/
  @ApiModelProperty(value = "")
  public Double getRefundsOnCashOrdersBracketsAmount() {
    return refundsOnCashOrdersBracketsAmount;
  }

  public void setRefundsOnCashOrdersBracketsAmount(Double refundsOnCashOrdersBracketsAmount) {
    this.refundsOnCashOrdersBracketsAmount = refundsOnCashOrdersBracketsAmount;
  }

  public PayoutReport3DetailsAdjustments refundsOnCashOrdersBracketsOutOfAmount(Double refundsOnCashOrdersBracketsOutOfAmount) {
    this.refundsOnCashOrdersBracketsOutOfAmount = refundsOnCashOrdersBracketsOutOfAmount;
    return this;
  }

   /**
   * Get refundsOnCashOrdersBracketsOutOfAmount
   * @return refundsOnCashOrdersBracketsOutOfAmount
  **/
  @ApiModelProperty(value = "")
  public Double getRefundsOnCashOrdersBracketsOutOfAmount() {
    return refundsOnCashOrdersBracketsOutOfAmount;
  }

  public void setRefundsOnCashOrdersBracketsOutOfAmount(Double refundsOnCashOrdersBracketsOutOfAmount) {
    this.refundsOnCashOrdersBracketsOutOfAmount = refundsOnCashOrdersBracketsOutOfAmount;
  }

  public PayoutReport3DetailsAdjustments cashCustomerFeesBracketsAmount(Double cashCustomerFeesBracketsAmount) {
    this.cashCustomerFeesBracketsAmount = cashCustomerFeesBracketsAmount;
    return this;
  }

   /**
   * Get cashCustomerFeesBracketsAmount
   * @return cashCustomerFeesBracketsAmount
  **/
  @ApiModelProperty(value = "")
  public Double getCashCustomerFeesBracketsAmount() {
    return cashCustomerFeesBracketsAmount;
  }

  public void setCashCustomerFeesBracketsAmount(Double cashCustomerFeesBracketsAmount) {
    this.cashCustomerFeesBracketsAmount = cashCustomerFeesBracketsAmount;
  }

  public PayoutReport3DetailsAdjustments cashCustomerFeesBracketsOutOfAmount(Double cashCustomerFeesBracketsOutOfAmount) {
    this.cashCustomerFeesBracketsOutOfAmount = cashCustomerFeesBracketsOutOfAmount;
    return this;
  }

   /**
   * Get cashCustomerFeesBracketsOutOfAmount
   * @return cashCustomerFeesBracketsOutOfAmount
  **/
  @ApiModelProperty(value = "")
  public Double getCashCustomerFeesBracketsOutOfAmount() {
    return cashCustomerFeesBracketsOutOfAmount;
  }

  public void setCashCustomerFeesBracketsOutOfAmount(Double cashCustomerFeesBracketsOutOfAmount) {
    this.cashCustomerFeesBracketsOutOfAmount = cashCustomerFeesBracketsOutOfAmount;
  }

  public PayoutReport3DetailsAdjustments balanceChange(Double balanceChange) {
    this.balanceChange = balanceChange;
    return this;
  }

   /**
   * Get balanceChange
   * @return balanceChange
  **/
  @ApiModelProperty(value = "")
  public Double getBalanceChange() {
    return balanceChange;
  }

  public void setBalanceChange(Double balanceChange) {
    this.balanceChange = balanceChange;
  }

  public PayoutReport3DetailsAdjustments previousPayoutId(Integer previousPayoutId) {
    this.previousPayoutId = previousPayoutId;
    return this;
  }

   /**
   * Get previousPayoutId
   * @return previousPayoutId
  **/
  @ApiModelProperty(value = "")
  public Integer getPreviousPayoutId() {
    return previousPayoutId;
  }

  public void setPreviousPayoutId(Integer previousPayoutId) {
    this.previousPayoutId = previousPayoutId;
  }

  public PayoutReport3DetailsAdjustments nextPayoutId(Integer nextPayoutId) {
    this.nextPayoutId = nextPayoutId;
    return this;
  }

   /**
   * Get nextPayoutId
   * @return nextPayoutId
  **/
  @ApiModelProperty(value = "")
  public Integer getNextPayoutId() {
    return nextPayoutId;
  }

  public void setNextPayoutId(Integer nextPayoutId) {
    this.nextPayoutId = nextPayoutId;
  }

  public PayoutReport3DetailsAdjustments refundedFeesOnChargebacks(Double refundedFeesOnChargebacks) {
    this.refundedFeesOnChargebacks = refundedFeesOnChargebacks;
    return this;
  }

   /**
   * Get refundedFeesOnChargebacks
   * @return refundedFeesOnChargebacks
  **/
  @ApiModelProperty(value = "")
  public Double getRefundedFeesOnChargebacks() {
    return refundedFeesOnChargebacks;
  }

  public void setRefundedFeesOnChargebacks(Double refundedFeesOnChargebacks) {
    this.refundedFeesOnChargebacks = refundedFeesOnChargebacks;
  }

  public PayoutReport3DetailsAdjustments totalChargebackCost(Double totalChargebackCost) {
    this.totalChargebackCost = totalChargebackCost;
    return this;
  }

   /**
   * Get totalChargebackCost
   * @return totalChargebackCost
  **/
  @ApiModelProperty(value = "")
  public Double getTotalChargebackCost() {
    return totalChargebackCost;
  }

  public void setTotalChargebackCost(Double totalChargebackCost) {
    this.totalChargebackCost = totalChargebackCost;
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
    return Objects.equals(this.openingBalanceDate, payoutReport3DetailsAdjustments.openingBalanceDate) &&
        Objects.equals(this.closingBalanceDate, payoutReport3DetailsAdjustments.closingBalanceDate) &&
        Objects.equals(this.openingBalance, payoutReport3DetailsAdjustments.openingBalance) &&
        Objects.equals(this.refundsOnCardOrders, payoutReport3DetailsAdjustments.refundsOnCardOrders) &&
        Objects.equals(this.refundsOnCashOrders, payoutReport3DetailsAdjustments.refundsOnCashOrders) &&
        Objects.equals(this.cashCustomerFees, payoutReport3DetailsAdjustments.cashCustomerFees) &&
        Objects.equals(this.chargebacks, payoutReport3DetailsAdjustments.chargebacks) &&
        Objects.equals(this.otherTransactions, payoutReport3DetailsAdjustments.otherTransactions) &&
        Objects.equals(this.closingBalance, payoutReport3DetailsAdjustments.closingBalance) &&
        Objects.equals(this.balanceRepaid, payoutReport3DetailsAdjustments.balanceRepaid) &&
        Objects.equals(this.refundsOnCardOrdersBracketsAmount, payoutReport3DetailsAdjustments.refundsOnCardOrdersBracketsAmount) &&
        Objects.equals(this.refundsOnCardOrdersBracketsOutOfAmount, payoutReport3DetailsAdjustments.refundsOnCardOrdersBracketsOutOfAmount) &&
        Objects.equals(this.refundsOnCashOrdersBracketsAmount, payoutReport3DetailsAdjustments.refundsOnCashOrdersBracketsAmount) &&
        Objects.equals(this.refundsOnCashOrdersBracketsOutOfAmount, payoutReport3DetailsAdjustments.refundsOnCashOrdersBracketsOutOfAmount) &&
        Objects.equals(this.cashCustomerFeesBracketsAmount, payoutReport3DetailsAdjustments.cashCustomerFeesBracketsAmount) &&
        Objects.equals(this.cashCustomerFeesBracketsOutOfAmount, payoutReport3DetailsAdjustments.cashCustomerFeesBracketsOutOfAmount) &&
        Objects.equals(this.balanceChange, payoutReport3DetailsAdjustments.balanceChange) &&
        Objects.equals(this.previousPayoutId, payoutReport3DetailsAdjustments.previousPayoutId) &&
        Objects.equals(this.nextPayoutId, payoutReport3DetailsAdjustments.nextPayoutId) &&
        Objects.equals(this.refundedFeesOnChargebacks, payoutReport3DetailsAdjustments.refundedFeesOnChargebacks) &&
        Objects.equals(this.totalChargebackCost, payoutReport3DetailsAdjustments.totalChargebackCost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openingBalanceDate, closingBalanceDate, openingBalance, refundsOnCardOrders, refundsOnCashOrders, cashCustomerFees, chargebacks, otherTransactions, closingBalance, balanceRepaid, refundsOnCardOrdersBracketsAmount, refundsOnCardOrdersBracketsOutOfAmount, refundsOnCashOrdersBracketsAmount, refundsOnCashOrdersBracketsOutOfAmount, cashCustomerFeesBracketsAmount, cashCustomerFeesBracketsOutOfAmount, balanceChange, previousPayoutId, nextPayoutId, refundedFeesOnChargebacks, totalChargebackCost);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutReport3DetailsAdjustments {\n");
    
    sb.append("    openingBalanceDate: ").append(toIndentedString(openingBalanceDate)).append("\n");
    sb.append("    closingBalanceDate: ").append(toIndentedString(closingBalanceDate)).append("\n");
    sb.append("    openingBalance: ").append(toIndentedString(openingBalance)).append("\n");
    sb.append("    refundsOnCardOrders: ").append(toIndentedString(refundsOnCardOrders)).append("\n");
    sb.append("    refundsOnCashOrders: ").append(toIndentedString(refundsOnCashOrders)).append("\n");
    sb.append("    cashCustomerFees: ").append(toIndentedString(cashCustomerFees)).append("\n");
    sb.append("    chargebacks: ").append(toIndentedString(chargebacks)).append("\n");
    sb.append("    otherTransactions: ").append(toIndentedString(otherTransactions)).append("\n");
    sb.append("    closingBalance: ").append(toIndentedString(closingBalance)).append("\n");
    sb.append("    balanceRepaid: ").append(toIndentedString(balanceRepaid)).append("\n");
    sb.append("    refundsOnCardOrdersBracketsAmount: ").append(toIndentedString(refundsOnCardOrdersBracketsAmount)).append("\n");
    sb.append("    refundsOnCardOrdersBracketsOutOfAmount: ").append(toIndentedString(refundsOnCardOrdersBracketsOutOfAmount)).append("\n");
    sb.append("    refundsOnCashOrdersBracketsAmount: ").append(toIndentedString(refundsOnCashOrdersBracketsAmount)).append("\n");
    sb.append("    refundsOnCashOrdersBracketsOutOfAmount: ").append(toIndentedString(refundsOnCashOrdersBracketsOutOfAmount)).append("\n");
    sb.append("    cashCustomerFeesBracketsAmount: ").append(toIndentedString(cashCustomerFeesBracketsAmount)).append("\n");
    sb.append("    cashCustomerFeesBracketsOutOfAmount: ").append(toIndentedString(cashCustomerFeesBracketsOutOfAmount)).append("\n");
    sb.append("    balanceChange: ").append(toIndentedString(balanceChange)).append("\n");
    sb.append("    previousPayoutId: ").append(toIndentedString(previousPayoutId)).append("\n");
    sb.append("    nextPayoutId: ").append(toIndentedString(nextPayoutId)).append("\n");
    sb.append("    refundedFeesOnChargebacks: ").append(toIndentedString(refundedFeesOnChargebacks)).append("\n");
    sb.append("    totalChargebackCost: ").append(toIndentedString(totalChargebackCost)).append("\n");
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

