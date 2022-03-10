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
import com.flipdish.apiclient.model.AppConfigurationSetting;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UpdateAppConfiguration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-10T15:15:38.717Z")
public class UpdateAppConfiguration {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("PhysicalRestaurants")
  private List<Integer> physicalRestaurants = null;

  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  @SerializedName("Settings")
  private List<AppConfigurationSetting> settings = null;

  public UpdateAppConfiguration id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UpdateAppConfiguration physicalRestaurants(List<Integer> physicalRestaurants) {
    this.physicalRestaurants = physicalRestaurants;
    return this;
  }

  public UpdateAppConfiguration addPhysicalRestaurantsItem(Integer physicalRestaurantsItem) {
    if (this.physicalRestaurants == null) {
      this.physicalRestaurants = new ArrayList<Integer>();
    }
    this.physicalRestaurants.add(physicalRestaurantsItem);
    return this;
  }

   /**
   * Get physicalRestaurants
   * @return physicalRestaurants
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getPhysicalRestaurants() {
    return physicalRestaurants;
  }

  public void setPhysicalRestaurants(List<Integer> physicalRestaurants) {
    this.physicalRestaurants = physicalRestaurants;
  }

  public UpdateAppConfiguration isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public UpdateAppConfiguration settings(List<AppConfigurationSetting> settings) {
    this.settings = settings;
    return this;
  }

  public UpdateAppConfiguration addSettingsItem(AppConfigurationSetting settingsItem) {
    if (this.settings == null) {
      this.settings = new ArrayList<AppConfigurationSetting>();
    }
    this.settings.add(settingsItem);
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @ApiModelProperty(value = "")
  public List<AppConfigurationSetting> getSettings() {
    return settings;
  }

  public void setSettings(List<AppConfigurationSetting> settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAppConfiguration updateAppConfiguration = (UpdateAppConfiguration) o;
    return Objects.equals(this.id, updateAppConfiguration.id) &&
        Objects.equals(this.physicalRestaurants, updateAppConfiguration.physicalRestaurants) &&
        Objects.equals(this.isEnabled, updateAppConfiguration.isEnabled) &&
        Objects.equals(this.settings, updateAppConfiguration.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, physicalRestaurants, isEnabled, settings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAppConfiguration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    physicalRestaurants: ").append(toIndentedString(physicalRestaurants)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

