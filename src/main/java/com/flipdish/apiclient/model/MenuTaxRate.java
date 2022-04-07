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
 * Tax Rates Associated with a Menu
 */
@ApiModel(description = "Tax Rates Associated with a Menu")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-07T12:39:20.558+01:00")
public class MenuTaxRate {
  @SerializedName("TaxRateId")
  private Integer taxRateId = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Rate")
  private Double rate = null;

  public MenuTaxRate taxRateId(Integer taxRateId) {
    this.taxRateId = taxRateId;
    return this;
  }

   /**
   * Id of Tax Rate
   * @return taxRateId
  **/
  @ApiModelProperty(value = "Id of Tax Rate")
  public Integer getTaxRateId() {
    return taxRateId;
  }

  public void setTaxRateId(Integer taxRateId) {
    this.taxRateId = taxRateId;
  }

  public MenuTaxRate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of Tax Rate
   * @return name
  **/
  @ApiModelProperty(value = "Name of Tax Rate")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MenuTaxRate rate(Double rate) {
    this.rate = rate;
    return this;
  }

   /**
   * In Percentage
   * @return rate
  **/
  @ApiModelProperty(value = "In Percentage")
  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuTaxRate menuTaxRate = (MenuTaxRate) o;
    return Objects.equals(this.taxRateId, menuTaxRate.taxRateId) &&
        Objects.equals(this.name, menuTaxRate.name) &&
        Objects.equals(this.rate, menuTaxRate.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxRateId, name, rate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuTaxRate {\n");
    
    sb.append("    taxRateId: ").append(toIndentedString(taxRateId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

