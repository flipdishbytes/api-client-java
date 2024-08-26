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
import com.flipdish.apiclient.model.OwnerEntityConfiguration;
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
 * Owner Entity Configurations
 */
@ApiModel(description = "Owner Entity Configurations")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-08-26T14:15:08.808Z")
public class OwnerEntityConfigurations {
  @SerializedName("Configurations")
  private List<OwnerEntityConfiguration> configurations = null;

  public OwnerEntityConfigurations configurations(List<OwnerEntityConfiguration> configurations) {
    this.configurations = configurations;
    return this;
  }

  public OwnerEntityConfigurations addConfigurationsItem(OwnerEntityConfiguration configurationsItem) {
    if (this.configurations == null) {
      this.configurations = new ArrayList<OwnerEntityConfiguration>();
    }
    this.configurations.add(configurationsItem);
    return this;
  }

   /**
   * Owner Entity Configuration
   * @return configurations
  **/
  @ApiModelProperty(value = "Owner Entity Configuration")
  public List<OwnerEntityConfiguration> getConfigurations() {
    return configurations;
  }

  public void setConfigurations(List<OwnerEntityConfiguration> configurations) {
    this.configurations = configurations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnerEntityConfigurations ownerEntityConfigurations = (OwnerEntityConfigurations) o;
    return Objects.equals(this.configurations, ownerEntityConfigurations.configurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnerEntityConfigurations {\n");
    
    sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
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

