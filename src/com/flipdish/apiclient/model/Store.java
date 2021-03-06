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
import com.flipdish.apiclient.model.BusinessHoursPeriod;
import com.flipdish.apiclient.model.DeliveryZone;
import com.flipdish.apiclient.model.StoreAddress;
import com.flipdish.apiclient.model.StoreNote;
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
import java.io.Serializable;

/**
 * Store
 */
@ApiModel(description = "Store")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-21T10:37:59.975Z")
public class Store implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("StoreGroupId")
  private Integer storeGroupId = null;

  @SerializedName("Address")
  private StoreAddress address = null;

  @SerializedName("DeliveryZones")
  private List<DeliveryZone> deliveryZones = null;

  @SerializedName("ApmPhoneNumber")
  private String apmPhoneNumber = null;

  @SerializedName("PickupHours")
  private List<BusinessHoursPeriod> pickupHours = null;

  @SerializedName("DeliveryHours")
  private List<BusinessHoursPeriod> deliveryHours = null;

  @SerializedName("MenuId")
  private Integer menuId = null;

  @SerializedName("OrderConfirmationMessageOverrideDelivery")
  private String orderConfirmationMessageOverrideDelivery = null;

  @SerializedName("OrderConfirmationMessageOverridePickup")
  private String orderConfirmationMessageOverridePickup = null;

  /**
   * Printout layout
   */
  @JsonAdapter(PrintoutLayoutTypeEnum.Adapter.class)
  public enum PrintoutLayoutTypeEnum {
    DEFAULT("Default"),
    
    CENTRA("Centra");

    private String value;

    PrintoutLayoutTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PrintoutLayoutTypeEnum fromValue(String text) {
      for (PrintoutLayoutTypeEnum b : PrintoutLayoutTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PrintoutLayoutTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PrintoutLayoutTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PrintoutLayoutTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PrintoutLayoutTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("PrintoutLayoutType")
  private PrintoutLayoutTypeEnum printoutLayoutType = null;

  @SerializedName("StoreNotes")
  private List<StoreNote> storeNotes = null;

  @SerializedName("MicrosoftTimeZone")
  private String microsoftTimeZone = null;

  @SerializedName("IanaTimeZone")
  private String ianaTimeZone = null;

  @SerializedName("PhoneNumber")
  private String phoneNumber = null;

  @SerializedName("AlwaysAppearOpen")
  private Boolean alwaysAppearOpen = null;

  @SerializedName("PreOrderEnabled")
  private Boolean preOrderEnabled = null;

  @SerializedName("TakeOutEnabled")
  private Boolean takeOutEnabled = null;

  @SerializedName("TableServiceEnabled")
  private Boolean tableServiceEnabled = null;

  @SerializedName("DineInEnabled")
  private Boolean dineInEnabled = null;

  @SerializedName("AllowPreOrdersAndTableService")
  private Boolean allowPreOrdersAndTableService = null;

  @SerializedName("PickupEnabled")
  private Boolean pickupEnabled = null;

  @SerializedName("DeliveryEnabled")
  private Boolean deliveryEnabled = null;

  @SerializedName("CardOrderDeliveryEnabled")
  private Boolean cardOrderDeliveryEnabled = null;

  @SerializedName("CashOrdersDeliveryEnabled")
  private Boolean cashOrdersDeliveryEnabled = null;

  @SerializedName("CardOrdersPickupEnabled")
  private Boolean cardOrdersPickupEnabled = null;

  @SerializedName("CashOrdersPickupEnabled")
  private Boolean cashOrdersPickupEnabled = null;

  @SerializedName("TipsEnabled")
  private Boolean tipsEnabled = null;

  @SerializedName("AutomaticallyAcceptOrders")
  private Boolean automaticallyAcceptOrders = null;

  @SerializedName("OpenForDelivery")
  private Boolean openForDelivery = null;

  @SerializedName("OpenForPickup")
  private Boolean openForPickup = null;

  @SerializedName("MinimumPickupOrderAmount")
  private Double minimumPickupOrderAmount = null;

  @SerializedName("RequireCustomerNameForPickup")
  private Boolean requireCustomerNameForPickup = null;

  @SerializedName("GdprCustomerPhoneNumbers")
  private Boolean gdprCustomerPhoneNumbers = null;

  @SerializedName("RequireCustomerNameForDelivery")
  private Boolean requireCustomerNameForDelivery = null;

  @SerializedName("EtaInPickupConfirmationSmsEnabled")
  private Boolean etaInPickupConfirmationSmsEnabled = null;

  @SerializedName("EtaInDeliveryConfirmationSmsEnabled")
  private Boolean etaInDeliveryConfirmationSmsEnabled = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("EmailAddress")
  private String emailAddress = null;

  @SerializedName("StaffLanguage")
  private String staffLanguage = null;

  public Store storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Store identifier
   * @return storeId
  **/
  @ApiModelProperty(value = "Store identifier")
  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public Store storeGroupId(Integer storeGroupId) {
    this.storeGroupId = storeGroupId;
    return this;
  }

   /**
   * Store group id to which this store belongs
   * @return storeGroupId
  **/
  @ApiModelProperty(value = "Store group id to which this store belongs")
  public Integer getStoreGroupId() {
    return storeGroupId;
  }

  public void setStoreGroupId(Integer storeGroupId) {
    this.storeGroupId = storeGroupId;
  }

  public Store address(StoreAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Store address
   * @return address
  **/
  @ApiModelProperty(value = "Store address")
  public StoreAddress getAddress() {
    return address;
  }

  public void setAddress(StoreAddress address) {
    this.address = address;
  }

  public Store deliveryZones(List<DeliveryZone> deliveryZones) {
    this.deliveryZones = deliveryZones;
    return this;
  }

  public Store addDeliveryZonesItem(DeliveryZone deliveryZonesItem) {
    if (this.deliveryZones == null) {
      this.deliveryZones = new ArrayList<>();
    }
    this.deliveryZones.add(deliveryZonesItem);
    return this;
  }

   /**
   * Delivery zones
   * @return deliveryZones
  **/
  @ApiModelProperty(value = "Delivery zones")
  public List<DeliveryZone> getDeliveryZones() {
    return deliveryZones;
  }

  public void setDeliveryZones(List<DeliveryZone> deliveryZones) {
    this.deliveryZones = deliveryZones;
  }

  public Store apmPhoneNumber(String apmPhoneNumber) {
    this.apmPhoneNumber = apmPhoneNumber;
    return this;
  }

   /**
   * Automated Phone Marketing number
   * @return apmPhoneNumber
  **/
  @ApiModelProperty(value = "Automated Phone Marketing number")
  public String getApmPhoneNumber() {
    return apmPhoneNumber;
  }

  public void setApmPhoneNumber(String apmPhoneNumber) {
    this.apmPhoneNumber = apmPhoneNumber;
  }

  public Store pickupHours(List<BusinessHoursPeriod> pickupHours) {
    this.pickupHours = pickupHours;
    return this;
  }

  public Store addPickupHoursItem(BusinessHoursPeriod pickupHoursItem) {
    if (this.pickupHours == null) {
      this.pickupHours = new ArrayList<>();
    }
    this.pickupHours.add(pickupHoursItem);
    return this;
  }

   /**
   * Pickup hours
   * @return pickupHours
  **/
  @ApiModelProperty(value = "Pickup hours")
  public List<BusinessHoursPeriod> getPickupHours() {
    return pickupHours;
  }

  public void setPickupHours(List<BusinessHoursPeriod> pickupHours) {
    this.pickupHours = pickupHours;
  }

  public Store deliveryHours(List<BusinessHoursPeriod> deliveryHours) {
    this.deliveryHours = deliveryHours;
    return this;
  }

  public Store addDeliveryHoursItem(BusinessHoursPeriod deliveryHoursItem) {
    if (this.deliveryHours == null) {
      this.deliveryHours = new ArrayList<>();
    }
    this.deliveryHours.add(deliveryHoursItem);
    return this;
  }

   /**
   * Delivery hours
   * @return deliveryHours
  **/
  @ApiModelProperty(value = "Delivery hours")
  public List<BusinessHoursPeriod> getDeliveryHours() {
    return deliveryHours;
  }

  public void setDeliveryHours(List<BusinessHoursPeriod> deliveryHours) {
    this.deliveryHours = deliveryHours;
  }

  public Store menuId(Integer menuId) {
    this.menuId = menuId;
    return this;
  }

   /**
   * Menu identifier
   * @return menuId
  **/
  @ApiModelProperty(value = "Menu identifier")
  public Integer getMenuId() {
    return menuId;
  }

  public void setMenuId(Integer menuId) {
    this.menuId = menuId;
  }

  public Store orderConfirmationMessageOverrideDelivery(String orderConfirmationMessageOverrideDelivery) {
    this.orderConfirmationMessageOverrideDelivery = orderConfirmationMessageOverrideDelivery;
    return this;
  }

   /**
   * Overridden confirmation message for delivery orders
   * @return orderConfirmationMessageOverrideDelivery
  **/
  @ApiModelProperty(value = "Overridden confirmation message for delivery orders")
  public String getOrderConfirmationMessageOverrideDelivery() {
    return orderConfirmationMessageOverrideDelivery;
  }

  public void setOrderConfirmationMessageOverrideDelivery(String orderConfirmationMessageOverrideDelivery) {
    this.orderConfirmationMessageOverrideDelivery = orderConfirmationMessageOverrideDelivery;
  }

  public Store orderConfirmationMessageOverridePickup(String orderConfirmationMessageOverridePickup) {
    this.orderConfirmationMessageOverridePickup = orderConfirmationMessageOverridePickup;
    return this;
  }

   /**
   * Overridden confirmation message for pickup orders
   * @return orderConfirmationMessageOverridePickup
  **/
  @ApiModelProperty(value = "Overridden confirmation message for pickup orders")
  public String getOrderConfirmationMessageOverridePickup() {
    return orderConfirmationMessageOverridePickup;
  }

  public void setOrderConfirmationMessageOverridePickup(String orderConfirmationMessageOverridePickup) {
    this.orderConfirmationMessageOverridePickup = orderConfirmationMessageOverridePickup;
  }

  public Store printoutLayoutType(PrintoutLayoutTypeEnum printoutLayoutType) {
    this.printoutLayoutType = printoutLayoutType;
    return this;
  }

   /**
   * Printout layout
   * @return printoutLayoutType
  **/
  @ApiModelProperty(value = "Printout layout")
  public PrintoutLayoutTypeEnum getPrintoutLayoutType() {
    return printoutLayoutType;
  }

  public void setPrintoutLayoutType(PrintoutLayoutTypeEnum printoutLayoutType) {
    this.printoutLayoutType = printoutLayoutType;
  }

  public Store storeNotes(List<StoreNote> storeNotes) {
    this.storeNotes = storeNotes;
    return this;
  }

  public Store addStoreNotesItem(StoreNote storeNotesItem) {
    if (this.storeNotes == null) {
      this.storeNotes = new ArrayList<>();
    }
    this.storeNotes.add(storeNotesItem);
    return this;
  }

   /**
   * Store notes
   * @return storeNotes
  **/
  @ApiModelProperty(value = "Store notes")
  public List<StoreNote> getStoreNotes() {
    return storeNotes;
  }

  public void setStoreNotes(List<StoreNote> storeNotes) {
    this.storeNotes = storeNotes;
  }

  public Store microsoftTimeZone(String microsoftTimeZone) {
    this.microsoftTimeZone = microsoftTimeZone;
    return this;
  }

   /**
   * Microsoft Time Zone Index Values (https://msdn.microsoft.com/en-us/library/ms912391)  (Editable through store coordinate change)
   * @return microsoftTimeZone
  **/
  @ApiModelProperty(value = "Microsoft Time Zone Index Values (https://msdn.microsoft.com/en-us/library/ms912391)  (Editable through store coordinate change)")
  public String getMicrosoftTimeZone() {
    return microsoftTimeZone;
  }

  public void setMicrosoftTimeZone(String microsoftTimeZone) {
    this.microsoftTimeZone = microsoftTimeZone;
  }

  public Store ianaTimeZone(String ianaTimeZone) {
    this.ianaTimeZone = ianaTimeZone;
    return this;
  }

   /**
   * IANA Time Zone (https://www.iana.org/time-zones)  (Editable through store coordinate change)
   * @return ianaTimeZone
  **/
  @ApiModelProperty(value = "IANA Time Zone (https://www.iana.org/time-zones)  (Editable through store coordinate change)")
  public String getIanaTimeZone() {
    return ianaTimeZone;
  }

  public void setIanaTimeZone(String ianaTimeZone) {
    this.ianaTimeZone = ianaTimeZone;
  }

  public Store phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Phone number")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Store alwaysAppearOpen(Boolean alwaysAppearOpen) {
    this.alwaysAppearOpen = alwaysAppearOpen;
    return this;
  }

   /**
   * True if the store always appears open
   * @return alwaysAppearOpen
  **/
  @ApiModelProperty(value = "True if the store always appears open")
  public Boolean isAlwaysAppearOpen() {
    return alwaysAppearOpen;
  }

  public void setAlwaysAppearOpen(Boolean alwaysAppearOpen) {
    this.alwaysAppearOpen = alwaysAppearOpen;
  }

  public Store preOrderEnabled(Boolean preOrderEnabled) {
    this.preOrderEnabled = preOrderEnabled;
    return this;
  }

   /**
   * True if the store accepts pre-orders
   * @return preOrderEnabled
  **/
  @ApiModelProperty(value = "True if the store accepts pre-orders")
  public Boolean isPreOrderEnabled() {
    return preOrderEnabled;
  }

  public void setPreOrderEnabled(Boolean preOrderEnabled) {
    this.preOrderEnabled = preOrderEnabled;
  }

  public Store takeOutEnabled(Boolean takeOutEnabled) {
    this.takeOutEnabled = takeOutEnabled;
    return this;
  }

   /**
   * True if the store accepts take-out orders
   * @return takeOutEnabled
  **/
  @ApiModelProperty(value = "True if the store accepts take-out orders")
  public Boolean isTakeOutEnabled() {
    return takeOutEnabled;
  }

  public void setTakeOutEnabled(Boolean takeOutEnabled) {
    this.takeOutEnabled = takeOutEnabled;
  }

  public Store tableServiceEnabled(Boolean tableServiceEnabled) {
    this.tableServiceEnabled = tableServiceEnabled;
    return this;
  }

   /**
   * True if the store has table service
   * @return tableServiceEnabled
  **/
  @ApiModelProperty(value = "True if the store has table service")
  public Boolean isTableServiceEnabled() {
    return tableServiceEnabled;
  }

  public void setTableServiceEnabled(Boolean tableServiceEnabled) {
    this.tableServiceEnabled = tableServiceEnabled;
  }

  public Store dineInEnabled(Boolean dineInEnabled) {
    this.dineInEnabled = dineInEnabled;
    return this;
  }

   /**
   * True if the store accepts dine-in orders
   * @return dineInEnabled
  **/
  @ApiModelProperty(value = "True if the store accepts dine-in orders")
  public Boolean isDineInEnabled() {
    return dineInEnabled;
  }

  public void setDineInEnabled(Boolean dineInEnabled) {
    this.dineInEnabled = dineInEnabled;
  }

  public Store allowPreOrdersAndTableService(Boolean allowPreOrdersAndTableService) {
    this.allowPreOrdersAndTableService = allowPreOrdersAndTableService;
    return this;
  }

   /**
   * True if both pre-orders and talbe service can be enabled
   * @return allowPreOrdersAndTableService
  **/
  @ApiModelProperty(value = "True if both pre-orders and talbe service can be enabled")
  public Boolean isAllowPreOrdersAndTableService() {
    return allowPreOrdersAndTableService;
  }

  public void setAllowPreOrdersAndTableService(Boolean allowPreOrdersAndTableService) {
    this.allowPreOrdersAndTableService = allowPreOrdersAndTableService;
  }

  public Store pickupEnabled(Boolean pickupEnabled) {
    this.pickupEnabled = pickupEnabled;
    return this;
  }

   /**
   * True if the store accepts pickup orders
   * @return pickupEnabled
  **/
  @ApiModelProperty(value = "True if the store accepts pickup orders")
  public Boolean isPickupEnabled() {
    return pickupEnabled;
  }

  public void setPickupEnabled(Boolean pickupEnabled) {
    this.pickupEnabled = pickupEnabled;
  }

  public Store deliveryEnabled(Boolean deliveryEnabled) {
    this.deliveryEnabled = deliveryEnabled;
    return this;
  }

   /**
   * True if the store accepts delivery orders
   * @return deliveryEnabled
  **/
  @ApiModelProperty(value = "True if the store accepts delivery orders")
  public Boolean isDeliveryEnabled() {
    return deliveryEnabled;
  }

  public void setDeliveryEnabled(Boolean deliveryEnabled) {
    this.deliveryEnabled = deliveryEnabled;
  }

  public Store cardOrderDeliveryEnabled(Boolean cardOrderDeliveryEnabled) {
    this.cardOrderDeliveryEnabled = cardOrderDeliveryEnabled;
    return this;
  }

   /**
   * True if the store accepts card payment for delivery orders
   * @return cardOrderDeliveryEnabled
  **/
  @ApiModelProperty(value = "True if the store accepts card payment for delivery orders")
  public Boolean isCardOrderDeliveryEnabled() {
    return cardOrderDeliveryEnabled;
  }

  public void setCardOrderDeliveryEnabled(Boolean cardOrderDeliveryEnabled) {
    this.cardOrderDeliveryEnabled = cardOrderDeliveryEnabled;
  }

  public Store cashOrdersDeliveryEnabled(Boolean cashOrdersDeliveryEnabled) {
    this.cashOrdersDeliveryEnabled = cashOrdersDeliveryEnabled;
    return this;
  }

   /**
   * True if the store accepts cash payment for delivery orders
   * @return cashOrdersDeliveryEnabled
  **/
  @ApiModelProperty(value = "True if the store accepts cash payment for delivery orders")
  public Boolean isCashOrdersDeliveryEnabled() {
    return cashOrdersDeliveryEnabled;
  }

  public void setCashOrdersDeliveryEnabled(Boolean cashOrdersDeliveryEnabled) {
    this.cashOrdersDeliveryEnabled = cashOrdersDeliveryEnabled;
  }

  public Store cardOrdersPickupEnabled(Boolean cardOrdersPickupEnabled) {
    this.cardOrdersPickupEnabled = cardOrdersPickupEnabled;
    return this;
  }

   /**
   * True if the store accepts card payment for pickup orders
   * @return cardOrdersPickupEnabled
  **/
  @ApiModelProperty(value = "True if the store accepts card payment for pickup orders")
  public Boolean isCardOrdersPickupEnabled() {
    return cardOrdersPickupEnabled;
  }

  public void setCardOrdersPickupEnabled(Boolean cardOrdersPickupEnabled) {
    this.cardOrdersPickupEnabled = cardOrdersPickupEnabled;
  }

  public Store cashOrdersPickupEnabled(Boolean cashOrdersPickupEnabled) {
    this.cashOrdersPickupEnabled = cashOrdersPickupEnabled;
    return this;
  }

   /**
   * True if the store accepts cash payment for pickup orders
   * @return cashOrdersPickupEnabled
  **/
  @ApiModelProperty(value = "True if the store accepts cash payment for pickup orders")
  public Boolean isCashOrdersPickupEnabled() {
    return cashOrdersPickupEnabled;
  }

  public void setCashOrdersPickupEnabled(Boolean cashOrdersPickupEnabled) {
    this.cashOrdersPickupEnabled = cashOrdersPickupEnabled;
  }

  public Store tipsEnabled(Boolean tipsEnabled) {
    this.tipsEnabled = tipsEnabled;
    return this;
  }

   /**
   * True if the store accepts tips
   * @return tipsEnabled
  **/
  @ApiModelProperty(value = "True if the store accepts tips")
  public Boolean isTipsEnabled() {
    return tipsEnabled;
  }

  public void setTipsEnabled(Boolean tipsEnabled) {
    this.tipsEnabled = tipsEnabled;
  }

  public Store automaticallyAcceptOrders(Boolean automaticallyAcceptOrders) {
    this.automaticallyAcceptOrders = automaticallyAcceptOrders;
    return this;
  }

   /**
   * True if the stores orders are automatically accepted in Flipdish
   * @return automaticallyAcceptOrders
  **/
  @ApiModelProperty(value = "True if the stores orders are automatically accepted in Flipdish")
  public Boolean isAutomaticallyAcceptOrders() {
    return automaticallyAcceptOrders;
  }

  public void setAutomaticallyAcceptOrders(Boolean automaticallyAcceptOrders) {
    this.automaticallyAcceptOrders = automaticallyAcceptOrders;
  }

  public Store openForDelivery(Boolean openForDelivery) {
    this.openForDelivery = openForDelivery;
    return this;
  }

   /**
   * True if the store is open for delivery
   * @return openForDelivery
  **/
  @ApiModelProperty(value = "True if the store is open for delivery")
  public Boolean isOpenForDelivery() {
    return openForDelivery;
  }

  public void setOpenForDelivery(Boolean openForDelivery) {
    this.openForDelivery = openForDelivery;
  }

  public Store openForPickup(Boolean openForPickup) {
    this.openForPickup = openForPickup;
    return this;
  }

   /**
   * True if the store is open for pickup
   * @return openForPickup
  **/
  @ApiModelProperty(value = "True if the store is open for pickup")
  public Boolean isOpenForPickup() {
    return openForPickup;
  }

  public void setOpenForPickup(Boolean openForPickup) {
    this.openForPickup = openForPickup;
  }

  public Store minimumPickupOrderAmount(Double minimumPickupOrderAmount) {
    this.minimumPickupOrderAmount = minimumPickupOrderAmount;
    return this;
  }

   /**
   * Minimum pickup order amount
   * @return minimumPickupOrderAmount
  **/
  @ApiModelProperty(value = "Minimum pickup order amount")
  public Double getMinimumPickupOrderAmount() {
    return minimumPickupOrderAmount;
  }

  public void setMinimumPickupOrderAmount(Double minimumPickupOrderAmount) {
    this.minimumPickupOrderAmount = minimumPickupOrderAmount;
  }

  public Store requireCustomerNameForPickup(Boolean requireCustomerNameForPickup) {
    this.requireCustomerNameForPickup = requireCustomerNameForPickup;
    return this;
  }

   /**
   * True if customer name required for pickup orders
   * @return requireCustomerNameForPickup
  **/
  @ApiModelProperty(value = "True if customer name required for pickup orders")
  public Boolean isRequireCustomerNameForPickup() {
    return requireCustomerNameForPickup;
  }

  public void setRequireCustomerNameForPickup(Boolean requireCustomerNameForPickup) {
    this.requireCustomerNameForPickup = requireCustomerNameForPickup;
  }

  public Store gdprCustomerPhoneNumbers(Boolean gdprCustomerPhoneNumbers) {
    this.gdprCustomerPhoneNumbers = gdprCustomerPhoneNumbers;
    return this;
  }

   /**
   * Mask your customers phone numbers printed on receipts and reduce the amout of personally identifiable customer information that is exposed.
   * @return gdprCustomerPhoneNumbers
  **/
  @ApiModelProperty(value = "Mask your customers phone numbers printed on receipts and reduce the amout of personally identifiable customer information that is exposed.")
  public Boolean isGdprCustomerPhoneNumbers() {
    return gdprCustomerPhoneNumbers;
  }

  public void setGdprCustomerPhoneNumbers(Boolean gdprCustomerPhoneNumbers) {
    this.gdprCustomerPhoneNumbers = gdprCustomerPhoneNumbers;
  }

  public Store requireCustomerNameForDelivery(Boolean requireCustomerNameForDelivery) {
    this.requireCustomerNameForDelivery = requireCustomerNameForDelivery;
    return this;
  }

   /**
   * True if customer name required for delivery orders
   * @return requireCustomerNameForDelivery
  **/
  @ApiModelProperty(value = "True if customer name required for delivery orders")
  public Boolean isRequireCustomerNameForDelivery() {
    return requireCustomerNameForDelivery;
  }

  public void setRequireCustomerNameForDelivery(Boolean requireCustomerNameForDelivery) {
    this.requireCustomerNameForDelivery = requireCustomerNameForDelivery;
  }

  public Store etaInPickupConfirmationSmsEnabled(Boolean etaInPickupConfirmationSmsEnabled) {
    this.etaInPickupConfirmationSmsEnabled = etaInPickupConfirmationSmsEnabled;
    return this;
  }

   /**
   * True if order confirmation sms includes estimated time when order will be ready for collection
   * @return etaInPickupConfirmationSmsEnabled
  **/
  @ApiModelProperty(value = "True if order confirmation sms includes estimated time when order will be ready for collection")
  public Boolean isEtaInPickupConfirmationSmsEnabled() {
    return etaInPickupConfirmationSmsEnabled;
  }

  public void setEtaInPickupConfirmationSmsEnabled(Boolean etaInPickupConfirmationSmsEnabled) {
    this.etaInPickupConfirmationSmsEnabled = etaInPickupConfirmationSmsEnabled;
  }

  public Store etaInDeliveryConfirmationSmsEnabled(Boolean etaInDeliveryConfirmationSmsEnabled) {
    this.etaInDeliveryConfirmationSmsEnabled = etaInDeliveryConfirmationSmsEnabled;
    return this;
  }

   /**
   * True if order confirmation sms includes estimated time when order will delivered
   * @return etaInDeliveryConfirmationSmsEnabled
  **/
  @ApiModelProperty(value = "True if order confirmation sms includes estimated time when order will delivered")
  public Boolean isEtaInDeliveryConfirmationSmsEnabled() {
    return etaInDeliveryConfirmationSmsEnabled;
  }

  public void setEtaInDeliveryConfirmationSmsEnabled(Boolean etaInDeliveryConfirmationSmsEnabled) {
    this.etaInDeliveryConfirmationSmsEnabled = etaInDeliveryConfirmationSmsEnabled;
  }

  public Store name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Store emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Email address (visible to customers)
   * @return emailAddress
  **/
  @ApiModelProperty(value = "Email address (visible to customers)")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Store staffLanguage(String staffLanguage) {
    this.staffLanguage = staffLanguage;
    return this;
  }

   /**
   * Staff Language (used for communcation with the staff)  Emails, Printouts etc
   * @return staffLanguage
  **/
  @ApiModelProperty(value = "Staff Language (used for communcation with the staff)  Emails, Printouts etc")
  public String getStaffLanguage() {
    return staffLanguage;
  }

  public void setStaffLanguage(String staffLanguage) {
    this.staffLanguage = staffLanguage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Store store = (Store) o;
    return Objects.equals(this.storeId, store.storeId) &&
        Objects.equals(this.storeGroupId, store.storeGroupId) &&
        Objects.equals(this.address, store.address) &&
        Objects.equals(this.deliveryZones, store.deliveryZones) &&
        Objects.equals(this.apmPhoneNumber, store.apmPhoneNumber) &&
        Objects.equals(this.pickupHours, store.pickupHours) &&
        Objects.equals(this.deliveryHours, store.deliveryHours) &&
        Objects.equals(this.menuId, store.menuId) &&
        Objects.equals(this.orderConfirmationMessageOverrideDelivery, store.orderConfirmationMessageOverrideDelivery) &&
        Objects.equals(this.orderConfirmationMessageOverridePickup, store.orderConfirmationMessageOverridePickup) &&
        Objects.equals(this.printoutLayoutType, store.printoutLayoutType) &&
        Objects.equals(this.storeNotes, store.storeNotes) &&
        Objects.equals(this.microsoftTimeZone, store.microsoftTimeZone) &&
        Objects.equals(this.ianaTimeZone, store.ianaTimeZone) &&
        Objects.equals(this.phoneNumber, store.phoneNumber) &&
        Objects.equals(this.alwaysAppearOpen, store.alwaysAppearOpen) &&
        Objects.equals(this.preOrderEnabled, store.preOrderEnabled) &&
        Objects.equals(this.takeOutEnabled, store.takeOutEnabled) &&
        Objects.equals(this.tableServiceEnabled, store.tableServiceEnabled) &&
        Objects.equals(this.dineInEnabled, store.dineInEnabled) &&
        Objects.equals(this.allowPreOrdersAndTableService, store.allowPreOrdersAndTableService) &&
        Objects.equals(this.pickupEnabled, store.pickupEnabled) &&
        Objects.equals(this.deliveryEnabled, store.deliveryEnabled) &&
        Objects.equals(this.cardOrderDeliveryEnabled, store.cardOrderDeliveryEnabled) &&
        Objects.equals(this.cashOrdersDeliveryEnabled, store.cashOrdersDeliveryEnabled) &&
        Objects.equals(this.cardOrdersPickupEnabled, store.cardOrdersPickupEnabled) &&
        Objects.equals(this.cashOrdersPickupEnabled, store.cashOrdersPickupEnabled) &&
        Objects.equals(this.tipsEnabled, store.tipsEnabled) &&
        Objects.equals(this.automaticallyAcceptOrders, store.automaticallyAcceptOrders) &&
        Objects.equals(this.openForDelivery, store.openForDelivery) &&
        Objects.equals(this.openForPickup, store.openForPickup) &&
        Objects.equals(this.minimumPickupOrderAmount, store.minimumPickupOrderAmount) &&
        Objects.equals(this.requireCustomerNameForPickup, store.requireCustomerNameForPickup) &&
        Objects.equals(this.gdprCustomerPhoneNumbers, store.gdprCustomerPhoneNumbers) &&
        Objects.equals(this.requireCustomerNameForDelivery, store.requireCustomerNameForDelivery) &&
        Objects.equals(this.etaInPickupConfirmationSmsEnabled, store.etaInPickupConfirmationSmsEnabled) &&
        Objects.equals(this.etaInDeliveryConfirmationSmsEnabled, store.etaInDeliveryConfirmationSmsEnabled) &&
        Objects.equals(this.name, store.name) &&
        Objects.equals(this.emailAddress, store.emailAddress) &&
        Objects.equals(this.staffLanguage, store.staffLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, storeGroupId, address, deliveryZones, apmPhoneNumber, pickupHours, deliveryHours, menuId, orderConfirmationMessageOverrideDelivery, orderConfirmationMessageOverridePickup, printoutLayoutType, storeNotes, microsoftTimeZone, ianaTimeZone, phoneNumber, alwaysAppearOpen, preOrderEnabled, takeOutEnabled, tableServiceEnabled, dineInEnabled, allowPreOrdersAndTableService, pickupEnabled, deliveryEnabled, cardOrderDeliveryEnabled, cashOrdersDeliveryEnabled, cardOrdersPickupEnabled, cashOrdersPickupEnabled, tipsEnabled, automaticallyAcceptOrders, openForDelivery, openForPickup, minimumPickupOrderAmount, requireCustomerNameForPickup, gdprCustomerPhoneNumbers, requireCustomerNameForDelivery, etaInPickupConfirmationSmsEnabled, etaInDeliveryConfirmationSmsEnabled, name, emailAddress, staffLanguage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Store {\n");
    
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    storeGroupId: ").append(toIndentedString(storeGroupId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    deliveryZones: ").append(toIndentedString(deliveryZones)).append("\n");
    sb.append("    apmPhoneNumber: ").append(toIndentedString(apmPhoneNumber)).append("\n");
    sb.append("    pickupHours: ").append(toIndentedString(pickupHours)).append("\n");
    sb.append("    deliveryHours: ").append(toIndentedString(deliveryHours)).append("\n");
    sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
    sb.append("    orderConfirmationMessageOverrideDelivery: ").append(toIndentedString(orderConfirmationMessageOverrideDelivery)).append("\n");
    sb.append("    orderConfirmationMessageOverridePickup: ").append(toIndentedString(orderConfirmationMessageOverridePickup)).append("\n");
    sb.append("    printoutLayoutType: ").append(toIndentedString(printoutLayoutType)).append("\n");
    sb.append("    storeNotes: ").append(toIndentedString(storeNotes)).append("\n");
    sb.append("    microsoftTimeZone: ").append(toIndentedString(microsoftTimeZone)).append("\n");
    sb.append("    ianaTimeZone: ").append(toIndentedString(ianaTimeZone)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    alwaysAppearOpen: ").append(toIndentedString(alwaysAppearOpen)).append("\n");
    sb.append("    preOrderEnabled: ").append(toIndentedString(preOrderEnabled)).append("\n");
    sb.append("    takeOutEnabled: ").append(toIndentedString(takeOutEnabled)).append("\n");
    sb.append("    tableServiceEnabled: ").append(toIndentedString(tableServiceEnabled)).append("\n");
    sb.append("    dineInEnabled: ").append(toIndentedString(dineInEnabled)).append("\n");
    sb.append("    allowPreOrdersAndTableService: ").append(toIndentedString(allowPreOrdersAndTableService)).append("\n");
    sb.append("    pickupEnabled: ").append(toIndentedString(pickupEnabled)).append("\n");
    sb.append("    deliveryEnabled: ").append(toIndentedString(deliveryEnabled)).append("\n");
    sb.append("    cardOrderDeliveryEnabled: ").append(toIndentedString(cardOrderDeliveryEnabled)).append("\n");
    sb.append("    cashOrdersDeliveryEnabled: ").append(toIndentedString(cashOrdersDeliveryEnabled)).append("\n");
    sb.append("    cardOrdersPickupEnabled: ").append(toIndentedString(cardOrdersPickupEnabled)).append("\n");
    sb.append("    cashOrdersPickupEnabled: ").append(toIndentedString(cashOrdersPickupEnabled)).append("\n");
    sb.append("    tipsEnabled: ").append(toIndentedString(tipsEnabled)).append("\n");
    sb.append("    automaticallyAcceptOrders: ").append(toIndentedString(automaticallyAcceptOrders)).append("\n");
    sb.append("    openForDelivery: ").append(toIndentedString(openForDelivery)).append("\n");
    sb.append("    openForPickup: ").append(toIndentedString(openForPickup)).append("\n");
    sb.append("    minimumPickupOrderAmount: ").append(toIndentedString(minimumPickupOrderAmount)).append("\n");
    sb.append("    requireCustomerNameForPickup: ").append(toIndentedString(requireCustomerNameForPickup)).append("\n");
    sb.append("    gdprCustomerPhoneNumbers: ").append(toIndentedString(gdprCustomerPhoneNumbers)).append("\n");
    sb.append("    requireCustomerNameForDelivery: ").append(toIndentedString(requireCustomerNameForDelivery)).append("\n");
    sb.append("    etaInPickupConfirmationSmsEnabled: ").append(toIndentedString(etaInPickupConfirmationSmsEnabled)).append("\n");
    sb.append("    etaInDeliveryConfirmationSmsEnabled: ").append(toIndentedString(etaInDeliveryConfirmationSmsEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    staffLanguage: ").append(toIndentedString(staffLanguage)).append("\n");
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

