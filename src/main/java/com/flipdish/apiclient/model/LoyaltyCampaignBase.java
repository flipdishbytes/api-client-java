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
import java.util.ArrayList;
import java.util.List;

/**
 * Loyalty campaign base
 */
@ApiModel(description = "Loyalty campaign base")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-24T10:16:25.462Z")
public class LoyaltyCampaignBase {
  @SerializedName("OrdersBeforeReceivingVoucher")
  private Integer ordersBeforeReceivingVoucher = null;

  @SerializedName("PercentDiscountAmount")
  private Integer percentDiscountAmount = null;

  @SerializedName("RoundingStrategy")
  private Integer roundingStrategy = null;

  @SerializedName("ShouldIncludeOrdersWithLoyaltyVoucher")
  private Boolean shouldIncludeOrdersWithLoyaltyVoucher = null;

  @SerializedName("VoucherValidPeriodDays")
  private Integer voucherValidPeriodDays = null;

  @SerializedName("IncludeDeliveryFee")
  private Boolean includeDeliveryFee = null;

  @SerializedName("AutoApplyResultingVouchers")
  private Boolean autoApplyResultingVouchers = null;

  @SerializedName("IncludeExistingOrders")
  private Boolean includeExistingOrders = null;

  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  @SerializedName("StoreIds")
  private List<Integer> storeIds = null;

  @SerializedName("AppId")
  private String appId = null;

  public LoyaltyCampaignBase ordersBeforeReceivingVoucher(Integer ordersBeforeReceivingVoucher) {
    this.ordersBeforeReceivingVoucher = ordersBeforeReceivingVoucher;
    return this;
  }

   /**
   * Number of orders customer needs to make, before receiving voucher
   * @return ordersBeforeReceivingVoucher
  **/
  @ApiModelProperty(value = "Number of orders customer needs to make, before receiving voucher")
  public Integer getOrdersBeforeReceivingVoucher() {
    return ordersBeforeReceivingVoucher;
  }

  public void setOrdersBeforeReceivingVoucher(Integer ordersBeforeReceivingVoucher) {
    this.ordersBeforeReceivingVoucher = ordersBeforeReceivingVoucher;
  }

  public LoyaltyCampaignBase percentDiscountAmount(Integer percentDiscountAmount) {
    this.percentDiscountAmount = percentDiscountAmount;
    return this;
  }

   /**
   * Discount amount in percents
   * minimum: 1
   * maximum: 100
   * @return percentDiscountAmount
  **/
  @ApiModelProperty(value = "Discount amount in percents")
  public Integer getPercentDiscountAmount() {
    return percentDiscountAmount;
  }

  public void setPercentDiscountAmount(Integer percentDiscountAmount) {
    this.percentDiscountAmount = percentDiscountAmount;
  }

  public LoyaltyCampaignBase roundingStrategy(Integer roundingStrategy) {
    this.roundingStrategy = roundingStrategy;
    return this;
  }

   /**
   * Controls how the loyalty voucher&#39;s amount is rounded
   * minimum: 0
   * maximum: 2
   * @return roundingStrategy
  **/
  @ApiModelProperty(value = "Controls how the loyalty voucher's amount is rounded")
  public Integer getRoundingStrategy() {
    return roundingStrategy;
  }

  public void setRoundingStrategy(Integer roundingStrategy) {
    this.roundingStrategy = roundingStrategy;
  }

  public LoyaltyCampaignBase shouldIncludeOrdersWithLoyaltyVoucher(Boolean shouldIncludeOrdersWithLoyaltyVoucher) {
    this.shouldIncludeOrdersWithLoyaltyVoucher = shouldIncludeOrdersWithLoyaltyVoucher;
    return this;
  }

   /**
   * Controls whether we should include orders with loyalty vouchers in the campaign calculation
   * @return shouldIncludeOrdersWithLoyaltyVoucher
  **/
  @ApiModelProperty(value = "Controls whether we should include orders with loyalty vouchers in the campaign calculation")
  public Boolean isShouldIncludeOrdersWithLoyaltyVoucher() {
    return shouldIncludeOrdersWithLoyaltyVoucher;
  }

  public void setShouldIncludeOrdersWithLoyaltyVoucher(Boolean shouldIncludeOrdersWithLoyaltyVoucher) {
    this.shouldIncludeOrdersWithLoyaltyVoucher = shouldIncludeOrdersWithLoyaltyVoucher;
  }

  public LoyaltyCampaignBase voucherValidPeriodDays(Integer voucherValidPeriodDays) {
    this.voucherValidPeriodDays = voucherValidPeriodDays;
    return this;
  }

   /**
   * Number of days for which the voucher will be valid.
   * minimum: 1
   * maximum: 300
   * @return voucherValidPeriodDays
  **/
  @ApiModelProperty(value = "Number of days for which the voucher will be valid.")
  public Integer getVoucherValidPeriodDays() {
    return voucherValidPeriodDays;
  }

  public void setVoucherValidPeriodDays(Integer voucherValidPeriodDays) {
    this.voucherValidPeriodDays = voucherValidPeriodDays;
  }

  public LoyaltyCampaignBase includeDeliveryFee(Boolean includeDeliveryFee) {
    this.includeDeliveryFee = includeDeliveryFee;
    return this;
  }

   /**
   * Discount will include delivery fee
   * @return includeDeliveryFee
  **/
  @ApiModelProperty(value = "Discount will include delivery fee")
  public Boolean isIncludeDeliveryFee() {
    return includeDeliveryFee;
  }

  public void setIncludeDeliveryFee(Boolean includeDeliveryFee) {
    this.includeDeliveryFee = includeDeliveryFee;
  }

  public LoyaltyCampaignBase autoApplyResultingVouchers(Boolean autoApplyResultingVouchers) {
    this.autoApplyResultingVouchers = autoApplyResultingVouchers;
    return this;
  }

   /**
   * Automatically apply resulting vouchers
   * @return autoApplyResultingVouchers
  **/
  @ApiModelProperty(value = "Automatically apply resulting vouchers")
  public Boolean isAutoApplyResultingVouchers() {
    return autoApplyResultingVouchers;
  }

  public void setAutoApplyResultingVouchers(Boolean autoApplyResultingVouchers) {
    this.autoApplyResultingVouchers = autoApplyResultingVouchers;
  }

  public LoyaltyCampaignBase includeExistingOrders(Boolean includeExistingOrders) {
    this.includeExistingOrders = includeExistingOrders;
    return this;
  }

   /**
   * Campaign will apply to existing orders
   * @return includeExistingOrders
  **/
  @ApiModelProperty(value = "Campaign will apply to existing orders")
  public Boolean isIncludeExistingOrders() {
    return includeExistingOrders;
  }

  public void setIncludeExistingOrders(Boolean includeExistingOrders) {
    this.includeExistingOrders = includeExistingOrders;
  }

  public LoyaltyCampaignBase isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Is campaign enabled
   * @return isEnabled
  **/
  @ApiModelProperty(value = "Is campaign enabled")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public LoyaltyCampaignBase storeIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
    return this;
  }

  public LoyaltyCampaignBase addStoreIdsItem(Integer storeIdsItem) {
    if (this.storeIds == null) {
      this.storeIds = new ArrayList<Integer>();
    }
    this.storeIds.add(storeIdsItem);
    return this;
  }

   /**
   * Ids of stores this campaign applies to
   * @return storeIds
  **/
  @ApiModelProperty(value = "Ids of stores this campaign applies to")
  public List<Integer> getStoreIds() {
    return storeIds;
  }

  public void setStoreIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
  }

  public LoyaltyCampaignBase appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * The app that this campaign belongs to.
   * @return appId
  **/
  @ApiModelProperty(value = "The app that this campaign belongs to.")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyCampaignBase loyaltyCampaignBase = (LoyaltyCampaignBase) o;
    return Objects.equals(this.ordersBeforeReceivingVoucher, loyaltyCampaignBase.ordersBeforeReceivingVoucher) &&
        Objects.equals(this.percentDiscountAmount, loyaltyCampaignBase.percentDiscountAmount) &&
        Objects.equals(this.roundingStrategy, loyaltyCampaignBase.roundingStrategy) &&
        Objects.equals(this.shouldIncludeOrdersWithLoyaltyVoucher, loyaltyCampaignBase.shouldIncludeOrdersWithLoyaltyVoucher) &&
        Objects.equals(this.voucherValidPeriodDays, loyaltyCampaignBase.voucherValidPeriodDays) &&
        Objects.equals(this.includeDeliveryFee, loyaltyCampaignBase.includeDeliveryFee) &&
        Objects.equals(this.autoApplyResultingVouchers, loyaltyCampaignBase.autoApplyResultingVouchers) &&
        Objects.equals(this.includeExistingOrders, loyaltyCampaignBase.includeExistingOrders) &&
        Objects.equals(this.isEnabled, loyaltyCampaignBase.isEnabled) &&
        Objects.equals(this.storeIds, loyaltyCampaignBase.storeIds) &&
        Objects.equals(this.appId, loyaltyCampaignBase.appId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ordersBeforeReceivingVoucher, percentDiscountAmount, roundingStrategy, shouldIncludeOrdersWithLoyaltyVoucher, voucherValidPeriodDays, includeDeliveryFee, autoApplyResultingVouchers, includeExistingOrders, isEnabled, storeIds, appId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyCampaignBase {\n");
    
    sb.append("    ordersBeforeReceivingVoucher: ").append(toIndentedString(ordersBeforeReceivingVoucher)).append("\n");
    sb.append("    percentDiscountAmount: ").append(toIndentedString(percentDiscountAmount)).append("\n");
    sb.append("    roundingStrategy: ").append(toIndentedString(roundingStrategy)).append("\n");
    sb.append("    shouldIncludeOrdersWithLoyaltyVoucher: ").append(toIndentedString(shouldIncludeOrdersWithLoyaltyVoucher)).append("\n");
    sb.append("    voucherValidPeriodDays: ").append(toIndentedString(voucherValidPeriodDays)).append("\n");
    sb.append("    includeDeliveryFee: ").append(toIndentedString(includeDeliveryFee)).append("\n");
    sb.append("    autoApplyResultingVouchers: ").append(toIndentedString(autoApplyResultingVouchers)).append("\n");
    sb.append("    includeExistingOrders: ").append(toIndentedString(includeExistingOrders)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    storeIds: ").append(toIndentedString(storeIds)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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

