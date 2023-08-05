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
import com.flipdish.apiclient.model.AppStoreAppSupportInfo;
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
 * App store app configurations
 */
@ApiModel(description = "App store app configurations")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-08-05T11:32:36.536+01:00")
public class AppStoreAppConfiguration {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("AppId")
  private String appId = null;

  @SerializedName("AppStoreAppId")
  private String appStoreAppId = null;

  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  @SerializedName("StoreIds")
  private List<Integer> storeIds = null;

  @SerializedName("Settings")
  private List<Setting> settings = null;

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

  @SerializedName("Logo")
  private String logo = null;

  @SerializedName("OAuthAppId")
  private String oauthAppId = null;

  @SerializedName("Internal")
  private Boolean internal = null;

  @SerializedName("Details")
  private String details = null;

  /**
   * Configuration type  &lt;example&gt;External link&lt;/example&gt;&lt;example&gt;Flipdish hosted&lt;/example&gt;
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

  @SerializedName("FieldGroups")
  private List<FieldGroup> fieldGroups = null;

  @SerializedName("SetupInstructions")
  private String setupInstructions = null;

  @SerializedName("ExternalSetupLink")
  private String externalSetupLink = null;

  /**
   * Teammate app access level
   */
  @JsonAdapter(TeammateAppAccessLevelEnum.Adapter.class)
  public enum TeammateAppAccessLevelEnum {
    OWNER("Owner"),
    
    STOREOWNER("StoreOwner"),
    
    MANAGEDOWNER("ManagedOwner"),
    
    INTEGRATOR("Integrator"),
    
    STOREMANAGER("StoreManager"),
    
    STORESTAFF("StoreStaff"),
    
    STOREREADONLYACCESS("StoreReadOnlyAccess"),
    
    FINANCEMANGER("FinanceManger");

    private String value;

    TeammateAppAccessLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TeammateAppAccessLevelEnum fromValue(String text) {
      for (TeammateAppAccessLevelEnum b : TeammateAppAccessLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TeammateAppAccessLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TeammateAppAccessLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TeammateAppAccessLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TeammateAppAccessLevelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("TeammateAppAccessLevel")
  private TeammateAppAccessLevelEnum teammateAppAccessLevel = null;

  /**
   * Permissions type
   */
  @JsonAdapter(PermissionsTypeEnum.Adapter.class)
  public enum PermissionsTypeEnum {
    TEAMMATE("Teammate");

    private String value;

    PermissionsTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PermissionsTypeEnum fromValue(String text) {
      for (PermissionsTypeEnum b : PermissionsTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PermissionsTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PermissionsTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PermissionsTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PermissionsTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("PermissionsType")
  private PermissionsTypeEnum permissionsType = null;

  @SerializedName("Support")
  private AppStoreAppSupportInfo support = null;

  @SerializedName("ExternalFunctionActionUrl")
  private String externalFunctionActionUrl = null;

  @SerializedName("ExternalFunctionSignatureKey")
  private String externalFunctionSignatureKey = null;

  @SerializedName("IsPaid")
  private Boolean isPaid = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  /**
   * Gets or Sets categories
   */
  @JsonAdapter(CategoriesEnum.Adapter.class)
  public enum CategoriesEnum {
    POINTOFSALE("PointOfSale"),
    
    DELIVERYANDLOGISTICS("DeliveryAndLogistics"),
    
    CRM("CRM"),
    
    GIFTCARD("GiftCard"),
    
    ACCOUNTING("Accounting"),
    
    LOYALTYANDMARKETING("LoyaltyAndMarketing"),
    
    OTHER("Other");

    private String value;

    CategoriesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CategoriesEnum fromValue(String text) {
      for (CategoriesEnum b : CategoriesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CategoriesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoriesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CategoriesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CategoriesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Categories")
  private List<CategoriesEnum> categories = new ArrayList<CategoriesEnum>();

  /**
   * Gets or Sets countries
   */
  @JsonAdapter(CountriesEnum.Adapter.class)
  public enum CountriesEnum {
    GB("GB"),
    
    IE("IE"),
    
    FR("FR"),
    
    ES("ES"),
    
    PT("PT"),
    
    IT("IT"),
    
    DE("DE"),
    
    PL("PL"),
    
    BE("BE"),
    
    LU("LU"),
    
    NL("NL"),
    
    US("US"),
    
    CA("CA"),
    
    BG("BG"),
    
    MX("MX"),
    
    AU("AU"),
    
    NZ("NZ");

    private String value;

    CountriesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CountriesEnum fromValue(String text) {
      for (CountriesEnum b : CountriesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CountriesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CountriesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CountriesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CountriesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Countries")
  private List<CountriesEnum> countries = new ArrayList<CountriesEnum>();

  @SerializedName("DeveloperName")
  private String developerName = null;

  public AppStoreAppConfiguration id(String id) {
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

  public AppStoreAppConfiguration appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * App id
   * @return appId
  **/
  @ApiModelProperty(required = true, value = "App id")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public AppStoreAppConfiguration appStoreAppId(String appStoreAppId) {
    this.appStoreAppId = appStoreAppId;
    return this;
  }

   /**
   * App store app id
   * @return appStoreAppId
  **/
  @ApiModelProperty(required = true, value = "App store app id")
  public String getAppStoreAppId() {
    return appStoreAppId;
  }

  public void setAppStoreAppId(String appStoreAppId) {
    this.appStoreAppId = appStoreAppId;
  }

  public AppStoreAppConfiguration isEnabled(Boolean isEnabled) {
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

  public AppStoreAppConfiguration storeIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
    return this;
  }

  public AppStoreAppConfiguration addStoreIdsItem(Integer storeIdsItem) {
    if (this.storeIds == null) {
      this.storeIds = new ArrayList<Integer>();
    }
    this.storeIds.add(storeIdsItem);
    return this;
  }

   /**
   * Stores id&#39;s
   * @return storeIds
  **/
  @ApiModelProperty(value = "Stores id's")
  public List<Integer> getStoreIds() {
    return storeIds;
  }

  public void setStoreIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
  }

  public AppStoreAppConfiguration settings(List<Setting> settings) {
    this.settings = settings;
    return this;
  }

  public AppStoreAppConfiguration addSettingsItem(Setting settingsItem) {
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

  public AppStoreAppConfiguration verificationStatus(VerificationStatusEnum verificationStatus) {
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

  public AppStoreAppConfiguration logo(String logo) {
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

  public AppStoreAppConfiguration oauthAppId(String oauthAppId) {
    this.oauthAppId = oauthAppId;
    return this;
  }

   /**
   * OAuth App identifier
   * @return oauthAppId
  **/
  @ApiModelProperty(required = true, value = "OAuth App identifier")
  public String getOauthAppId() {
    return oauthAppId;
  }

  public void setOauthAppId(String oauthAppId) {
    this.oauthAppId = oauthAppId;
  }

  public AppStoreAppConfiguration internal(Boolean internal) {
    this.internal = internal;
    return this;
  }

   /**
   * Internal
   * @return internal
  **/
  @ApiModelProperty(required = true, value = "Internal")
  public Boolean isInternal() {
    return internal;
  }

  public void setInternal(Boolean internal) {
    this.internal = internal;
  }

  public AppStoreAppConfiguration details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Details
   * @return details
  **/
  @ApiModelProperty(required = true, value = "Details")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public AppStoreAppConfiguration configurationType(ConfigurationTypeEnum configurationType) {
    this.configurationType = configurationType;
    return this;
  }

   /**
   * Configuration type  &lt;example&gt;External link&lt;/example&gt;&lt;example&gt;Flipdish hosted&lt;/example&gt;
   * @return configurationType
  **/
  @ApiModelProperty(required = true, value = "Configuration type  <example>External link</example><example>Flipdish hosted</example>")
  public ConfigurationTypeEnum getConfigurationType() {
    return configurationType;
  }

  public void setConfigurationType(ConfigurationTypeEnum configurationType) {
    this.configurationType = configurationType;
  }

  public AppStoreAppConfiguration storeSelectorType(StoreSelectorTypeEnum storeSelectorType) {
    this.storeSelectorType = storeSelectorType;
    return this;
  }

   /**
   * Store selector type
   * @return storeSelectorType
  **/
  @ApiModelProperty(required = true, value = "Store selector type")
  public StoreSelectorTypeEnum getStoreSelectorType() {
    return storeSelectorType;
  }

  public void setStoreSelectorType(StoreSelectorTypeEnum storeSelectorType) {
    this.storeSelectorType = storeSelectorType;
  }

  public AppStoreAppConfiguration fieldGroups(List<FieldGroup> fieldGroups) {
    this.fieldGroups = fieldGroups;
    return this;
  }

  public AppStoreAppConfiguration addFieldGroupsItem(FieldGroup fieldGroupsItem) {
    if (this.fieldGroups == null) {
      this.fieldGroups = new ArrayList<FieldGroup>();
    }
    this.fieldGroups.add(fieldGroupsItem);
    return this;
  }

   /**
   * Field groups
   * @return fieldGroups
  **/
  @ApiModelProperty(value = "Field groups")
  public List<FieldGroup> getFieldGroups() {
    return fieldGroups;
  }

  public void setFieldGroups(List<FieldGroup> fieldGroups) {
    this.fieldGroups = fieldGroups;
  }

  public AppStoreAppConfiguration setupInstructions(String setupInstructions) {
    this.setupInstructions = setupInstructions;
    return this;
  }

   /**
   * Setup instructions
   * @return setupInstructions
  **/
  @ApiModelProperty(value = "Setup instructions")
  public String getSetupInstructions() {
    return setupInstructions;
  }

  public void setSetupInstructions(String setupInstructions) {
    this.setupInstructions = setupInstructions;
  }

  public AppStoreAppConfiguration externalSetupLink(String externalSetupLink) {
    this.externalSetupLink = externalSetupLink;
    return this;
  }

   /**
   * External setup link
   * @return externalSetupLink
  **/
  @ApiModelProperty(value = "External setup link")
  public String getExternalSetupLink() {
    return externalSetupLink;
  }

  public void setExternalSetupLink(String externalSetupLink) {
    this.externalSetupLink = externalSetupLink;
  }

  public AppStoreAppConfiguration teammateAppAccessLevel(TeammateAppAccessLevelEnum teammateAppAccessLevel) {
    this.teammateAppAccessLevel = teammateAppAccessLevel;
    return this;
  }

   /**
   * Teammate app access level
   * @return teammateAppAccessLevel
  **/
  @ApiModelProperty(value = "Teammate app access level")
  public TeammateAppAccessLevelEnum getTeammateAppAccessLevel() {
    return teammateAppAccessLevel;
  }

  public void setTeammateAppAccessLevel(TeammateAppAccessLevelEnum teammateAppAccessLevel) {
    this.teammateAppAccessLevel = teammateAppAccessLevel;
  }

  public AppStoreAppConfiguration permissionsType(PermissionsTypeEnum permissionsType) {
    this.permissionsType = permissionsType;
    return this;
  }

   /**
   * Permissions type
   * @return permissionsType
  **/
  @ApiModelProperty(required = true, value = "Permissions type")
  public PermissionsTypeEnum getPermissionsType() {
    return permissionsType;
  }

  public void setPermissionsType(PermissionsTypeEnum permissionsType) {
    this.permissionsType = permissionsType;
  }

  public AppStoreAppConfiguration support(AppStoreAppSupportInfo support) {
    this.support = support;
    return this;
  }

   /**
   * Support information
   * @return support
  **/
  @ApiModelProperty(value = "Support information")
  public AppStoreAppSupportInfo getSupport() {
    return support;
  }

  public void setSupport(AppStoreAppSupportInfo support) {
    this.support = support;
  }

  public AppStoreAppConfiguration externalFunctionActionUrl(String externalFunctionActionUrl) {
    this.externalFunctionActionUrl = externalFunctionActionUrl;
    return this;
  }

   /**
   * Action URL for external functions, used for handling Portal configuration action buttons
   * @return externalFunctionActionUrl
  **/
  @ApiModelProperty(value = "Action URL for external functions, used for handling Portal configuration action buttons")
  public String getExternalFunctionActionUrl() {
    return externalFunctionActionUrl;
  }

  public void setExternalFunctionActionUrl(String externalFunctionActionUrl) {
    this.externalFunctionActionUrl = externalFunctionActionUrl;
  }

  public AppStoreAppConfiguration externalFunctionSignatureKey(String externalFunctionSignatureKey) {
    this.externalFunctionSignatureKey = externalFunctionSignatureKey;
    return this;
  }

   /**
   * Signing key for external function action calls
   * @return externalFunctionSignatureKey
  **/
  @ApiModelProperty(value = "Signing key for external function action calls")
  public String getExternalFunctionSignatureKey() {
    return externalFunctionSignatureKey;
  }

  public void setExternalFunctionSignatureKey(String externalFunctionSignatureKey) {
    this.externalFunctionSignatureKey = externalFunctionSignatureKey;
  }

  public AppStoreAppConfiguration isPaid(Boolean isPaid) {
    this.isPaid = isPaid;
    return this;
  }

   /**
   * Is Paid
   * @return isPaid
  **/
  @ApiModelProperty(value = "Is Paid")
  public Boolean isIsPaid() {
    return isPaid;
  }

  public void setIsPaid(Boolean isPaid) {
    this.isPaid = isPaid;
  }

  public AppStoreAppConfiguration name(String name) {
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

  public AppStoreAppConfiguration description(String description) {
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

  public AppStoreAppConfiguration categories(List<CategoriesEnum> categories) {
    this.categories = categories;
    return this;
  }

  public AppStoreAppConfiguration addCategoriesItem(CategoriesEnum categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Categories
   * @return categories
  **/
  @ApiModelProperty(required = true, value = "Categories")
  public List<CategoriesEnum> getCategories() {
    return categories;
  }

  public void setCategories(List<CategoriesEnum> categories) {
    this.categories = categories;
  }

  public AppStoreAppConfiguration countries(List<CountriesEnum> countries) {
    this.countries = countries;
    return this;
  }

  public AppStoreAppConfiguration addCountriesItem(CountriesEnum countriesItem) {
    this.countries.add(countriesItem);
    return this;
  }

   /**
   * Countries
   * @return countries
  **/
  @ApiModelProperty(required = true, value = "Countries")
  public List<CountriesEnum> getCountries() {
    return countries;
  }

  public void setCountries(List<CountriesEnum> countries) {
    this.countries = countries;
  }

  public AppStoreAppConfiguration developerName(String developerName) {
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
    AppStoreAppConfiguration appStoreAppConfiguration = (AppStoreAppConfiguration) o;
    return Objects.equals(this.id, appStoreAppConfiguration.id) &&
        Objects.equals(this.appId, appStoreAppConfiguration.appId) &&
        Objects.equals(this.appStoreAppId, appStoreAppConfiguration.appStoreAppId) &&
        Objects.equals(this.isEnabled, appStoreAppConfiguration.isEnabled) &&
        Objects.equals(this.storeIds, appStoreAppConfiguration.storeIds) &&
        Objects.equals(this.settings, appStoreAppConfiguration.settings) &&
        Objects.equals(this.verificationStatus, appStoreAppConfiguration.verificationStatus) &&
        Objects.equals(this.logo, appStoreAppConfiguration.logo) &&
        Objects.equals(this.oauthAppId, appStoreAppConfiguration.oauthAppId) &&
        Objects.equals(this.internal, appStoreAppConfiguration.internal) &&
        Objects.equals(this.details, appStoreAppConfiguration.details) &&
        Objects.equals(this.configurationType, appStoreAppConfiguration.configurationType) &&
        Objects.equals(this.storeSelectorType, appStoreAppConfiguration.storeSelectorType) &&
        Objects.equals(this.fieldGroups, appStoreAppConfiguration.fieldGroups) &&
        Objects.equals(this.setupInstructions, appStoreAppConfiguration.setupInstructions) &&
        Objects.equals(this.externalSetupLink, appStoreAppConfiguration.externalSetupLink) &&
        Objects.equals(this.teammateAppAccessLevel, appStoreAppConfiguration.teammateAppAccessLevel) &&
        Objects.equals(this.permissionsType, appStoreAppConfiguration.permissionsType) &&
        Objects.equals(this.support, appStoreAppConfiguration.support) &&
        Objects.equals(this.externalFunctionActionUrl, appStoreAppConfiguration.externalFunctionActionUrl) &&
        Objects.equals(this.externalFunctionSignatureKey, appStoreAppConfiguration.externalFunctionSignatureKey) &&
        Objects.equals(this.isPaid, appStoreAppConfiguration.isPaid) &&
        Objects.equals(this.name, appStoreAppConfiguration.name) &&
        Objects.equals(this.description, appStoreAppConfiguration.description) &&
        Objects.equals(this.categories, appStoreAppConfiguration.categories) &&
        Objects.equals(this.countries, appStoreAppConfiguration.countries) &&
        Objects.equals(this.developerName, appStoreAppConfiguration.developerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, appId, appStoreAppId, isEnabled, storeIds, settings, verificationStatus, logo, oauthAppId, internal, details, configurationType, storeSelectorType, fieldGroups, setupInstructions, externalSetupLink, teammateAppAccessLevel, permissionsType, support, externalFunctionActionUrl, externalFunctionSignatureKey, isPaid, name, description, categories, countries, developerName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreAppConfiguration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appStoreAppId: ").append(toIndentedString(appStoreAppId)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    storeIds: ").append(toIndentedString(storeIds)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    oauthAppId: ").append(toIndentedString(oauthAppId)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    configurationType: ").append(toIndentedString(configurationType)).append("\n");
    sb.append("    storeSelectorType: ").append(toIndentedString(storeSelectorType)).append("\n");
    sb.append("    fieldGroups: ").append(toIndentedString(fieldGroups)).append("\n");
    sb.append("    setupInstructions: ").append(toIndentedString(setupInstructions)).append("\n");
    sb.append("    externalSetupLink: ").append(toIndentedString(externalSetupLink)).append("\n");
    sb.append("    teammateAppAccessLevel: ").append(toIndentedString(teammateAppAccessLevel)).append("\n");
    sb.append("    permissionsType: ").append(toIndentedString(permissionsType)).append("\n");
    sb.append("    support: ").append(toIndentedString(support)).append("\n");
    sb.append("    externalFunctionActionUrl: ").append(toIndentedString(externalFunctionActionUrl)).append("\n");
    sb.append("    externalFunctionSignatureKey: ").append(toIndentedString(externalFunctionSignatureKey)).append("\n");
    sb.append("    isPaid: ").append(toIndentedString(isPaid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
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

