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
import com.flipdish.apiclient.model.CampaignStatistics;
import com.flipdish.apiclient.model.StoreCampaignStartTime;
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
 * Retention campaign
 */
@ApiModel(description = "Retention campaign")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-10-31T15:42:54.077Z")
public class RetentionCampaign {
  @SerializedName("CampaignId")
  private Integer campaignId = null;

  @SerializedName("Statistics")
  private CampaignStatistics statistics = null;

  @SerializedName("Stores")
  private List<StoreCampaignStartTime> stores = null;

  @SerializedName("NotifyCustomerAfterMinutes")
  private Integer notifyCustomerAfterMinutes = null;

  @SerializedName("PercentDiscountAmount")
  private Integer percentDiscountAmount = null;

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

  public RetentionCampaign campaignId(Integer campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Id of campaign
   * @return campaignId
  **/
  @ApiModelProperty(value = "Id of campaign")
  public Integer getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Integer campaignId) {
    this.campaignId = campaignId;
  }

  public RetentionCampaign statistics(CampaignStatistics statistics) {
    this.statistics = statistics;
    return this;
  }

   /**
   * Statistics of campaign
   * @return statistics
  **/
  @ApiModelProperty(value = "Statistics of campaign")
  public CampaignStatistics getStatistics() {
    return statistics;
  }

  public void setStatistics(CampaignStatistics statistics) {
    this.statistics = statistics;
  }

  public RetentionCampaign stores(List<StoreCampaignStartTime> stores) {
    this.stores = stores;
    return this;
  }

  public RetentionCampaign addStoresItem(StoreCampaignStartTime storesItem) {
    if (this.stores == null) {
      this.stores = new ArrayList<StoreCampaignStartTime>();
    }
    this.stores.add(storesItem);
    return this;
  }

   /**
   * Stores this campaign applies to with campaign start time in Utc
   * @return stores
  **/
  @ApiModelProperty(value = "Stores this campaign applies to with campaign start time in Utc")
  public List<StoreCampaignStartTime> getStores() {
    return stores;
  }

  public void setStores(List<StoreCampaignStartTime> stores) {
    this.stores = stores;
  }

  public RetentionCampaign notifyCustomerAfterMinutes(Integer notifyCustomerAfterMinutes) {
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

  public RetentionCampaign percentDiscountAmount(Integer percentDiscountAmount) {
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

  public RetentionCampaign lumpDiscountAmount(Double lumpDiscountAmount) {
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

  public RetentionCampaign voucherValidPeriodDays(Integer voucherValidPeriodDays) {
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

  public RetentionCampaign includeDeliveryFee(Boolean includeDeliveryFee) {
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

  public RetentionCampaign autoApplyResultingVouchers(Boolean autoApplyResultingVouchers) {
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

  public RetentionCampaign includeExistingOrders(Boolean includeExistingOrders) {
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

  public RetentionCampaign isEnabled(Boolean isEnabled) {
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

  public RetentionCampaign storeIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
    return this;
  }

  public RetentionCampaign addStoreIdsItem(Integer storeIdsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionCampaign retentionCampaign = (RetentionCampaign) o;
    return Objects.equals(this.campaignId, retentionCampaign.campaignId) &&
        Objects.equals(this.statistics, retentionCampaign.statistics) &&
        Objects.equals(this.stores, retentionCampaign.stores) &&
        Objects.equals(this.notifyCustomerAfterMinutes, retentionCampaign.notifyCustomerAfterMinutes) &&
        Objects.equals(this.percentDiscountAmount, retentionCampaign.percentDiscountAmount) &&
        Objects.equals(this.lumpDiscountAmount, retentionCampaign.lumpDiscountAmount) &&
        Objects.equals(this.voucherValidPeriodDays, retentionCampaign.voucherValidPeriodDays) &&
        Objects.equals(this.includeDeliveryFee, retentionCampaign.includeDeliveryFee) &&
        Objects.equals(this.autoApplyResultingVouchers, retentionCampaign.autoApplyResultingVouchers) &&
        Objects.equals(this.includeExistingOrders, retentionCampaign.includeExistingOrders) &&
        Objects.equals(this.isEnabled, retentionCampaign.isEnabled) &&
        Objects.equals(this.storeIds, retentionCampaign.storeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, statistics, stores, notifyCustomerAfterMinutes, percentDiscountAmount, lumpDiscountAmount, voucherValidPeriodDays, includeDeliveryFee, autoApplyResultingVouchers, includeExistingOrders, isEnabled, storeIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionCampaign {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    stores: ").append(toIndentedString(stores)).append("\n");
    sb.append("    notifyCustomerAfterMinutes: ").append(toIndentedString(notifyCustomerAfterMinutes)).append("\n");
    sb.append("    percentDiscountAmount: ").append(toIndentedString(percentDiscountAmount)).append("\n");
    sb.append("    lumpDiscountAmount: ").append(toIndentedString(lumpDiscountAmount)).append("\n");
    sb.append("    voucherValidPeriodDays: ").append(toIndentedString(voucherValidPeriodDays)).append("\n");
    sb.append("    includeDeliveryFee: ").append(toIndentedString(includeDeliveryFee)).append("\n");
    sb.append("    autoApplyResultingVouchers: ").append(toIndentedString(autoApplyResultingVouchers)).append("\n");
    sb.append("    includeExistingOrders: ").append(toIndentedString(includeExistingOrders)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    storeIds: ").append(toIndentedString(storeIds)).append("\n");
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

