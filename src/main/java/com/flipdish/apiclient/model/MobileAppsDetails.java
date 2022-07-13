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
 * Mobile Apps form submission
 */
@ApiModel(description = "Mobile Apps form submission")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-13T14:26:54.618+01:00")
public class MobileAppsDetails {
  @SerializedName("AppName")
  private String appName = null;

  @SerializedName("AppDescription")
  private String appDescription = null;

  @SerializedName("AppShortDescription")
  private String appShortDescription = null;

  @SerializedName("Keywords")
  private List<String> keywords = null;

  @SerializedName("AppLogoUrl")
  private String appLogoUrl = null;

  public MobileAppsDetails appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * App Name
   * @return appName
  **/
  @ApiModelProperty(value = "App Name")
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public MobileAppsDetails appDescription(String appDescription) {
    this.appDescription = appDescription;
    return this;
  }

   /**
   * App Description
   * @return appDescription
  **/
  @ApiModelProperty(value = "App Description")
  public String getAppDescription() {
    return appDescription;
  }

  public void setAppDescription(String appDescription) {
    this.appDescription = appDescription;
  }

  public MobileAppsDetails appShortDescription(String appShortDescription) {
    this.appShortDescription = appShortDescription;
    return this;
  }

   /**
   * App Description
   * @return appShortDescription
  **/
  @ApiModelProperty(value = "App Description")
  public String getAppShortDescription() {
    return appShortDescription;
  }

  public void setAppShortDescription(String appShortDescription) {
    this.appShortDescription = appShortDescription;
  }

  public MobileAppsDetails keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public MobileAppsDetails addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<String>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Keywords
   * @return keywords
  **/
  @ApiModelProperty(value = "Keywords")
  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  public MobileAppsDetails appLogoUrl(String appLogoUrl) {
    this.appLogoUrl = appLogoUrl;
    return this;
  }

   /**
   * Logo URL
   * @return appLogoUrl
  **/
  @ApiModelProperty(value = "Logo URL")
  public String getAppLogoUrl() {
    return appLogoUrl;
  }

  public void setAppLogoUrl(String appLogoUrl) {
    this.appLogoUrl = appLogoUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileAppsDetails mobileAppsDetails = (MobileAppsDetails) o;
    return Objects.equals(this.appName, mobileAppsDetails.appName) &&
        Objects.equals(this.appDescription, mobileAppsDetails.appDescription) &&
        Objects.equals(this.appShortDescription, mobileAppsDetails.appShortDescription) &&
        Objects.equals(this.keywords, mobileAppsDetails.keywords) &&
        Objects.equals(this.appLogoUrl, mobileAppsDetails.appLogoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, appDescription, appShortDescription, keywords, appLogoUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileAppsDetails {\n");
    
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appDescription: ").append(toIndentedString(appDescription)).append("\n");
    sb.append("    appShortDescription: ").append(toIndentedString(appShortDescription)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    appLogoUrl: ").append(toIndentedString(appLogoUrl)).append("\n");
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

