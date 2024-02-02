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
 * CreatePayGreenConfigurationRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-02T09:41:57.654Z")
public class CreatePayGreenConfigurationRequest {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("PayGreenId")
  private String payGreenId = null;

  @SerializedName("PayGreenPrivateKey")
  private String payGreenPrivateKey = null;

  @SerializedName("AssignedStores")
  private List<Integer> assignedStores = null;

  public CreatePayGreenConfigurationRequest name(String name) {
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

  public CreatePayGreenConfigurationRequest payGreenId(String payGreenId) {
    this.payGreenId = payGreenId;
    return this;
  }

   /**
   * Get payGreenId
   * @return payGreenId
  **/
  @ApiModelProperty(value = "")
  public String getPayGreenId() {
    return payGreenId;
  }

  public void setPayGreenId(String payGreenId) {
    this.payGreenId = payGreenId;
  }

  public CreatePayGreenConfigurationRequest payGreenPrivateKey(String payGreenPrivateKey) {
    this.payGreenPrivateKey = payGreenPrivateKey;
    return this;
  }

   /**
   * Get payGreenPrivateKey
   * @return payGreenPrivateKey
  **/
  @ApiModelProperty(value = "")
  public String getPayGreenPrivateKey() {
    return payGreenPrivateKey;
  }

  public void setPayGreenPrivateKey(String payGreenPrivateKey) {
    this.payGreenPrivateKey = payGreenPrivateKey;
  }

  public CreatePayGreenConfigurationRequest assignedStores(List<Integer> assignedStores) {
    this.assignedStores = assignedStores;
    return this;
  }

  public CreatePayGreenConfigurationRequest addAssignedStoresItem(Integer assignedStoresItem) {
    if (this.assignedStores == null) {
      this.assignedStores = new ArrayList<Integer>();
    }
    this.assignedStores.add(assignedStoresItem);
    return this;
  }

   /**
   * Get assignedStores
   * @return assignedStores
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getAssignedStores() {
    return assignedStores;
  }

  public void setAssignedStores(List<Integer> assignedStores) {
    this.assignedStores = assignedStores;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePayGreenConfigurationRequest createPayGreenConfigurationRequest = (CreatePayGreenConfigurationRequest) o;
    return Objects.equals(this.name, createPayGreenConfigurationRequest.name) &&
        Objects.equals(this.payGreenId, createPayGreenConfigurationRequest.payGreenId) &&
        Objects.equals(this.payGreenPrivateKey, createPayGreenConfigurationRequest.payGreenPrivateKey) &&
        Objects.equals(this.assignedStores, createPayGreenConfigurationRequest.assignedStores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, payGreenId, payGreenPrivateKey, assignedStores);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePayGreenConfigurationRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    payGreenId: ").append(toIndentedString(payGreenId)).append("\n");
    sb.append("    payGreenPrivateKey: ").append(toIndentedString(payGreenPrivateKey)).append("\n");
    sb.append("    assignedStores: ").append(toIndentedString(assignedStores)).append("\n");
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

