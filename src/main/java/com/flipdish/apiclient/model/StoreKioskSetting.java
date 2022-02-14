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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-14T11:12:33.159Z")
public class StoreKioskSetting {
  @SerializedName("KioskSettingId")
  private Integer kioskSettingId = null;

  @SerializedName("KioskName")
  private String kioskName = null;

  @SerializedName("RequireCustomerName")
  private Boolean requireCustomerName = null;

  @SerializedName("RequireCustomerPhoneNumber")
  private Boolean requireCustomerPhoneNumber = null;

  @SerializedName("RequestCustomerPhoneNumber")
  private Boolean requestCustomerPhoneNumber = null;

  @SerializedName("RequestTableNumber")
  private Boolean requestTableNumber = null;

  @SerializedName("OfferDineInOrTakeawayOption")
  private Boolean offerDineInOrTakeawayOption = null;

  @SerializedName("PhysicalRestaurantId")
  private Integer physicalRestaurantId = null;

  @SerializedName("HydraConfigId")
  private Integer hydraConfigId = null;

  public StoreKioskSetting kioskSettingId(Integer kioskSettingId) {
    this.kioskSettingId = kioskSettingId;
    return this;
  }

   /**
   * Kiosk setting id
   * @return kioskSettingId
  **/
  @ApiModelProperty(value = "Kiosk setting id")
  public Integer getKioskSettingId() {
    return kioskSettingId;
  }

  public void setKioskSettingId(Integer kioskSettingId) {
    this.kioskSettingId = kioskSettingId;
  }

  public StoreKioskSetting kioskName(String kioskName) {
    this.kioskName = kioskName;
    return this;
  }

   /**
   * Store kiosk name
   * @return kioskName
  **/
  @ApiModelProperty(value = "Store kiosk name")
  public String getKioskName() {
    return kioskName;
  }

  public void setKioskName(String kioskName) {
    this.kioskName = kioskName;
  }

  public StoreKioskSetting requireCustomerName(Boolean requireCustomerName) {
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

  public StoreKioskSetting requireCustomerPhoneNumber(Boolean requireCustomerPhoneNumber) {
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

  public StoreKioskSetting requestCustomerPhoneNumber(Boolean requestCustomerPhoneNumber) {
    this.requestCustomerPhoneNumber = requestCustomerPhoneNumber;
    return this;
  }

   /**
   * Request customer phone number flag (Option to Skip)
   * @return requestCustomerPhoneNumber
  **/
  @ApiModelProperty(value = "Request customer phone number flag (Option to Skip)")
  public Boolean isRequestCustomerPhoneNumber() {
    return requestCustomerPhoneNumber;
  }

  public void setRequestCustomerPhoneNumber(Boolean requestCustomerPhoneNumber) {
    this.requestCustomerPhoneNumber = requestCustomerPhoneNumber;
  }

  public StoreKioskSetting requestTableNumber(Boolean requestTableNumber) {
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

  public StoreKioskSetting offerDineInOrTakeawayOption(Boolean offerDineInOrTakeawayOption) {
    this.offerDineInOrTakeawayOption = offerDineInOrTakeawayOption;
    return this;
  }

   /**
   * Offer Dine-In/Takeaway option flag
   * @return offerDineInOrTakeawayOption
  **/
  @ApiModelProperty(value = "Offer Dine-In/Takeaway option flag")
  public Boolean isOfferDineInOrTakeawayOption() {
    return offerDineInOrTakeawayOption;
  }

  public void setOfferDineInOrTakeawayOption(Boolean offerDineInOrTakeawayOption) {
    this.offerDineInOrTakeawayOption = offerDineInOrTakeawayOption;
  }

  public StoreKioskSetting physicalRestaurantId(Integer physicalRestaurantId) {
    this.physicalRestaurantId = physicalRestaurantId;
    return this;
  }

   /**
   * Physical restaurant id
   * @return physicalRestaurantId
  **/
  @ApiModelProperty(value = "Physical restaurant id")
  public Integer getPhysicalRestaurantId() {
    return physicalRestaurantId;
  }

  public void setPhysicalRestaurantId(Integer physicalRestaurantId) {
    this.physicalRestaurantId = physicalRestaurantId;
  }

  public StoreKioskSetting hydraConfigId(Integer hydraConfigId) {
    this.hydraConfigId = hydraConfigId;
    return this;
  }

   /**
   * Hydra config id
   * @return hydraConfigId
  **/
  @ApiModelProperty(value = "Hydra config id")
  public Integer getHydraConfigId() {
    return hydraConfigId;
  }

  public void setHydraConfigId(Integer hydraConfigId) {
    this.hydraConfigId = hydraConfigId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreKioskSetting storeKioskSetting = (StoreKioskSetting) o;
    return Objects.equals(this.kioskSettingId, storeKioskSetting.kioskSettingId) &&
        Objects.equals(this.kioskName, storeKioskSetting.kioskName) &&
        Objects.equals(this.requireCustomerName, storeKioskSetting.requireCustomerName) &&
        Objects.equals(this.requireCustomerPhoneNumber, storeKioskSetting.requireCustomerPhoneNumber) &&
        Objects.equals(this.requestCustomerPhoneNumber, storeKioskSetting.requestCustomerPhoneNumber) &&
        Objects.equals(this.requestTableNumber, storeKioskSetting.requestTableNumber) &&
        Objects.equals(this.offerDineInOrTakeawayOption, storeKioskSetting.offerDineInOrTakeawayOption) &&
        Objects.equals(this.physicalRestaurantId, storeKioskSetting.physicalRestaurantId) &&
        Objects.equals(this.hydraConfigId, storeKioskSetting.hydraConfigId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kioskSettingId, kioskName, requireCustomerName, requireCustomerPhoneNumber, requestCustomerPhoneNumber, requestTableNumber, offerDineInOrTakeawayOption, physicalRestaurantId, hydraConfigId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreKioskSetting {\n");
    
    sb.append("    kioskSettingId: ").append(toIndentedString(kioskSettingId)).append("\n");
    sb.append("    kioskName: ").append(toIndentedString(kioskName)).append("\n");
    sb.append("    requireCustomerName: ").append(toIndentedString(requireCustomerName)).append("\n");
    sb.append("    requireCustomerPhoneNumber: ").append(toIndentedString(requireCustomerPhoneNumber)).append("\n");
    sb.append("    requestCustomerPhoneNumber: ").append(toIndentedString(requestCustomerPhoneNumber)).append("\n");
    sb.append("    requestTableNumber: ").append(toIndentedString(requestTableNumber)).append("\n");
    sb.append("    offerDineInOrTakeawayOption: ").append(toIndentedString(offerDineInOrTakeawayOption)).append("\n");
    sb.append("    physicalRestaurantId: ").append(toIndentedString(physicalRestaurantId)).append("\n");
    sb.append("    hydraConfigId: ").append(toIndentedString(hydraConfigId)).append("\n");
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

