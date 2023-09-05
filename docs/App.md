
# App

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appId** | **String** | App Identifier |  [optional]
**hasIosApp** | **Boolean** | Has iOS app in Apple App Store. This is readonly. |  [optional]
**hasAndroidApp** | **Boolean** | Has Android app in Google Play Store. This is readonly. |  [optional]
**countryId** | **String** | Country identifier in ISO 3166-1 alpha-2 format.   This code is set automatically based on the locations of the Stores in the App.     The App Country is used    - to determine how to parse mobile phone numbers that are entered in their local numbering format   - to determine if country specific payment methods should be offered   - in various fraud checks |  [optional]
**logoImageUrl** | **String** | Application Logo. |  [optional]
**languages** | [**List&lt;Language&gt;**](Language.md) | Languages that have been selected to be available to customers. |  [optional]
**availableAppLanguages** | [**List&lt;Language&gt;**](Language.md) | Lists all languages that are supported by Flipdish. |  [optional]
**appAccessLevel** | [**AppAccessLevelEnum**](#AppAccessLevelEnum) | App access level for the logged in user |  [optional]
**appResourceSet** | [**List&lt;AppResourceSetEnum&gt;**](#List&lt;AppResourceSetEnum&gt;) | Constitutes a list of available resources |  [optional]
**features** | **List&lt;String&gt;** | Feature flags. These cannot be set by 3rd parties. |  [optional]
**mapCenter** | [**Coordinates**](Coordinates.md) | Center of the map coordinates. This is used to center the map when the iOS and Android app first open.  This value is automatically set based on the locations of the Stores in the App. |  [optional]
**mapNorthEast** | [**Coordinates**](Coordinates.md) | North East(Top Right) Corner of the map coordinates. This is used to frame the map when the iOS and Android app first open.  This value is automatically set based on the locations of the Stores in the App. |  [optional]
**mapSouthWest** | [**Coordinates**](Coordinates.md) | South West (Bottom Left) Corner of the map coordinates. This is used to frame the map when the iOS and Android app first open.  This value is automatically set based on the locations of the Stores in the App. |  [optional]
**googleMapsApiKeyWeb** | **String** | Key to be passed with Google Maps requests |  [optional]
**name** | **String** | App name.   This is used in various places on the Apple App Store, Google Play Store, mobile apps and websites. |  [optional]
**hostName** | **String** | HostName on which the web-ordering system is allowed to be hosted or that a Flipdish website is hosted on. |  [optional]
**mainColor** | **String** | Main color of the web / Android / iOS applications |  [optional]
**kioskPrimaryColour** | **String** | Primary colour used on the Kiosk |  [optional]
**applicationCategory** | [**ApplicationCategoryEnum**](#ApplicationCategoryEnum) | Application Category |  [optional]
**isPanaceaEnabled** | **Boolean** | Panacea is the term used for websites that are hosted on the my.flipdish.com domain. This value is true when the App&#39;s website is hosted on this domain.  The aternative to using Panacea websites is to use a custom domain. |  [optional]
**panaceaVanityUrl** | **String** | In case of IsPanaceaEnabled is true, the app can be accessed via https://my.flipdish.com/{PanaceaVanityUrl} |  [optional]
**cookieConsentPromptEnabled** | **Boolean** | Cookie Consent Prompt Enabled |  [optional]


<a name="AppAccessLevelEnum"></a>
## Enum: AppAccessLevelEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
OWNER | &quot;Owner&quot;
STOREOWNER | &quot;StoreOwner&quot;
MANAGEDOWNER | &quot;ManagedOwner&quot;
INTEGRATOR | &quot;Integrator&quot;
STOREMANAGER | &quot;StoreManager&quot;
STORESTAFF | &quot;StoreStaff&quot;
STOREREADONLYACCESS | &quot;StoreReadOnlyAccess&quot;
FINANCEMANGER | &quot;FinanceManger&quot;
SUPPORT | &quot;Support&quot;


<a name="List<AppResourceSetEnum>"></a>
## Enum: List&lt;AppResourceSetEnum&gt;
Name | Value
---- | -----
VIEWAPP | &quot;ViewApp&quot;
CREATEAPP | &quot;CreateApp&quot;
UPDATEAPP | &quot;UpdateApp&quot;
EDITAPPASSETS | &quot;EditAppAssets&quot;
EDITAPPFEATURES | &quot;EditAppFeatures&quot;
VIEWTEAMMATES | &quot;ViewTeammates&quot;
EDITTEAMMATES | &quot;EditTeammates&quot;
CREATETEAMMATEOWNER | &quot;CreateTeammateOwner&quot;
CREATETEAMMATEMANAGEDOWNER | &quot;CreateTeammateManagedOwner&quot;
CREATETEAMMATESTOREOWNER | &quot;CreateTeammateStoreOwner&quot;
CREATETEAMMATESTOREMANAGER | &quot;CreateTeammateStoreManager&quot;
CREATETEAMMATESTORESTAFF | &quot;CreateTeammateStoreStaff&quot;
CREATETEAMMATESTOREREADACCESS | &quot;CreateTeammateStoreReadAccess&quot;
CREATETEAMMATEFINANCEMANAGER | &quot;CreateTeammateFinanceManager&quot;
CREATETEAMMATEINTEGRATOR | &quot;CreateTeammateIntegrator&quot;
VIEWAPMCONFIGURATIONS | &quot;ViewApmConfigurations&quot;
EDITAPMCONFIGURATIONS | &quot;EditApmConfigurations&quot;
VIEWCAMPAIGNSCONFIGURATIONS | &quot;ViewCampaignsConfigurations&quot;
CREATECAMPAIGNSCONFIGURATIONS | &quot;CreateCampaignsConfigurations&quot;
UPDATECAMPAIGNSCONFIGURATIONS | &quot;UpdateCampaignsConfigurations&quot;
DELETECAMPAIGNSCONFIGURATIONS | &quot;DeleteCampaignsConfigurations&quot;
VIEWDEVELOPERSSETTINGS | &quot;ViewDevelopersSettings&quot;
EDITDEVELOPERSSETTINGS | &quot;EditDevelopersSettings&quot;
VIEWORDERS | &quot;ViewOrders&quot;
UPDATEORDERSACCEPT | &quot;UpdateOrdersAccept&quot;
UPDATEORDERSREJECT | &quot;UpdateOrdersReject&quot;
UPDATEORDERSREFUND | &quot;UpdateOrdersRefund&quot;
UPDATEORDERSDISPATCH | &quot;UpdateOrdersDispatch&quot;
VIEWSTORES | &quot;ViewStores&quot;
CREATESTORES | &quot;CreateStores&quot;
EDITSTORES | &quot;EditStores&quot;
VIEWSTORESOPENINGHOURS | &quot;ViewStoresOpeningHours&quot;
UPDATESTORESOPENFORCOLLECTIONORDELIVERY | &quot;UpdateStoresOpenForCollectionOrDelivery&quot;
UPDATESTORESOPENINGHOURS | &quot;UpdateStoresOpeningHours&quot;
VIEWSTORESOPENINGHOURSOVERRIDE | &quot;ViewStoresOpeningHoursOverride&quot;
EDITSTORESOPENINGHOURSOVERRIDE | &quot;EditStoresOpeningHoursOverride&quot;
EDITSTORESOPENINGHOURSOVERRIDETEMPORARY | &quot;EditStoresOpeningHoursOverrideTemporary&quot;
UPDATESTORESNAME | &quot;UpdateStoresName&quot;
EDITSTOREKIOSKSETTINGS | &quot;EditStoreKioskSettings&quot;
EDITSTOREORDERCAPACITY | &quot;EditStoreOrderCapacity&quot;
UPDATEPRINTERTERMINALSASSIGN | &quot;UpdatePrinterTerminalsAssign&quot;
UPDATEPRINTERTERMINALSTOGGLE | &quot;UpdatePrinterTerminalsToggle&quot;
EDITSTORENOTIFICATIONS | &quot;EditStoreNotifications&quot;
VIEWSTOREGROUPS | &quot;ViewStoreGroups&quot;
CREATESTOREGROUPS | &quot;CreateStoreGroups&quot;
UPDATESTOREGROUPS | &quot;UpdateStoreGroups&quot;
DELETESTOREGROUPS | &quot;DeleteStoreGroups&quot;
VIEWDELIVERYZONES | &quot;ViewDeliveryZones&quot;
CREATEDELIVERYZONES | &quot;CreateDeliveryZones&quot;
UPDATEDELIVERYZONES | &quot;UpdateDeliveryZones&quot;
DELETEDELIVERYZONES | &quot;DeleteDeliveryZones&quot;
VIEWMENU | &quot;ViewMenu&quot;
CREATEMENU | &quot;CreateMenu&quot;
UPDATEMENU | &quot;UpdateMenu&quot;
DELETEMENU | &quot;DeleteMenu&quot;
UPDATEMENULOCK | &quot;UpdateMenuLock&quot;
UPDATEMENUITEMSHIDETEMPORARILY | &quot;UpdateMenuItemsHideTemporarily&quot;
EDITMENUIMAGE | &quot;EditMenuImage&quot;
VIEWVOUCHERS | &quot;ViewVouchers&quot;
EDITVOUCHERS | &quot;EditVouchers&quot;
VIEWWEBSITECONTENT | &quot;ViewWebsiteContent&quot;
EDITWEBSITECONTENT | &quot;EditWebsiteContent&quot;
VIEWWEBSITEDNSVERIFIED | &quot;ViewWebsiteDnsVerified&quot;
VIEWWEBSITECERTIFICATECREATED | &quot;ViewWebsiteCertificateCreated&quot;
VIEWWEBSITECERTIFICATERENEWED | &quot;ViewWebsiteCertificateRenewed&quot;
VIEWBANKACCOUNTS | &quot;ViewBankAccounts&quot;
CREATEBANKACCOUNTS | &quot;CreateBankAccounts&quot;
UPDATEBANKACCOUNTS | &quot;UpdateBankAccounts&quot;
UPDATEBANKACCOUNTSASSIGN | &quot;UpdateBankAccountsAssign&quot;
VIEWASSIGNEDBANKACCOUNT | &quot;ViewAssignedBankAccount&quot;
VERIFYBANKACCOUNTS | &quot;VerifyBankAccounts&quot;
VIEWSERVICECHARGECONFIGURATIONS | &quot;ViewServiceChargeConfigurations&quot;
EDITSERVICECHARGECONFIGURATIONS | &quot;EditServiceChargeConfigurations&quot;
VIEWHYDRACONFIG | &quot;ViewHydraConfig&quot;
UPDATEHYDRACONFIGMANAGE | &quot;UpdateHydraConfigManage&quot;
INITIATEBLUETOOTHPAIRINGMODE | &quot;InitiateBluetoothPairingMode&quot;
DELETETERMINAL | &quot;DeleteTerminal&quot;
VIEWKIOSKTELEMETRY | &quot;ViewKioskTelemetry&quot;
VIEWCUSTOMERS | &quot;ViewCustomers&quot;
EDITCUSTOMERS | &quot;EditCustomers&quot;
CREATECATALOGELEMENTS | &quot;CreateCatalogElements&quot;
UPDATECATALOGELEMENTS | &quot;UpdateCatalogElements&quot;
VIEWCATALOGELEMENTS | &quot;ViewCatalogElements&quot;
DELETECATALOGELEMENTS | &quot;DeleteCatalogElements&quot;
VIEWMETAFIELDDEFINITIONS | &quot;ViewMetafieldDefinitions&quot;
CREATEMETAFIELDDEFINITIONS | &quot;CreateMetafieldDefinitions&quot;
UPDATEMETAFIELDDEFINITIONS | &quot;UpdateMetafieldDefinitions&quot;
DELETEMETAFIELDDEFINITIONS | &quot;DeleteMetafieldDefinitions&quot;
UPDATEMETAFIELDS | &quot;UpdateMetafields&quot;
VIEWCATALOGMENUCHANGES | &quot;ViewCatalogMenuChanges&quot;
PUBLISHCATALOGMENUCHANGES | &quot;PublishCatalogMenuChanges&quot;
VIEWAPPSTATISTICS | &quot;ViewAppStatistics&quot;
VIEWAPMSTATISTICS | &quot;ViewApmStatistics&quot;
VIEWCAMPAIGNSSTATISTICS | &quot;ViewCampaignsStatistics&quot;
VIEWCUSTOMERSTATISTICS | &quot;ViewCustomerStatistics&quot;
VIEWLIVESTATISTICS | &quot;ViewLiveStatistics&quot;
VIEWORDERSTATISTICS | &quot;ViewOrderStatistics&quot;
VIEWSALESSTATISTICS | &quot;ViewSalesStatistics&quot;
VIEWSALESENDOFDAYSTATISTICS | &quot;ViewSalesEndOfDayStatistics&quot;
VIEWVOUCHERSSTATISTICS | &quot;ViewVouchersStatistics&quot;
DOWNLOADCUSTOMERCSVEXPORT | &quot;DownloadCustomerCsvExport&quot;
VIEWAPMAUDITLOGS | &quot;ViewApmAuditLogs&quot;
VIEWSTOREAUDITLOGS | &quot;ViewStoreAuditLogs&quot;
VIEWMENUAUDITLOGS | &quot;ViewMenuAuditLogs&quot;
VIEWBANKACCOUNTAUDITLOGS | &quot;ViewBankAccountAuditLogs&quot;
VIEWFEECONFIGURATIONSAUDITLOGS | &quot;ViewFeeConfigurationsAuditLogs&quot;
VIEWORDERSAUDITLOGS | &quot;ViewOrdersAuditLogs&quot;
VIEWVOUCHERSAUDITLOGS | &quot;ViewVouchersAuditLogs&quot;
VIEWUSEREVENTSAUDITLOGS | &quot;ViewUserEventsAuditLogs&quot;
VIEWCAMPAIGNSAUDITLOGS | &quot;ViewCampaignsAuditLogs&quot;
VIEWTEAMMATESAUDITLOGS | &quot;ViewTeammatesAuditLogs&quot;
VIEWAPPAUDITLOGS | &quot;ViewAppAuditLogs&quot;
VIEWCUSTOMERAUDITLOGS | &quot;ViewCustomerAuditLogs&quot;
VIEWPRINTERAUDITLOGS | &quot;ViewPrinterAuditLogs&quot;
VIEWHYDRAAUDITLOGS | &quot;ViewHydraAuditLogs&quot;
VIEWPUSHNOTIFICATIONAUDITLOGS | &quot;ViewPushNotificationAuditLogs&quot;
VIEWSTRIPECUSTOMCONNECTEDACCOUNTAUDITLOGS | &quot;ViewStripeCustomConnectedAccountAuditLogs&quot;
VIEWKIOSKBLUETOOTHDEVICEAUDITLOGS | &quot;ViewKioskBluetoothDeviceAuditLogs&quot;
VIEWEXTERNALAUDITLOGS | &quot;ViewExternalAuditLogs&quot;
CREATEEXTERNALAUDITLOGEVENTS | &quot;CreateExternalAuditLogEvents&quot;
VIEWCATALOGAUDITLOGS | &quot;ViewCatalogAuditLogs&quot;
VIEWORDERFULFILLMENTAUDITLOGS | &quot;ViewOrderFulfillmentAuditLogs&quot;
SENDPUSHNOTIFICATIONTOCUSTOMER | &quot;SendPushNotificationToCustomer&quot;
INVITEDRIVERTOAPP | &quot;InviteDriverToApp&quot;
GETDRIVERFORAPP | &quot;GetDriverForApp&quot;
REMOVEDRIVERFROMAPP | &quot;RemoveDriverFromApp&quot;
ASSIGNDRIVERTOORDER | &quot;AssignDriverToOrder&quot;
UNASSIGNDRIVERFROMORDER | &quot;UnassignDriverFromOrder&quot;
UPDATEORDERSDELIVERYTRACKINGSTATUS | &quot;UpdateOrdersDeliveryTrackingStatus&quot;
UPDATEORDERFULFILLMENTSTATUS | &quot;UpdateOrderFulfillmentStatus&quot;
VIEWFULFILLMENTSTATESCONFIGURATION | &quot;ViewFulfillmentStatesConfiguration&quot;
CREATEFULFILLMENTSTATESCONFIGURATION | &quot;CreateFulfillmentStatesConfiguration&quot;
UPDATEFULFILLMENTSTATESCONFIGURATION | &quot;UpdateFulfillmentStatesConfiguration&quot;
DELETEFULFILLMENTSTATESCONFIGURATION | &quot;DeleteFulfillmentStatesConfiguration&quot;
VIEWPAYOUTS | &quot;ViewPayouts&quot;
VIEWCHANNELS | &quot;ViewChannels&quot;
VIEWONBOARDING | &quot;ViewOnboarding&quot;
UPDATEONBOARDING | &quot;UpdateOnboarding&quot;
VIEWCLIENTDEVICES | &quot;ViewClientDevices&quot;
UPDATECLIENTDEVICES | &quot;UpdateClientDevices&quot;
ENROLLCLIENTDEVICES | &quot;EnrollClientDevices&quot;
ASSIGNCLIENTDEVICES | &quot;AssignClientDevices&quot;
VIEWCLIENTAUDITLOGS | &quot;ViewClientAuditLogs&quot;
CREATEAPPSTOREAPPCONFIGURATION | &quot;CreateAppStoreAppConfiguration&quot;
VIEWAPPSTOREAPPCONFIGURATION | &quot;ViewAppStoreAppConfiguration&quot;
UPDATEAPPSTOREAPPCONFIGURATION | &quot;UpdateAppStoreAppConfiguration&quot;
DELETEAPPSTOREAPPCONFIGURATION | &quot;DeleteAppStoreAppConfiguration&quot;
UPDATEAPPSTOREAPPCONFIGURATIONSETTINGS | &quot;UpdateAppStoreAppConfigurationSettings&quot;
VIEWSALESCHANNELS | &quot;ViewSalesChannels&quot;
EDITSALESCHANNELS | &quot;EditSalesChannels&quot;
VIEWPAYGREENWHITELABELCONFIGURATION | &quot;ViewPayGreenWhiteLabelConfiguration&quot;
CREATEPAYGREENWHITELABELCONFIGURATION | &quot;CreatePayGreenWhiteLabelConfiguration&quot;
UPDATEPAYGREENWHITELABELCONFIGURATION | &quot;UpdatePayGreenWhiteLabelConfiguration&quot;
UPDATEPAYGREENSTORECONFIGURATION | &quot;UpdatePayGreenStoreConfiguration&quot;
VIEWSUBSCRIPTIONS | &quot;ViewSubscriptions&quot;


<a name="ApplicationCategoryEnum"></a>
## Enum: ApplicationCategoryEnum
Name | Value
---- | -----
RESTAURANT | &quot;Restaurant&quot;
CAFE | &quot;Cafe&quot;
CONVENIENCE | &quot;Convenience&quot;



