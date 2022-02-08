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
import com.flipdish.apiclient.model.BalanceDetails;
import com.flipdish.apiclient.model.ChargebackDetails;
import com.flipdish.apiclient.model.FlipdishFeesDetails;
import com.flipdish.apiclient.model.OtherChargesDetails;
import com.flipdish.apiclient.model.RevenueAdjustmentsDetails;
import com.flipdish.apiclient.model.RevenueDetail;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Payout details for a single store
 */
@ApiModel(description = "Payout details for a single store")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-08T14:18:50.949Z")
public class PayoutStore {
  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("StoreName")
  private String storeName = null;

  @SerializedName("Amount")
  private Double amount = null;

  @SerializedName("OnlineRevenue")
  private RevenueDetail onlineRevenue = null;

  @SerializedName("Revenue")
  private RevenueDetail revenue = null;

  @SerializedName("RevenueAdjustments")
  private RevenueAdjustmentsDetails revenueAdjustments = null;

  @SerializedName("FlipdishFees")
  private FlipdishFeesDetails flipdishFees = null;

  @SerializedName("Chargebacks")
  private ChargebackDetails chargebacks = null;

  @SerializedName("OtherCharges")
  private OtherChargesDetails otherCharges = null;

  @SerializedName("Balance")
  private BalanceDetails balance = null;

  public PayoutStore storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * The id of the Store.
   * @return storeId
  **/
  @ApiModelProperty(value = "The id of the Store.")
  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public PayoutStore storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

   /**
   * Name of the store
   * @return storeName
  **/
  @ApiModelProperty(value = "Name of the store")
  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public PayoutStore amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount of the payout for this Store
   * @return amount
  **/
  @ApiModelProperty(value = "Amount of the payout for this Store")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

   /**
   * Revenue details (DEPRECATED: Use Revenue)
   * @return onlineRevenue
  **/
  @ApiModelProperty(value = "Revenue details (DEPRECATED: Use Revenue)")
  public RevenueDetail getOnlineRevenue() {
    return onlineRevenue;
  }

  public PayoutStore revenue(RevenueDetail revenue) {
    this.revenue = revenue;
    return this;
  }

   /**
   * Revenue details
   * @return revenue
  **/
  @ApiModelProperty(value = "Revenue details")
  public RevenueDetail getRevenue() {
    return revenue;
  }

  public void setRevenue(RevenueDetail revenue) {
    this.revenue = revenue;
  }

  public PayoutStore revenueAdjustments(RevenueAdjustmentsDetails revenueAdjustments) {
    this.revenueAdjustments = revenueAdjustments;
    return this;
  }

   /**
   * Revenue Adjustments breakdown
   * @return revenueAdjustments
  **/
  @ApiModelProperty(value = "Revenue Adjustments breakdown")
  public RevenueAdjustmentsDetails getRevenueAdjustments() {
    return revenueAdjustments;
  }

  public void setRevenueAdjustments(RevenueAdjustmentsDetails revenueAdjustments) {
    this.revenueAdjustments = revenueAdjustments;
  }

  public PayoutStore flipdishFees(FlipdishFeesDetails flipdishFees) {
    this.flipdishFees = flipdishFees;
    return this;
  }

   /**
   * Fees breakdown
   * @return flipdishFees
  **/
  @ApiModelProperty(value = "Fees breakdown")
  public FlipdishFeesDetails getFlipdishFees() {
    return flipdishFees;
  }

  public void setFlipdishFees(FlipdishFeesDetails flipdishFees) {
    this.flipdishFees = flipdishFees;
  }

  public PayoutStore chargebacks(ChargebackDetails chargebacks) {
    this.chargebacks = chargebacks;
    return this;
  }

   /**
   * Chargebacks breakdown
   * @return chargebacks
  **/
  @ApiModelProperty(value = "Chargebacks breakdown")
  public ChargebackDetails getChargebacks() {
    return chargebacks;
  }

  public void setChargebacks(ChargebackDetails chargebacks) {
    this.chargebacks = chargebacks;
  }

  public PayoutStore otherCharges(OtherChargesDetails otherCharges) {
    this.otherCharges = otherCharges;
    return this;
  }

   /**
   * Breakdown of other charges
   * @return otherCharges
  **/
  @ApiModelProperty(value = "Breakdown of other charges")
  public OtherChargesDetails getOtherCharges() {
    return otherCharges;
  }

  public void setOtherCharges(OtherChargesDetails otherCharges) {
    this.otherCharges = otherCharges;
  }

  public PayoutStore balance(BalanceDetails balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Period opening and closing balance
   * @return balance
  **/
  @ApiModelProperty(value = "Period opening and closing balance")
  public BalanceDetails getBalance() {
    return balance;
  }

  public void setBalance(BalanceDetails balance) {
    this.balance = balance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutStore payoutStore = (PayoutStore) o;
    return Objects.equals(this.storeId, payoutStore.storeId) &&
        Objects.equals(this.storeName, payoutStore.storeName) &&
        Objects.equals(this.amount, payoutStore.amount) &&
        Objects.equals(this.onlineRevenue, payoutStore.onlineRevenue) &&
        Objects.equals(this.revenue, payoutStore.revenue) &&
        Objects.equals(this.revenueAdjustments, payoutStore.revenueAdjustments) &&
        Objects.equals(this.flipdishFees, payoutStore.flipdishFees) &&
        Objects.equals(this.chargebacks, payoutStore.chargebacks) &&
        Objects.equals(this.otherCharges, payoutStore.otherCharges) &&
        Objects.equals(this.balance, payoutStore.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, storeName, amount, onlineRevenue, revenue, revenueAdjustments, flipdishFees, chargebacks, otherCharges, balance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutStore {\n");
    
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    onlineRevenue: ").append(toIndentedString(onlineRevenue)).append("\n");
    sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
    sb.append("    revenueAdjustments: ").append(toIndentedString(revenueAdjustments)).append("\n");
    sb.append("    flipdishFees: ").append(toIndentedString(flipdishFees)).append("\n");
    sb.append("    chargebacks: ").append(toIndentedString(chargebacks)).append("\n");
    sb.append("    otherCharges: ").append(toIndentedString(otherCharges)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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
