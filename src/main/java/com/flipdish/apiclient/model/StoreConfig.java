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

/**
 * StoreConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-09-19T09:39:05.515Z")
public class StoreConfig {
  @SerializedName("PickupEnabled")
  private Boolean pickupEnabled = null;

  @SerializedName("BankAccountAttached")
  private Boolean bankAccountAttached = null;

  @SerializedName("MenuAssigned")
  private Boolean menuAssigned = null;

  @SerializedName("HasFullAddress")
  private Boolean hasFullAddress = null;

  @SerializedName("PickupHours")
  private Boolean pickupHours = null;

  @SerializedName("IsPublished")
  private Boolean isPublished = null;

  public StoreConfig pickupEnabled(Boolean pickupEnabled) {
    this.pickupEnabled = pickupEnabled;
    return this;
  }

   /**
   * True if the store accepts pickup orders
   * @return pickupEnabled
  **/
  @ApiModelProperty(value = "True if the store accepts pickup orders")
  public Boolean isPickupEnabled() {
    return pickupEnabled;
  }

  public void setPickupEnabled(Boolean pickupEnabled) {
    this.pickupEnabled = pickupEnabled;
  }

  public StoreConfig bankAccountAttached(Boolean bankAccountAttached) {
    this.bankAccountAttached = bankAccountAttached;
    return this;
  }

   /**
   * True if the store has a Bank Account attached
   * @return bankAccountAttached
  **/
  @ApiModelProperty(value = "True if the store has a Bank Account attached")
  public Boolean isBankAccountAttached() {
    return bankAccountAttached;
  }

  public void setBankAccountAttached(Boolean bankAccountAttached) {
    this.bankAccountAttached = bankAccountAttached;
  }

  public StoreConfig menuAssigned(Boolean menuAssigned) {
    this.menuAssigned = menuAssigned;
    return this;
  }

   /**
   * True if the store is assigned to a Menu
   * @return menuAssigned
  **/
  @ApiModelProperty(value = "True if the store is assigned to a Menu")
  public Boolean isMenuAssigned() {
    return menuAssigned;
  }

  public void setMenuAssigned(Boolean menuAssigned) {
    this.menuAssigned = menuAssigned;
  }

  public StoreConfig hasFullAddress(Boolean hasFullAddress) {
    this.hasFullAddress = hasFullAddress;
    return this;
  }

   /**
   * True if the store has a valid Address
   * @return hasFullAddress
  **/
  @ApiModelProperty(value = "True if the store has a valid Address")
  public Boolean isHasFullAddress() {
    return hasFullAddress;
  }

  public void setHasFullAddress(Boolean hasFullAddress) {
    this.hasFullAddress = hasFullAddress;
  }

  public StoreConfig pickupHours(Boolean pickupHours) {
    this.pickupHours = pickupHours;
    return this;
  }

   /**
   * True if the store has Pickup hours
   * @return pickupHours
  **/
  @ApiModelProperty(value = "True if the store has Pickup hours")
  public Boolean isPickupHours() {
    return pickupHours;
  }

  public void setPickupHours(Boolean pickupHours) {
    this.pickupHours = pickupHours;
  }

  public StoreConfig isPublished(Boolean isPublished) {
    this.isPublished = isPublished;
    return this;
  }

   /**
   * Is the Store Published
   * @return isPublished
  **/
  @ApiModelProperty(value = "Is the Store Published")
  public Boolean isIsPublished() {
    return isPublished;
  }

  public void setIsPublished(Boolean isPublished) {
    this.isPublished = isPublished;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreConfig storeConfig = (StoreConfig) o;
    return Objects.equals(this.pickupEnabled, storeConfig.pickupEnabled) &&
        Objects.equals(this.bankAccountAttached, storeConfig.bankAccountAttached) &&
        Objects.equals(this.menuAssigned, storeConfig.menuAssigned) &&
        Objects.equals(this.hasFullAddress, storeConfig.hasFullAddress) &&
        Objects.equals(this.pickupHours, storeConfig.pickupHours) &&
        Objects.equals(this.isPublished, storeConfig.isPublished);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pickupEnabled, bankAccountAttached, menuAssigned, hasFullAddress, pickupHours, isPublished);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreConfig {\n");
    
    sb.append("    pickupEnabled: ").append(toIndentedString(pickupEnabled)).append("\n");
    sb.append("    bankAccountAttached: ").append(toIndentedString(bankAccountAttached)).append("\n");
    sb.append("    menuAssigned: ").append(toIndentedString(menuAssigned)).append("\n");
    sb.append("    hasFullAddress: ").append(toIndentedString(hasFullAddress)).append("\n");
    sb.append("    pickupHours: ").append(toIndentedString(pickupHours)).append("\n");
    sb.append("    isPublished: ").append(toIndentedString(isPublished)).append("\n");
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

