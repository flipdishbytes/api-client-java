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
import com.flipdish.apiclient.model.AddItemDetails;
import com.flipdish.apiclient.model.CreditNoteDetails;
import com.flipdish.apiclient.model.LumpDiscountDetails;
import com.flipdish.apiclient.model.PercentDiscountDetails;
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
import org.threeten.bp.OffsetDateTime;

/**
 * Voucher
 */
@ApiModel(description = "Voucher")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-11-30T15:36:43.474Z")
public class CreateVoucher {
  /**
   * Voucher Type
   */
  @JsonAdapter(VoucherTypeEnum.Adapter.class)
  public enum VoucherTypeEnum {
    PERCENTAGEDISCOUNT("PercentageDiscount"),
    
    LUMPDISCOUNT("LumpDiscount"),
    
    ADDITEM("AddItem"),
    
    CREDITNOTE("CreditNote");

    private String value;

    VoucherTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VoucherTypeEnum fromValue(String text) {
      for (VoucherTypeEnum b : VoucherTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VoucherTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VoucherTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VoucherTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VoucherTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("VoucherType")
  private VoucherTypeEnum voucherType = null;

  @SerializedName("AddItemDetails")
  private AddItemDetails addItemDetails = null;

  @SerializedName("CreditNoteDetails")
  private CreditNoteDetails creditNoteDetails = null;

  @SerializedName("LumpDiscountDetails")
  private LumpDiscountDetails lumpDiscountDetails = null;

  @SerializedName("PercentDiscountDetails")
  private PercentDiscountDetails percentDiscountDetails = null;

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

  public CreateVoucher voucherType(VoucherTypeEnum voucherType) {
    this.voucherType = voucherType;
    return this;
  }

   /**
   * Voucher Type
   * @return voucherType
  **/
  @ApiModelProperty(value = "Voucher Type")
  public VoucherTypeEnum getVoucherType() {
    return voucherType;
  }

  public void setVoucherType(VoucherTypeEnum voucherType) {
    this.voucherType = voucherType;
  }

  public CreateVoucher addItemDetails(AddItemDetails addItemDetails) {
    this.addItemDetails = addItemDetails;
    return this;
  }

   /**
   * Add item details
   * @return addItemDetails
  **/
  @ApiModelProperty(value = "Add item details")
  public AddItemDetails getAddItemDetails() {
    return addItemDetails;
  }

  public void setAddItemDetails(AddItemDetails addItemDetails) {
    this.addItemDetails = addItemDetails;
  }

  public CreateVoucher creditNoteDetails(CreditNoteDetails creditNoteDetails) {
    this.creditNoteDetails = creditNoteDetails;
    return this;
  }

   /**
   * Credit note details
   * @return creditNoteDetails
  **/
  @ApiModelProperty(value = "Credit note details")
  public CreditNoteDetails getCreditNoteDetails() {
    return creditNoteDetails;
  }

  public void setCreditNoteDetails(CreditNoteDetails creditNoteDetails) {
    this.creditNoteDetails = creditNoteDetails;
  }

  public CreateVoucher lumpDiscountDetails(LumpDiscountDetails lumpDiscountDetails) {
    this.lumpDiscountDetails = lumpDiscountDetails;
    return this;
  }

   /**
   * Lump discount details
   * @return lumpDiscountDetails
  **/
  @ApiModelProperty(value = "Lump discount details")
  public LumpDiscountDetails getLumpDiscountDetails() {
    return lumpDiscountDetails;
  }

  public void setLumpDiscountDetails(LumpDiscountDetails lumpDiscountDetails) {
    this.lumpDiscountDetails = lumpDiscountDetails;
  }

  public CreateVoucher percentDiscountDetails(PercentDiscountDetails percentDiscountDetails) {
    this.percentDiscountDetails = percentDiscountDetails;
    return this;
  }

   /**
   * Percent discount details
   * @return percentDiscountDetails
  **/
  @ApiModelProperty(value = "Percent discount details")
  public PercentDiscountDetails getPercentDiscountDetails() {
    return percentDiscountDetails;
  }

  public void setPercentDiscountDetails(PercentDiscountDetails percentDiscountDetails) {
    this.percentDiscountDetails = percentDiscountDetails;
  }

  public CreateVoucher code(String code) {
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

  public CreateVoucher description(String description) {
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

  public CreateVoucher stores(List<Integer> stores) {
    this.stores = stores;
    return this;
  }

  public CreateVoucher addStoresItem(Integer storesItem) {
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

  public CreateVoucher validOnOrdersOver(Double validOnOrdersOver) {
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

  public CreateVoucher takesPriority(Boolean takesPriority) {
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

  public CreateVoucher isEnabled(Boolean isEnabled) {
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

  public CreateVoucher isAutomaticallyApplied(Boolean isAutomaticallyApplied) {
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

  public CreateVoucher includeDeliveryFee(Boolean includeDeliveryFee) {
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

  public CreateVoucher isValidForDeliveryOrders(Boolean isValidForDeliveryOrders) {
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

  public CreateVoucher isValidForPickupOrders(Boolean isValidForPickupOrders) {
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

  public CreateVoucher isValidForOrdersPayedOnline(Boolean isValidForOrdersPayedOnline) {
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

  public CreateVoucher isValidForOrdersPayedByCash(Boolean isValidForOrdersPayedByCash) {
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

  public CreateVoucher isValidForFirstOrderOnly(Boolean isValidForFirstOrderOnly) {
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

  public CreateVoucher isValidOncePerCustomer(Boolean isValidOncePerCustomer) {
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

  public CreateVoucher isValidOnlyOnce(Boolean isValidOnlyOnce) {
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

  public CreateVoucher startDate(OffsetDateTime startDate) {
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

  public CreateVoucher expiryDate(OffsetDateTime expiryDate) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVoucher createVoucher = (CreateVoucher) o;
    return Objects.equals(this.voucherType, createVoucher.voucherType) &&
        Objects.equals(this.addItemDetails, createVoucher.addItemDetails) &&
        Objects.equals(this.creditNoteDetails, createVoucher.creditNoteDetails) &&
        Objects.equals(this.lumpDiscountDetails, createVoucher.lumpDiscountDetails) &&
        Objects.equals(this.percentDiscountDetails, createVoucher.percentDiscountDetails) &&
        Objects.equals(this.code, createVoucher.code) &&
        Objects.equals(this.description, createVoucher.description) &&
        Objects.equals(this.stores, createVoucher.stores) &&
        Objects.equals(this.validOnOrdersOver, createVoucher.validOnOrdersOver) &&
        Objects.equals(this.takesPriority, createVoucher.takesPriority) &&
        Objects.equals(this.isEnabled, createVoucher.isEnabled) &&
        Objects.equals(this.isAutomaticallyApplied, createVoucher.isAutomaticallyApplied) &&
        Objects.equals(this.includeDeliveryFee, createVoucher.includeDeliveryFee) &&
        Objects.equals(this.isValidForDeliveryOrders, createVoucher.isValidForDeliveryOrders) &&
        Objects.equals(this.isValidForPickupOrders, createVoucher.isValidForPickupOrders) &&
        Objects.equals(this.isValidForOrdersPayedOnline, createVoucher.isValidForOrdersPayedOnline) &&
        Objects.equals(this.isValidForOrdersPayedByCash, createVoucher.isValidForOrdersPayedByCash) &&
        Objects.equals(this.isValidForFirstOrderOnly, createVoucher.isValidForFirstOrderOnly) &&
        Objects.equals(this.isValidOncePerCustomer, createVoucher.isValidOncePerCustomer) &&
        Objects.equals(this.isValidOnlyOnce, createVoucher.isValidOnlyOnce) &&
        Objects.equals(this.startDate, createVoucher.startDate) &&
        Objects.equals(this.expiryDate, createVoucher.expiryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voucherType, addItemDetails, creditNoteDetails, lumpDiscountDetails, percentDiscountDetails, code, description, stores, validOnOrdersOver, takesPriority, isEnabled, isAutomaticallyApplied, includeDeliveryFee, isValidForDeliveryOrders, isValidForPickupOrders, isValidForOrdersPayedOnline, isValidForOrdersPayedByCash, isValidForFirstOrderOnly, isValidOncePerCustomer, isValidOnlyOnce, startDate, expiryDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVoucher {\n");
    
    sb.append("    voucherType: ").append(toIndentedString(voucherType)).append("\n");
    sb.append("    addItemDetails: ").append(toIndentedString(addItemDetails)).append("\n");
    sb.append("    creditNoteDetails: ").append(toIndentedString(creditNoteDetails)).append("\n");
    sb.append("    lumpDiscountDetails: ").append(toIndentedString(lumpDiscountDetails)).append("\n");
    sb.append("    percentDiscountDetails: ").append(toIndentedString(percentDiscountDetails)).append("\n");
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

