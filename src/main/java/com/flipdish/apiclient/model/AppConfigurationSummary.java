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
import com.flipdish.apiclient.model.ConfiguredPhysicalRestaurant;
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
 * Application Configuration Summary  &lt;remarks&gt;Header information for display in lists, like list of apps&lt;/remarks&gt;
 */
@ApiModel(description = "Application Configuration Summary  <remarks>Header information for display in lists, like list of apps</remarks>")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-01T15:14:53.315Z")
public class AppConfigurationSummary {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("AppId")
  private String appId = null;

  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  @SerializedName("PhysicalRestaurants")
  private List<ConfiguredPhysicalRestaurant> physicalRestaurants = new ArrayList<ConfiguredPhysicalRestaurant>();

  /**
   * Configuration Type
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
   * Store Selector Type
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

  public AppConfigurationSummary id(String id) {
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

  public AppConfigurationSummary appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Whitelabel App Id
   * @return appId
  **/
  @ApiModelProperty(required = true, value = "Whitelabel App Id")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public AppConfigurationSummary isEnabled(Boolean isEnabled) {
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

  public AppConfigurationSummary physicalRestaurants(List<ConfiguredPhysicalRestaurant> physicalRestaurants) {
    this.physicalRestaurants = physicalRestaurants;
    return this;
  }

  public AppConfigurationSummary addPhysicalRestaurantsItem(ConfiguredPhysicalRestaurant physicalRestaurantsItem) {
    this.physicalRestaurants.add(physicalRestaurantsItem);
    return this;
  }

   /**
   * List of restaurants
   * @return physicalRestaurants
  **/
  @ApiModelProperty(required = true, value = "List of restaurants")
  public List<ConfiguredPhysicalRestaurant> getPhysicalRestaurants() {
    return physicalRestaurants;
  }

  public void setPhysicalRestaurants(List<ConfiguredPhysicalRestaurant> physicalRestaurants) {
    this.physicalRestaurants = physicalRestaurants;
  }

  public AppConfigurationSummary configurationType(ConfigurationTypeEnum configurationType) {
    this.configurationType = configurationType;
    return this;
  }

   /**
   * Configuration Type
   * @return configurationType
  **/
  @ApiModelProperty(value = "Configuration Type")
  public ConfigurationTypeEnum getConfigurationType() {
    return configurationType;
  }

  public void setConfigurationType(ConfigurationTypeEnum configurationType) {
    this.configurationType = configurationType;
  }

  public AppConfigurationSummary storeSelectorType(StoreSelectorTypeEnum storeSelectorType) {
    this.storeSelectorType = storeSelectorType;
    return this;
  }

   /**
   * Store Selector Type
   * @return storeSelectorType
  **/
  @ApiModelProperty(value = "Store Selector Type")
  public StoreSelectorTypeEnum getStoreSelectorType() {
    return storeSelectorType;
  }

  public void setStoreSelectorType(StoreSelectorTypeEnum storeSelectorType) {
    this.storeSelectorType = storeSelectorType;
  }

  public AppConfigurationSummary appStoreAppId(String appStoreAppId) {
    this.appStoreAppId = appStoreAppId;
    return this;
  }

   /**
   * AppStore App Id
   * @return appStoreAppId
  **/
  @ApiModelProperty(required = true, value = "AppStore App Id")
  public String getAppStoreAppId() {
    return appStoreAppId;
  }

  public void setAppStoreAppId(String appStoreAppId) {
    this.appStoreAppId = appStoreAppId;
  }

  public AppConfigurationSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AppConfigurationSummary description(String description) {
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

  public AppConfigurationSummary logo(String logo) {
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

  public AppConfigurationSummary developerName(String developerName) {
    this.developerName = developerName;
    return this;
  }

   /**
   * Developer Name
   * @return developerName
  **/
  @ApiModelProperty(value = "Developer Name")
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
    AppConfigurationSummary appConfigurationSummary = (AppConfigurationSummary) o;
    return Objects.equals(this.id, appConfigurationSummary.id) &&
        Objects.equals(this.appId, appConfigurationSummary.appId) &&
        Objects.equals(this.isEnabled, appConfigurationSummary.isEnabled) &&
        Objects.equals(this.physicalRestaurants, appConfigurationSummary.physicalRestaurants) &&
        Objects.equals(this.configurationType, appConfigurationSummary.configurationType) &&
        Objects.equals(this.storeSelectorType, appConfigurationSummary.storeSelectorType) &&
        Objects.equals(this.appStoreAppId, appConfigurationSummary.appStoreAppId) &&
        Objects.equals(this.name, appConfigurationSummary.name) &&
        Objects.equals(this.description, appConfigurationSummary.description) &&
        Objects.equals(this.logo, appConfigurationSummary.logo) &&
        Objects.equals(this.developerName, appConfigurationSummary.developerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, appId, isEnabled, physicalRestaurants, configurationType, storeSelectorType, appStoreAppId, name, description, logo, developerName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppConfigurationSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    physicalRestaurants: ").append(toIndentedString(physicalRestaurants)).append("\n");
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

