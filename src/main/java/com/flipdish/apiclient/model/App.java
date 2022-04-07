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
import com.flipdish.apiclient.model.Coordinates;
import com.flipdish.apiclient.model.Language;
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
 * App
 */
@ApiModel(description = "App")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-07T12:39:20.558+01:00")
public class App {
  @SerializedName("AppId")
  private String appId = null;

  @SerializedName("HasIosApp")
  private Boolean hasIosApp = null;

  @SerializedName("HasAndroidApp")
  private Boolean hasAndroidApp = null;

  @SerializedName("CountryId")
  private String countryId = null;

  @SerializedName("LogoImageUrl")
  private String logoImageUrl = null;

  @SerializedName("Languages")
  private List<Language> languages = null;

  @SerializedName("AvailableAppLanguages")
  private List<Language> availableAppLanguages = null;

  /**
   * App access level for the logged in user
   */
  @JsonAdapter(AppAccessLevelEnum.Adapter.class)
  public enum AppAccessLevelEnum {
    NONE("None"),
    
    OWNER("Owner"),
    
    STOREOWNER("StoreOwner"),
    
    MANAGEDOWNER("ManagedOwner"),
    
    INTEGRATOR("Integrator"),
    
    STOREMANAGER("StoreManager"),
    
    STORESTAFF("StoreStaff"),
    
    STOREREADONLYACCESS("StoreReadOnlyAccess"),
    
    FINANCEMANGER("FinanceManger"),
    
    SUPPORT("Support");

    private String value;

    AppAccessLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AppAccessLevelEnum fromValue(String text) {
      for (AppAccessLevelEnum b : AppAccessLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AppAccessLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AppAccessLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AppAccessLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AppAccessLevelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("AppAccessLevel")
  private AppAccessLevelEnum appAccessLevel = null;

  /**
   * Gets or Sets appResourceSet
   */
  @JsonAdapter(AppResourceSetEnum.Adapter.class)
  public enum AppResourceSetEnum {
    VIEWAPP("ViewApp"),
    
    CREATEAPP("CreateApp"),
    
    UPDATEAPP("UpdateApp"),
    
    EDITAPPASSETS("EditAppAssets"),
    
    VIEWTEAMMATES("ViewTeammates"),
    
    EDITTEAMMATES("EditTeammates"),
    
    CREATETEAMMATEOWNER("CreateTeammateOwner"),
    
    CREATETEAMMATEMANAGEDOWNER("CreateTeammateManagedOwner"),
    
    CREATETEAMMATESTOREOWNER("CreateTeammateStoreOwner"),
    
    CREATETEAMMATESTOREMANAGER("CreateTeammateStoreManager"),
    
    CREATETEAMMATESTORESTAFF("CreateTeammateStoreStaff"),
    
    CREATETEAMMATESTOREREADACCESS("CreateTeammateStoreReadAccess"),
    
    CREATETEAMMATEFINANCEMANAGER("CreateTeammateFinanceManager"),
    
    CREATETEAMMATEINTEGRATOR("CreateTeammateIntegrator"),
    
    VIEWAPMCONFIGURATIONS("ViewApmConfigurations"),
    
    EDITAPMCONFIGURATIONS("EditApmConfigurations"),
    
    VIEWCAMPAIGNSCONFIGURATIONS("ViewCampaignsConfigurations"),
    
    CREATECAMPAIGNSCONFIGURATIONS("CreateCampaignsConfigurations"),
    
    UPDATECAMPAIGNSCONFIGURATIONS("UpdateCampaignsConfigurations"),
    
    DELETECAMPAIGNSCONFIGURATIONS("DeleteCampaignsConfigurations"),
    
    VIEWDEVELOPERSSETTINGS("ViewDevelopersSettings"),
    
    EDITDEVELOPERSSETTINGS("EditDevelopersSettings"),
    
    VIEWORDERS("ViewOrders"),
    
    UPDATEORDERSACCEPT("UpdateOrdersAccept"),
    
    UPDATEORDERSREJECT("UpdateOrdersReject"),
    
    UPDATEORDERSREFUND("UpdateOrdersRefund"),
    
    UPDATEORDERSDISPATCH("UpdateOrdersDispatch"),
    
    VIEWSTORES("ViewStores"),
    
    EDITSTORES("EditStores"),
    
    VIEWSTORESOPENINGHOURS("ViewStoresOpeningHours"),
    
    UPDATESTORESOPENFORCOLLECTIONORDELIVERY("UpdateStoresOpenForCollectionOrDelivery"),
    
    UPDATESTORESOPENINGHOURS("UpdateStoresOpeningHours"),
    
    VIEWSTORESOPENINGHOURSOVERRIDE("ViewStoresOpeningHoursOverride"),
    
    EDITSTORESOPENINGHOURSOVERRIDE("EditStoresOpeningHoursOverride"),
    
    EDITSTORESOPENINGHOURSOVERRIDETEMPORARY("EditStoresOpeningHoursOverrideTemporary"),
    
    UPDATESTORESNAME("UpdateStoresName"),
    
    EDITSTOREKIOSKSETTINGS("EditStoreKioskSettings"),
    
    EDITSTOREORDERCAPACITY("EditStoreOrderCapacity"),
    
    UPDATEPRINTERTERMINALSASSIGN("UpdatePrinterTerminalsAssign"),
    
    UPDATEPRINTERTERMINALSTOGGLE("UpdatePrinterTerminalsToggle"),
    
    EDITSTORENOTIFICATIONS("EditStoreNotifications"),
    
    VIEWSTOREGROUPS("ViewStoreGroups"),
    
    CREATESTOREGROUPS("CreateStoreGroups"),
    
    UPDATESTOREGROUPS("UpdateStoreGroups"),
    
    DELETESTOREGROUPS("DeleteStoreGroups"),
    
    VIEWDELIVERYZONES("ViewDeliveryZones"),
    
    CREATEDELIVERYZONES("CreateDeliveryZones"),
    
    UPDATEDELIVERYZONES("UpdateDeliveryZones"),
    
    DELETEDELIVERYZONES("DeleteDeliveryZones"),
    
    VIEWMENU("ViewMenu"),
    
    CREATEMENU("CreateMenu"),
    
    UPDATEMENU("UpdateMenu"),
    
    DELETEMENU("DeleteMenu"),
    
    UPDATEMENULOCK("UpdateMenuLock"),
    
    UPDATEMENUITEMSHIDETEMPORARILY("UpdateMenuItemsHideTemporarily"),
    
    EDITMENUIMAGE("EditMenuImage"),
    
    VIEWVOUCHERS("ViewVouchers"),
    
    EDITVOUCHERS("EditVouchers"),
    
    UPDATEVOUCHERSEXTENDDISABLE("UpdateVouchersExtendDisable"),
    
    VIEWWEBSITECONTENT("ViewWebsiteContent"),
    
    EDITWEBSITECONTENT("EditWebsiteContent"),
    
    VIEWWEBSITEDNSVERIFIED("ViewWebsiteDnsVerified"),
    
    VIEWWEBSITECERTIFICATECREATED("ViewWebsiteCertificateCreated"),
    
    VIEWWEBSITECERTIFICATERENEWED("ViewWebsiteCertificateRenewed"),
    
    VIEWBANKACCOUNTS("ViewBankAccounts"),
    
    CREATEBANKACCOUNTS("CreateBankAccounts"),
    
    UPDATEBANKACCOUNTS("UpdateBankAccounts"),
    
    UPDATEBANKACCOUNTSASSIGN("UpdateBankAccountsAssign"),
    
    VIEWASSIGNEDBANKACCOUNT("ViewAssignedBankAccount"),
    
    VERIFYBANKACCOUNTS("VerifyBankAccounts"),
    
    VIEWSERVICECHARGECONFIGURATIONS("ViewServiceChargeConfigurations"),
    
    EDITSERVICECHARGECONFIGURATIONS("EditServiceChargeConfigurations"),
    
    VIEWHYDRACONFIG("ViewHydraConfig"),
    
    UPDATEHYDRACONFIGMANAGE("UpdateHydraConfigManage"),
    
    INITIATEBLUETOOTHPAIRINGMODE("InitiateBluetoothPairingMode"),
    
    VIEWCUSTOMERS("ViewCustomers"),
    
    EDITCUSTOMERS("EditCustomers"),
    
    CREATECATALOGELEMENTS("CreateCatalogElements"),
    
    UPDATECATALOGELEMENTS("UpdateCatalogElements"),
    
    VIEWCATALOGELEMENTS("ViewCatalogElements"),
    
    DELETECATALOGELEMENTS("DeleteCatalogElements"),
    
    VIEWMETAFIELDDEFINITIONS("ViewMetafieldDefinitions"),
    
    CREATEMETAFIELDDEFINITIONS("CreateMetafieldDefinitions"),
    
    UPDATEMETAFIELDDEFINITIONS("UpdateMetafieldDefinitions"),
    
    DELETEMETAFIELDDEFINITIONS("DeleteMetafieldDefinitions"),
    
    UPDATEMETAFIELDS("UpdateMetafields"),
    
    VIEWCATALOGMENUCHANGES("ViewCatalogMenuChanges"),
    
    PUBLISHCATALOGMENUCHANGES("PublishCatalogMenuChanges"),
    
    VIEWAPPSTATISTICS("ViewAppStatistics"),
    
    VIEWAPMSTATISTICS("ViewApmStatistics"),
    
    VIEWCAMPAIGNSSTATISTICS("ViewCampaignsStatistics"),
    
    VIEWCUSTOMERSTATISTICS("ViewCustomerStatistics"),
    
    VIEWLIVESTATISTICS("ViewLiveStatistics"),
    
    VIEWORDERSTATISTICS("ViewOrderStatistics"),
    
    VIEWSALESSTATISTICS("ViewSalesStatistics"),
    
    VIEWSALESENDOFDAYSTATISTICS("ViewSalesEndOfDayStatistics"),
    
    VIEWVOUCHERSSTATISTICS("ViewVouchersStatistics"),
    
    DOWNLOADCUSTOMERCSVEXPORT("DownloadCustomerCsvExport"),
    
    VIEWAPMAUDITLOGS("ViewApmAuditLogs"),
    
    VIEWSTOREAUDITLOGS("ViewStoreAuditLogs"),
    
    VIEWMENUAUDITLOGS("ViewMenuAuditLogs"),
    
    VIEWBANKACCOUNTAUDITLOGS("ViewBankAccountAuditLogs"),
    
    VIEWFEECONFIGURATIONSAUDITLOGS("ViewFeeConfigurationsAuditLogs"),
    
    VIEWORDERSAUDITLOGS("ViewOrdersAuditLogs"),
    
    VIEWVOUCHERSAUDITLOGS("ViewVouchersAuditLogs"),
    
    VIEWUSEREVENTSAUDITLOGS("ViewUserEventsAuditLogs"),
    
    VIEWCAMPAIGNSAUDITLOGS("ViewCampaignsAuditLogs"),
    
    VIEWTEAMMATESAUDITLOGS("ViewTeammatesAuditLogs"),
    
    VIEWAPPAUDITLOGS("ViewAppAuditLogs"),
    
    VIEWCUSTOMERAUDITLOGS("ViewCustomerAuditLogs"),
    
    VIEWPRINTERAUDITLOGS("ViewPrinterAuditLogs"),
    
    VIEWHYDRAAUDITLOGS("ViewHydraAuditLogs"),
    
    VIEWPUSHNOTIFICATIONAUDITLOGS("ViewPushNotificationAuditLogs"),
    
    VIEWSTRIPECUSTOMCONNECTEDACCOUNTAUDITLOGS("ViewStripeCustomConnectedAccountAuditLogs"),
    
    VIEWKIOSKBLUETOOTHDEVICEAUDITLOGS("ViewKioskBluetoothDeviceAuditLogs"),
    
    VIEWEXTERNALAUDITLOGS("ViewExternalAuditLogs"),
    
    CREATEEXTERNALAUDITLOGEVENTS("CreateExternalAuditLogEvents"),
    
    VIEWCATALOGAUDITLOGS("ViewCatalogAuditLogs"),
    
    CREATEAPPSTOREAPP("CreateAppStoreApp"),
    
    VIEWAPPSTOREAPP("ViewAppStoreApp"),
    
    UPDATEAPPSTOREAPP("UpdateAppStoreApp"),
    
    DELETEAPPSTOREAPP("DeleteAppStoreApp"),
    
    CREATEAPPSTOREAPPCONFIGURATION("CreateAppStoreAppConfiguration"),
    
    VIEWAPPSTOREAPPCONFIGURATION("ViewAppStoreAppConfiguration"),
    
    UPDATEAPPSTOREAPPCONFIGURATION("UpdateAppStoreAppConfiguration"),
    
    DELETEAPPSTOREAPPCONFIGURATION("DeleteAppStoreAppConfiguration"),
    
    SENDPUSHNOTIFICATIONTOCUSTOMER("SendPushNotificationToCustomer"),
    
    INVITEDRIVERTOAPP("InviteDriverToApp"),
    
    GETDRIVERFORAPP("GetDriverForApp"),
    
    REMOVEDRIVERFROMAPP("RemoveDriverFromApp"),
    
    ASSIGNDRIVERTOORDER("AssignDriverToOrder"),
    
    UNASSIGNDRIVERFROMORDER("UnassignDriverFromOrder"),
    
    UPDATEORDERSDELIVERYTRACKINGSTATUS("UpdateOrdersDeliveryTrackingStatus"),
    
    VIEWPAYOUTS("ViewPayouts"),
    
    VIEWCHANNELS("ViewChannels"),
    
    VIEWONBOARDING("ViewOnboarding"),
    
    UPDATEONBOARDING("UpdateOnboarding");

    private String value;

    AppResourceSetEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AppResourceSetEnum fromValue(String text) {
      for (AppResourceSetEnum b : AppResourceSetEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AppResourceSetEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AppResourceSetEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AppResourceSetEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AppResourceSetEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("AppResourceSet")
  private List<AppResourceSetEnum> appResourceSet = null;

  @SerializedName("Features")
  private List<String> features = null;

  @SerializedName("MapCenter")
  private Coordinates mapCenter = null;

  @SerializedName("MapNorthEast")
  private Coordinates mapNorthEast = null;

  @SerializedName("MapSouthWest")
  private Coordinates mapSouthWest = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("HostName")
  private String hostName = null;

  @SerializedName("MainColor")
  private String mainColor = null;

  /**
   * Application Category
   */
  @JsonAdapter(ApplicationCategoryEnum.Adapter.class)
  public enum ApplicationCategoryEnum {
    RESTAURANT("Restaurant"),
    
    CAFE("Cafe"),
    
    CONVENIENCE("Convenience");

    private String value;

    ApplicationCategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ApplicationCategoryEnum fromValue(String text) {
      for (ApplicationCategoryEnum b : ApplicationCategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ApplicationCategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ApplicationCategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ApplicationCategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ApplicationCategoryEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ApplicationCategory")
  private ApplicationCategoryEnum applicationCategory = null;

  @SerializedName("IsPanaceaEnabled")
  private Boolean isPanaceaEnabled = null;

  @SerializedName("CookieConsentPromptEnabled")
  private Boolean cookieConsentPromptEnabled = null;

  public App appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * App Identifier
   * @return appId
  **/
  @ApiModelProperty(value = "App Identifier")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public App hasIosApp(Boolean hasIosApp) {
    this.hasIosApp = hasIosApp;
    return this;
  }

   /**
   * Has iOS app in Apple App Store. This is readonly.
   * @return hasIosApp
  **/
  @ApiModelProperty(value = "Has iOS app in Apple App Store. This is readonly.")
  public Boolean isHasIosApp() {
    return hasIosApp;
  }

  public void setHasIosApp(Boolean hasIosApp) {
    this.hasIosApp = hasIosApp;
  }

  public App hasAndroidApp(Boolean hasAndroidApp) {
    this.hasAndroidApp = hasAndroidApp;
    return this;
  }

   /**
   * Has Android app in Google Play Store. This is readonly.
   * @return hasAndroidApp
  **/
  @ApiModelProperty(value = "Has Android app in Google Play Store. This is readonly.")
  public Boolean isHasAndroidApp() {
    return hasAndroidApp;
  }

  public void setHasAndroidApp(Boolean hasAndroidApp) {
    this.hasAndroidApp = hasAndroidApp;
  }

  public App countryId(String countryId) {
    this.countryId = countryId;
    return this;
  }

   /**
   * Country identifier in ISO 3166-1 alpha-2 format.   This code is set automatically based on the locations of the Stores in the App.     The App Country is used    - to determine how to parse mobile phone numbers that are entered in their local numbering format   - to determine if country specific payment methods should be offered   - in various fraud checks
   * @return countryId
  **/
  @ApiModelProperty(value = "Country identifier in ISO 3166-1 alpha-2 format.   This code is set automatically based on the locations of the Stores in the App.     The App Country is used    - to determine how to parse mobile phone numbers that are entered in their local numbering format   - to determine if country specific payment methods should be offered   - in various fraud checks")
  public String getCountryId() {
    return countryId;
  }

  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }

  public App logoImageUrl(String logoImageUrl) {
    this.logoImageUrl = logoImageUrl;
    return this;
  }

   /**
   * Application Logo.
   * @return logoImageUrl
  **/
  @ApiModelProperty(value = "Application Logo.")
  public String getLogoImageUrl() {
    return logoImageUrl;
  }

  public void setLogoImageUrl(String logoImageUrl) {
    this.logoImageUrl = logoImageUrl;
  }

  public App languages(List<Language> languages) {
    this.languages = languages;
    return this;
  }

  public App addLanguagesItem(Language languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<Language>();
    }
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * Languages that have been selected to be available to customers.
   * @return languages
  **/
  @ApiModelProperty(value = "Languages that have been selected to be available to customers.")
  public List<Language> getLanguages() {
    return languages;
  }

  public void setLanguages(List<Language> languages) {
    this.languages = languages;
  }

  public App availableAppLanguages(List<Language> availableAppLanguages) {
    this.availableAppLanguages = availableAppLanguages;
    return this;
  }

  public App addAvailableAppLanguagesItem(Language availableAppLanguagesItem) {
    if (this.availableAppLanguages == null) {
      this.availableAppLanguages = new ArrayList<Language>();
    }
    this.availableAppLanguages.add(availableAppLanguagesItem);
    return this;
  }

   /**
   * Lists all languages that are supported by Flipdish.
   * @return availableAppLanguages
  **/
  @ApiModelProperty(value = "Lists all languages that are supported by Flipdish.")
  public List<Language> getAvailableAppLanguages() {
    return availableAppLanguages;
  }

  public void setAvailableAppLanguages(List<Language> availableAppLanguages) {
    this.availableAppLanguages = availableAppLanguages;
  }

  public App appAccessLevel(AppAccessLevelEnum appAccessLevel) {
    this.appAccessLevel = appAccessLevel;
    return this;
  }

   /**
   * App access level for the logged in user
   * @return appAccessLevel
  **/
  @ApiModelProperty(value = "App access level for the logged in user")
  public AppAccessLevelEnum getAppAccessLevel() {
    return appAccessLevel;
  }

  public void setAppAccessLevel(AppAccessLevelEnum appAccessLevel) {
    this.appAccessLevel = appAccessLevel;
  }

  public App appResourceSet(List<AppResourceSetEnum> appResourceSet) {
    this.appResourceSet = appResourceSet;
    return this;
  }

  public App addAppResourceSetItem(AppResourceSetEnum appResourceSetItem) {
    if (this.appResourceSet == null) {
      this.appResourceSet = new ArrayList<AppResourceSetEnum>();
    }
    this.appResourceSet.add(appResourceSetItem);
    return this;
  }

   /**
   * Constitutes a list of available resources
   * @return appResourceSet
  **/
  @ApiModelProperty(value = "Constitutes a list of available resources")
  public List<AppResourceSetEnum> getAppResourceSet() {
    return appResourceSet;
  }

  public void setAppResourceSet(List<AppResourceSetEnum> appResourceSet) {
    this.appResourceSet = appResourceSet;
  }

  public App features(List<String> features) {
    this.features = features;
    return this;
  }

  public App addFeaturesItem(String featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<String>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Feature flags. These cannot be set by 3rd parties.
   * @return features
  **/
  @ApiModelProperty(value = "Feature flags. These cannot be set by 3rd parties.")
  public List<String> getFeatures() {
    return features;
  }

  public void setFeatures(List<String> features) {
    this.features = features;
  }

  public App mapCenter(Coordinates mapCenter) {
    this.mapCenter = mapCenter;
    return this;
  }

   /**
   * Center of the map coordinates. This is used to center the map when the iOS and Android app first open.  This value is automatically set based on the locations of the Stores in the App.
   * @return mapCenter
  **/
  @ApiModelProperty(value = "Center of the map coordinates. This is used to center the map when the iOS and Android app first open.  This value is automatically set based on the locations of the Stores in the App.")
  public Coordinates getMapCenter() {
    return mapCenter;
  }

  public void setMapCenter(Coordinates mapCenter) {
    this.mapCenter = mapCenter;
  }

  public App mapNorthEast(Coordinates mapNorthEast) {
    this.mapNorthEast = mapNorthEast;
    return this;
  }

   /**
   * North East(Top Right) Corner of the map coordinates. This is used to frame the map when the iOS and Android app first open.  This value is automatically set based on the locations of the Stores in the App.
   * @return mapNorthEast
  **/
  @ApiModelProperty(value = "North East(Top Right) Corner of the map coordinates. This is used to frame the map when the iOS and Android app first open.  This value is automatically set based on the locations of the Stores in the App.")
  public Coordinates getMapNorthEast() {
    return mapNorthEast;
  }

  public void setMapNorthEast(Coordinates mapNorthEast) {
    this.mapNorthEast = mapNorthEast;
  }

  public App mapSouthWest(Coordinates mapSouthWest) {
    this.mapSouthWest = mapSouthWest;
    return this;
  }

   /**
   * South West (Bottom Left) Corner of the map coordinates. This is used to frame the map when the iOS and Android app first open.  This value is automatically set based on the locations of the Stores in the App.
   * @return mapSouthWest
  **/
  @ApiModelProperty(value = "South West (Bottom Left) Corner of the map coordinates. This is used to frame the map when the iOS and Android app first open.  This value is automatically set based on the locations of the Stores in the App.")
  public Coordinates getMapSouthWest() {
    return mapSouthWest;
  }

  public void setMapSouthWest(Coordinates mapSouthWest) {
    this.mapSouthWest = mapSouthWest;
  }

  public App name(String name) {
    this.name = name;
    return this;
  }

   /**
   * App name.   This is used in various places on the Apple App Store, Google Play Store, mobile apps and websites.
   * @return name
  **/
  @ApiModelProperty(value = "App name.   This is used in various places on the Apple App Store, Google Play Store, mobile apps and websites.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public App hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * HostName on which the web-ordering system is allowed to be hosted or that a Flipdish website is hosted on.
   * @return hostName
  **/
  @ApiModelProperty(value = "HostName on which the web-ordering system is allowed to be hosted or that a Flipdish website is hosted on.")
  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public App mainColor(String mainColor) {
    this.mainColor = mainColor;
    return this;
  }

   /**
   * Main color of the web / Android / iOS applications
   * @return mainColor
  **/
  @ApiModelProperty(value = "Main color of the web / Android / iOS applications")
  public String getMainColor() {
    return mainColor;
  }

  public void setMainColor(String mainColor) {
    this.mainColor = mainColor;
  }

  public App applicationCategory(ApplicationCategoryEnum applicationCategory) {
    this.applicationCategory = applicationCategory;
    return this;
  }

   /**
   * Application Category
   * @return applicationCategory
  **/
  @ApiModelProperty(value = "Application Category")
  public ApplicationCategoryEnum getApplicationCategory() {
    return applicationCategory;
  }

  public void setApplicationCategory(ApplicationCategoryEnum applicationCategory) {
    this.applicationCategory = applicationCategory;
  }

  public App isPanaceaEnabled(Boolean isPanaceaEnabled) {
    this.isPanaceaEnabled = isPanaceaEnabled;
    return this;
  }

   /**
   * Panacea is the term used for websites that are hosted on the my.flipdish.com domain. This value is true when the App&#39;s website is hosted on this domain.  The aternative to using Panacea websites is to use a custom domain.
   * @return isPanaceaEnabled
  **/
  @ApiModelProperty(value = "Panacea is the term used for websites that are hosted on the my.flipdish.com domain. This value is true when the App's website is hosted on this domain.  The aternative to using Panacea websites is to use a custom domain.")
  public Boolean isIsPanaceaEnabled() {
    return isPanaceaEnabled;
  }

  public void setIsPanaceaEnabled(Boolean isPanaceaEnabled) {
    this.isPanaceaEnabled = isPanaceaEnabled;
  }

  public App cookieConsentPromptEnabled(Boolean cookieConsentPromptEnabled) {
    this.cookieConsentPromptEnabled = cookieConsentPromptEnabled;
    return this;
  }

   /**
   * Cookie Consent Prompt Enabled
   * @return cookieConsentPromptEnabled
  **/
  @ApiModelProperty(value = "Cookie Consent Prompt Enabled")
  public Boolean isCookieConsentPromptEnabled() {
    return cookieConsentPromptEnabled;
  }

  public void setCookieConsentPromptEnabled(Boolean cookieConsentPromptEnabled) {
    this.cookieConsentPromptEnabled = cookieConsentPromptEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    App app = (App) o;
    return Objects.equals(this.appId, app.appId) &&
        Objects.equals(this.hasIosApp, app.hasIosApp) &&
        Objects.equals(this.hasAndroidApp, app.hasAndroidApp) &&
        Objects.equals(this.countryId, app.countryId) &&
        Objects.equals(this.logoImageUrl, app.logoImageUrl) &&
        Objects.equals(this.languages, app.languages) &&
        Objects.equals(this.availableAppLanguages, app.availableAppLanguages) &&
        Objects.equals(this.appAccessLevel, app.appAccessLevel) &&
        Objects.equals(this.appResourceSet, app.appResourceSet) &&
        Objects.equals(this.features, app.features) &&
        Objects.equals(this.mapCenter, app.mapCenter) &&
        Objects.equals(this.mapNorthEast, app.mapNorthEast) &&
        Objects.equals(this.mapSouthWest, app.mapSouthWest) &&
        Objects.equals(this.name, app.name) &&
        Objects.equals(this.hostName, app.hostName) &&
        Objects.equals(this.mainColor, app.mainColor) &&
        Objects.equals(this.applicationCategory, app.applicationCategory) &&
        Objects.equals(this.isPanaceaEnabled, app.isPanaceaEnabled) &&
        Objects.equals(this.cookieConsentPromptEnabled, app.cookieConsentPromptEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, hasIosApp, hasAndroidApp, countryId, logoImageUrl, languages, availableAppLanguages, appAccessLevel, appResourceSet, features, mapCenter, mapNorthEast, mapSouthWest, name, hostName, mainColor, applicationCategory, isPanaceaEnabled, cookieConsentPromptEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class App {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    hasIosApp: ").append(toIndentedString(hasIosApp)).append("\n");
    sb.append("    hasAndroidApp: ").append(toIndentedString(hasAndroidApp)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    logoImageUrl: ").append(toIndentedString(logoImageUrl)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    availableAppLanguages: ").append(toIndentedString(availableAppLanguages)).append("\n");
    sb.append("    appAccessLevel: ").append(toIndentedString(appAccessLevel)).append("\n");
    sb.append("    appResourceSet: ").append(toIndentedString(appResourceSet)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    mapCenter: ").append(toIndentedString(mapCenter)).append("\n");
    sb.append("    mapNorthEast: ").append(toIndentedString(mapNorthEast)).append("\n");
    sb.append("    mapSouthWest: ").append(toIndentedString(mapSouthWest)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    mainColor: ").append(toIndentedString(mainColor)).append("\n");
    sb.append("    applicationCategory: ").append(toIndentedString(applicationCategory)).append("\n");
    sb.append("    isPanaceaEnabled: ").append(toIndentedString(isPanaceaEnabled)).append("\n");
    sb.append("    cookieConsentPromptEnabled: ").append(toIndentedString(cookieConsentPromptEnabled)).append("\n");
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

