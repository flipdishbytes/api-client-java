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
 * Defines a customer update model
 */
@ApiModel(description = "Defines a customer update model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-27T11:41:42.137+01:00")
public class CustomerUpdateModel {
  @SerializedName("CashOrdersEnabled")
  private Boolean cashOrdersEnabled = null;

  @SerializedName("CardOrdersEnabled")
  private Boolean cardOrdersEnabled = null;

  @SerializedName("MarketingEnabled")
  private Boolean marketingEnabled = null;

  public CustomerUpdateModel cashOrdersEnabled(Boolean cashOrdersEnabled) {
    this.cashOrdersEnabled = cashOrdersEnabled;
    return this;
  }

   /**
   * Customer can place cash orders
   * @return cashOrdersEnabled
  **/
  @ApiModelProperty(value = "Customer can place cash orders")
  public Boolean isCashOrdersEnabled() {
    return cashOrdersEnabled;
  }

  public void setCashOrdersEnabled(Boolean cashOrdersEnabled) {
    this.cashOrdersEnabled = cashOrdersEnabled;
  }

  public CustomerUpdateModel cardOrdersEnabled(Boolean cardOrdersEnabled) {
    this.cardOrdersEnabled = cardOrdersEnabled;
    return this;
  }

   /**
   * Customer can place card orders
   * @return cardOrdersEnabled
  **/
  @ApiModelProperty(value = "Customer can place card orders")
  public Boolean isCardOrdersEnabled() {
    return cardOrdersEnabled;
  }

  public void setCardOrdersEnabled(Boolean cardOrdersEnabled) {
    this.cardOrdersEnabled = cardOrdersEnabled;
  }

  public CustomerUpdateModel marketingEnabled(Boolean marketingEnabled) {
    this.marketingEnabled = marketingEnabled;
    return this;
  }

   /**
   * Customer can receive marketing
   * @return marketingEnabled
  **/
  @ApiModelProperty(value = "Customer can receive marketing")
  public Boolean isMarketingEnabled() {
    return marketingEnabled;
  }

  public void setMarketingEnabled(Boolean marketingEnabled) {
    this.marketingEnabled = marketingEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerUpdateModel customerUpdateModel = (CustomerUpdateModel) o;
    return Objects.equals(this.cashOrdersEnabled, customerUpdateModel.cashOrdersEnabled) &&
        Objects.equals(this.cardOrdersEnabled, customerUpdateModel.cardOrdersEnabled) &&
        Objects.equals(this.marketingEnabled, customerUpdateModel.marketingEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashOrdersEnabled, cardOrdersEnabled, marketingEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerUpdateModel {\n");
    
    sb.append("    cashOrdersEnabled: ").append(toIndentedString(cashOrdersEnabled)).append("\n");
    sb.append("    cardOrdersEnabled: ").append(toIndentedString(cardOrdersEnabled)).append("\n");
    sb.append("    marketingEnabled: ").append(toIndentedString(marketingEnabled)).append("\n");
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

