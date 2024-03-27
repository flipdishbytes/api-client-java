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
 * Defines a customer
 */
@ApiModel(description = "Defines a customer")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-27T13:36:47.136Z")
public class Customer {
  @SerializedName("CustomerId")
  private Integer customerId = null;

  @SerializedName("RegistrationDate")
  private OffsetDateTime registrationDate = null;

  @SerializedName("PhoneNumber")
  private String phoneNumber = null;

  @SerializedName("CashOrdersEnabled")
  private Boolean cashOrdersEnabled = null;

  @SerializedName("CardOrdersEnabled")
  private Boolean cardOrdersEnabled = null;

  @SerializedName("MarketingEnabled")
  private Boolean marketingEnabled = null;

  public Customer customerId(Integer customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Id of the customer
   * @return customerId
  **/
  @ApiModelProperty(value = "Id of the customer")
  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public Customer registrationDate(OffsetDateTime registrationDate) {
    this.registrationDate = registrationDate;
    return this;
  }

   /**
   * Customer registration date
   * @return registrationDate
  **/
  @ApiModelProperty(value = "Customer registration date")
  public OffsetDateTime getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(OffsetDateTime registrationDate) {
    this.registrationDate = registrationDate;
  }

  public Customer phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone Number in international format
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Phone Number in international format")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Customer cashOrdersEnabled(Boolean cashOrdersEnabled) {
    this.cashOrdersEnabled = cashOrdersEnabled;
    return this;
  }

   /**
   * Customer can place cash orders
   * @return cashOrdersEnabled
  **/
  @ApiModelProperty(value = "Customer can place cash orders")
  public Boolean isCashOrdersEnabled() {
    return cashOrdersEnabled;
  }

  public void setCashOrdersEnabled(Boolean cashOrdersEnabled) {
    this.cashOrdersEnabled = cashOrdersEnabled;
  }

  public Customer cardOrdersEnabled(Boolean cardOrdersEnabled) {
    this.cardOrdersEnabled = cardOrdersEnabled;
    return this;
  }

   /**
   * Customer can place card orders
   * @return cardOrdersEnabled
  **/
  @ApiModelProperty(value = "Customer can place card orders")
  public Boolean isCardOrdersEnabled() {
    return cardOrdersEnabled;
  }

  public void setCardOrdersEnabled(Boolean cardOrdersEnabled) {
    this.cardOrdersEnabled = cardOrdersEnabled;
  }

  public Customer marketingEnabled(Boolean marketingEnabled) {
    this.marketingEnabled = marketingEnabled;
    return this;
  }

   /**
   * Customer can receive marketing
   * @return marketingEnabled
  **/
  @ApiModelProperty(value = "Customer can receive marketing")
  public Boolean isMarketingEnabled() {
    return marketingEnabled;
  }

  public void setMarketingEnabled(Boolean marketingEnabled) {
    this.marketingEnabled = marketingEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.customerId, customer.customerId) &&
        Objects.equals(this.registrationDate, customer.registrationDate) &&
        Objects.equals(this.phoneNumber, customer.phoneNumber) &&
        Objects.equals(this.cashOrdersEnabled, customer.cashOrdersEnabled) &&
        Objects.equals(this.cardOrdersEnabled, customer.cardOrdersEnabled) &&
        Objects.equals(this.marketingEnabled, customer.marketingEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, registrationDate, phoneNumber, cashOrdersEnabled, cardOrdersEnabled, marketingEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    cashOrdersEnabled: ").append(toIndentedString(cashOrdersEnabled)).append("\n");
    sb.append("    cardOrdersEnabled: ").append(toIndentedString(cardOrdersEnabled)).append("\n");
    sb.append("    marketingEnabled: ").append(toIndentedString(marketingEnabled)).append("\n");
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

