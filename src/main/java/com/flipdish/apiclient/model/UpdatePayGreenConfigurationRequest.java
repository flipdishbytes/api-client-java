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
 * UpdatePayGreenConfigurationRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-24T12:25:59.605+01:00")
public class UpdatePayGreenConfigurationRequest {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("AssignedStores")
  private List<Integer> assignedStores = null;

  public UpdatePayGreenConfigurationRequest name(String name) {
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

  public UpdatePayGreenConfigurationRequest assignedStores(List<Integer> assignedStores) {
    this.assignedStores = assignedStores;
    return this;
  }

  public UpdatePayGreenConfigurationRequest addAssignedStoresItem(Integer assignedStoresItem) {
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
    UpdatePayGreenConfigurationRequest updatePayGreenConfigurationRequest = (UpdatePayGreenConfigurationRequest) o;
    return Objects.equals(this.name, updatePayGreenConfigurationRequest.name) &&
        Objects.equals(this.assignedStores, updatePayGreenConfigurationRequest.assignedStores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, assignedStores);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePayGreenConfigurationRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
