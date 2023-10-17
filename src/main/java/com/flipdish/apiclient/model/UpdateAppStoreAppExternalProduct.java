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
 * Update App store app external product id
 */
@ApiModel(description = "Update App store app external product id")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-10-17T09:39:41.364Z")
public class UpdateAppStoreAppExternalProduct {
  @SerializedName("ExternalProductId")
  private String externalProductId = null;

  public UpdateAppStoreAppExternalProduct externalProductId(String externalProductId) {
    this.externalProductId = externalProductId;
    return this;
  }

   /**
   * The external product id
   * @return externalProductId
  **/
  @ApiModelProperty(value = "The external product id")
  public String getExternalProductId() {
    return externalProductId;
  }

  public void setExternalProductId(String externalProductId) {
    this.externalProductId = externalProductId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAppStoreAppExternalProduct updateAppStoreAppExternalProduct = (UpdateAppStoreAppExternalProduct) o;
    return Objects.equals(this.externalProductId, updateAppStoreAppExternalProduct.externalProductId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalProductId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAppStoreAppExternalProduct {\n");
    
    sb.append("    externalProductId: ").append(toIndentedString(externalProductId)).append("\n");
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

