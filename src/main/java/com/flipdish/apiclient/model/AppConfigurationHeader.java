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
 * Configured app item for list
 */
@ApiModel(description = "Configured app item for list")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T15:41:59.208Z")
public class AppConfigurationHeader {
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

  public AppConfigurationHeader appStoreAppId(String appStoreAppId) {
    this.appStoreAppId = appStoreAppId;
    return this;
  }

   /**
   * AppStore App Id
   * @return appStoreAppId
  **/
  @ApiModelProperty(required = true, value = "AppStore App Id")
  public String getAppStoreAppId() {
    return appStoreAppId;
  }

  public void setAppStoreAppId(String appStoreAppId) {
    this.appStoreAppId = appStoreAppId;
  }

  public AppConfigurationHeader name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AppConfigurationHeader description(String description) {
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

  public AppConfigurationHeader logo(String logo) {
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

  public AppConfigurationHeader developerName(String developerName) {
    this.developerName = developerName;
    return this;
  }

   /**
   * Developer Name
   * @return developerName
  **/
  @ApiModelProperty(value = "Developer Name")
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
    AppConfigurationHeader appConfigurationHeader = (AppConfigurationHeader) o;
    return Objects.equals(this.appStoreAppId, appConfigurationHeader.appStoreAppId) &&
        Objects.equals(this.name, appConfigurationHeader.name) &&
        Objects.equals(this.description, appConfigurationHeader.description) &&
        Objects.equals(this.logo, appConfigurationHeader.logo) &&
        Objects.equals(this.developerName, appConfigurationHeader.developerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appStoreAppId, name, description, logo, developerName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppConfigurationHeader {\n");
    
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

