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
 * Kiosk level settings
 */
@ApiModel(description = "Kiosk level settings")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class KioskSettings {
  @SerializedName("HideLogoFromFrontPage")
  private Boolean hideLogoFromFrontPage = null;

  @SerializedName("TwoColumnMenuLayout")
  private Boolean twoColumnMenuLayout = null;

  public KioskSettings hideLogoFromFrontPage(Boolean hideLogoFromFrontPage) {
    this.hideLogoFromFrontPage = hideLogoFromFrontPage;
    return this;
  }

   /**
   * Hide logo from front page
   * @return hideLogoFromFrontPage
  **/
  @ApiModelProperty(value = "Hide logo from front page")
  public Boolean isHideLogoFromFrontPage() {
    return hideLogoFromFrontPage;
  }

  public void setHideLogoFromFrontPage(Boolean hideLogoFromFrontPage) {
    this.hideLogoFromFrontPage = hideLogoFromFrontPage;
  }

  public KioskSettings twoColumnMenuLayout(Boolean twoColumnMenuLayout) {
    this.twoColumnMenuLayout = twoColumnMenuLayout;
    return this;
  }

   /**
   * 2 Column Menu Layout
   * @return twoColumnMenuLayout
  **/
  @ApiModelProperty(value = "2 Column Menu Layout")
  public Boolean isTwoColumnMenuLayout() {
    return twoColumnMenuLayout;
  }

  public void setTwoColumnMenuLayout(Boolean twoColumnMenuLayout) {
    this.twoColumnMenuLayout = twoColumnMenuLayout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KioskSettings kioskSettings = (KioskSettings) o;
    return Objects.equals(this.hideLogoFromFrontPage, kioskSettings.hideLogoFromFrontPage) &&
        Objects.equals(this.twoColumnMenuLayout, kioskSettings.twoColumnMenuLayout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hideLogoFromFrontPage, twoColumnMenuLayout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KioskSettings {\n");
    
    sb.append("    hideLogoFromFrontPage: ").append(toIndentedString(hideLogoFromFrontPage)).append("\n");
    sb.append("    twoColumnMenuLayout: ").append(toIndentedString(twoColumnMenuLayout)).append("\n");
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

