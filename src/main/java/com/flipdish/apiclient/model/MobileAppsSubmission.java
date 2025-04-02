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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-02T11:34:10.106Z")
public class MobileAppsSubmission {
  @SerializedName("SubmissionId")
  private Integer submissionId = null;

  @SerializedName("AppName")
  private String appName = null;

  @SerializedName("AppDescription")
  private String appDescription = null;

  @SerializedName("AppShortDescription")
  private String appShortDescription = null;

  @SerializedName("Keywords")
  private List<String> keywords = null;

  @SerializedName("AutoPublish")
  private Boolean autoPublish = null;

  public MobileAppsSubmission submissionId(Integer submissionId) {
    this.submissionId = submissionId;
    return this;
  }

   /**
   * Mobile Apps Submission Id
   * @return submissionId
  **/
  @ApiModelProperty(value = "Mobile Apps Submission Id")
  public Integer getSubmissionId() {
    return submissionId;
  }

  public void setSubmissionId(Integer submissionId) {
    this.submissionId = submissionId;
  }

  public MobileAppsSubmission appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * App Name
   * @return appName
  **/
  @ApiModelProperty(required = true, value = "App Name")
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public MobileAppsSubmission appDescription(String appDescription) {
    this.appDescription = appDescription;
    return this;
  }

   /**
   * App Description
   * @return appDescription
  **/
  @ApiModelProperty(required = true, value = "App Description")
  public String getAppDescription() {
    return appDescription;
  }

  public void setAppDescription(String appDescription) {
    this.appDescription = appDescription;
  }

  public MobileAppsSubmission appShortDescription(String appShortDescription) {
    this.appShortDescription = appShortDescription;
    return this;
  }

   /**
   * App Description
   * @return appShortDescription
  **/
  @ApiModelProperty(required = true, value = "App Description")
  public String getAppShortDescription() {
    return appShortDescription;
  }

  public void setAppShortDescription(String appShortDescription) {
    this.appShortDescription = appShortDescription;
  }

  public MobileAppsSubmission keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public MobileAppsSubmission addKeywordsItem(String keywordsItem) {
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

  public MobileAppsSubmission autoPublish(Boolean autoPublish) {
    this.autoPublish = autoPublish;
    return this;
  }

   /**
   * Publish automatically
   * @return autoPublish
  **/
  @ApiModelProperty(value = "Publish automatically")
  public Boolean isAutoPublish() {
    return autoPublish;
  }

  public void setAutoPublish(Boolean autoPublish) {
    this.autoPublish = autoPublish;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileAppsSubmission mobileAppsSubmission = (MobileAppsSubmission) o;
    return Objects.equals(this.submissionId, mobileAppsSubmission.submissionId) &&
        Objects.equals(this.appName, mobileAppsSubmission.appName) &&
        Objects.equals(this.appDescription, mobileAppsSubmission.appDescription) &&
        Objects.equals(this.appShortDescription, mobileAppsSubmission.appShortDescription) &&
        Objects.equals(this.keywords, mobileAppsSubmission.keywords) &&
        Objects.equals(this.autoPublish, mobileAppsSubmission.autoPublish);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submissionId, appName, appDescription, appShortDescription, keywords, autoPublish);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileAppsSubmission {\n");
    
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appDescription: ").append(toIndentedString(appDescription)).append("\n");
    sb.append("    appShortDescription: ").append(toIndentedString(appShortDescription)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    autoPublish: ").append(toIndentedString(autoPublish)).append("\n");
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

