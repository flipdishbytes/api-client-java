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
 * Country
 */
@ApiModel(description = "Country")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-09-19T09:39:05.515Z")
public class CountryFormResponse {
  @SerializedName("Value")
  private String value = null;

  @SerializedName("Label")
  private String label = null;

  public CountryFormResponse value(String value) {
    this.value = value;
    return this;
  }

   /**
   * ISO two letter code.
   * @return value
  **/
  @ApiModelProperty(value = "ISO two letter code.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public CountryFormResponse label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Label
   * @return label
  **/
  @ApiModelProperty(value = "Label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryFormResponse countryFormResponse = (CountryFormResponse) o;
    return Objects.equals(this.value, countryFormResponse.value) &&
        Objects.equals(this.label, countryFormResponse.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, label);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryFormResponse {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

