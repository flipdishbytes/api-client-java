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
 * Voucher Base
 */
@ApiModel(description = "Voucher Base")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-06T12:39:46.243+01:00")
public class VoucherBase {
  @SerializedName("Code")
  private String code = null;

  @SerializedName("Description")
  private String description = null;

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

  public VoucherBase code(String code) {
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

  public VoucherBase description(String description) {
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

  public VoucherBase validOnOrdersOver(Double validOnOrdersOver) {
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

  public VoucherBase takesPriority(Boolean takesPriority) {
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

  public VoucherBase isEnabled(Boolean isEnabled) {
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

  public VoucherBase isAutomaticallyApplied(Boolean isAutomaticallyApplied) {
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

  public VoucherBase includeDeliveryFee(Boolean includeDeliveryFee) {
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

  public VoucherBase isValidForDeliveryOrders(Boolean isValidForDeliveryOrders) {
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

  public VoucherBase isValidForPickupOrders(Boolean isValidForPickupOrders) {
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

  public VoucherBase isValidForOrdersPayedOnline(Boolean isValidForOrdersPayedOnline) {
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

  public VoucherBase isValidForOrdersPayedByCash(Boolean isValidForOrdersPayedByCash) {
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

  public VoucherBase isValidForFirstOrderOnly(Boolean isValidForFirstOrderOnly) {
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

  public VoucherBase isValidOncePerCustomer(Boolean isValidOncePerCustomer) {
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

  public VoucherBase isValidOnlyOnce(Boolean isValidOnlyOnce) {
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

  public VoucherBase startDate(OffsetDateTime startDate) {
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

  public VoucherBase expiryDate(OffsetDateTime expiryDate) {
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
    VoucherBase voucherBase = (VoucherBase) o;
    return Objects.equals(this.code, voucherBase.code) &&
        Objects.equals(this.description, voucherBase.description) &&
        Objects.equals(this.validOnOrdersOver, voucherBase.validOnOrdersOver) &&
        Objects.equals(this.takesPriority, voucherBase.takesPriority) &&
        Objects.equals(this.isEnabled, voucherBase.isEnabled) &&
        Objects.equals(this.isAutomaticallyApplied, voucherBase.isAutomaticallyApplied) &&
        Objects.equals(this.includeDeliveryFee, voucherBase.includeDeliveryFee) &&
        Objects.equals(this.isValidForDeliveryOrders, voucherBase.isValidForDeliveryOrders) &&
        Objects.equals(this.isValidForPickupOrders, voucherBase.isValidForPickupOrders) &&
        Objects.equals(this.isValidForOrdersPayedOnline, voucherBase.isValidForOrdersPayedOnline) &&
        Objects.equals(this.isValidForOrdersPayedByCash, voucherBase.isValidForOrdersPayedByCash) &&
        Objects.equals(this.isValidForFirstOrderOnly, voucherBase.isValidForFirstOrderOnly) &&
        Objects.equals(this.isValidOncePerCustomer, voucherBase.isValidOncePerCustomer) &&
        Objects.equals(this.isValidOnlyOnce, voucherBase.isValidOnlyOnce) &&
        Objects.equals(this.startDate, voucherBase.startDate) &&
        Objects.equals(this.expiryDate, voucherBase.expiryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, validOnOrdersOver, takesPriority, isEnabled, isAutomaticallyApplied, includeDeliveryFee, isValidForDeliveryOrders, isValidForPickupOrders, isValidForOrdersPayedOnline, isValidForOrdersPayedByCash, isValidForFirstOrderOnly, isValidOncePerCustomer, isValidOnlyOnce, startDate, expiryDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherBase {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

