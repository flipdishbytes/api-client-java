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
 * Model for updating the onboarding config
 */
@ApiModel(description = "Model for updating the onboarding config")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-10-17T09:39:41.364Z")
public class OnboardingConfigUpdate {
  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  @SerializedName("IsWelcomeScreenEnabled")
  private Boolean isWelcomeScreenEnabled = null;

  public OnboardingConfigUpdate isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Gets or sets whether onboarding is enabled
   * @return isEnabled
  **/
  @ApiModelProperty(value = "Gets or sets whether onboarding is enabled")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public OnboardingConfigUpdate isWelcomeScreenEnabled(Boolean isWelcomeScreenEnabled) {
    this.isWelcomeScreenEnabled = isWelcomeScreenEnabled;
    return this;
  }

   /**
   * Get isWelcomeScreenEnabled
   * @return isWelcomeScreenEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsWelcomeScreenEnabled() {
    return isWelcomeScreenEnabled;
  }

  public void setIsWelcomeScreenEnabled(Boolean isWelcomeScreenEnabled) {
    this.isWelcomeScreenEnabled = isWelcomeScreenEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnboardingConfigUpdate onboardingConfigUpdate = (OnboardingConfigUpdate) o;
    return Objects.equals(this.isEnabled, onboardingConfigUpdate.isEnabled) &&
        Objects.equals(this.isWelcomeScreenEnabled, onboardingConfigUpdate.isWelcomeScreenEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, isWelcomeScreenEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnboardingConfigUpdate {\n");
    
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isWelcomeScreenEnabled: ").append(toIndentedString(isWelcomeScreenEnabled)).append("\n");
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

