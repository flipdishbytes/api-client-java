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
import com.flipdish.apiclient.model.CurrencyData;
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
 * Home statitstics
 */
@ApiModel(description = "Home statitstics")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-13T09:47:54.420+01:00")
public class HomeStatistics {
  @SerializedName("TotalMoneySaved")
  private List<CurrencyData> totalMoneySaved = null;

  public HomeStatistics totalMoneySaved(List<CurrencyData> totalMoneySaved) {
    this.totalMoneySaved = totalMoneySaved;
    return this;
  }

  public HomeStatistics addTotalMoneySavedItem(CurrencyData totalMoneySavedItem) {
    if (this.totalMoneySaved == null) {
      this.totalMoneySaved = new ArrayList<CurrencyData>();
    }
    this.totalMoneySaved.add(totalMoneySavedItem);
    return this;
  }

   /**
   * Money saved
   * @return totalMoneySaved
  **/
  @ApiModelProperty(value = "Money saved")
  public List<CurrencyData> getTotalMoneySaved() {
    return totalMoneySaved;
  }

  public void setTotalMoneySaved(List<CurrencyData> totalMoneySaved) {
    this.totalMoneySaved = totalMoneySaved;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HomeStatistics homeStatistics = (HomeStatistics) o;
    return Objects.equals(this.totalMoneySaved, homeStatistics.totalMoneySaved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalMoneySaved);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HomeStatistics {\n");
    
    sb.append("    totalMoneySaved: ").append(toIndentedString(totalMoneySaved)).append("\n");
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

