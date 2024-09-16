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
 * Create an App in an Organisation Request
 */
@ApiModel(description = "Create an App in an Organisation Request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-09-16T14:31:56.180Z")
public class CreateAppInOrg {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("CountryId")
  private String countryId = null;

  @SerializedName("MainColor")
  private String mainColor = null;

  @SerializedName("AppId")
  private String appId = null;

  public CreateAppInOrg name(String name) {
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

  public CreateAppInOrg countryId(String countryId) {
    this.countryId = countryId;
    return this;
  }

   /**
   * Country in ISO 3166-1 alpha-2 standard
   * @return countryId
  **/
  @ApiModelProperty(value = "Country in ISO 3166-1 alpha-2 standard")
  public String getCountryId() {
    return countryId;
  }

  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }

  public CreateAppInOrg mainColor(String mainColor) {
    this.mainColor = mainColor;
    return this;
  }

   /**
   * Main color for the different sales channels
   * @return mainColor
  **/
  @ApiModelProperty(value = "Main color for the different sales channels")
  public String getMainColor() {
    return mainColor;
  }

  public void setMainColor(String mainColor) {
    this.mainColor = mainColor;
  }

  public CreateAppInOrg appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * A predefined AppId
   * @return appId
  **/
  @ApiModelProperty(value = "A predefined AppId")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAppInOrg createAppInOrg = (CreateAppInOrg) o;
    return Objects.equals(this.name, createAppInOrg.name) &&
        Objects.equals(this.countryId, createAppInOrg.countryId) &&
        Objects.equals(this.mainColor, createAppInOrg.mainColor) &&
        Objects.equals(this.appId, createAppInOrg.appId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, countryId, mainColor, appId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAppInOrg {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    mainColor: ").append(toIndentedString(mainColor)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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

