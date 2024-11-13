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
 * Kiosk entitlements and usage
 */
@ApiModel(description = "Kiosk entitlements and usage")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-11-13T12:22:11.768Z")
public class KioskEntitlementsResult {
  @SerializedName("EntitledQuantity")
  private Integer entitledQuantity = null;

  @SerializedName("UsedQuantity")
  private Integer usedQuantity = null;

  public KioskEntitlementsResult entitledQuantity(Integer entitledQuantity) {
    this.entitledQuantity = entitledQuantity;
    return this;
  }

   /**
   * Number of kiosk devices entitled
   * @return entitledQuantity
  **/
  @ApiModelProperty(value = "Number of kiosk devices entitled")
  public Integer getEntitledQuantity() {
    return entitledQuantity;
  }

  public void setEntitledQuantity(Integer entitledQuantity) {
    this.entitledQuantity = entitledQuantity;
  }

  public KioskEntitlementsResult usedQuantity(Integer usedQuantity) {
    this.usedQuantity = usedQuantity;
    return this;
  }

   /**
   * The quantity of entitlements that have been used
   * @return usedQuantity
  **/
  @ApiModelProperty(value = "The quantity of entitlements that have been used")
  public Integer getUsedQuantity() {
    return usedQuantity;
  }

  public void setUsedQuantity(Integer usedQuantity) {
    this.usedQuantity = usedQuantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KioskEntitlementsResult kioskEntitlementsResult = (KioskEntitlementsResult) o;
    return Objects.equals(this.entitledQuantity, kioskEntitlementsResult.entitledQuantity) &&
        Objects.equals(this.usedQuantity, kioskEntitlementsResult.usedQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitledQuantity, usedQuantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KioskEntitlementsResult {\n");
    
    sb.append("    entitledQuantity: ").append(toIndentedString(entitledQuantity)).append("\n");
    sb.append("    usedQuantity: ").append(toIndentedString(usedQuantity)).append("\n");
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

