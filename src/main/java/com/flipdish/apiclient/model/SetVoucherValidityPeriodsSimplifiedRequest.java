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
import java.util.ArrayList;
import java.util.List;

/**
 * Set the validity periods of a voucher.
 */
@ApiModel(description = "Set the validity periods of a voucher.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-17T15:53:22.758Z")
public class SetVoucherValidityPeriodsSimplifiedRequest {
  /**
   * Gets or Sets daysOfWeek
   */
  @JsonAdapter(DaysOfWeekEnum.Adapter.class)
  public enum DaysOfWeekEnum {
    SUNDAY("Sunday"),
    
    MONDAY("Monday"),
    
    TUESDAY("Tuesday"),
    
    WEDNESDAY("Wednesday"),
    
    THURSDAY("Thursday"),
    
    FRIDAY("Friday"),
    
    SATURDAY("Saturday");

    private String value;

    DaysOfWeekEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DaysOfWeekEnum fromValue(String text) {
      for (DaysOfWeekEnum b : DaysOfWeekEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DaysOfWeekEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DaysOfWeekEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DaysOfWeekEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DaysOfWeekEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("DaysOfWeek")
  private List<DaysOfWeekEnum> daysOfWeek = null;

  @SerializedName("StartTime")
  private String startTime = null;

  @SerializedName("EndTime")
  private String endTime = null;

  public SetVoucherValidityPeriodsSimplifiedRequest daysOfWeek(List<DaysOfWeekEnum> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }

  public SetVoucherValidityPeriodsSimplifiedRequest addDaysOfWeekItem(DaysOfWeekEnum daysOfWeekItem) {
    if (this.daysOfWeek == null) {
      this.daysOfWeek = new ArrayList<DaysOfWeekEnum>();
    }
    this.daysOfWeek.add(daysOfWeekItem);
    return this;
  }

   /**
   * Days of week when the voucher is valid
   * @return daysOfWeek
  **/
  @ApiModelProperty(value = "Days of week when the voucher is valid")
  public List<DaysOfWeekEnum> getDaysOfWeek() {
    return daysOfWeek;
  }

  public void setDaysOfWeek(List<DaysOfWeekEnum> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }

  public SetVoucherValidityPeriodsSimplifiedRequest startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Start time of the day when the voucher is valid
   * @return startTime
  **/
  @ApiModelProperty(value = "Start time of the day when the voucher is valid")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public SetVoucherValidityPeriodsSimplifiedRequest endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * End time of the day when the voucher is valid.  If the end time is before the start time, the end time is assumed to be the next day.
   * @return endTime
  **/
  @ApiModelProperty(value = "End time of the day when the voucher is valid.  If the end time is before the start time, the end time is assumed to be the next day.")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetVoucherValidityPeriodsSimplifiedRequest setVoucherValidityPeriodsSimplifiedRequest = (SetVoucherValidityPeriodsSimplifiedRequest) o;
    return Objects.equals(this.daysOfWeek, setVoucherValidityPeriodsSimplifiedRequest.daysOfWeek) &&
        Objects.equals(this.startTime, setVoucherValidityPeriodsSimplifiedRequest.startTime) &&
        Objects.equals(this.endTime, setVoucherValidityPeriodsSimplifiedRequest.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysOfWeek, startTime, endTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetVoucherValidityPeriodsSimplifiedRequest {\n");
    
    sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

