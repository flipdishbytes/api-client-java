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
import java.util.UUID;

/**
 * Loyalty campaign
 */
@ApiModel(description = "Loyalty campaign")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-11T11:43:34.227Z")
public class LoyaltyCampaign {
  @SerializedName("CampaignId")
  private Integer campaignId = null;

  @SerializedName("Statistics")
  private CampaignStatistics statistics = null;

  @SerializedName("Stores")
  private List<StoreCampaignStartTime> stores = null;

  @SerializedName("PublicId")
  private UUID publicId = null;

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

  public LoyaltyCampaign campaignId(Integer campaignId) {
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

  public LoyaltyCampaign statistics(CampaignStatistics statistics) {
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

  public LoyaltyCampaign stores(List<StoreCampaignStartTime> stores) {
    this.stores = stores;
    return this;
  }

  public LoyaltyCampaign addStoresItem(StoreCampaignStartTime storesItem) {
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

  public LoyaltyCampaign publicId(UUID publicId) {
    this.publicId = publicId;
    return this;
  }

   /**
   * Permanent reference to the item.
   * @return publicId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "Permanent reference to the item.")
  public UUID getPublicId() {
    return publicId;
  }

  public void setPublicId(UUID publicId) {
    this.publicId = publicId;
  }

  public LoyaltyCampaign ordersBeforeReceivingVoucher(Integer ordersBeforeReceivingVoucher) {
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

  public LoyaltyCampaign percentDiscountAmount(Integer percentDiscountAmount) {
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

  public LoyaltyCampaign roundingStrategy(Integer roundingStrategy) {
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

  public LoyaltyCampaign shouldIncludeOrdersWithLoyaltyVoucher(Boolean shouldIncludeOrdersWithLoyaltyVoucher) {
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

  public LoyaltyCampaign voucherValidPeriodDays(Integer voucherValidPeriodDays) {
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

  public LoyaltyCampaign includeDeliveryFee(Boolean includeDeliveryFee) {
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

  public LoyaltyCampaign autoApplyResultingVouchers(Boolean autoApplyResultingVouchers) {
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

  public LoyaltyCampaign includeExistingOrders(Boolean includeExistingOrders) {
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

  public LoyaltyCampaign isEnabled(Boolean isEnabled) {
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

  public LoyaltyCampaign storeIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
    return this;
  }

  public LoyaltyCampaign addStoreIdsItem(Integer storeIdsItem) {
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
    LoyaltyCampaign loyaltyCampaign = (LoyaltyCampaign) o;
    return Objects.equals(this.campaignId, loyaltyCampaign.campaignId) &&
        Objects.equals(this.statistics, loyaltyCampaign.statistics) &&
        Objects.equals(this.stores, loyaltyCampaign.stores) &&
        Objects.equals(this.publicId, loyaltyCampaign.publicId) &&
        Objects.equals(this.ordersBeforeReceivingVoucher, loyaltyCampaign.ordersBeforeReceivingVoucher) &&
        Objects.equals(this.percentDiscountAmount, loyaltyCampaign.percentDiscountAmount) &&
        Objects.equals(this.roundingStrategy, loyaltyCampaign.roundingStrategy) &&
        Objects.equals(this.shouldIncludeOrdersWithLoyaltyVoucher, loyaltyCampaign.shouldIncludeOrdersWithLoyaltyVoucher) &&
        Objects.equals(this.voucherValidPeriodDays, loyaltyCampaign.voucherValidPeriodDays) &&
        Objects.equals(this.includeDeliveryFee, loyaltyCampaign.includeDeliveryFee) &&
        Objects.equals(this.autoApplyResultingVouchers, loyaltyCampaign.autoApplyResultingVouchers) &&
        Objects.equals(this.includeExistingOrders, loyaltyCampaign.includeExistingOrders) &&
        Objects.equals(this.isEnabled, loyaltyCampaign.isEnabled) &&
        Objects.equals(this.storeIds, loyaltyCampaign.storeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, statistics, stores, publicId, ordersBeforeReceivingVoucher, percentDiscountAmount, roundingStrategy, shouldIncludeOrdersWithLoyaltyVoucher, voucherValidPeriodDays, includeDeliveryFee, autoApplyResultingVouchers, includeExistingOrders, isEnabled, storeIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyCampaign {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    stores: ").append(toIndentedString(stores)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
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

