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
import com.flipdish.apiclient.model.FieldGroup;
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
 * Application configuration detail
 */
@ApiModel(description = "Application configuration detail")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-04T12:13:53.469Z")
public class AppConfigurationDetail {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("AppId")
  private String appId = null;

  @SerializedName("AppStoreAppId")
  private String appStoreAppId = null;

  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  @SerializedName("PhysicalRestaurants")
  private List<Integer> physicalRestaurants = null;

  @SerializedName("Settings")
  private List<Setting> settings = null;

  /**
   * Configuration Type  &lt;example&gt;ExternalLink&lt;/example&gt;&lt;example&gt;FlipdishHosted&lt;/example&gt;
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

  @SerializedName("FieldGroups")
  private List<FieldGroup> fieldGroups = null;

  @SerializedName("SetupInstructions")
  private String setupInstructions = null;

  @SerializedName("ExternalSetupLink")
  private String externalSetupLink = null;

  @SerializedName("OAuthAppId")
  private String oauthAppId = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Logo")
  private String logo = null;

  /**
   * Application verification status
   */
  @JsonAdapter(VerificationStatusEnum.Adapter.class)
  public enum VerificationStatusEnum {
    DRAFT("Draft"),
    
    SUBMITTED("Submitted"),
    
    VERIFIED("Verified");

    private String value;

    VerificationStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VerificationStatusEnum fromValue(String text) {
      for (VerificationStatusEnum b : VerificationStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VerificationStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VerificationStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VerificationStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VerificationStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("VerificationStatus")
  private VerificationStatusEnum verificationStatus = null;

  @SerializedName("Tags")
  private List<String> tags = new ArrayList<String>();

  @SerializedName("Regions")
  private List<String> regions = new ArrayList<String>();

  @SerializedName("DeveloperName")
  private String developerName = null;

  public AppConfigurationDetail id(String id) {
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

  public AppConfigurationDetail appId(String appId) {
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

  public AppConfigurationDetail appStoreAppId(String appStoreAppId) {
    this.appStoreAppId = appStoreAppId;
    return this;
  }

   /**
   * App Store App Id
   * @return appStoreAppId
  **/
  @ApiModelProperty(required = true, value = "App Store App Id")
  public String getAppStoreAppId() {
    return appStoreAppId;
  }

  public void setAppStoreAppId(String appStoreAppId) {
    this.appStoreAppId = appStoreAppId;
  }

  public AppConfigurationDetail isEnabled(Boolean isEnabled) {
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

  public AppConfigurationDetail physicalRestaurants(List<Integer> physicalRestaurants) {
    this.physicalRestaurants = physicalRestaurants;
    return this;
  }

  public AppConfigurationDetail addPhysicalRestaurantsItem(Integer physicalRestaurantsItem) {
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

  public AppConfigurationDetail settings(List<Setting> settings) {
    this.settings = settings;
    return this;
  }

  public AppConfigurationDetail addSettingsItem(Setting settingsItem) {
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

  public AppConfigurationDetail configurationType(ConfigurationTypeEnum configurationType) {
    this.configurationType = configurationType;
    return this;
  }

   /**
   * Configuration Type  &lt;example&gt;ExternalLink&lt;/example&gt;&lt;example&gt;FlipdishHosted&lt;/example&gt;
   * @return configurationType
  **/
  @ApiModelProperty(required = true, value = "Configuration Type  <example>ExternalLink</example><example>FlipdishHosted</example>")
  public ConfigurationTypeEnum getConfigurationType() {
    return configurationType;
  }

  public void setConfigurationType(ConfigurationTypeEnum configurationType) {
    this.configurationType = configurationType;
  }

  public AppConfigurationDetail storeSelectorType(StoreSelectorTypeEnum storeSelectorType) {
    this.storeSelectorType = storeSelectorType;
    return this;
  }

   /**
   * Store Selector Type
   * @return storeSelectorType
  **/
  @ApiModelProperty(required = true, value = "Store Selector Type")
  public StoreSelectorTypeEnum getStoreSelectorType() {
    return storeSelectorType;
  }

  public void setStoreSelectorType(StoreSelectorTypeEnum storeSelectorType) {
    this.storeSelectorType = storeSelectorType;
  }

  public AppConfigurationDetail fieldGroups(List<FieldGroup> fieldGroups) {
    this.fieldGroups = fieldGroups;
    return this;
  }

  public AppConfigurationDetail addFieldGroupsItem(FieldGroup fieldGroupsItem) {
    if (this.fieldGroups == null) {
      this.fieldGroups = new ArrayList<FieldGroup>();
    }
    this.fieldGroups.add(fieldGroupsItem);
    return this;
  }

   /**
   * Field Groups
   * @return fieldGroups
  **/
  @ApiModelProperty(value = "Field Groups")
  public List<FieldGroup> getFieldGroups() {
    return fieldGroups;
  }

  public void setFieldGroups(List<FieldGroup> fieldGroups) {
    this.fieldGroups = fieldGroups;
  }

  public AppConfigurationDetail setupInstructions(String setupInstructions) {
    this.setupInstructions = setupInstructions;
    return this;
  }

   /**
   * Setup Instructions
   * @return setupInstructions
  **/
  @ApiModelProperty(value = "Setup Instructions")
  public String getSetupInstructions() {
    return setupInstructions;
  }

  public void setSetupInstructions(String setupInstructions) {
    this.setupInstructions = setupInstructions;
  }

  public AppConfigurationDetail externalSetupLink(String externalSetupLink) {
    this.externalSetupLink = externalSetupLink;
    return this;
  }

   /**
   * External Setup Link
   * @return externalSetupLink
  **/
  @ApiModelProperty(value = "External Setup Link")
  public String getExternalSetupLink() {
    return externalSetupLink;
  }

  public void setExternalSetupLink(String externalSetupLink) {
    this.externalSetupLink = externalSetupLink;
  }

  public AppConfigurationDetail oauthAppId(String oauthAppId) {
    this.oauthAppId = oauthAppId;
    return this;
  }

   /**
   * OAuth App Id
   * @return oauthAppId
  **/
  @ApiModelProperty(required = true, value = "OAuth App Id")
  public String getOauthAppId() {
    return oauthAppId;
  }

  public void setOauthAppId(String oauthAppId) {
    this.oauthAppId = oauthAppId;
  }

  public AppConfigurationDetail name(String name) {
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

  public AppConfigurationDetail description(String description) {
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

  public AppConfigurationDetail logo(String logo) {
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

  public AppConfigurationDetail verificationStatus(VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * Application verification status
   * @return verificationStatus
  **/
  @ApiModelProperty(required = true, value = "Application verification status")
  public VerificationStatusEnum getVerificationStatus() {
    return verificationStatus;
  }

  public void setVerificationStatus(VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
  }

  public AppConfigurationDetail tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public AppConfigurationDetail addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags
   * @return tags
  **/
  @ApiModelProperty(required = true, value = "Tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public AppConfigurationDetail regions(List<String> regions) {
    this.regions = regions;
    return this;
  }

  public AppConfigurationDetail addRegionsItem(String regionsItem) {
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * Regions
   * @return regions
  **/
  @ApiModelProperty(required = true, value = "Regions")
  public List<String> getRegions() {
    return regions;
  }

  public void setRegions(List<String> regions) {
    this.regions = regions;
  }

  public AppConfigurationDetail developerName(String developerName) {
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
    AppConfigurationDetail appConfigurationDetail = (AppConfigurationDetail) o;
    return Objects.equals(this.id, appConfigurationDetail.id) &&
        Objects.equals(this.appId, appConfigurationDetail.appId) &&
        Objects.equals(this.appStoreAppId, appConfigurationDetail.appStoreAppId) &&
        Objects.equals(this.isEnabled, appConfigurationDetail.isEnabled) &&
        Objects.equals(this.physicalRestaurants, appConfigurationDetail.physicalRestaurants) &&
        Objects.equals(this.settings, appConfigurationDetail.settings) &&
        Objects.equals(this.configurationType, appConfigurationDetail.configurationType) &&
        Objects.equals(this.storeSelectorType, appConfigurationDetail.storeSelectorType) &&
        Objects.equals(this.fieldGroups, appConfigurationDetail.fieldGroups) &&
        Objects.equals(this.setupInstructions, appConfigurationDetail.setupInstructions) &&
        Objects.equals(this.externalSetupLink, appConfigurationDetail.externalSetupLink) &&
        Objects.equals(this.oauthAppId, appConfigurationDetail.oauthAppId) &&
        Objects.equals(this.name, appConfigurationDetail.name) &&
        Objects.equals(this.description, appConfigurationDetail.description) &&
        Objects.equals(this.logo, appConfigurationDetail.logo) &&
        Objects.equals(this.verificationStatus, appConfigurationDetail.verificationStatus) &&
        Objects.equals(this.tags, appConfigurationDetail.tags) &&
        Objects.equals(this.regions, appConfigurationDetail.regions) &&
        Objects.equals(this.developerName, appConfigurationDetail.developerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, appId, appStoreAppId, isEnabled, physicalRestaurants, settings, configurationType, storeSelectorType, fieldGroups, setupInstructions, externalSetupLink, oauthAppId, name, description, logo, verificationStatus, tags, regions, developerName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppConfigurationDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appStoreAppId: ").append(toIndentedString(appStoreAppId)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    physicalRestaurants: ").append(toIndentedString(physicalRestaurants)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    configurationType: ").append(toIndentedString(configurationType)).append("\n");
    sb.append("    storeSelectorType: ").append(toIndentedString(storeSelectorType)).append("\n");
    sb.append("    fieldGroups: ").append(toIndentedString(fieldGroups)).append("\n");
    sb.append("    setupInstructions: ").append(toIndentedString(setupInstructions)).append("\n");
    sb.append("    externalSetupLink: ").append(toIndentedString(externalSetupLink)).append("\n");
    sb.append("    oauthAppId: ").append(toIndentedString(oauthAppId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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

