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
import com.flipdish.apiclient.model.ConfiguredStore;
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
 * App store app configuration summary information
 */
@ApiModel(description = "App store app configuration summary information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-11-18T12:42:27.246Z")
public class AppStoreAppConfigurationSummary {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("AppId")
  private String appId = null;

  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  @SerializedName("Stores")
  private List<ConfiguredStore> stores = new ArrayList<ConfiguredStore>();

  /**
   * Configuration type
   */
  @JsonAdapter(ConfigurationTypeEnum.Adapter.class)
  public enum ConfigurationTypeEnum {
    EXTERNALLINK("ExternalLink"),
    
    FLIPDISHHOSTED("FlipdishHosted");

    private String value;

    ConfigurationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConfigurationTypeEnum fromValue(String text) {
      for (ConfigurationTypeEnum b : ConfigurationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ConfigurationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConfigurationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConfigurationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ConfigurationTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ConfigurationType")
  private ConfigurationTypeEnum configurationType = null;

  /**
   * Store selector type
   */
  @JsonAdapter(StoreSelectorTypeEnum.Adapter.class)
  public enum StoreSelectorTypeEnum {
    NONE("None"),
    
    SINGLE("Single"),
    
    MULTIPLE("Multiple");

    private String value;

    StoreSelectorTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StoreSelectorTypeEnum fromValue(String text) {
      for (StoreSelectorTypeEnum b : StoreSelectorTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StoreSelectorTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StoreSelectorTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StoreSelectorTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StoreSelectorTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("StoreSelectorType")
  private StoreSelectorTypeEnum storeSelectorType = null;

  @SerializedName("AppStoreAppId")
  private String appStoreAppId = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Logo")
  private String logo = null;

  @SerializedName("DeveloperName")
  private String developerName = null;

  public AppStoreAppConfigurationSummary id(String id) {
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

  public AppStoreAppConfigurationSummary appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * App Id
   * @return appId
  **/
  @ApiModelProperty(required = true, value = "App Id")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public AppStoreAppConfigurationSummary isEnabled(Boolean isEnabled) {
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

  public AppStoreAppConfigurationSummary stores(List<ConfiguredStore> stores) {
    this.stores = stores;
    return this;
  }

  public AppStoreAppConfigurationSummary addStoresItem(ConfiguredStore storesItem) {
    this.stores.add(storesItem);
    return this;
  }

   /**
   * List of stores
   * @return stores
  **/
  @ApiModelProperty(required = true, value = "List of stores")
  public List<ConfiguredStore> getStores() {
    return stores;
  }

  public void setStores(List<ConfiguredStore> stores) {
    this.stores = stores;
  }

  public AppStoreAppConfigurationSummary configurationType(ConfigurationTypeEnum configurationType) {
    this.configurationType = configurationType;
    return this;
  }

   /**
   * Configuration type
   * @return configurationType
  **/
  @ApiModelProperty(value = "Configuration type")
  public ConfigurationTypeEnum getConfigurationType() {
    return configurationType;
  }

  public void setConfigurationType(ConfigurationTypeEnum configurationType) {
    this.configurationType = configurationType;
  }

  public AppStoreAppConfigurationSummary storeSelectorType(StoreSelectorTypeEnum storeSelectorType) {
    this.storeSelectorType = storeSelectorType;
    return this;
  }

   /**
   * Store selector type
   * @return storeSelectorType
  **/
  @ApiModelProperty(value = "Store selector type")
  public StoreSelectorTypeEnum getStoreSelectorType() {
    return storeSelectorType;
  }

  public void setStoreSelectorType(StoreSelectorTypeEnum storeSelectorType) {
    this.storeSelectorType = storeSelectorType;
  }

  public AppStoreAppConfigurationSummary appStoreAppId(String appStoreAppId) {
    this.appStoreAppId = appStoreAppId;
    return this;
  }

   /**
   * Unique App store app id
   * @return appStoreAppId
  **/
  @ApiModelProperty(required = true, value = "Unique App store app id")
  public String getAppStoreAppId() {
    return appStoreAppId;
  }

  public void setAppStoreAppId(String appStoreAppId) {
    this.appStoreAppId = appStoreAppId;
  }

  public AppStoreAppConfigurationSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of Appstore app
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of Appstore app")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AppStoreAppConfigurationSummary description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AppStoreAppConfigurationSummary logo(String logo) {
    this.logo = logo;
    return this;
  }

   /**
   * Logo
   * @return logo
  **/
  @ApiModelProperty(value = "Logo")
  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public AppStoreAppConfigurationSummary developerName(String developerName) {
    this.developerName = developerName;
    return this;
  }

   /**
   * Developer name
   * @return developerName
  **/
  @ApiModelProperty(value = "Developer name")
  public String getDeveloperName() {
    return developerName;
  }

  public void setDeveloperName(String developerName) {
    this.developerName = developerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStoreAppConfigurationSummary appStoreAppConfigurationSummary = (AppStoreAppConfigurationSummary) o;
    return Objects.equals(this.id, appStoreAppConfigurationSummary.id) &&
        Objects.equals(this.appId, appStoreAppConfigurationSummary.appId) &&
        Objects.equals(this.isEnabled, appStoreAppConfigurationSummary.isEnabled) &&
        Objects.equals(this.stores, appStoreAppConfigurationSummary.stores) &&
        Objects.equals(this.configurationType, appStoreAppConfigurationSummary.configurationType) &&
        Objects.equals(this.storeSelectorType, appStoreAppConfigurationSummary.storeSelectorType) &&
        Objects.equals(this.appStoreAppId, appStoreAppConfigurationSummary.appStoreAppId) &&
        Objects.equals(this.name, appStoreAppConfigurationSummary.name) &&
        Objects.equals(this.description, appStoreAppConfigurationSummary.description) &&
        Objects.equals(this.logo, appStoreAppConfigurationSummary.logo) &&
        Objects.equals(this.developerName, appStoreAppConfigurationSummary.developerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, appId, isEnabled, stores, configurationType, storeSelectorType, appStoreAppId, name, description, logo, developerName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreAppConfigurationSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    stores: ").append(toIndentedString(stores)).append("\n");
    sb.append("    configurationType: ").append(toIndentedString(configurationType)).append("\n");
    sb.append("    storeSelectorType: ").append(toIndentedString(storeSelectorType)).append("\n");
    sb.append("    appStoreAppId: ").append(toIndentedString(appStoreAppId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    developerName: ").append(toIndentedString(developerName)).append("\n");
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

