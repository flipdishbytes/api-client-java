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
 * Retention campaign base
 */
@ApiModel(description = "Retention campaign base")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class RetentionCampaignBase {
  @SerializedName("NotifyCustomerAfterMinutes")
  private Integer notifyCustomerAfterMinutes = null;

  @SerializedName("PercentDiscountAmount")
  private Integer percentDiscountAmount = null;

  @SerializedName("MaxDiscount")
  private Double maxDiscount = null;

  @SerializedName("LumpDiscountAmount")
  private Double lumpDiscountAmount = null;

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

  @SerializedName("ForceDiscount")
  private Boolean forceDiscount = null;

  public RetentionCampaignBase notifyCustomerAfterMinutes(Integer notifyCustomerAfterMinutes) {
    this.notifyCustomerAfterMinutes = notifyCustomerAfterMinutes;
    return this;
  }

   /**
   * Time in minutes, after which customer will receive retention voucher if he/she does not order
   * minimum: 1440
   * maximum: 2147483647
   * @return notifyCustomerAfterMinutes
  **/
  @ApiModelProperty(value = "Time in minutes, after which customer will receive retention voucher if he/she does not order")
  public Integer getNotifyCustomerAfterMinutes() {
    return notifyCustomerAfterMinutes;
  }

  public void setNotifyCustomerAfterMinutes(Integer notifyCustomerAfterMinutes) {
    this.notifyCustomerAfterMinutes = notifyCustomerAfterMinutes;
  }

  public RetentionCampaignBase percentDiscountAmount(Integer percentDiscountAmount) {
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

  public RetentionCampaignBase maxDiscount(Double maxDiscount) {
    this.maxDiscount = maxDiscount;
    return this;
  }

   /**
   * Maximum discount for percentage discounts
   * minimum: 0
   * @return maxDiscount
  **/
  @ApiModelProperty(value = "Maximum discount for percentage discounts")
  public Double getMaxDiscount() {
    return maxDiscount;
  }

  public void setMaxDiscount(Double maxDiscount) {
    this.maxDiscount = maxDiscount;
  }

  public RetentionCampaignBase lumpDiscountAmount(Double lumpDiscountAmount) {
    this.lumpDiscountAmount = lumpDiscountAmount;
    return this;
  }

   /**
   * Discount amount in sum of money
   * minimum: 0
   * maximum: 2147483647
   * @return lumpDiscountAmount
  **/
  @ApiModelProperty(value = "Discount amount in sum of money")
  public Double getLumpDiscountAmount() {
    return lumpDiscountAmount;
  }

  public void setLumpDiscountAmount(Double lumpDiscountAmount) {
    this.lumpDiscountAmount = lumpDiscountAmount;
  }

  public RetentionCampaignBase voucherValidPeriodDays(Integer voucherValidPeriodDays) {
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

  public RetentionCampaignBase includeDeliveryFee(Boolean includeDeliveryFee) {
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

  public RetentionCampaignBase autoApplyResultingVouchers(Boolean autoApplyResultingVouchers) {
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

  public RetentionCampaignBase includeExistingOrders(Boolean includeExistingOrders) {
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

  public RetentionCampaignBase isEnabled(Boolean isEnabled) {
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

  public RetentionCampaignBase storeIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
    return this;
  }

  public RetentionCampaignBase addStoreIdsItem(Integer storeIdsItem) {
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

  public RetentionCampaignBase appId(String appId) {
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

  public RetentionCampaignBase forceDiscount(Boolean forceDiscount) {
    this.forceDiscount = forceDiscount;
    return this;
  }

   /**
   * Controls whether the voucher generated from this campaign will override discount exclusions
   * @return forceDiscount
  **/
  @ApiModelProperty(value = "Controls whether the voucher generated from this campaign will override discount exclusions")
  public Boolean isForceDiscount() {
    return forceDiscount;
  }

  public void setForceDiscount(Boolean forceDiscount) {
    this.forceDiscount = forceDiscount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionCampaignBase retentionCampaignBase = (RetentionCampaignBase) o;
    return Objects.equals(this.notifyCustomerAfterMinutes, retentionCampaignBase.notifyCustomerAfterMinutes) &&
        Objects.equals(this.percentDiscountAmount, retentionCampaignBase.percentDiscountAmount) &&
        Objects.equals(this.maxDiscount, retentionCampaignBase.maxDiscount) &&
        Objects.equals(this.lumpDiscountAmount, retentionCampaignBase.lumpDiscountAmount) &&
        Objects.equals(this.voucherValidPeriodDays, retentionCampaignBase.voucherValidPeriodDays) &&
        Objects.equals(this.includeDeliveryFee, retentionCampaignBase.includeDeliveryFee) &&
        Objects.equals(this.autoApplyResultingVouchers, retentionCampaignBase.autoApplyResultingVouchers) &&
        Objects.equals(this.includeExistingOrders, retentionCampaignBase.includeExistingOrders) &&
        Objects.equals(this.isEnabled, retentionCampaignBase.isEnabled) &&
        Objects.equals(this.storeIds, retentionCampaignBase.storeIds) &&
        Objects.equals(this.appId, retentionCampaignBase.appId) &&
        Objects.equals(this.forceDiscount, retentionCampaignBase.forceDiscount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifyCustomerAfterMinutes, percentDiscountAmount, maxDiscount, lumpDiscountAmount, voucherValidPeriodDays, includeDeliveryFee, autoApplyResultingVouchers, includeExistingOrders, isEnabled, storeIds, appId, forceDiscount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionCampaignBase {\n");
    
    sb.append("    notifyCustomerAfterMinutes: ").append(toIndentedString(notifyCustomerAfterMinutes)).append("\n");
    sb.append("    percentDiscountAmount: ").append(toIndentedString(percentDiscountAmount)).append("\n");
    sb.append("    maxDiscount: ").append(toIndentedString(maxDiscount)).append("\n");
    sb.append("    lumpDiscountAmount: ").append(toIndentedString(lumpDiscountAmount)).append("\n");
    sb.append("    voucherValidPeriodDays: ").append(toIndentedString(voucherValidPeriodDays)).append("\n");
    sb.append("    includeDeliveryFee: ").append(toIndentedString(includeDeliveryFee)).append("\n");
    sb.append("    autoApplyResultingVouchers: ").append(toIndentedString(autoApplyResultingVouchers)).append("\n");
    sb.append("    includeExistingOrders: ").append(toIndentedString(includeExistingOrders)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    storeIds: ").append(toIndentedString(storeIds)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    forceDiscount: ").append(toIndentedString(forceDiscount)).append("\n");
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

