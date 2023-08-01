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
import org.threeten.bp.OffsetDateTime;

/**
 * Store Data Point
 */
@ApiModel(description = "Store Data Point")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-08-01T12:45:24.090+01:00")
public class StoreDataPoint {
  @SerializedName("Day")
  private OffsetDateTime day = null;

  @SerializedName("Value")
  private Double value = null;

  public StoreDataPoint day(OffsetDateTime day) {
    this.day = day;
    return this;
  }

   /**
   * Day
   * @return day
  **/
  @ApiModelProperty(value = "Day")
  public OffsetDateTime getDay() {
    return day;
  }

  public void setDay(OffsetDateTime day) {
    this.day = day;
  }

  public StoreDataPoint value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Value for the day
   * @return value
  **/
  @ApiModelProperty(value = "Value for the day")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreDataPoint storeDataPoint = (StoreDataPoint) o;
    return Objects.equals(this.day, storeDataPoint.day) &&
        Objects.equals(this.value, storeDataPoint.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreDataPoint {\n");
    
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

