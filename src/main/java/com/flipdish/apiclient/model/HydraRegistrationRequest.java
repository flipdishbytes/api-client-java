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
 * Hydra registration result
 */
@ApiModel(description = "Hydra registration result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-12-13T13:55:38.072Z")
public class HydraRegistrationRequest {
  @SerializedName("StoreIds")
  private List<Integer> storeIds = new ArrayList<Integer>();

  @SerializedName("DeviceName")
  private String deviceName = null;

  @SerializedName("PinCode")
  private Integer pinCode = null;

  public HydraRegistrationRequest storeIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
    return this;
  }

  public HydraRegistrationRequest addStoreIdsItem(Integer storeIdsItem) {
    this.storeIds.add(storeIdsItem);
    return this;
  }

   /**
   * Stores to assign the hydra
   * @return storeIds
  **/
  @ApiModelProperty(required = true, value = "Stores to assign the hydra")
  public List<Integer> getStoreIds() {
    return storeIds;
  }

  public void setStoreIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
  }

  public HydraRegistrationRequest deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

   /**
   * Hydra device name
   * @return deviceName
  **/
  @ApiModelProperty(required = true, value = "Hydra device name")
  public String getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  public HydraRegistrationRequest pinCode(Integer pinCode) {
    this.pinCode = pinCode;
    return this;
  }

   /**
   * 6 digit PIN code (not starting with zero).
   * minimum: 100000
   * maximum: 999999
   * @return pinCode
  **/
  @ApiModelProperty(value = "6 digit PIN code (not starting with zero).")
  public Integer getPinCode() {
    return pinCode;
  }

  public void setPinCode(Integer pinCode) {
    this.pinCode = pinCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HydraRegistrationRequest hydraRegistrationRequest = (HydraRegistrationRequest) o;
    return Objects.equals(this.storeIds, hydraRegistrationRequest.storeIds) &&
        Objects.equals(this.deviceName, hydraRegistrationRequest.deviceName) &&
        Objects.equals(this.pinCode, hydraRegistrationRequest.pinCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeIds, deviceName, pinCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HydraRegistrationRequest {\n");
    
    sb.append("    storeIds: ").append(toIndentedString(storeIds)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    pinCode: ").append(toIndentedString(pinCode)).append("\n");
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

