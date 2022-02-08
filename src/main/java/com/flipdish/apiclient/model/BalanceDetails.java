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
 * Period opening and closing balance
 */
@ApiModel(description = "Period opening and closing balance")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-08T14:18:50.949Z")
public class BalanceDetails {
  @SerializedName("OpeningBalance")
  private Double openingBalance = null;

  @SerializedName("ClosingBalance")
  private Double closingBalance = null;

  public BalanceDetails openingBalance(Double openingBalance) {
    this.openingBalance = openingBalance;
    return this;
  }

   /**
   * Get openingBalance
   * @return openingBalance
  **/
  @ApiModelProperty(value = "")
  public Double getOpeningBalance() {
    return openingBalance;
  }

  public void setOpeningBalance(Double openingBalance) {
    this.openingBalance = openingBalance;
  }

  public BalanceDetails closingBalance(Double closingBalance) {
    this.closingBalance = closingBalance;
    return this;
  }

   /**
   * Get closingBalance
   * @return closingBalance
  **/
  @ApiModelProperty(value = "")
  public Double getClosingBalance() {
    return closingBalance;
  }

  public void setClosingBalance(Double closingBalance) {
    this.closingBalance = closingBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceDetails balanceDetails = (BalanceDetails) o;
    return Objects.equals(this.openingBalance, balanceDetails.openingBalance) &&
        Objects.equals(this.closingBalance, balanceDetails.closingBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openingBalance, closingBalance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceDetails {\n");
    
    sb.append("    openingBalance: ").append(toIndentedString(openingBalance)).append("\n");
    sb.append("    closingBalance: ").append(toIndentedString(closingBalance)).append("\n");
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
