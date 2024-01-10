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
 * App store app configuration webhook event
 */
@ApiModel(description = "App store app configuration webhook event")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-10T14:21:53.091Z")
public class UpdateAppStoreAppConfigurationWebhookDTO {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  @SerializedName("StoreIds")
  private List<Integer> storeIds = null;

  @SerializedName("Settings")
  private List<Setting> settings = null;

  public UpdateAppStoreAppConfigurationWebhookDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique App store app configuration id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique App store app configuration id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UpdateAppStoreAppConfigurationWebhookDTO isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Is enabled
   * @return isEnabled
  **/
  @ApiModelProperty(required = true, value = "Is enabled")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public UpdateAppStoreAppConfigurationWebhookDTO storeIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
    return this;
  }

  public UpdateAppStoreAppConfigurationWebhookDTO addStoreIdsItem(Integer storeIdsItem) {
    if (this.storeIds == null) {
      this.storeIds = new ArrayList<Integer>();
    }
    this.storeIds.add(storeIdsItem);
    return this;
  }

   /**
   * Store id&#39;s
   * @return storeIds
  **/
  @ApiModelProperty(value = "Store id's")
  public List<Integer> getStoreIds() {
    return storeIds;
  }

  public void setStoreIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
  }

  public UpdateAppStoreAppConfigurationWebhookDTO settings(List<Setting> settings) {
    this.settings = settings;
    return this;
  }

  public UpdateAppStoreAppConfigurationWebhookDTO addSettingsItem(Setting settingsItem) {
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
    UpdateAppStoreAppConfigurationWebhookDTO updateAppStoreAppConfigurationWebhookDTO = (UpdateAppStoreAppConfigurationWebhookDTO) o;
    return Objects.equals(this.id, updateAppStoreAppConfigurationWebhookDTO.id) &&
        Objects.equals(this.isEnabled, updateAppStoreAppConfigurationWebhookDTO.isEnabled) &&
        Objects.equals(this.storeIds, updateAppStoreAppConfigurationWebhookDTO.storeIds) &&
        Objects.equals(this.settings, updateAppStoreAppConfigurationWebhookDTO.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isEnabled, storeIds, settings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAppStoreAppConfigurationWebhookDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    storeIds: ").append(toIndentedString(storeIds)).append("\n");
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

