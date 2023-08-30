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
 * Represents a localised time zone
 */
@ApiModel(description = "Represents a localised time zone")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-08-30T13:05:53.551+01:00")
public class LocalisedTimeZone {
  @SerializedName("TimeZoneId")
  private String timeZoneId = null;

  @SerializedName("IanaTimeZoneId")
  private String ianaTimeZoneId = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  public LocalisedTimeZone timeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
    return this;
  }

   /**
   * Microsoft Time Zone Id
   * @return timeZoneId
  **/
  @ApiModelProperty(value = "Microsoft Time Zone Id")
  public String getTimeZoneId() {
    return timeZoneId;
  }

  public void setTimeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
  }

  public LocalisedTimeZone ianaTimeZoneId(String ianaTimeZoneId) {
    this.ianaTimeZoneId = ianaTimeZoneId;
    return this;
  }

   /**
   * Iana Time Zone Id
   * @return ianaTimeZoneId
  **/
  @ApiModelProperty(value = "Iana Time Zone Id")
  public String getIanaTimeZoneId() {
    return ianaTimeZoneId;
  }

  public void setIanaTimeZoneId(String ianaTimeZoneId) {
    this.ianaTimeZoneId = ianaTimeZoneId;
  }

  public LocalisedTimeZone displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name in users language
   * @return displayName
  **/
  @ApiModelProperty(value = "Display name in users language")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalisedTimeZone localisedTimeZone = (LocalisedTimeZone) o;
    return Objects.equals(this.timeZoneId, localisedTimeZone.timeZoneId) &&
        Objects.equals(this.ianaTimeZoneId, localisedTimeZone.ianaTimeZoneId) &&
        Objects.equals(this.displayName, localisedTimeZone.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeZoneId, ianaTimeZoneId, displayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalisedTimeZone {\n");
    
    sb.append("    timeZoneId: ").append(toIndentedString(timeZoneId)).append("\n");
    sb.append("    ianaTimeZoneId: ").append(toIndentedString(ianaTimeZoneId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

