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
 * Mobile Apps form submission
 */
@ApiModel(description = "Mobile Apps form submission")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-20T13:59:48.716+01:00")
public class MobileAppConfig {
  @SerializedName("AutoPublish")
  private Boolean autoPublish = null;

  public MobileAppConfig autoPublish(Boolean autoPublish) {
    this.autoPublish = autoPublish;
    return this;
  }

   /**
   * App Name
   * @return autoPublish
  **/
  @ApiModelProperty(value = "App Name")
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
    MobileAppConfig mobileAppConfig = (MobileAppConfig) o;
    return Objects.equals(this.autoPublish, mobileAppConfig.autoPublish);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoPublish);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileAppConfig {\n");
    
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

