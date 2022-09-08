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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Store Base
 */
@ApiModel(description = "Store Base")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-08T09:15:58.305+01:00")
public class StoreBase {
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

  @SerializedName("AllowChefNotes")
  private Boolean allowChefNotes = null;

  @SerializedName("EtaInPickupConfirmationSmsEnabled")
  private Boolean etaInPickupConfirmationSmsEnabled = null;

  @SerializedName("EtaInDeliveryConfirmationSmsEnabled")
  private Boolean etaInDeliveryConfirmationSmsEnabled = null;

  @SerializedName("IsArchived")
  private Boolean isArchived = null;

  @SerializedName("IsPublished")
  private Boolean isPublished = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("EmailAddress")
  private String emailAddress = null;

  @SerializedName("StaffLanguage")
  private String staffLanguage = null;

  public StoreBase phoneNumber(String phoneNumber) {
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

  public StoreBase alwaysAppearOpen(Boolean alwaysAppearOpen) {
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

  public StoreBase preOrderEnabled(Boolean preOrderEnabled) {
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

  public StoreBase takeOutEnabled(Boolean takeOutEnabled) {
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

  public StoreBase tableServiceEnabled(Boolean tableServiceEnabled) {
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

  public StoreBase dineInEnabled(Boolean dineInEnabled) {
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

  public StoreBase allowPreOrdersAndTableService(Boolean allowPreOrdersAndTableService) {
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

  public StoreBase pickupEnabled(Boolean pickupEnabled) {
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

  public StoreBase deliveryEnabled(Boolean deliveryEnabled) {
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

  public StoreBase cardOrderDeliveryEnabled(Boolean cardOrderDeliveryEnabled) {
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

  public StoreBase cashOrdersDeliveryEnabled(Boolean cashOrdersDeliveryEnabled) {
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

  public StoreBase cardOrdersPickupEnabled(Boolean cardOrdersPickupEnabled) {
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

  public StoreBase cashOrdersPickupEnabled(Boolean cashOrdersPickupEnabled) {
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

  public StoreBase tipsEnabled(Boolean tipsEnabled) {
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

  public StoreBase automaticallyAcceptOrders(Boolean automaticallyAcceptOrders) {
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

  public StoreBase openForDelivery(Boolean openForDelivery) {
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

  public StoreBase openForPickup(Boolean openForPickup) {
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

  public StoreBase minimumPickupOrderAmount(Double minimumPickupOrderAmount) {
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

  public StoreBase requireCustomerNameForPickup(Boolean requireCustomerNameForPickup) {
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

  public StoreBase gdprCustomerPhoneNumbers(Boolean gdprCustomerPhoneNumbers) {
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

  public StoreBase requireCustomerNameForDelivery(Boolean requireCustomerNameForDelivery) {
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

  public StoreBase allowChefNotes(Boolean allowChefNotes) {
    this.allowChefNotes = allowChefNotes;
    return this;
  }

   /**
   * True if the customer is allowed enter custom notes with their orders
   * @return allowChefNotes
  **/
  @ApiModelProperty(value = "True if the customer is allowed enter custom notes with their orders")
  public Boolean isAllowChefNotes() {
    return allowChefNotes;
  }

  public void setAllowChefNotes(Boolean allowChefNotes) {
    this.allowChefNotes = allowChefNotes;
  }

  public StoreBase etaInPickupConfirmationSmsEnabled(Boolean etaInPickupConfirmationSmsEnabled) {
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

  public StoreBase etaInDeliveryConfirmationSmsEnabled(Boolean etaInDeliveryConfirmationSmsEnabled) {
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

  public StoreBase isArchived(Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

   /**
   * Is the Store Archived
   * @return isArchived
  **/
  @ApiModelProperty(value = "Is the Store Archived")
  public Boolean isIsArchived() {
    return isArchived;
  }

  public void setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
  }

  public StoreBase isPublished(Boolean isPublished) {
    this.isPublished = isPublished;
    return this;
  }

   /**
   * Is the Store Published
   * @return isPublished
  **/
  @ApiModelProperty(value = "Is the Store Published")
  public Boolean isIsPublished() {
    return isPublished;
  }

  public void setIsPublished(Boolean isPublished) {
    this.isPublished = isPublished;
  }

  public StoreBase name(String name) {
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

  public StoreBase emailAddress(String emailAddress) {
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

  public StoreBase staffLanguage(String staffLanguage) {
    this.staffLanguage = staffLanguage;
    return this;
  }

   /**
   * Staff Language (used for communication with the staff)  Emails, Printouts etc
   * @return staffLanguage
  **/
  @ApiModelProperty(value = "Staff Language (used for communication with the staff)  Emails, Printouts etc")
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
    StoreBase storeBase = (StoreBase) o;
    return Objects.equals(this.phoneNumber, storeBase.phoneNumber) &&
        Objects.equals(this.alwaysAppearOpen, storeBase.alwaysAppearOpen) &&
        Objects.equals(this.preOrderEnabled, storeBase.preOrderEnabled) &&
        Objects.equals(this.takeOutEnabled, storeBase.takeOutEnabled) &&
        Objects.equals(this.tableServiceEnabled, storeBase.tableServiceEnabled) &&
        Objects.equals(this.dineInEnabled, storeBase.dineInEnabled) &&
        Objects.equals(this.allowPreOrdersAndTableService, storeBase.allowPreOrdersAndTableService) &&
        Objects.equals(this.pickupEnabled, storeBase.pickupEnabled) &&
        Objects.equals(this.deliveryEnabled, storeBase.deliveryEnabled) &&
        Objects.equals(this.cardOrderDeliveryEnabled, storeBase.cardOrderDeliveryEnabled) &&
        Objects.equals(this.cashOrdersDeliveryEnabled, storeBase.cashOrdersDeliveryEnabled) &&
        Objects.equals(this.cardOrdersPickupEnabled, storeBase.cardOrdersPickupEnabled) &&
        Objects.equals(this.cashOrdersPickupEnabled, storeBase.cashOrdersPickupEnabled) &&
        Objects.equals(this.tipsEnabled, storeBase.tipsEnabled) &&
        Objects.equals(this.automaticallyAcceptOrders, storeBase.automaticallyAcceptOrders) &&
        Objects.equals(this.openForDelivery, storeBase.openForDelivery) &&
        Objects.equals(this.openForPickup, storeBase.openForPickup) &&
        Objects.equals(this.minimumPickupOrderAmount, storeBase.minimumPickupOrderAmount) &&
        Objects.equals(this.requireCustomerNameForPickup, storeBase.requireCustomerNameForPickup) &&
        Objects.equals(this.gdprCustomerPhoneNumbers, storeBase.gdprCustomerPhoneNumbers) &&
        Objects.equals(this.requireCustomerNameForDelivery, storeBase.requireCustomerNameForDelivery) &&
        Objects.equals(this.allowChefNotes, storeBase.allowChefNotes) &&
        Objects.equals(this.etaInPickupConfirmationSmsEnabled, storeBase.etaInPickupConfirmationSmsEnabled) &&
        Objects.equals(this.etaInDeliveryConfirmationSmsEnabled, storeBase.etaInDeliveryConfirmationSmsEnabled) &&
        Objects.equals(this.isArchived, storeBase.isArchived) &&
        Objects.equals(this.isPublished, storeBase.isPublished) &&
        Objects.equals(this.name, storeBase.name) &&
        Objects.equals(this.emailAddress, storeBase.emailAddress) &&
        Objects.equals(this.staffLanguage, storeBase.staffLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, alwaysAppearOpen, preOrderEnabled, takeOutEnabled, tableServiceEnabled, dineInEnabled, allowPreOrdersAndTableService, pickupEnabled, deliveryEnabled, cardOrderDeliveryEnabled, cashOrdersDeliveryEnabled, cardOrdersPickupEnabled, cashOrdersPickupEnabled, tipsEnabled, automaticallyAcceptOrders, openForDelivery, openForPickup, minimumPickupOrderAmount, requireCustomerNameForPickup, gdprCustomerPhoneNumbers, requireCustomerNameForDelivery, allowChefNotes, etaInPickupConfirmationSmsEnabled, etaInDeliveryConfirmationSmsEnabled, isArchived, isPublished, name, emailAddress, staffLanguage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreBase {\n");
    
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
    sb.append("    allowChefNotes: ").append(toIndentedString(allowChefNotes)).append("\n");
    sb.append("    etaInPickupConfirmationSmsEnabled: ").append(toIndentedString(etaInPickupConfirmationSmsEnabled)).append("\n");
    sb.append("    etaInDeliveryConfirmationSmsEnabled: ").append(toIndentedString(etaInDeliveryConfirmationSmsEnabled)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
    sb.append("    isPublished: ").append(toIndentedString(isPublished)).append("\n");
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

