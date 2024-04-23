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
import org.threeten.bp.OffsetDateTime;

/**
 * A single data point in timeline graphs related to APM
 */
@ApiModel(description = "A single data point in timeline graphs related to APM")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-23T14:27:15.919Z")
public class ApmCurrencyDataPoint {
  @SerializedName("PeriodStart")
  private OffsetDateTime periodStart = null;

  @SerializedName("PeriodLengthInDays")
  private Integer periodLengthInDays = null;

  @SerializedName("CurrencyData")
  private List<CurrencyData> currencyData = null;

  public ApmCurrencyDataPoint periodStart(OffsetDateTime periodStart) {
    this.periodStart = periodStart;
    return this;
  }

   /**
   * Date from which the data point starts
   * @return periodStart
  **/
  @ApiModelProperty(value = "Date from which the data point starts")
  public OffsetDateTime getPeriodStart() {
    return periodStart;
  }

  public void setPeriodStart(OffsetDateTime periodStart) {
    this.periodStart = periodStart;
  }

  public ApmCurrencyDataPoint periodLengthInDays(Integer periodLengthInDays) {
    this.periodLengthInDays = periodLengthInDays;
    return this;
  }

   /**
   * The length in days that this data point covers
   * @return periodLengthInDays
  **/
  @ApiModelProperty(value = "The length in days that this data point covers")
  public Integer getPeriodLengthInDays() {
    return periodLengthInDays;
  }

  public void setPeriodLengthInDays(Integer periodLengthInDays) {
    this.periodLengthInDays = periodLengthInDays;
  }

  public ApmCurrencyDataPoint currencyData(List<CurrencyData> currencyData) {
    this.currencyData = currencyData;
    return this;
  }

  public ApmCurrencyDataPoint addCurrencyDataItem(CurrencyData currencyDataItem) {
    if (this.currencyData == null) {
      this.currencyData = new ArrayList<CurrencyData>();
    }
    this.currencyData.add(currencyDataItem);
    return this;
  }

   /**
   * The values of this data point
   * @return currencyData
  **/
  @ApiModelProperty(value = "The values of this data point")
  public List<CurrencyData> getCurrencyData() {
    return currencyData;
  }

  public void setCurrencyData(List<CurrencyData> currencyData) {
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
    ApmCurrencyDataPoint apmCurrencyDataPoint = (ApmCurrencyDataPoint) o;
    return Objects.equals(this.periodStart, apmCurrencyDataPoint.periodStart) &&
        Objects.equals(this.periodLengthInDays, apmCurrencyDataPoint.periodLengthInDays) &&
        Objects.equals(this.currencyData, apmCurrencyDataPoint.currencyData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodStart, periodLengthInDays, currencyData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApmCurrencyDataPoint {\n");
    
    sb.append("    periodStart: ").append(toIndentedString(periodStart)).append("\n");
    sb.append("    periodLengthInDays: ").append(toIndentedString(periodLengthInDays)).append("\n");
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

