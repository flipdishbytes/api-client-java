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
 * Store Kiosk Settings
 */
@ApiModel(description = "Store Kiosk Settings")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-21T10:47:00.453Z")
public class StoreKioskSettingModel {
  @SerializedName("KioskName")
  private String kioskName = null;

  @SerializedName("RequireCustomerName")
  private Boolean requireCustomerName = null;

  @SerializedName("RequireCustomerPhoneNumber")
  private Boolean requireCustomerPhoneNumber = null;

  @SerializedName("RequestTableNumber")
  private Boolean requestTableNumber = null;

  @SerializedName("OfferDineInOrTakeawayOptions")
  private Boolean offerDineInOrTakeawayOptions = null;

  @SerializedName("SortOrder")
  private Integer sortOrder = null;

  @SerializedName("ConfigId")
  private Integer configId = null;

  @SerializedName("StoreId")
  private Integer storeId = null;

  public StoreKioskSettingModel kioskName(String kioskName) {
    this.kioskName = kioskName;
    return this;
  }

   /**
   * Name of the Kiosk
   * @return kioskName
  **/
  @ApiModelProperty(value = "Name of the Kiosk")
  public String getKioskName() {
    return kioskName;
  }

  public void setKioskName(String kioskName) {
    this.kioskName = kioskName;
  }

  public StoreKioskSettingModel requireCustomerName(Boolean requireCustomerName) {
    this.requireCustomerName = requireCustomerName;
    return this;
  }

   /**
   * Require customer name flag
   * @return requireCustomerName
  **/
  @ApiModelProperty(value = "Require customer name flag")
  public Boolean isRequireCustomerName() {
    return requireCustomerName;
  }

  public void setRequireCustomerName(Boolean requireCustomerName) {
    this.requireCustomerName = requireCustomerName;
  }

  public StoreKioskSettingModel requireCustomerPhoneNumber(Boolean requireCustomerPhoneNumber) {
    this.requireCustomerPhoneNumber = requireCustomerPhoneNumber;
    return this;
  }

   /**
   * Require customer phone number flag
   * @return requireCustomerPhoneNumber
  **/
  @ApiModelProperty(value = "Require customer phone number flag")
  public Boolean isRequireCustomerPhoneNumber() {
    return requireCustomerPhoneNumber;
  }

  public void setRequireCustomerPhoneNumber(Boolean requireCustomerPhoneNumber) {
    this.requireCustomerPhoneNumber = requireCustomerPhoneNumber;
  }

  public StoreKioskSettingModel requestTableNumber(Boolean requestTableNumber) {
    this.requestTableNumber = requestTableNumber;
    return this;
  }

   /**
   * Request table number flag
   * @return requestTableNumber
  **/
  @ApiModelProperty(value = "Request table number flag")
  public Boolean isRequestTableNumber() {
    return requestTableNumber;
  }

  public void setRequestTableNumber(Boolean requestTableNumber) {
    this.requestTableNumber = requestTableNumber;
  }

  public StoreKioskSettingModel offerDineInOrTakeawayOptions(Boolean offerDineInOrTakeawayOptions) {
    this.offerDineInOrTakeawayOptions = offerDineInOrTakeawayOptions;
    return this;
  }

   /**
   * Offer Dine-In/Takeaway option flag
   * @return offerDineInOrTakeawayOptions
  **/
  @ApiModelProperty(value = "Offer Dine-In/Takeaway option flag")
  public Boolean isOfferDineInOrTakeawayOptions() {
    return offerDineInOrTakeawayOptions;
  }

  public void setOfferDineInOrTakeawayOptions(Boolean offerDineInOrTakeawayOptions) {
    this.offerDineInOrTakeawayOptions = offerDineInOrTakeawayOptions;
  }

  public StoreKioskSettingModel sortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Order in which the Kiosks should be listed
   * @return sortOrder
  **/
  @ApiModelProperty(value = "Order in which the Kiosks should be listed")
  public Integer getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  public StoreKioskSettingModel configId(Integer configId) {
    this.configId = configId;
    return this;
  }

   /**
   * Kiosk (Hydra) config id
   * @return configId
  **/
  @ApiModelProperty(value = "Kiosk (Hydra) config id")
  public Integer getConfigId() {
    return configId;
  }

  public void setConfigId(Integer configId) {
    this.configId = configId;
  }

  public StoreKioskSettingModel storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Id of the store (Physical Restaurant)
   * @return storeId
  **/
  @ApiModelProperty(value = "Id of the store (Physical Restaurant)")
  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreKioskSettingModel storeKioskSettingModel = (StoreKioskSettingModel) o;
    return Objects.equals(this.kioskName, storeKioskSettingModel.kioskName) &&
        Objects.equals(this.requireCustomerName, storeKioskSettingModel.requireCustomerName) &&
        Objects.equals(this.requireCustomerPhoneNumber, storeKioskSettingModel.requireCustomerPhoneNumber) &&
        Objects.equals(this.requestTableNumber, storeKioskSettingModel.requestTableNumber) &&
        Objects.equals(this.offerDineInOrTakeawayOptions, storeKioskSettingModel.offerDineInOrTakeawayOptions) &&
        Objects.equals(this.sortOrder, storeKioskSettingModel.sortOrder) &&
        Objects.equals(this.configId, storeKioskSettingModel.configId) &&
        Objects.equals(this.storeId, storeKioskSettingModel.storeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kioskName, requireCustomerName, requireCustomerPhoneNumber, requestTableNumber, offerDineInOrTakeawayOptions, sortOrder, configId, storeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreKioskSettingModel {\n");
    
    sb.append("    kioskName: ").append(toIndentedString(kioskName)).append("\n");
    sb.append("    requireCustomerName: ").append(toIndentedString(requireCustomerName)).append("\n");
    sb.append("    requireCustomerPhoneNumber: ").append(toIndentedString(requireCustomerPhoneNumber)).append("\n");
    sb.append("    requestTableNumber: ").append(toIndentedString(requestTableNumber)).append("\n");
    sb.append("    offerDineInOrTakeawayOptions: ").append(toIndentedString(offerDineInOrTakeawayOptions)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
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

