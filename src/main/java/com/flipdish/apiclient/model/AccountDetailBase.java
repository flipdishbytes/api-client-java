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
 * Account Details Base
 */
@ApiModel(description = "Account Details Base")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-31T15:06:05.506Z")
public class AccountDetailBase {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Language")
  private String language = null;

  @SerializedName("TimeZoneInfoId")
  private String timeZoneInfoId = null;

  @SerializedName("DisplayTimesInUserLocalTimeZone")
  private Boolean displayTimesInUserLocalTimeZone = null;

  @SerializedName("ShowHiddenFeatures")
  private Boolean showHiddenFeatures = null;

  public AccountDetailBase name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccountDetailBase language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Language Id
   * @return language
  **/
  @ApiModelProperty(value = "Language Id")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public AccountDetailBase timeZoneInfoId(String timeZoneInfoId) {
    this.timeZoneInfoId = timeZoneInfoId;
    return this;
  }

   /**
   * Time Zone Info Id
   * @return timeZoneInfoId
  **/
  @ApiModelProperty(value = "Time Zone Info Id")
  public String getTimeZoneInfoId() {
    return timeZoneInfoId;
  }

  public void setTimeZoneInfoId(String timeZoneInfoId) {
    this.timeZoneInfoId = timeZoneInfoId;
  }

  public AccountDetailBase displayTimesInUserLocalTimeZone(Boolean displayTimesInUserLocalTimeZone) {
    this.displayTimesInUserLocalTimeZone = displayTimesInUserLocalTimeZone;
    return this;
  }

   /**
   * Display the time in time zone local to the user
   * @return displayTimesInUserLocalTimeZone
  **/
  @ApiModelProperty(value = "Display the time in time zone local to the user")
  public Boolean isDisplayTimesInUserLocalTimeZone() {
    return displayTimesInUserLocalTimeZone;
  }

  public void setDisplayTimesInUserLocalTimeZone(Boolean displayTimesInUserLocalTimeZone) {
    this.displayTimesInUserLocalTimeZone = displayTimesInUserLocalTimeZone;
  }

  public AccountDetailBase showHiddenFeatures(Boolean showHiddenFeatures) {
    this.showHiddenFeatures = showHiddenFeatures;
    return this;
  }

   /**
   * Show hidden features
   * @return showHiddenFeatures
  **/
  @ApiModelProperty(value = "Show hidden features")
  public Boolean isShowHiddenFeatures() {
    return showHiddenFeatures;
  }

  public void setShowHiddenFeatures(Boolean showHiddenFeatures) {
    this.showHiddenFeatures = showHiddenFeatures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDetailBase accountDetailBase = (AccountDetailBase) o;
    return Objects.equals(this.name, accountDetailBase.name) &&
        Objects.equals(this.language, accountDetailBase.language) &&
        Objects.equals(this.timeZoneInfoId, accountDetailBase.timeZoneInfoId) &&
        Objects.equals(this.displayTimesInUserLocalTimeZone, accountDetailBase.displayTimesInUserLocalTimeZone) &&
        Objects.equals(this.showHiddenFeatures, accountDetailBase.showHiddenFeatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, language, timeZoneInfoId, displayTimesInUserLocalTimeZone, showHiddenFeatures);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDetailBase {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    timeZoneInfoId: ").append(toIndentedString(timeZoneInfoId)).append("\n");
    sb.append("    displayTimesInUserLocalTimeZone: ").append(toIndentedString(displayTimesInUserLocalTimeZone)).append("\n");
    sb.append("    showHiddenFeatures: ").append(toIndentedString(showHiddenFeatures)).append("\n");
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

