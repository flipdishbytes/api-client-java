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
import com.flipdish.apiclient.model.StoreConfig;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Hey
 */
@ApiModel(description = "Hey")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-14T09:37:20.863Z")
public class StoreValidationConfig {
  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("IsValid")
  private Boolean isValid = null;

  @SerializedName("StoreGroupId")
  private Integer storeGroupId = null;

  @SerializedName("ConfigValidation")
  private StoreConfig configValidation = null;

  public StoreValidationConfig storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Store identifier
   * @return storeId
  **/
  @ApiModelProperty(value = "Store identifier")
  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public StoreValidationConfig name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StoreValidationConfig isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

   /**
   * Is Store Valid for Kiosk
   * @return isValid
  **/
  @ApiModelProperty(value = "Is Store Valid for Kiosk")
  public Boolean isIsValid() {
    return isValid;
  }

  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }

  public StoreValidationConfig storeGroupId(Integer storeGroupId) {
    this.storeGroupId = storeGroupId;
    return this;
  }

   /**
   * Store group Id
   * @return storeGroupId
  **/
  @ApiModelProperty(value = "Store group Id")
  public Integer getStoreGroupId() {
    return storeGroupId;
  }

  public void setStoreGroupId(Integer storeGroupId) {
    this.storeGroupId = storeGroupId;
  }

  public StoreValidationConfig configValidation(StoreConfig configValidation) {
    this.configValidation = configValidation;
    return this;
  }

   /**
   * Get configValidation
   * @return configValidation
  **/
  @ApiModelProperty(value = "")
  public StoreConfig getConfigValidation() {
    return configValidation;
  }

  public void setConfigValidation(StoreConfig configValidation) {
    this.configValidation = configValidation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreValidationConfig storeValidationConfig = (StoreValidationConfig) o;
    return Objects.equals(this.storeId, storeValidationConfig.storeId) &&
        Objects.equals(this.name, storeValidationConfig.name) &&
        Objects.equals(this.isValid, storeValidationConfig.isValid) &&
        Objects.equals(this.storeGroupId, storeValidationConfig.storeGroupId) &&
        Objects.equals(this.configValidation, storeValidationConfig.configValidation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, name, isValid, storeGroupId, configValidation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreValidationConfig {\n");
    
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    storeGroupId: ").append(toIndentedString(storeGroupId)).append("\n");
    sb.append("    configValidation: ").append(toIndentedString(configValidation)).append("\n");
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

