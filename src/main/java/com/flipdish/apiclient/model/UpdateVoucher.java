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
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Update Voucher
 */
@ApiModel(description = "Update Voucher")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:29:52.176Z")
public class UpdateVoucher {
  @SerializedName("PromotionId")
  private Integer promotionId = null;

  @SerializedName("PromotionName")
  private String promotionName = null;

  @SerializedName("PromotionAwardMenuItemPublicIds")
  private List<UUID> promotionAwardMenuItemPublicIds = null;

  @SerializedName("Code")
  private String code = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Stores")
  private List<Integer> stores = null;

  @SerializedName("ValidOnOrdersOver")
  private Double validOnOrdersOver = null;

  @SerializedName("TakesPriority")
  private Boolean takesPriority = null;

  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  @SerializedName("IsAutomaticallyApplied")
  private Boolean isAutomaticallyApplied = null;

  @SerializedName("IncludeDeliveryFee")
  private Boolean includeDeliveryFee = null;

  @SerializedName("IsValidForDeliveryOrders")
  private Boolean isValidForDeliveryOrders = null;

  @SerializedName("IsValidForPickupOrders")
  private Boolean isValidForPickupOrders = null;

  @SerializedName("IsValidForOrdersPayedOnline")
  private Boolean isValidForOrdersPayedOnline = null;

  @SerializedName("IsValidForOrdersPayedByCash")
  private Boolean isValidForOrdersPayedByCash = null;

  @SerializedName("IsValidForFirstOrderOnly")
  private Boolean isValidForFirstOrderOnly = null;

  @SerializedName("IsValidOncePerCustomer")
  private Boolean isValidOncePerCustomer = null;

  @SerializedName("IsValidOnlyOnce")
  private Boolean isValidOnlyOnce = null;

  @SerializedName("StartDate")
  private OffsetDateTime startDate = null;

  @SerializedName("ExpiryDate")
  private OffsetDateTime expiryDate = null;

  /**
   * Gets or Sets channelRestrictions
   */
  @JsonAdapter(ChannelRestrictionsEnum.Adapter.class)
  public enum ChannelRestrictionsEnum {
    IOS("Ios"),
    
    ANDROID("Android"),
    
    WEB("Web"),
    
    KIOSK("Kiosk"),
    
    POS("Pos"),
    
    GOOGLE("Google");

    private String value;

    ChannelRestrictionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChannelRestrictionsEnum fromValue(String text) {
      for (ChannelRestrictionsEnum b : ChannelRestrictionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ChannelRestrictionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChannelRestrictionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChannelRestrictionsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ChannelRestrictionsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ChannelRestrictions")
  private List<ChannelRestrictionsEnum> channelRestrictions = null;

  public UpdateVoucher promotionId(Integer promotionId) {
    this.promotionId = promotionId;
    return this;
  }

   /**
   * Promotion ID to update
   * @return promotionId
  **/
  @ApiModelProperty(value = "Promotion ID to update")
  public Integer getPromotionId() {
    return promotionId;
  }

  public void setPromotionId(Integer promotionId) {
    this.promotionId = promotionId;
  }

  public UpdateVoucher promotionName(String promotionName) {
    this.promotionName = promotionName;
    return this;
  }

   /**
   * The updated name of the promotion
   * @return promotionName
  **/
  @ApiModelProperty(value = "The updated name of the promotion")
  public String getPromotionName() {
    return promotionName;
  }

  public void setPromotionName(String promotionName) {
    this.promotionName = promotionName;
  }

  public UpdateVoucher promotionAwardMenuItemPublicIds(List<UUID> promotionAwardMenuItemPublicIds) {
    this.promotionAwardMenuItemPublicIds = promotionAwardMenuItemPublicIds;
    return this;
  }

  public UpdateVoucher addPromotionAwardMenuItemPublicIdsItem(UUID promotionAwardMenuItemPublicIdsItem) {
    if (this.promotionAwardMenuItemPublicIds == null) {
      this.promotionAwardMenuItemPublicIds = new ArrayList<UUID>();
    }
    this.promotionAwardMenuItemPublicIds.add(promotionAwardMenuItemPublicIdsItem);
    return this;
  }

   /**
   * The updated menu items that the promotion awards
   * @return promotionAwardMenuItemPublicIds
  **/
  @ApiModelProperty(value = "The updated menu items that the promotion awards")
  public List<UUID> getPromotionAwardMenuItemPublicIds() {
    return promotionAwardMenuItemPublicIds;
  }

  public void setPromotionAwardMenuItemPublicIds(List<UUID> promotionAwardMenuItemPublicIds) {
    this.promotionAwardMenuItemPublicIds = promotionAwardMenuItemPublicIds;
  }

  public UpdateVoucher code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Voucher Code
   * @return code
  **/
  @ApiModelProperty(value = "Voucher Code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public UpdateVoucher description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Voucher Description (Visible on printout)
   * @return description
  **/
  @ApiModelProperty(value = "Voucher Description (Visible on printout)")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdateVoucher stores(List<Integer> stores) {
    this.stores = stores;
    return this;
  }

  public UpdateVoucher addStoresItem(Integer storesItem) {
    if (this.stores == null) {
      this.stores = new ArrayList<Integer>();
    }
    this.stores.add(storesItem);
    return this;
  }

   /**
   * Stores that this voucher applies to
   * @return stores
  **/
  @ApiModelProperty(value = "Stores that this voucher applies to")
  public List<Integer> getStores() {
    return stores;
  }

  public void setStores(List<Integer> stores) {
    this.stores = stores;
  }

  public UpdateVoucher validOnOrdersOver(Double validOnOrdersOver) {
    this.validOnOrdersOver = validOnOrdersOver;
    return this;
  }

   /**
   * Valid on orders on or above
   * @return validOnOrdersOver
  **/
  @ApiModelProperty(value = "Valid on orders on or above")
  public Double getValidOnOrdersOver() {
    return validOnOrdersOver;
  }

  public void setValidOnOrdersOver(Double validOnOrdersOver) {
    this.validOnOrdersOver = validOnOrdersOver;
  }

  public UpdateVoucher takesPriority(Boolean takesPriority) {
    this.takesPriority = takesPriority;
    return this;
  }

   /**
   * Takes priority
   * @return takesPriority
  **/
  @ApiModelProperty(value = "Takes priority")
  public Boolean isTakesPriority() {
    return takesPriority;
  }

  public void setTakesPriority(Boolean takesPriority) {
    this.takesPriority = takesPriority;
  }

  public UpdateVoucher isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Is voucher enabled
   * @return isEnabled
  **/
  @ApiModelProperty(value = "Is voucher enabled")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public UpdateVoucher isAutomaticallyApplied(Boolean isAutomaticallyApplied) {
    this.isAutomaticallyApplied = isAutomaticallyApplied;
    return this;
  }

   /**
   * Is voucher automatically applied
   * @return isAutomaticallyApplied
  **/
  @ApiModelProperty(value = "Is voucher automatically applied")
  public Boolean isIsAutomaticallyApplied() {
    return isAutomaticallyApplied;
  }

  public void setIsAutomaticallyApplied(Boolean isAutomaticallyApplied) {
    this.isAutomaticallyApplied = isAutomaticallyApplied;
  }

  public UpdateVoucher includeDeliveryFee(Boolean includeDeliveryFee) {
    this.includeDeliveryFee = includeDeliveryFee;
    return this;
  }

   /**
   * Include delivery fees
   * @return includeDeliveryFee
  **/
  @ApiModelProperty(value = "Include delivery fees")
  public Boolean isIncludeDeliveryFee() {
    return includeDeliveryFee;
  }

  public void setIncludeDeliveryFee(Boolean includeDeliveryFee) {
    this.includeDeliveryFee = includeDeliveryFee;
  }

  public UpdateVoucher isValidForDeliveryOrders(Boolean isValidForDeliveryOrders) {
    this.isValidForDeliveryOrders = isValidForDeliveryOrders;
    return this;
  }

   /**
   * Valid for delivery orders
   * @return isValidForDeliveryOrders
  **/
  @ApiModelProperty(value = "Valid for delivery orders")
  public Boolean isIsValidForDeliveryOrders() {
    return isValidForDeliveryOrders;
  }

  public void setIsValidForDeliveryOrders(Boolean isValidForDeliveryOrders) {
    this.isValidForDeliveryOrders = isValidForDeliveryOrders;
  }

  public UpdateVoucher isValidForPickupOrders(Boolean isValidForPickupOrders) {
    this.isValidForPickupOrders = isValidForPickupOrders;
    return this;
  }

   /**
   * Valid for pickup orders
   * @return isValidForPickupOrders
  **/
  @ApiModelProperty(value = "Valid for pickup orders")
  public Boolean isIsValidForPickupOrders() {
    return isValidForPickupOrders;
  }

  public void setIsValidForPickupOrders(Boolean isValidForPickupOrders) {
    this.isValidForPickupOrders = isValidForPickupOrders;
  }

  public UpdateVoucher isValidForOrdersPayedOnline(Boolean isValidForOrdersPayedOnline) {
    this.isValidForOrdersPayedOnline = isValidForOrdersPayedOnline;
    return this;
  }

   /**
   * Valid for orders payed online
   * @return isValidForOrdersPayedOnline
  **/
  @ApiModelProperty(value = "Valid for orders payed online")
  public Boolean isIsValidForOrdersPayedOnline() {
    return isValidForOrdersPayedOnline;
  }

  public void setIsValidForOrdersPayedOnline(Boolean isValidForOrdersPayedOnline) {
    this.isValidForOrdersPayedOnline = isValidForOrdersPayedOnline;
  }

  public UpdateVoucher isValidForOrdersPayedByCash(Boolean isValidForOrdersPayedByCash) {
    this.isValidForOrdersPayedByCash = isValidForOrdersPayedByCash;
    return this;
  }

   /**
   * Valid for orders payed in cash
   * @return isValidForOrdersPayedByCash
  **/
  @ApiModelProperty(value = "Valid for orders payed in cash")
  public Boolean isIsValidForOrdersPayedByCash() {
    return isValidForOrdersPayedByCash;
  }

  public void setIsValidForOrdersPayedByCash(Boolean isValidForOrdersPayedByCash) {
    this.isValidForOrdersPayedByCash = isValidForOrdersPayedByCash;
  }

  public UpdateVoucher isValidForFirstOrderOnly(Boolean isValidForFirstOrderOnly) {
    this.isValidForFirstOrderOnly = isValidForFirstOrderOnly;
    return this;
  }

   /**
   * Valid only on the first order by the customer
   * @return isValidForFirstOrderOnly
  **/
  @ApiModelProperty(value = "Valid only on the first order by the customer")
  public Boolean isIsValidForFirstOrderOnly() {
    return isValidForFirstOrderOnly;
  }

  public void setIsValidForFirstOrderOnly(Boolean isValidForFirstOrderOnly) {
    this.isValidForFirstOrderOnly = isValidForFirstOrderOnly;
  }

  public UpdateVoucher isValidOncePerCustomer(Boolean isValidOncePerCustomer) {
    this.isValidOncePerCustomer = isValidOncePerCustomer;
    return this;
  }

   /**
   * Valid once per customer
   * @return isValidOncePerCustomer
  **/
  @ApiModelProperty(value = "Valid once per customer")
  public Boolean isIsValidOncePerCustomer() {
    return isValidOncePerCustomer;
  }

  public void setIsValidOncePerCustomer(Boolean isValidOncePerCustomer) {
    this.isValidOncePerCustomer = isValidOncePerCustomer;
  }

  public UpdateVoucher isValidOnlyOnce(Boolean isValidOnlyOnce) {
    this.isValidOnlyOnce = isValidOnlyOnce;
    return this;
  }

   /**
   * Valid only once, by any customer (once used cannot be used again by any other customer)
   * @return isValidOnlyOnce
  **/
  @ApiModelProperty(value = "Valid only once, by any customer (once used cannot be used again by any other customer)")
  public Boolean isIsValidOnlyOnce() {
    return isValidOnlyOnce;
  }

  public void setIsValidOnlyOnce(Boolean isValidOnlyOnce) {
    this.isValidOnlyOnce = isValidOnlyOnce;
  }

  public UpdateVoucher startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Voucher Starts On (Time in UTC)
   * @return startDate
  **/
  @ApiModelProperty(value = "Voucher Starts On (Time in UTC)")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public UpdateVoucher expiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Voucher Expires On (Time in UTC)
   * @return expiryDate
  **/
  @ApiModelProperty(value = "Voucher Expires On (Time in UTC)")
  public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }

  public UpdateVoucher channelRestrictions(List<ChannelRestrictionsEnum> channelRestrictions) {
    this.channelRestrictions = channelRestrictions;
    return this;
  }

  public UpdateVoucher addChannelRestrictionsItem(ChannelRestrictionsEnum channelRestrictionsItem) {
    if (this.channelRestrictions == null) {
      this.channelRestrictions = new ArrayList<ChannelRestrictionsEnum>();
    }
    this.channelRestrictions.add(channelRestrictionsItem);
    return this;
  }

   /**
   * Limit the channels this voucher can be used on
   * @return channelRestrictions
  **/
  @ApiModelProperty(value = "Limit the channels this voucher can be used on")
  public List<ChannelRestrictionsEnum> getChannelRestrictions() {
    return channelRestrictions;
  }

  public void setChannelRestrictions(List<ChannelRestrictionsEnum> channelRestrictions) {
    this.channelRestrictions = channelRestrictions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVoucher updateVoucher = (UpdateVoucher) o;
    return Objects.equals(this.promotionId, updateVoucher.promotionId) &&
        Objects.equals(this.promotionName, updateVoucher.promotionName) &&
        Objects.equals(this.promotionAwardMenuItemPublicIds, updateVoucher.promotionAwardMenuItemPublicIds) &&
        Objects.equals(this.code, updateVoucher.code) &&
        Objects.equals(this.description, updateVoucher.description) &&
        Objects.equals(this.stores, updateVoucher.stores) &&
        Objects.equals(this.validOnOrdersOver, updateVoucher.validOnOrdersOver) &&
        Objects.equals(this.takesPriority, updateVoucher.takesPriority) &&
        Objects.equals(this.isEnabled, updateVoucher.isEnabled) &&
        Objects.equals(this.isAutomaticallyApplied, updateVoucher.isAutomaticallyApplied) &&
        Objects.equals(this.includeDeliveryFee, updateVoucher.includeDeliveryFee) &&
        Objects.equals(this.isValidForDeliveryOrders, updateVoucher.isValidForDeliveryOrders) &&
        Objects.equals(this.isValidForPickupOrders, updateVoucher.isValidForPickupOrders) &&
        Objects.equals(this.isValidForOrdersPayedOnline, updateVoucher.isValidForOrdersPayedOnline) &&
        Objects.equals(this.isValidForOrdersPayedByCash, updateVoucher.isValidForOrdersPayedByCash) &&
        Objects.equals(this.isValidForFirstOrderOnly, updateVoucher.isValidForFirstOrderOnly) &&
        Objects.equals(this.isValidOncePerCustomer, updateVoucher.isValidOncePerCustomer) &&
        Objects.equals(this.isValidOnlyOnce, updateVoucher.isValidOnlyOnce) &&
        Objects.equals(this.startDate, updateVoucher.startDate) &&
        Objects.equals(this.expiryDate, updateVoucher.expiryDate) &&
        Objects.equals(this.channelRestrictions, updateVoucher.channelRestrictions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotionId, promotionName, promotionAwardMenuItemPublicIds, code, description, stores, validOnOrdersOver, takesPriority, isEnabled, isAutomaticallyApplied, includeDeliveryFee, isValidForDeliveryOrders, isValidForPickupOrders, isValidForOrdersPayedOnline, isValidForOrdersPayedByCash, isValidForFirstOrderOnly, isValidOncePerCustomer, isValidOnlyOnce, startDate, expiryDate, channelRestrictions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVoucher {\n");
    
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    promotionName: ").append(toIndentedString(promotionName)).append("\n");
    sb.append("    promotionAwardMenuItemPublicIds: ").append(toIndentedString(promotionAwardMenuItemPublicIds)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    stores: ").append(toIndentedString(stores)).append("\n");
    sb.append("    validOnOrdersOver: ").append(toIndentedString(validOnOrdersOver)).append("\n");
    sb.append("    takesPriority: ").append(toIndentedString(takesPriority)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isAutomaticallyApplied: ").append(toIndentedString(isAutomaticallyApplied)).append("\n");
    sb.append("    includeDeliveryFee: ").append(toIndentedString(includeDeliveryFee)).append("\n");
    sb.append("    isValidForDeliveryOrders: ").append(toIndentedString(isValidForDeliveryOrders)).append("\n");
    sb.append("    isValidForPickupOrders: ").append(toIndentedString(isValidForPickupOrders)).append("\n");
    sb.append("    isValidForOrdersPayedOnline: ").append(toIndentedString(isValidForOrdersPayedOnline)).append("\n");
    sb.append("    isValidForOrdersPayedByCash: ").append(toIndentedString(isValidForOrdersPayedByCash)).append("\n");
    sb.append("    isValidForFirstOrderOnly: ").append(toIndentedString(isValidForFirstOrderOnly)).append("\n");
    sb.append("    isValidOncePerCustomer: ").append(toIndentedString(isValidOncePerCustomer)).append("\n");
    sb.append("    isValidOnlyOnce: ").append(toIndentedString(isValidOnlyOnce)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    channelRestrictions: ").append(toIndentedString(channelRestrictions)).append("\n");
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

