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
 * White label configuration details
 */
@ApiModel(description = "White label configuration details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-01-27T14:05:13.934Z")
public class WhiteLabelConfig {
  @SerializedName("WhiteLabelId")
  private Integer whiteLabelId = null;

  @SerializedName("WhiteLabelName")
  private String whiteLabelName = null;

  @SerializedName("CountryId")
  private String countryId = null;

  @SerializedName("AppNameId")
  private String appNameId = null;

  @SerializedName("Website")
  private String website = null;

  @SerializedName("PanaceaVanityUrl")
  private String panaceaVanityUrl = null;

  public WhiteLabelConfig whiteLabelId(Integer whiteLabelId) {
    this.whiteLabelId = whiteLabelId;
    return this;
  }

   /**
   * White label identifier
   * @return whiteLabelId
  **/
  @ApiModelProperty(value = "White label identifier")
  public Integer getWhiteLabelId() {
    return whiteLabelId;
  }

  public void setWhiteLabelId(Integer whiteLabelId) {
    this.whiteLabelId = whiteLabelId;
  }

  public WhiteLabelConfig whiteLabelName(String whiteLabelName) {
    this.whiteLabelName = whiteLabelName;
    return this;
  }

   /**
   * White label name
   * @return whiteLabelName
  **/
  @ApiModelProperty(value = "White label name")
  public String getWhiteLabelName() {
    return whiteLabelName;
  }

  public void setWhiteLabelName(String whiteLabelName) {
    this.whiteLabelName = whiteLabelName;
  }

  public WhiteLabelConfig countryId(String countryId) {
    this.countryId = countryId;
    return this;
  }

   /**
   * Country identifier
   * @return countryId
  **/
  @ApiModelProperty(value = "Country identifier")
  public String getCountryId() {
    return countryId;
  }

  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }

  public WhiteLabelConfig appNameId(String appNameId) {
    this.appNameId = appNameId;
    return this;
  }

   /**
   * App id
   * @return appNameId
  **/
  @ApiModelProperty(value = "App id")
  public String getAppNameId() {
    return appNameId;
  }

  public void setAppNameId(String appNameId) {
    this.appNameId = appNameId;
  }

  public WhiteLabelConfig website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Website URL
   * @return website
  **/
  @ApiModelProperty(value = "Website URL")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public WhiteLabelConfig panaceaVanityUrl(String panaceaVanityUrl) {
    this.panaceaVanityUrl = panaceaVanityUrl;
    return this;
  }

   /**
   * Panacea vanity URL
   * @return panaceaVanityUrl
  **/
  @ApiModelProperty(value = "Panacea vanity URL")
  public String getPanaceaVanityUrl() {
    return panaceaVanityUrl;
  }

  public void setPanaceaVanityUrl(String panaceaVanityUrl) {
    this.panaceaVanityUrl = panaceaVanityUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhiteLabelConfig whiteLabelConfig = (WhiteLabelConfig) o;
    return Objects.equals(this.whiteLabelId, whiteLabelConfig.whiteLabelId) &&
        Objects.equals(this.whiteLabelName, whiteLabelConfig.whiteLabelName) &&
        Objects.equals(this.countryId, whiteLabelConfig.countryId) &&
        Objects.equals(this.appNameId, whiteLabelConfig.appNameId) &&
        Objects.equals(this.website, whiteLabelConfig.website) &&
        Objects.equals(this.panaceaVanityUrl, whiteLabelConfig.panaceaVanityUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whiteLabelId, whiteLabelName, countryId, appNameId, website, panaceaVanityUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhiteLabelConfig {\n");
    
    sb.append("    whiteLabelId: ").append(toIndentedString(whiteLabelId)).append("\n");
    sb.append("    whiteLabelName: ").append(toIndentedString(whiteLabelName)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    appNameId: ").append(toIndentedString(appNameId)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    panaceaVanityUrl: ").append(toIndentedString(panaceaVanityUrl)).append("\n");
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

