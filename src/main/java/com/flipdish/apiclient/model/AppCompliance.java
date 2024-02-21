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
 * Application compliance model
 */
@ApiModel(description = "Application compliance model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-21T13:31:03.338Z")
public class AppCompliance {
  @SerializedName("AppId")
  private String appId = null;

  /**
   * Type of compliance.  This controls if the Flipdish websites and apps display cookie consent banners and adjust cookies to be inline with various regulations.   You should set this correctly based on your region.
   */
  @JsonAdapter(ComplianceTypeEnum.Adapter.class)
  public enum ComplianceTypeEnum {
    DEFAULT("Default"),
    
    GDPRCOMPLIANCE("GdprCompliance");

    private String value;

    ComplianceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ComplianceTypeEnum fromValue(String text) {
      for (ComplianceTypeEnum b : ComplianceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ComplianceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ComplianceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ComplianceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ComplianceTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ComplianceType")
  private ComplianceTypeEnum complianceType = null;

  @SerializedName("AllowDisablingOfGdpr")
  private Boolean allowDisablingOfGdpr = null;

  public AppCompliance appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * App ID
   * @return appId
  **/
  @ApiModelProperty(value = "App ID")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public AppCompliance complianceType(ComplianceTypeEnum complianceType) {
    this.complianceType = complianceType;
    return this;
  }

   /**
   * Type of compliance.  This controls if the Flipdish websites and apps display cookie consent banners and adjust cookies to be inline with various regulations.   You should set this correctly based on your region.
   * @return complianceType
  **/
  @ApiModelProperty(value = "Type of compliance.  This controls if the Flipdish websites and apps display cookie consent banners and adjust cookies to be inline with various regulations.   You should set this correctly based on your region.")
  public ComplianceTypeEnum getComplianceType() {
    return complianceType;
  }

  public void setComplianceType(ComplianceTypeEnum complianceType) {
    this.complianceType = complianceType;
  }

  public AppCompliance allowDisablingOfGdpr(Boolean allowDisablingOfGdpr) {
    this.allowDisablingOfGdpr = allowDisablingOfGdpr;
    return this;
  }

   /**
   * For EU countries, we should not allow to change the option to “Default banner”, but all other countries should be able to do so.
   * @return allowDisablingOfGdpr
  **/
  @ApiModelProperty(value = "For EU countries, we should not allow to change the option to “Default banner”, but all other countries should be able to do so.")
  public Boolean isAllowDisablingOfGdpr() {
    return allowDisablingOfGdpr;
  }

  public void setAllowDisablingOfGdpr(Boolean allowDisablingOfGdpr) {
    this.allowDisablingOfGdpr = allowDisablingOfGdpr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppCompliance appCompliance = (AppCompliance) o;
    return Objects.equals(this.appId, appCompliance.appId) &&
        Objects.equals(this.complianceType, appCompliance.complianceType) &&
        Objects.equals(this.allowDisablingOfGdpr, appCompliance.allowDisablingOfGdpr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, complianceType, allowDisablingOfGdpr);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppCompliance {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    complianceType: ").append(toIndentedString(complianceType)).append("\n");
    sb.append("    allowDisablingOfGdpr: ").append(toIndentedString(allowDisablingOfGdpr)).append("\n");
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

