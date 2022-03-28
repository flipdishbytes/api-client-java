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
 * App store app
 */
@ApiModel(description = "App store app")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-28T15:34:01.760+01:00")
public class AppStoreApp {
  @SerializedName("Id")
  private String id = null;

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

  @SerializedName("OAuthAppId")
  private String oauthAppId = null;

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

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  /**
   * Gets or Sets tags
   */
  @JsonAdapter(TagsEnum.Adapter.class)
  public enum TagsEnum {
    POINTOFSALE("PointOfSale"),
    
    DELIVERYANDLOGISTICS("DeliveryAndLogistics"),
    
    CRM("CRM"),
    
    GIFTCARD("GiftCard"),
    
    ACCOUNTING("Accounting"),
    
    LOYALTYANDMARKETING("LoyaltyAndMarketing"),
    
    OTHER("Other");

    private String value;

    TagsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TagsEnum fromValue(String text) {
      for (TagsEnum b : TagsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TagsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TagsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TagsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TagsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Tags")
  private List<TagsEnum> tags = new ArrayList<TagsEnum>();

  /**
   * Gets or Sets regions
   */
  @JsonAdapter(RegionsEnum.Adapter.class)
  public enum RegionsEnum {
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

    RegionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RegionsEnum fromValue(String text) {
      for (RegionsEnum b : RegionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RegionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RegionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RegionsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RegionsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Regions")
  private List<RegionsEnum> regions = new ArrayList<RegionsEnum>();

  @SerializedName("DeveloperName")
  private String developerName = null;

  public AppStoreApp id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique App store app id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique App store app id")
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

  public AppStoreApp logo(String logo) {
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

  public AppStoreApp details(String details) {
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

  public AppStoreApp configurationType(ConfigurationTypeEnum configurationType) {
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

  public AppStoreApp storeSelectorType(StoreSelectorTypeEnum storeSelectorType) {
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

  public AppStoreApp setupInstructions(String setupInstructions) {
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

  public AppStoreApp externalSetupLink(String externalSetupLink) {
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

  public AppStoreApp oauthAppId(String oauthAppId) {
    this.oauthAppId = oauthAppId;
    return this;
  }

   /**
   * OAuth app id
   * @return oauthAppId
  **/
  @ApiModelProperty(required = true, value = "OAuth app id")
  public String getOauthAppId() {
    return oauthAppId;
  }

  public void setOauthAppId(String oauthAppId) {
    this.oauthAppId = oauthAppId;
  }

  public AppStoreApp teammateAppAccessLevel(TeammateAppAccessLevelEnum teammateAppAccessLevel) {
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

  public AppStoreApp permissionsType(PermissionsTypeEnum permissionsType) {
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

  public AppStoreApp name(String name) {
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

  public AppStoreApp description(String description) {
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

  public AppStoreApp isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Is application enabled
   * @return isEnabled
  **/
  @ApiModelProperty(value = "Is application enabled")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public AppStoreApp tags(List<TagsEnum> tags) {
    this.tags = tags;
    return this;
  }

  public AppStoreApp addTagsItem(TagsEnum tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags
   * @return tags
  **/
  @ApiModelProperty(required = true, value = "Tags")
  public List<TagsEnum> getTags() {
    return tags;
  }

  public void setTags(List<TagsEnum> tags) {
    this.tags = tags;
  }

  public AppStoreApp regions(List<RegionsEnum> regions) {
    this.regions = regions;
    return this;
  }

  public AppStoreApp addRegionsItem(RegionsEnum regionsItem) {
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * Regions
   * @return regions
  **/
  @ApiModelProperty(required = true, value = "Regions")
  public List<RegionsEnum> getRegions() {
    return regions;
  }

  public void setRegions(List<RegionsEnum> regions) {
    this.regions = regions;
  }

  public AppStoreApp developerName(String developerName) {
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
    AppStoreApp appStoreApp = (AppStoreApp) o;
    return Objects.equals(this.id, appStoreApp.id) &&
        Objects.equals(this.verificationStatus, appStoreApp.verificationStatus) &&
        Objects.equals(this.logo, appStoreApp.logo) &&
        Objects.equals(this.details, appStoreApp.details) &&
        Objects.equals(this.configurationType, appStoreApp.configurationType) &&
        Objects.equals(this.storeSelectorType, appStoreApp.storeSelectorType) &&
        Objects.equals(this.fieldGroups, appStoreApp.fieldGroups) &&
        Objects.equals(this.setupInstructions, appStoreApp.setupInstructions) &&
        Objects.equals(this.externalSetupLink, appStoreApp.externalSetupLink) &&
        Objects.equals(this.oauthAppId, appStoreApp.oauthAppId) &&
        Objects.equals(this.teammateAppAccessLevel, appStoreApp.teammateAppAccessLevel) &&
        Objects.equals(this.permissionsType, appStoreApp.permissionsType) &&
        Objects.equals(this.name, appStoreApp.name) &&
        Objects.equals(this.description, appStoreApp.description) &&
        Objects.equals(this.isEnabled, appStoreApp.isEnabled) &&
        Objects.equals(this.tags, appStoreApp.tags) &&
        Objects.equals(this.regions, appStoreApp.regions) &&
        Objects.equals(this.developerName, appStoreApp.developerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, verificationStatus, logo, details, configurationType, storeSelectorType, fieldGroups, setupInstructions, externalSetupLink, oauthAppId, teammateAppAccessLevel, permissionsType, name, description, isEnabled, tags, regions, developerName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreApp {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    configurationType: ").append(toIndentedString(configurationType)).append("\n");
    sb.append("    storeSelectorType: ").append(toIndentedString(storeSelectorType)).append("\n");
    sb.append("    fieldGroups: ").append(toIndentedString(fieldGroups)).append("\n");
    sb.append("    setupInstructions: ").append(toIndentedString(setupInstructions)).append("\n");
    sb.append("    externalSetupLink: ").append(toIndentedString(externalSetupLink)).append("\n");
    sb.append("    oauthAppId: ").append(toIndentedString(oauthAppId)).append("\n");
    sb.append("    teammateAppAccessLevel: ").append(toIndentedString(teammateAppAccessLevel)).append("\n");
    sb.append("    permissionsType: ").append(toIndentedString(permissionsType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
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

