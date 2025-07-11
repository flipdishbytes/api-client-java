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
 * AppStoreApp
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class AppStoreApp {
  @SerializedName("Id")
  private String id = null;

  /**
   * Gets or Sets verificationStatus
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
   * Gets or Sets configurationType
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
   * Gets or Sets storeSelectorType
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
   * Gets or Sets teammateAppAccessLevel
   */
  @JsonAdapter(TeammateAppAccessLevelEnum.Adapter.class)
  public enum TeammateAppAccessLevelEnum {
    OWNER("Owner"),
    
    STOREOWNER("StoreOwner"),
    
    PROPERTYOWNER("PropertyOwner"),
    
    MANAGEDOWNER("ManagedOwner"),
    
    INTEGRATOR("Integrator"),
    
    PROPERTYMANAGER("PropertyManager"),
    
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
   * Gets or Sets permissionsType
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

  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

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

  public AppStoreApp id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AppStoreApp verificationStatus(VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * Get verificationStatus
   * @return verificationStatus
  **/
  @ApiModelProperty(required = true, value = "")
  public VerificationStatusEnum getVerificationStatus() {
    return verificationStatus;
  }

  public void setVerificationStatus(VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
  }

  public AppStoreApp logo(String logo) {
    this.logo = logo;
    return this;
  }

   /**
   * Get logo
   * @return logo
  **/
  @ApiModelProperty(value = "")
  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public AppStoreApp oauthAppId(String oauthAppId) {
    this.oauthAppId = oauthAppId;
    return this;
  }

   /**
   * Get oauthAppId
   * @return oauthAppId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getOauthAppId() {
    return oauthAppId;
  }

  public void setOauthAppId(String oauthAppId) {
    this.oauthAppId = oauthAppId;
  }

  public AppStoreApp internal(Boolean internal) {
    this.internal = internal;
    return this;
  }

   /**
   * Get internal
   * @return internal
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isInternal() {
    return internal;
  }

  public void setInternal(Boolean internal) {
    this.internal = internal;
  }

  public AppStoreApp details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public AppStoreApp configurationType(ConfigurationTypeEnum configurationType) {
    this.configurationType = configurationType;
    return this;
  }

   /**
   * Get configurationType
   * @return configurationType
  **/
  @ApiModelProperty(required = true, value = "")
  public ConfigurationTypeEnum getConfigurationType() {
    return configurationType;
  }

  public void setConfigurationType(ConfigurationTypeEnum configurationType) {
    this.configurationType = configurationType;
  }

  public AppStoreApp storeSelectorType(StoreSelectorTypeEnum storeSelectorType) {
    this.storeSelectorType = storeSelectorType;
    return this;
  }

   /**
   * Get storeSelectorType
   * @return storeSelectorType
  **/
  @ApiModelProperty(required = true, value = "")
  public StoreSelectorTypeEnum getStoreSelectorType() {
    return storeSelectorType;
  }

  public void setStoreSelectorType(StoreSelectorTypeEnum storeSelectorType) {
    this.storeSelectorType = storeSelectorType;
  }

  public AppStoreApp fieldGroups(List<FieldGroup> fieldGroups) {
    this.fieldGroups = fieldGroups;
    return this;
  }

  public AppStoreApp addFieldGroupsItem(FieldGroup fieldGroupsItem) {
    if (this.fieldGroups == null) {
      this.fieldGroups = new ArrayList<FieldGroup>();
    }
    this.fieldGroups.add(fieldGroupsItem);
    return this;
  }

   /**
   * Get fieldGroups
   * @return fieldGroups
  **/
  @ApiModelProperty(value = "")
  public List<FieldGroup> getFieldGroups() {
    return fieldGroups;
  }

  public void setFieldGroups(List<FieldGroup> fieldGroups) {
    this.fieldGroups = fieldGroups;
  }

  public AppStoreApp setupInstructions(String setupInstructions) {
    this.setupInstructions = setupInstructions;
    return this;
  }

   /**
   * Get setupInstructions
   * @return setupInstructions
  **/
  @ApiModelProperty(value = "")
  public String getSetupInstructions() {
    return setupInstructions;
  }

  public void setSetupInstructions(String setupInstructions) {
    this.setupInstructions = setupInstructions;
  }

  public AppStoreApp externalSetupLink(String externalSetupLink) {
    this.externalSetupLink = externalSetupLink;
    return this;
  }

   /**
   * Get externalSetupLink
   * @return externalSetupLink
  **/
  @ApiModelProperty(value = "")
  public String getExternalSetupLink() {
    return externalSetupLink;
  }

  public void setExternalSetupLink(String externalSetupLink) {
    this.externalSetupLink = externalSetupLink;
  }

  public AppStoreApp teammateAppAccessLevel(TeammateAppAccessLevelEnum teammateAppAccessLevel) {
    this.teammateAppAccessLevel = teammateAppAccessLevel;
    return this;
  }

   /**
   * Get teammateAppAccessLevel
   * @return teammateAppAccessLevel
  **/
  @ApiModelProperty(value = "")
  public TeammateAppAccessLevelEnum getTeammateAppAccessLevel() {
    return teammateAppAccessLevel;
  }

  public void setTeammateAppAccessLevel(TeammateAppAccessLevelEnum teammateAppAccessLevel) {
    this.teammateAppAccessLevel = teammateAppAccessLevel;
  }

  public AppStoreApp permissionsType(PermissionsTypeEnum permissionsType) {
    this.permissionsType = permissionsType;
    return this;
  }

   /**
   * Get permissionsType
   * @return permissionsType
  **/
  @ApiModelProperty(required = true, value = "")
  public PermissionsTypeEnum getPermissionsType() {
    return permissionsType;
  }

  public void setPermissionsType(PermissionsTypeEnum permissionsType) {
    this.permissionsType = permissionsType;
  }

  public AppStoreApp support(AppStoreAppSupportInfo support) {
    this.support = support;
    return this;
  }

   /**
   * Get support
   * @return support
  **/
  @ApiModelProperty(value = "")
  public AppStoreAppSupportInfo getSupport() {
    return support;
  }

  public void setSupport(AppStoreAppSupportInfo support) {
    this.support = support;
  }

  public AppStoreApp externalFunctionActionUrl(String externalFunctionActionUrl) {
    this.externalFunctionActionUrl = externalFunctionActionUrl;
    return this;
  }

   /**
   * Get externalFunctionActionUrl
   * @return externalFunctionActionUrl
  **/
  @ApiModelProperty(value = "")
  public String getExternalFunctionActionUrl() {
    return externalFunctionActionUrl;
  }

  public void setExternalFunctionActionUrl(String externalFunctionActionUrl) {
    this.externalFunctionActionUrl = externalFunctionActionUrl;
  }

  public AppStoreApp externalFunctionSignatureKey(String externalFunctionSignatureKey) {
    this.externalFunctionSignatureKey = externalFunctionSignatureKey;
    return this;
  }

   /**
   * Get externalFunctionSignatureKey
   * @return externalFunctionSignatureKey
  **/
  @ApiModelProperty(value = "")
  public String getExternalFunctionSignatureKey() {
    return externalFunctionSignatureKey;
  }

  public void setExternalFunctionSignatureKey(String externalFunctionSignatureKey) {
    this.externalFunctionSignatureKey = externalFunctionSignatureKey;
  }

  public AppStoreApp isPaid(Boolean isPaid) {
    this.isPaid = isPaid;
    return this;
  }

   /**
   * Get isPaid
   * @return isPaid
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsPaid() {
    return isPaid;
  }

  public void setIsPaid(Boolean isPaid) {
    this.isPaid = isPaid;
  }

  public AppStoreApp name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AppStoreApp description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AppStoreApp isEnabled(Boolean isEnabled) {
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

  public AppStoreApp categories(List<CategoriesEnum> categories) {
    this.categories = categories;
    return this;
  }

  public AppStoreApp addCategoriesItem(CategoriesEnum categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @ApiModelProperty(required = true, value = "")
  public List<CategoriesEnum> getCategories() {
    return categories;
  }

  public void setCategories(List<CategoriesEnum> categories) {
    this.categories = categories;
  }

  public AppStoreApp countries(List<CountriesEnum> countries) {
    this.countries = countries;
    return this;
  }

  public AppStoreApp addCountriesItem(CountriesEnum countriesItem) {
    this.countries.add(countriesItem);
    return this;
  }

   /**
   * Get countries
   * @return countries
  **/
  @ApiModelProperty(required = true, value = "")
  public List<CountriesEnum> getCountries() {
    return countries;
  }

  public void setCountries(List<CountriesEnum> countries) {
    this.countries = countries;
  }

  public AppStoreApp developerName(String developerName) {
    this.developerName = developerName;
    return this;
  }

   /**
   * Get developerName
   * @return developerName
  **/
  @ApiModelProperty(value = "")
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
    AppStoreApp appStoreApp = (AppStoreApp) o;
    return Objects.equals(this.id, appStoreApp.id) &&
        Objects.equals(this.verificationStatus, appStoreApp.verificationStatus) &&
        Objects.equals(this.logo, appStoreApp.logo) &&
        Objects.equals(this.oauthAppId, appStoreApp.oauthAppId) &&
        Objects.equals(this.internal, appStoreApp.internal) &&
        Objects.equals(this.details, appStoreApp.details) &&
        Objects.equals(this.configurationType, appStoreApp.configurationType) &&
        Objects.equals(this.storeSelectorType, appStoreApp.storeSelectorType) &&
        Objects.equals(this.fieldGroups, appStoreApp.fieldGroups) &&
        Objects.equals(this.setupInstructions, appStoreApp.setupInstructions) &&
        Objects.equals(this.externalSetupLink, appStoreApp.externalSetupLink) &&
        Objects.equals(this.teammateAppAccessLevel, appStoreApp.teammateAppAccessLevel) &&
        Objects.equals(this.permissionsType, appStoreApp.permissionsType) &&
        Objects.equals(this.support, appStoreApp.support) &&
        Objects.equals(this.externalFunctionActionUrl, appStoreApp.externalFunctionActionUrl) &&
        Objects.equals(this.externalFunctionSignatureKey, appStoreApp.externalFunctionSignatureKey) &&
        Objects.equals(this.isPaid, appStoreApp.isPaid) &&
        Objects.equals(this.name, appStoreApp.name) &&
        Objects.equals(this.description, appStoreApp.description) &&
        Objects.equals(this.isEnabled, appStoreApp.isEnabled) &&
        Objects.equals(this.categories, appStoreApp.categories) &&
        Objects.equals(this.countries, appStoreApp.countries) &&
        Objects.equals(this.developerName, appStoreApp.developerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, verificationStatus, logo, oauthAppId, internal, details, configurationType, storeSelectorType, fieldGroups, setupInstructions, externalSetupLink, teammateAppAccessLevel, permissionsType, support, externalFunctionActionUrl, externalFunctionSignatureKey, isPaid, name, description, isEnabled, categories, countries, developerName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreApp {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
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

