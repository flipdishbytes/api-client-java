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
 * Action item for next fulfillment status selector
 */
@ApiModel(description = "Action item for next fulfillment status selector")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-08-30T13:05:53.551+01:00")
public class FulfillentStatusActionItem {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("Name")
  private String name = null;

  public FulfillentStatusActionItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Status Id
   * @return id
  **/
  @ApiModelProperty(value = "Status Id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FulfillentStatusActionItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Status Name
   * @return name
  **/
  @ApiModelProperty(value = "Status Name")
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
    FulfillentStatusActionItem fulfillentStatusActionItem = (FulfillentStatusActionItem) o;
    return Objects.equals(this.id, fulfillentStatusActionItem.id) &&
        Objects.equals(this.name, fulfillentStatusActionItem.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillentStatusActionItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

