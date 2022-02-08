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
import com.flipdish.apiclient.model.StatisticsCurrencyDataPoint;
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
 * APM Statistics
 */
@ApiModel(description = "APM Statistics")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-08T14:18:50.949Z")
public class ApmStatistics {
  @SerializedName("EstimatedMinutesSaved")
  private Integer estimatedMinutesSaved = null;

  @SerializedName("EstimatedMinutesCouldSaved")
  private Integer estimatedMinutesCouldSaved = null;

  @SerializedName("CurrencyData")
  private List<StatisticsCurrencyDataPoint> currencyData = null;

  public ApmStatistics estimatedMinutesSaved(Integer estimatedMinutesSaved) {
    this.estimatedMinutesSaved = estimatedMinutesSaved;
    return this;
  }

   /**
   * Total amount of time spent with APM
   * @return estimatedMinutesSaved
  **/
  @ApiModelProperty(value = "Total amount of time spent with APM")
  public Integer getEstimatedMinutesSaved() {
    return estimatedMinutesSaved;
  }

  public void setEstimatedMinutesSaved(Integer estimatedMinutesSaved) {
    this.estimatedMinutesSaved = estimatedMinutesSaved;
  }

  public ApmStatistics estimatedMinutesCouldSaved(Integer estimatedMinutesCouldSaved) {
    this.estimatedMinutesCouldSaved = estimatedMinutesCouldSaved;
    return this;
  }

   /**
   * Total amount of time that could be saved
   * @return estimatedMinutesCouldSaved
  **/
  @ApiModelProperty(value = "Total amount of time that could be saved")
  public Integer getEstimatedMinutesCouldSaved() {
    return estimatedMinutesCouldSaved;
  }

  public void setEstimatedMinutesCouldSaved(Integer estimatedMinutesCouldSaved) {
    this.estimatedMinutesCouldSaved = estimatedMinutesCouldSaved;
  }

  public ApmStatistics currencyData(List<StatisticsCurrencyDataPoint> currencyData) {
    this.currencyData = currencyData;
    return this;
  }

  public ApmStatistics addCurrencyDataItem(StatisticsCurrencyDataPoint currencyDataItem) {
    if (this.currencyData == null) {
      this.currencyData = new ArrayList<StatisticsCurrencyDataPoint>();
    }
    this.currencyData.add(currencyDataItem);
    return this;
  }

   /**
   * Currency based data
   * @return currencyData
  **/
  @ApiModelProperty(value = "Currency based data")
  public List<StatisticsCurrencyDataPoint> getCurrencyData() {
    return currencyData;
  }

  public void setCurrencyData(List<StatisticsCurrencyDataPoint> currencyData) {
    this.currencyData = currencyData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApmStatistics apmStatistics = (ApmStatistics) o;
    return Objects.equals(this.estimatedMinutesSaved, apmStatistics.estimatedMinutesSaved) &&
        Objects.equals(this.estimatedMinutesCouldSaved, apmStatistics.estimatedMinutesCouldSaved) &&
        Objects.equals(this.currencyData, apmStatistics.currencyData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedMinutesSaved, estimatedMinutesCouldSaved, currencyData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApmStatistics {\n");
    
    sb.append("    estimatedMinutesSaved: ").append(toIndentedString(estimatedMinutesSaved)).append("\n");
    sb.append("    estimatedMinutesCouldSaved: ").append(toIndentedString(estimatedMinutesCouldSaved)).append("\n");
    sb.append("    currencyData: ").append(toIndentedString(currencyData)).append("\n");
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
