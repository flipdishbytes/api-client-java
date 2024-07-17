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
 * AppStoreAppEntitlements
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-17T15:53:22.758Z")
public class AppStoreAppEntitlements {
  @SerializedName("EntitlementQuantity")
  private Integer entitlementQuantity = null;

  @SerializedName("CurrentUsage")
  private Integer currentUsage = null;

  public AppStoreAppEntitlements entitlementQuantity(Integer entitlementQuantity) {
    this.entitlementQuantity = entitlementQuantity;
    return this;
  }

   /**
   * Get entitlementQuantity
   * @return entitlementQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getEntitlementQuantity() {
    return entitlementQuantity;
  }

  public void setEntitlementQuantity(Integer entitlementQuantity) {
    this.entitlementQuantity = entitlementQuantity;
  }

  public AppStoreAppEntitlements currentUsage(Integer currentUsage) {
    this.currentUsage = currentUsage;
    return this;
  }

   /**
   * Get currentUsage
   * @return currentUsage
  **/
  @ApiModelProperty(value = "")
  public Integer getCurrentUsage() {
    return currentUsage;
  }

  public void setCurrentUsage(Integer currentUsage) {
    this.currentUsage = currentUsage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStoreAppEntitlements appStoreAppEntitlements = (AppStoreAppEntitlements) o;
    return Objects.equals(this.entitlementQuantity, appStoreAppEntitlements.entitlementQuantity) &&
        Objects.equals(this.currentUsage, appStoreAppEntitlements.currentUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitlementQuantity, currentUsage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreAppEntitlements {\n");
    
    sb.append("    entitlementQuantity: ").append(toIndentedString(entitlementQuantity)).append("\n");
    sb.append("    currentUsage: ").append(toIndentedString(currentUsage)).append("\n");
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

