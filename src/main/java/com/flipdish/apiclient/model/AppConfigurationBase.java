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
import com.flipdish.apiclient.model.Setting;
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
 * Application Configuration Base
 */
@ApiModel(description = "Application Configuration Base")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-08T09:43:56.761Z")
public class AppConfigurationBase {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  @SerializedName("PhysicalRestaurants")
  private List<Integer> physicalRestaurants = null;

  @SerializedName("Settings")
  private List<Setting> settings = null;

  public AppConfigurationBase id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Application Configuration Public Id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Application Configuration Public Id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AppConfigurationBase isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Is Enabled
   * @return isEnabled
  **/
  @ApiModelProperty(required = true, value = "Is Enabled")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public AppConfigurationBase physicalRestaurants(List<Integer> physicalRestaurants) {
    this.physicalRestaurants = physicalRestaurants;
    return this;
  }

  public AppConfigurationBase addPhysicalRestaurantsItem(Integer physicalRestaurantsItem) {
    if (this.physicalRestaurants == null) {
      this.physicalRestaurants = new ArrayList<Integer>();
    }
    this.physicalRestaurants.add(physicalRestaurantsItem);
    return this;
  }

   /**
   * Physical Restaurant Id&#39;s
   * @return physicalRestaurants
  **/
  @ApiModelProperty(value = "Physical Restaurant Id's")
  public List<Integer> getPhysicalRestaurants() {
    return physicalRestaurants;
  }

  public void setPhysicalRestaurants(List<Integer> physicalRestaurants) {
    this.physicalRestaurants = physicalRestaurants;
  }

  public AppConfigurationBase settings(List<Setting> settings) {
    this.settings = settings;
    return this;
  }

  public AppConfigurationBase addSettingsItem(Setting settingsItem) {
    if (this.settings == null) {
      this.settings = new ArrayList<Setting>();
    }
    this.settings.add(settingsItem);
    return this;
  }

   /**
   * Settings
   * @return settings
  **/
  @ApiModelProperty(value = "Settings")
  public List<Setting> getSettings() {
    return settings;
  }

  public void setSettings(List<Setting> settings) {
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
    AppConfigurationBase appConfigurationBase = (AppConfigurationBase) o;
    return Objects.equals(this.id, appConfigurationBase.id) &&
        Objects.equals(this.isEnabled, appConfigurationBase.isEnabled) &&
        Objects.equals(this.physicalRestaurants, appConfigurationBase.physicalRestaurants) &&
        Objects.equals(this.settings, appConfigurationBase.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isEnabled, physicalRestaurants, settings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppConfigurationBase {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    physicalRestaurants: ").append(toIndentedString(physicalRestaurants)).append("\n");
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

