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
 * Configured stores
 */
@ApiModel(description = "Configured stores")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-21T11:36:00.630+01:00")
public class FulfillmentStatesConfiguredStore {
  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("Name")
  private String name = null;

  public FulfillmentStatesConfiguredStore storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Store id
   * @return storeId
  **/
  @ApiModelProperty(value = "Store id")
  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public FulfillmentStatesConfiguredStore name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of store
   * @return name
  **/
  @ApiModelProperty(value = "Name of store")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentStatesConfiguredStore fulfillmentStatesConfiguredStore = (FulfillmentStatesConfiguredStore) o;
    return Objects.equals(this.storeId, fulfillmentStatesConfiguredStore.storeId) &&
        Objects.equals(this.name, fulfillmentStatesConfiguredStore.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentStatesConfiguredStore {\n");
    
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

