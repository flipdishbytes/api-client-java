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
 * Provides an average value for a single hour of day of the week
 */
@ApiModel(description = "Provides an average value for a single hour of day of the week")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class ApmHourlyDataPoint {
  /**
   * Day of the week
   */
  @JsonAdapter(DayEnum.Adapter.class)
  public enum DayEnum {
    SUNDAY("Sunday"),
    
    MONDAY("Monday"),
    
    TUESDAY("Tuesday"),
    
    WEDNESDAY("Wednesday"),
    
    THURSDAY("Thursday"),
    
    FRIDAY("Friday"),
    
    SATURDAY("Saturday");

    private String value;

    DayEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DayEnum fromValue(String text) {
      for (DayEnum b : DayEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DayEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DayEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DayEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DayEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Day")
  private DayEnum day = null;

  @SerializedName("Hour")
  private Integer hour = null;

  @SerializedName("TotalValue")
  private Integer totalValue = null;

  public ApmHourlyDataPoint day(DayEnum day) {
    this.day = day;
    return this;
  }

   /**
   * Day of the week
   * @return day
  **/
  @ApiModelProperty(value = "Day of the week")
  public DayEnum getDay() {
    return day;
  }

  public void setDay(DayEnum day) {
    this.day = day;
  }

  public ApmHourlyDataPoint hour(Integer hour) {
    this.hour = hour;
    return this;
  }

   /**
   * Hour in the day
   * @return hour
  **/
  @ApiModelProperty(value = "Hour in the day")
  public Integer getHour() {
    return hour;
  }

  public void setHour(Integer hour) {
    this.hour = hour;
  }

  public ApmHourlyDataPoint totalValue(Integer totalValue) {
    this.totalValue = totalValue;
    return this;
  }

   /**
   * Total Value
   * @return totalValue
  **/
  @ApiModelProperty(value = "Total Value")
  public Integer getTotalValue() {
    return totalValue;
  }

  public void setTotalValue(Integer totalValue) {
    this.totalValue = totalValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApmHourlyDataPoint apmHourlyDataPoint = (ApmHourlyDataPoint) o;
    return Objects.equals(this.day, apmHourlyDataPoint.day) &&
        Objects.equals(this.hour, apmHourlyDataPoint.hour) &&
        Objects.equals(this.totalValue, apmHourlyDataPoint.totalValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, hour, totalValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApmHourlyDataPoint {\n");
    
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    totalValue: ").append(toIndentedString(totalValue)).append("\n");
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

