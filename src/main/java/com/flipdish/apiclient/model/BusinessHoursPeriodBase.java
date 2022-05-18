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
 * Business hours period
 */
@ApiModel(description = "Business hours period")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-18T12:01:12.230+01:00")
public class BusinessHoursPeriodBase {
  /**
   * Day of week
   */
  @JsonAdapter(DayOfWeekEnum.Adapter.class)
  public enum DayOfWeekEnum {
    SUNDAY("Sunday"),
    
    MONDAY("Monday"),
    
    TUESDAY("Tuesday"),
    
    WEDNESDAY("Wednesday"),
    
    THURSDAY("Thursday"),
    
    FRIDAY("Friday"),
    
    SATURDAY("Saturday");

    private String value;

    DayOfWeekEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DayOfWeekEnum fromValue(String text) {
      for (DayOfWeekEnum b : DayOfWeekEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DayOfWeekEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DayOfWeekEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DayOfWeekEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DayOfWeekEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("DayOfWeek")
  private DayOfWeekEnum dayOfWeek = null;

  @SerializedName("StartTime")
  private String startTime = null;

  @SerializedName("Period")
  private String period = null;

  @SerializedName("StartTimeEarly")
  private String startTimeEarly = null;

  @SerializedName("PeriodEarly")
  private String periodEarly = null;

  public BusinessHoursPeriodBase dayOfWeek(DayOfWeekEnum dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

   /**
   * Day of week
   * @return dayOfWeek
  **/
  @ApiModelProperty(value = "Day of week")
  public DayOfWeekEnum getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(DayOfWeekEnum dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public BusinessHoursPeriodBase startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Start time
   * @return startTime
  **/
  @ApiModelProperty(value = "Start time")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public BusinessHoursPeriodBase period(String period) {
    this.period = period;
    return this;
  }

   /**
   * Period
   * @return period
  **/
  @ApiModelProperty(value = "Period")
  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public BusinessHoursPeriodBase startTimeEarly(String startTimeEarly) {
    this.startTimeEarly = startTimeEarly;
    return this;
  }

   /**
   * Start time early
   * @return startTimeEarly
  **/
  @ApiModelProperty(value = "Start time early")
  public String getStartTimeEarly() {
    return startTimeEarly;
  }

  public void setStartTimeEarly(String startTimeEarly) {
    this.startTimeEarly = startTimeEarly;
  }

  public BusinessHoursPeriodBase periodEarly(String periodEarly) {
    this.periodEarly = periodEarly;
    return this;
  }

   /**
   * Period early
   * @return periodEarly
  **/
  @ApiModelProperty(value = "Period early")
  public String getPeriodEarly() {
    return periodEarly;
  }

  public void setPeriodEarly(String periodEarly) {
    this.periodEarly = periodEarly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessHoursPeriodBase businessHoursPeriodBase = (BusinessHoursPeriodBase) o;
    return Objects.equals(this.dayOfWeek, businessHoursPeriodBase.dayOfWeek) &&
        Objects.equals(this.startTime, businessHoursPeriodBase.startTime) &&
        Objects.equals(this.period, businessHoursPeriodBase.period) &&
        Objects.equals(this.startTimeEarly, businessHoursPeriodBase.startTimeEarly) &&
        Objects.equals(this.periodEarly, businessHoursPeriodBase.periodEarly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeek, startTime, period, startTimeEarly, periodEarly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessHoursPeriodBase {\n");
    
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    startTimeEarly: ").append(toIndentedString(startTimeEarly)).append("\n");
    sb.append("    periodEarly: ").append(toIndentedString(periodEarly)).append("\n");
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

