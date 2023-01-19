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
 * App store app configuration header information
 */
@ApiModel(description = "App store app configuration header information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-19T08:27:38.139Z")
public class AppStoreAppConfigurationHeader {
  @SerializedName("AppStoreAppId")
  private String appStoreAppId = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Logo")
  private String logo = null;

  @SerializedName("DeveloperName")
  private String developerName = null;

  public AppStoreAppConfigurationHeader appStoreAppId(String appStoreAppId) {
    this.appStoreAppId = appStoreAppId;
    return this;
  }

   /**
   * Unique App store app id
   * @return appStoreAppId
  **/
  @ApiModelProperty(required = true, value = "Unique App store app id")
  public String getAppStoreAppId() {
    return appStoreAppId;
  }

  public void setAppStoreAppId(String appStoreAppId) {
    this.appStoreAppId = appStoreAppId;
  }

  public AppStoreAppConfigurationHeader name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of Appstore app
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of Appstore app")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AppStoreAppConfigurationHeader description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AppStoreAppConfigurationHeader logo(String logo) {
    this.logo = logo;
    return this;
  }

   /**
   * Logo
   * @return logo
  **/
  @ApiModelProperty(value = "Logo")
  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public AppStoreAppConfigurationHeader developerName(String developerName) {
    this.developerName = developerName;
    return this;
  }

   /**
   * Developer name
   * @return developerName
  **/
  @ApiModelProperty(value = "Developer name")
  public String getDeveloperName() {
    return developerName;
  }

  public void setDeveloperName(String developerName) {
    this.developerName = developerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStoreAppConfigurationHeader appStoreAppConfigurationHeader = (AppStoreAppConfigurationHeader) o;
    return Objects.equals(this.appStoreAppId, appStoreAppConfigurationHeader.appStoreAppId) &&
        Objects.equals(this.name, appStoreAppConfigurationHeader.name) &&
        Objects.equals(this.description, appStoreAppConfigurationHeader.description) &&
        Objects.equals(this.logo, appStoreAppConfigurationHeader.logo) &&
        Objects.equals(this.developerName, appStoreAppConfigurationHeader.developerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appStoreAppId, name, description, logo, developerName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreAppConfigurationHeader {\n");
    
    sb.append("    appStoreAppId: ").append(toIndentedString(appStoreAppId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    developerName: ").append(toIndentedString(developerName)).append("\n");
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

