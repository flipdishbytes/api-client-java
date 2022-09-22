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
 * SSO Embed URL Information
 */
@ApiModel(description = "SSO Embed URL Information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-22T11:16:23.089+01:00")
public class DashboardEmbed {
  @SerializedName("EmbedUrl")
  private String embedUrl = null;

  public DashboardEmbed embedUrl(String embedUrl) {
    this.embedUrl = embedUrl;
    return this;
  }

   /**
   * SSO URL generated by Flipdish to embed Looker dashboard
   * @return embedUrl
  **/
  @ApiModelProperty(value = "SSO URL generated by Flipdish to embed Looker dashboard")
  public String getEmbedUrl() {
    return embedUrl;
  }

  public void setEmbedUrl(String embedUrl) {
    this.embedUrl = embedUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardEmbed dashboardEmbed = (DashboardEmbed) o;
    return Objects.equals(this.embedUrl, dashboardEmbed.embedUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embedUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardEmbed {\n");
    
    sb.append("    embedUrl: ").append(toIndentedString(embedUrl)).append("\n");
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

