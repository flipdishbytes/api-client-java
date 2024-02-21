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
 * Pre Order Config
 */
@ApiModel(description = "Pre Order Config")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-21T13:31:03.338Z")
public class PreOrderConfig {
  @SerializedName("LeadTimeMinutes")
  private Integer leadTimeMinutes = null;

  @SerializedName("IntervalMinutes")
  private Integer intervalMinutes = null;

  @SerializedName("MaxOrderAheadDays")
  private Integer maxOrderAheadDays = null;

  @SerializedName("IncludeAsap")
  private Boolean includeAsap = null;

  @SerializedName("IncludeMoreGranularInitialTime")
  private Boolean includeMoreGranularInitialTime = null;

  @SerializedName("CutOffTimePreviousDayBasic")
  private String cutOffTimePreviousDayBasic = null;

  @SerializedName("CutOffTimeCurrentDayBasic")
  private String cutOffTimeCurrentDayBasic = null;

  /**
   * Type of time displayed.
   */
  @JsonAdapter(PreOrderTimeDisplayTypeEnum.Adapter.class)
  public enum PreOrderTimeDisplayTypeEnum {
    SINGLETIME("SingleTime"),
    
    STARTANDENDTIME("StartAndEndTime"),
    
    DAYONLY("DayOnly");

    private String value;

    PreOrderTimeDisplayTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PreOrderTimeDisplayTypeEnum fromValue(String text) {
      for (PreOrderTimeDisplayTypeEnum b : PreOrderTimeDisplayTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PreOrderTimeDisplayTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PreOrderTimeDisplayTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PreOrderTimeDisplayTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PreOrderTimeDisplayTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("PreOrderTimeDisplayType")
  private PreOrderTimeDisplayTypeEnum preOrderTimeDisplayType = null;

  @SerializedName("AlwaysAppearOpen")
  private Boolean alwaysAppearOpen = null;

  @SerializedName("RequireExplicitSelectAlways")
  private Boolean requireExplicitSelectAlways = null;

  public PreOrderConfig leadTimeMinutes(Integer leadTimeMinutes) {
    this.leadTimeMinutes = leadTimeMinutes;
    return this;
  }

   /**
   * Lead Time in Minutes
   * @return leadTimeMinutes
  **/
  @ApiModelProperty(value = "Lead Time in Minutes")
  public Integer getLeadTimeMinutes() {
    return leadTimeMinutes;
  }

  public void setLeadTimeMinutes(Integer leadTimeMinutes) {
    this.leadTimeMinutes = leadTimeMinutes;
  }

  public PreOrderConfig intervalMinutes(Integer intervalMinutes) {
    this.intervalMinutes = intervalMinutes;
    return this;
  }

   /**
   * Interval in minutes
   * @return intervalMinutes
  **/
  @ApiModelProperty(value = "Interval in minutes")
  public Integer getIntervalMinutes() {
    return intervalMinutes;
  }

  public void setIntervalMinutes(Integer intervalMinutes) {
    this.intervalMinutes = intervalMinutes;
  }

  public PreOrderConfig maxOrderAheadDays(Integer maxOrderAheadDays) {
    this.maxOrderAheadDays = maxOrderAheadDays;
    return this;
  }

   /**
   * Max Days to order ahead
   * @return maxOrderAheadDays
  **/
  @ApiModelProperty(value = "Max Days to order ahead")
  public Integer getMaxOrderAheadDays() {
    return maxOrderAheadDays;
  }

  public void setMaxOrderAheadDays(Integer maxOrderAheadDays) {
    this.maxOrderAheadDays = maxOrderAheadDays;
  }

  public PreOrderConfig includeAsap(Boolean includeAsap) {
    this.includeAsap = includeAsap;
    return this;
  }

   /**
   * Show ASAP as option
   * @return includeAsap
  **/
  @ApiModelProperty(value = "Show ASAP as option")
  public Boolean isIncludeAsap() {
    return includeAsap;
  }

  public void setIncludeAsap(Boolean includeAsap) {
    this.includeAsap = includeAsap;
  }

  public PreOrderConfig includeMoreGranularInitialTime(Boolean includeMoreGranularInitialTime) {
    this.includeMoreGranularInitialTime = includeMoreGranularInitialTime;
    return this;
  }

   /**
   * Granual Init&#39; Time
   * @return includeMoreGranularInitialTime
  **/
  @ApiModelProperty(value = "Granual Init' Time")
  public Boolean isIncludeMoreGranularInitialTime() {
    return includeMoreGranularInitialTime;
  }

  public void setIncludeMoreGranularInitialTime(Boolean includeMoreGranularInitialTime) {
    this.includeMoreGranularInitialTime = includeMoreGranularInitialTime;
  }

  public PreOrderConfig cutOffTimePreviousDayBasic(String cutOffTimePreviousDayBasic) {
    this.cutOffTimePreviousDayBasic = cutOffTimePreviousDayBasic;
    return this;
  }

   /**
   * Cut off time previous day
   * @return cutOffTimePreviousDayBasic
  **/
  @ApiModelProperty(value = "Cut off time previous day")
  public String getCutOffTimePreviousDayBasic() {
    return cutOffTimePreviousDayBasic;
  }

  public void setCutOffTimePreviousDayBasic(String cutOffTimePreviousDayBasic) {
    this.cutOffTimePreviousDayBasic = cutOffTimePreviousDayBasic;
  }

  public PreOrderConfig cutOffTimeCurrentDayBasic(String cutOffTimeCurrentDayBasic) {
    this.cutOffTimeCurrentDayBasic = cutOffTimeCurrentDayBasic;
    return this;
  }

   /**
   * Cut off time current day
   * @return cutOffTimeCurrentDayBasic
  **/
  @ApiModelProperty(value = "Cut off time current day")
  public String getCutOffTimeCurrentDayBasic() {
    return cutOffTimeCurrentDayBasic;
  }

  public void setCutOffTimeCurrentDayBasic(String cutOffTimeCurrentDayBasic) {
    this.cutOffTimeCurrentDayBasic = cutOffTimeCurrentDayBasic;
  }

  public PreOrderConfig preOrderTimeDisplayType(PreOrderTimeDisplayTypeEnum preOrderTimeDisplayType) {
    this.preOrderTimeDisplayType = preOrderTimeDisplayType;
    return this;
  }

   /**
   * Type of time displayed.
   * @return preOrderTimeDisplayType
  **/
  @ApiModelProperty(value = "Type of time displayed.")
  public PreOrderTimeDisplayTypeEnum getPreOrderTimeDisplayType() {
    return preOrderTimeDisplayType;
  }

  public void setPreOrderTimeDisplayType(PreOrderTimeDisplayTypeEnum preOrderTimeDisplayType) {
    this.preOrderTimeDisplayType = preOrderTimeDisplayType;
  }

  public PreOrderConfig alwaysAppearOpen(Boolean alwaysAppearOpen) {
    this.alwaysAppearOpen = alwaysAppearOpen;
    return this;
  }

   /**
   * Specifies whether a customer can pre-order outside the store opening hours or not.
   * @return alwaysAppearOpen
  **/
  @ApiModelProperty(value = "Specifies whether a customer can pre-order outside the store opening hours or not.")
  public Boolean isAlwaysAppearOpen() {
    return alwaysAppearOpen;
  }

  public void setAlwaysAppearOpen(Boolean alwaysAppearOpen) {
    this.alwaysAppearOpen = alwaysAppearOpen;
  }

  public PreOrderConfig requireExplicitSelectAlways(Boolean requireExplicitSelectAlways) {
    this.requireExplicitSelectAlways = requireExplicitSelectAlways;
    return this;
  }

   /**
   * Force customer to select collection time.
   * @return requireExplicitSelectAlways
  **/
  @ApiModelProperty(value = "Force customer to select collection time.")
  public Boolean isRequireExplicitSelectAlways() {
    return requireExplicitSelectAlways;
  }

  public void setRequireExplicitSelectAlways(Boolean requireExplicitSelectAlways) {
    this.requireExplicitSelectAlways = requireExplicitSelectAlways;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreOrderConfig preOrderConfig = (PreOrderConfig) o;
    return Objects.equals(this.leadTimeMinutes, preOrderConfig.leadTimeMinutes) &&
        Objects.equals(this.intervalMinutes, preOrderConfig.intervalMinutes) &&
        Objects.equals(this.maxOrderAheadDays, preOrderConfig.maxOrderAheadDays) &&
        Objects.equals(this.includeAsap, preOrderConfig.includeAsap) &&
        Objects.equals(this.includeMoreGranularInitialTime, preOrderConfig.includeMoreGranularInitialTime) &&
        Objects.equals(this.cutOffTimePreviousDayBasic, preOrderConfig.cutOffTimePreviousDayBasic) &&
        Objects.equals(this.cutOffTimeCurrentDayBasic, preOrderConfig.cutOffTimeCurrentDayBasic) &&
        Objects.equals(this.preOrderTimeDisplayType, preOrderConfig.preOrderTimeDisplayType) &&
        Objects.equals(this.alwaysAppearOpen, preOrderConfig.alwaysAppearOpen) &&
        Objects.equals(this.requireExplicitSelectAlways, preOrderConfig.requireExplicitSelectAlways);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leadTimeMinutes, intervalMinutes, maxOrderAheadDays, includeAsap, includeMoreGranularInitialTime, cutOffTimePreviousDayBasic, cutOffTimeCurrentDayBasic, preOrderTimeDisplayType, alwaysAppearOpen, requireExplicitSelectAlways);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreOrderConfig {\n");
    
    sb.append("    leadTimeMinutes: ").append(toIndentedString(leadTimeMinutes)).append("\n");
    sb.append("    intervalMinutes: ").append(toIndentedString(intervalMinutes)).append("\n");
    sb.append("    maxOrderAheadDays: ").append(toIndentedString(maxOrderAheadDays)).append("\n");
    sb.append("    includeAsap: ").append(toIndentedString(includeAsap)).append("\n");
    sb.append("    includeMoreGranularInitialTime: ").append(toIndentedString(includeMoreGranularInitialTime)).append("\n");
    sb.append("    cutOffTimePreviousDayBasic: ").append(toIndentedString(cutOffTimePreviousDayBasic)).append("\n");
    sb.append("    cutOffTimeCurrentDayBasic: ").append(toIndentedString(cutOffTimeCurrentDayBasic)).append("\n");
    sb.append("    preOrderTimeDisplayType: ").append(toIndentedString(preOrderTimeDisplayType)).append("\n");
    sb.append("    alwaysAppearOpen: ").append(toIndentedString(alwaysAppearOpen)).append("\n");
    sb.append("    requireExplicitSelectAlways: ").append(toIndentedString(requireExplicitSelectAlways)).append("\n");
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

