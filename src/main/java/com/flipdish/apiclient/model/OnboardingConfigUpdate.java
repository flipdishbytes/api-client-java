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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-22T14:01:52.558Z")
public class OnboardingConfigUpdate {
  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  @SerializedName("IsWelcomeScreenEnabled")
  private Boolean isWelcomeScreenEnabled = null;

  /**
   * Onboarding config type
   */
  @JsonAdapter(ConfigTypeEnum.Adapter.class)
  public enum ConfigTypeEnum {
    TUTORIAL("Tutorial"),
    
    ONBOARDINGWIZARD("OnboardingWizard");

    private String value;

    ConfigTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConfigTypeEnum fromValue(String text) {
      for (ConfigTypeEnum b : ConfigTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ConfigTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConfigTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConfigTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ConfigTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ConfigType")
  private ConfigTypeEnum configType = null;

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
   * Gets or sets whether welcome screen is enabled
   * @return isWelcomeScreenEnabled
  **/
  @ApiModelProperty(value = "Gets or sets whether welcome screen is enabled")
  public Boolean isIsWelcomeScreenEnabled() {
    return isWelcomeScreenEnabled;
  }

  public void setIsWelcomeScreenEnabled(Boolean isWelcomeScreenEnabled) {
    this.isWelcomeScreenEnabled = isWelcomeScreenEnabled;
  }

  public OnboardingConfigUpdate configType(ConfigTypeEnum configType) {
    this.configType = configType;
    return this;
  }

   /**
   * Onboarding config type
   * @return configType
  **/
  @ApiModelProperty(value = "Onboarding config type")
  public ConfigTypeEnum getConfigType() {
    return configType;
  }

  public void setConfigType(ConfigTypeEnum configType) {
    this.configType = configType;
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
        Objects.equals(this.isWelcomeScreenEnabled, onboardingConfigUpdate.isWelcomeScreenEnabled) &&
        Objects.equals(this.configType, onboardingConfigUpdate.configType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, isWelcomeScreenEnabled, configType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnboardingConfigUpdate {\n");
    
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isWelcomeScreenEnabled: ").append(toIndentedString(isWelcomeScreenEnabled)).append("\n");
    sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
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

