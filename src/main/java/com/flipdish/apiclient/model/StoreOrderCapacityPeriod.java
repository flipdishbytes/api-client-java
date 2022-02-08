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
 * Represents a single order capacity period
 */
@ApiModel(description = "Represents a single order capacity period")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-08T14:18:50.949Z")
public class StoreOrderCapacityPeriod {
  @SerializedName("MaxOrderNumberPerStoreInterval")
  private Integer maxOrderNumberPerStoreInterval = null;

  /**
   * Day of the week the period pertains to
   */
  @JsonAdapter(DayOfTheWeekEnum.Adapter.class)
  public enum DayOfTheWeekEnum {
    SUNDAY("Sunday"),
    
    MONDAY("Monday"),
    
    TUESDAY("Tuesday"),
    
    WEDNESDAY("Wednesday"),
    
    THURSDAY("Thursday"),
    
    FRIDAY("Friday"),
    
    SATURDAY("Saturday");

    private String value;

    DayOfTheWeekEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DayOfTheWeekEnum fromValue(String text) {
      for (DayOfTheWeekEnum b : DayOfTheWeekEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DayOfTheWeekEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DayOfTheWeekEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DayOfTheWeekEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DayOfTheWeekEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("DayOfTheWeek")
  private DayOfTheWeekEnum dayOfTheWeek = null;

  @SerializedName("PeriodStartHour")
  private Integer periodStartHour = null;

  @SerializedName("PeriodStartMinutes")
  private Integer periodStartMinutes = null;

  @SerializedName("PeriodEndHour")
  private Integer periodEndHour = null;

  @SerializedName("PeriodEndMinutes")
  private Integer periodEndMinutes = null;

  public StoreOrderCapacityPeriod maxOrderNumberPerStoreInterval(Integer maxOrderNumberPerStoreInterval) {
    this.maxOrderNumberPerStoreInterval = maxOrderNumberPerStoreInterval;
    return this;
  }

   /**
   * The maximum number of orders per each store order interval in this order capacity period.  E.g. for a period from 9:00 till 11:00, if the store&#39;s interval is 10 minutes, and MaxOrderNumberPerStoreInterval is set to 5,  it means that within each 10-minute interval between 9:00 and 11:00 (i.e. 9:00-9:10, 9:10-9:20, .. , 10:50-11:00) it will be possible to  request at most 5 orders.
   * @return maxOrderNumberPerStoreInterval
  **/
  @ApiModelProperty(value = "The maximum number of orders per each store order interval in this order capacity period.  E.g. for a period from 9:00 till 11:00, if the store's interval is 10 minutes, and MaxOrderNumberPerStoreInterval is set to 5,  it means that within each 10-minute interval between 9:00 and 11:00 (i.e. 9:00-9:10, 9:10-9:20, .. , 10:50-11:00) it will be possible to  request at most 5 orders.")
  public Integer getMaxOrderNumberPerStoreInterval() {
    return maxOrderNumberPerStoreInterval;
  }

  public void setMaxOrderNumberPerStoreInterval(Integer maxOrderNumberPerStoreInterval) {
    this.maxOrderNumberPerStoreInterval = maxOrderNumberPerStoreInterval;
  }

  public StoreOrderCapacityPeriod dayOfTheWeek(DayOfTheWeekEnum dayOfTheWeek) {
    this.dayOfTheWeek = dayOfTheWeek;
    return this;
  }

   /**
   * Day of the week the period pertains to
   * @return dayOfTheWeek
  **/
  @ApiModelProperty(value = "Day of the week the period pertains to")
  public DayOfTheWeekEnum getDayOfTheWeek() {
    return dayOfTheWeek;
  }

  public void setDayOfTheWeek(DayOfTheWeekEnum dayOfTheWeek) {
    this.dayOfTheWeek = dayOfTheWeek;
  }

  public StoreOrderCapacityPeriod periodStartHour(Integer periodStartHour) {
    this.periodStartHour = periodStartHour;
    return this;
  }

   /**
   * The hour the period starts at
   * @return periodStartHour
  **/
  @ApiModelProperty(value = "The hour the period starts at")
  public Integer getPeriodStartHour() {
    return periodStartHour;
  }

  public void setPeriodStartHour(Integer periodStartHour) {
    this.periodStartHour = periodStartHour;
  }

  public StoreOrderCapacityPeriod periodStartMinutes(Integer periodStartMinutes) {
    this.periodStartMinutes = periodStartMinutes;
    return this;
  }

   /**
   * The minutes after the hour the period starts at
   * @return periodStartMinutes
  **/
  @ApiModelProperty(value = "The minutes after the hour the period starts at")
  public Integer getPeriodStartMinutes() {
    return periodStartMinutes;
  }

  public void setPeriodStartMinutes(Integer periodStartMinutes) {
    this.periodStartMinutes = periodStartMinutes;
  }

  public StoreOrderCapacityPeriod periodEndHour(Integer periodEndHour) {
    this.periodEndHour = periodEndHour;
    return this;
  }

   /**
   * The hour the period ends at
   * @return periodEndHour
  **/
  @ApiModelProperty(value = "The hour the period ends at")
  public Integer getPeriodEndHour() {
    return periodEndHour;
  }

  public void setPeriodEndHour(Integer periodEndHour) {
    this.periodEndHour = periodEndHour;
  }

  public StoreOrderCapacityPeriod periodEndMinutes(Integer periodEndMinutes) {
    this.periodEndMinutes = periodEndMinutes;
    return this;
  }

   /**
   * The minutes after the hour the period ends at
   * @return periodEndMinutes
  **/
  @ApiModelProperty(value = "The minutes after the hour the period ends at")
  public Integer getPeriodEndMinutes() {
    return periodEndMinutes;
  }

  public void setPeriodEndMinutes(Integer periodEndMinutes) {
    this.periodEndMinutes = periodEndMinutes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreOrderCapacityPeriod storeOrderCapacityPeriod = (StoreOrderCapacityPeriod) o;
    return Objects.equals(this.maxOrderNumberPerStoreInterval, storeOrderCapacityPeriod.maxOrderNumberPerStoreInterval) &&
        Objects.equals(this.dayOfTheWeek, storeOrderCapacityPeriod.dayOfTheWeek) &&
        Objects.equals(this.periodStartHour, storeOrderCapacityPeriod.periodStartHour) &&
        Objects.equals(this.periodStartMinutes, storeOrderCapacityPeriod.periodStartMinutes) &&
        Objects.equals(this.periodEndHour, storeOrderCapacityPeriod.periodEndHour) &&
        Objects.equals(this.periodEndMinutes, storeOrderCapacityPeriod.periodEndMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxOrderNumberPerStoreInterval, dayOfTheWeek, periodStartHour, periodStartMinutes, periodEndHour, periodEndMinutes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreOrderCapacityPeriod {\n");
    
    sb.append("    maxOrderNumberPerStoreInterval: ").append(toIndentedString(maxOrderNumberPerStoreInterval)).append("\n");
    sb.append("    dayOfTheWeek: ").append(toIndentedString(dayOfTheWeek)).append("\n");
    sb.append("    periodStartHour: ").append(toIndentedString(periodStartHour)).append("\n");
    sb.append("    periodStartMinutes: ").append(toIndentedString(periodStartMinutes)).append("\n");
    sb.append("    periodEndHour: ").append(toIndentedString(periodEndHour)).append("\n");
    sb.append("    periodEndMinutes: ").append(toIndentedString(periodEndMinutes)).append("\n");
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
