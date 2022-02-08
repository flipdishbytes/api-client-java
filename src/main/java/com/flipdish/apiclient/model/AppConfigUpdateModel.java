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
 * Application configuration
 */
@ApiModel(description = "Application configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-08T14:18:50.949Z")
public class AppConfigUpdateModel {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("HostName")
  private String hostName = null;

  @SerializedName("MainColor")
  private String mainColor = null;

  /**
   * Application Category
   */
  @JsonAdapter(ApplicationCategoryEnum.Adapter.class)
  public enum ApplicationCategoryEnum {
    RESTAURANT("Restaurant"),
    
    CAFE("Cafe"),
    
    CONVENIENCE("Convenience");

    private String value;

    ApplicationCategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ApplicationCategoryEnum fromValue(String text) {
      for (ApplicationCategoryEnum b : ApplicationCategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ApplicationCategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ApplicationCategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ApplicationCategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ApplicationCategoryEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ApplicationCategory")
  private ApplicationCategoryEnum applicationCategory = null;

  @SerializedName("IsPanaceaEnabled")
  private Boolean isPanaceaEnabled = null;

  @SerializedName("CookieConsentPromptEnabled")
  private Boolean cookieConsentPromptEnabled = null;

  public AppConfigUpdateModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * App name.   This is used in various places on the Apple App Store, Google Play Store, mobile apps and websites.
   * @return name
  **/
  @ApiModelProperty(value = "App name.   This is used in various places on the Apple App Store, Google Play Store, mobile apps and websites.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AppConfigUpdateModel hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * HostName on which the web-ordering system is allowed to be hosted or that a Flipdish website is hosted on.
   * @return hostName
  **/
  @ApiModelProperty(value = "HostName on which the web-ordering system is allowed to be hosted or that a Flipdish website is hosted on.")
  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public AppConfigUpdateModel mainColor(String mainColor) {
    this.mainColor = mainColor;
    return this;
  }

   /**
   * Main color of the web / Android / iOS applications
   * @return mainColor
  **/
  @ApiModelProperty(value = "Main color of the web / Android / iOS applications")
  public String getMainColor() {
    return mainColor;
  }

  public void setMainColor(String mainColor) {
    this.mainColor = mainColor;
  }

  public AppConfigUpdateModel applicationCategory(ApplicationCategoryEnum applicationCategory) {
    this.applicationCategory = applicationCategory;
    return this;
  }

   /**
   * Application Category
   * @return applicationCategory
  **/
  @ApiModelProperty(value = "Application Category")
  public ApplicationCategoryEnum getApplicationCategory() {
    return applicationCategory;
  }

  public void setApplicationCategory(ApplicationCategoryEnum applicationCategory) {
    this.applicationCategory = applicationCategory;
  }

  public AppConfigUpdateModel isPanaceaEnabled(Boolean isPanaceaEnabled) {
    this.isPanaceaEnabled = isPanaceaEnabled;
    return this;
  }

   /**
   * Panacea is the term used for websites that are hosted on the my.flipdish.com domain. This value is true when the App&#39;s website is hosted on this domain.  The aternative to using Panacea websites is to use a custom domain.
   * @return isPanaceaEnabled
  **/
  @ApiModelProperty(value = "Panacea is the term used for websites that are hosted on the my.flipdish.com domain. This value is true when the App's website is hosted on this domain.  The aternative to using Panacea websites is to use a custom domain.")
  public Boolean isIsPanaceaEnabled() {
    return isPanaceaEnabled;
  }

  public void setIsPanaceaEnabled(Boolean isPanaceaEnabled) {
    this.isPanaceaEnabled = isPanaceaEnabled;
  }

  public AppConfigUpdateModel cookieConsentPromptEnabled(Boolean cookieConsentPromptEnabled) {
    this.cookieConsentPromptEnabled = cookieConsentPromptEnabled;
    return this;
  }

   /**
   * Cookie Consent Prompt Enabled
   * @return cookieConsentPromptEnabled
  **/
  @ApiModelProperty(value = "Cookie Consent Prompt Enabled")
  public Boolean isCookieConsentPromptEnabled() {
    return cookieConsentPromptEnabled;
  }

  public void setCookieConsentPromptEnabled(Boolean cookieConsentPromptEnabled) {
    this.cookieConsentPromptEnabled = cookieConsentPromptEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppConfigUpdateModel appConfigUpdateModel = (AppConfigUpdateModel) o;
    return Objects.equals(this.name, appConfigUpdateModel.name) &&
        Objects.equals(this.hostName, appConfigUpdateModel.hostName) &&
        Objects.equals(this.mainColor, appConfigUpdateModel.mainColor) &&
        Objects.equals(this.applicationCategory, appConfigUpdateModel.applicationCategory) &&
        Objects.equals(this.isPanaceaEnabled, appConfigUpdateModel.isPanaceaEnabled) &&
        Objects.equals(this.cookieConsentPromptEnabled, appConfigUpdateModel.cookieConsentPromptEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, hostName, mainColor, applicationCategory, isPanaceaEnabled, cookieConsentPromptEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppConfigUpdateModel {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    mainColor: ").append(toIndentedString(mainColor)).append("\n");
    sb.append("    applicationCategory: ").append(toIndentedString(applicationCategory)).append("\n");
    sb.append("    isPanaceaEnabled: ").append(toIndentedString(isPanaceaEnabled)).append("\n");
    sb.append("    cookieConsentPromptEnabled: ").append(toIndentedString(cookieConsentPromptEnabled)).append("\n");
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
