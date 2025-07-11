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
 * PayoutReport3OverviewHeader
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class PayoutReport3OverviewHeader {
  @SerializedName("PayoutId")
  private Integer payoutId = null;

  @SerializedName("BankAccountId")
  private Integer bankAccountId = null;

  @SerializedName("IsManualPayout")
  private Boolean isManualPayout = null;

  @SerializedName("AccountName")
  private String accountName = null;

  @SerializedName("PayoutStatus")
  private String payoutStatus = null;

  @SerializedName("CreatedDate")
  private OffsetDateTime createdDate = null;

  @SerializedName("PeriodStartTime")
  private OffsetDateTime periodStartTime = null;

  @SerializedName("PeriodEndTime")
  private OffsetDateTime periodEndTime = null;

  @SerializedName("DestinationBank")
  private String destinationBank = null;

  @SerializedName("DestinationAccount")
  private String destinationAccount = null;

  @SerializedName("Amount")
  private Double amount = null;

  @SerializedName("Currency")
  private String currency = null;

  public PayoutReport3OverviewHeader payoutId(Integer payoutId) {
    this.payoutId = payoutId;
    return this;
  }

   /**
   * Get payoutId
   * @return payoutId
  **/
  @ApiModelProperty(value = "")
  public Integer getPayoutId() {
    return payoutId;
  }

  public void setPayoutId(Integer payoutId) {
    this.payoutId = payoutId;
  }

  public PayoutReport3OverviewHeader bankAccountId(Integer bankAccountId) {
    this.bankAccountId = bankAccountId;
    return this;
  }

   /**
   * Get bankAccountId
   * @return bankAccountId
  **/
  @ApiModelProperty(value = "")
  public Integer getBankAccountId() {
    return bankAccountId;
  }

  public void setBankAccountId(Integer bankAccountId) {
    this.bankAccountId = bankAccountId;
  }

  public PayoutReport3OverviewHeader isManualPayout(Boolean isManualPayout) {
    this.isManualPayout = isManualPayout;
    return this;
  }

   /**
   * Get isManualPayout
   * @return isManualPayout
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsManualPayout() {
    return isManualPayout;
  }

  public void setIsManualPayout(Boolean isManualPayout) {
    this.isManualPayout = isManualPayout;
  }

  public PayoutReport3OverviewHeader accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @ApiModelProperty(value = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public PayoutReport3OverviewHeader payoutStatus(String payoutStatus) {
    this.payoutStatus = payoutStatus;
    return this;
  }

   /**
   * Get payoutStatus
   * @return payoutStatus
  **/
  @ApiModelProperty(value = "")
  public String getPayoutStatus() {
    return payoutStatus;
  }

  public void setPayoutStatus(String payoutStatus) {
    this.payoutStatus = payoutStatus;
  }

  public PayoutReport3OverviewHeader createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public PayoutReport3OverviewHeader periodStartTime(OffsetDateTime periodStartTime) {
    this.periodStartTime = periodStartTime;
    return this;
  }

   /**
   * Get periodStartTime
   * @return periodStartTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getPeriodStartTime() {
    return periodStartTime;
  }

  public void setPeriodStartTime(OffsetDateTime periodStartTime) {
    this.periodStartTime = periodStartTime;
  }

  public PayoutReport3OverviewHeader periodEndTime(OffsetDateTime periodEndTime) {
    this.periodEndTime = periodEndTime;
    return this;
  }

   /**
   * Get periodEndTime
   * @return periodEndTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getPeriodEndTime() {
    return periodEndTime;
  }

  public void setPeriodEndTime(OffsetDateTime periodEndTime) {
    this.periodEndTime = periodEndTime;
  }

  public PayoutReport3OverviewHeader destinationBank(String destinationBank) {
    this.destinationBank = destinationBank;
    return this;
  }

   /**
   * Get destinationBank
   * @return destinationBank
  **/
  @ApiModelProperty(value = "")
  public String getDestinationBank() {
    return destinationBank;
  }

  public void setDestinationBank(String destinationBank) {
    this.destinationBank = destinationBank;
  }

  public PayoutReport3OverviewHeader destinationAccount(String destinationAccount) {
    this.destinationAccount = destinationAccount;
    return this;
  }

   /**
   * Get destinationAccount
   * @return destinationAccount
  **/
  @ApiModelProperty(value = "")
  public String getDestinationAccount() {
    return destinationAccount;
  }

  public void setDestinationAccount(String destinationAccount) {
    this.destinationAccount = destinationAccount;
  }

  public PayoutReport3OverviewHeader amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public PayoutReport3OverviewHeader currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutReport3OverviewHeader payoutReport3OverviewHeader = (PayoutReport3OverviewHeader) o;
    return Objects.equals(this.payoutId, payoutReport3OverviewHeader.payoutId) &&
        Objects.equals(this.bankAccountId, payoutReport3OverviewHeader.bankAccountId) &&
        Objects.equals(this.isManualPayout, payoutReport3OverviewHeader.isManualPayout) &&
        Objects.equals(this.accountName, payoutReport3OverviewHeader.accountName) &&
        Objects.equals(this.payoutStatus, payoutReport3OverviewHeader.payoutStatus) &&
        Objects.equals(this.createdDate, payoutReport3OverviewHeader.createdDate) &&
        Objects.equals(this.periodStartTime, payoutReport3OverviewHeader.periodStartTime) &&
        Objects.equals(this.periodEndTime, payoutReport3OverviewHeader.periodEndTime) &&
        Objects.equals(this.destinationBank, payoutReport3OverviewHeader.destinationBank) &&
        Objects.equals(this.destinationAccount, payoutReport3OverviewHeader.destinationAccount) &&
        Objects.equals(this.amount, payoutReport3OverviewHeader.amount) &&
        Objects.equals(this.currency, payoutReport3OverviewHeader.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payoutId, bankAccountId, isManualPayout, accountName, payoutStatus, createdDate, periodStartTime, periodEndTime, destinationBank, destinationAccount, amount, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutReport3OverviewHeader {\n");
    
    sb.append("    payoutId: ").append(toIndentedString(payoutId)).append("\n");
    sb.append("    bankAccountId: ").append(toIndentedString(bankAccountId)).append("\n");
    sb.append("    isManualPayout: ").append(toIndentedString(isManualPayout)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    payoutStatus: ").append(toIndentedString(payoutStatus)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    periodStartTime: ").append(toIndentedString(periodStartTime)).append("\n");
    sb.append("    periodEndTime: ").append(toIndentedString(periodEndTime)).append("\n");
    sb.append("    destinationBank: ").append(toIndentedString(destinationBank)).append("\n");
    sb.append("    destinationAccount: ").append(toIndentedString(destinationAccount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

