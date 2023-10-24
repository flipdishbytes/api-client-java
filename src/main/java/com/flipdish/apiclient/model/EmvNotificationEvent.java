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
import com.flipdish.apiclient.model.Order;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Order Terminal Notification
 */
@ApiModel(description = "Order Terminal Notification")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-10-24T12:01:02.196Z")
public class EmvNotificationEvent {
  @SerializedName("EventName")
  private String eventName = null;

  @SerializedName("Notification")
  private String notification = null;

  @SerializedName("Order")
  private Order order = null;

  @SerializedName("TerminalId")
  private String terminalId = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ExpDate")
  private String expDate = null;

  @SerializedName("CardType")
  private String cardType = null;

  @SerializedName("PaymentMethod")
  private String paymentMethod = null;

  @SerializedName("AccountNumber")
  private String accountNumber = null;

  @SerializedName("AuthCode")
  private String authCode = null;

  @SerializedName("ProviderMessage")
  private String providerMessage = null;

  @SerializedName("FlipdishEventId")
  private UUID flipdishEventId = null;

  @SerializedName("CreateTime")
  private OffsetDateTime createTime = null;

  @SerializedName("Position")
  private Integer position = null;

  @SerializedName("AppId")
  private String appId = null;

  @SerializedName("IpAddress")
  private String ipAddress = null;

  public EmvNotificationEvent eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * The event name
   * @return eventName
  **/
  @ApiModelProperty(value = "The event name")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public EmvNotificationEvent notification(String notification) {
    this.notification = notification;
    return this;
  }

   /**
   * Notification Sent
   * @return notification
  **/
  @ApiModelProperty(value = "Notification Sent")
  public String getNotification() {
    return notification;
  }

  public void setNotification(String notification) {
    this.notification = notification;
  }

  public EmvNotificationEvent order(Order order) {
    this.order = order;
    return this;
  }

   /**
   * Order
   * @return order
  **/
  @ApiModelProperty(value = "Order")
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public EmvNotificationEvent terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

   /**
   * TerminalId
   * @return terminalId
  **/
  @ApiModelProperty(value = "TerminalId")
  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  public EmvNotificationEvent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @ApiModelProperty(value = "Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EmvNotificationEvent expDate(String expDate) {
    this.expDate = expDate;
    return this;
  }

   /**
   * Expirey Date
   * @return expDate
  **/
  @ApiModelProperty(value = "Expirey Date")
  public String getExpDate() {
    return expDate;
  }

  public void setExpDate(String expDate) {
    this.expDate = expDate;
  }

  public EmvNotificationEvent cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * Card Type
   * @return cardType
  **/
  @ApiModelProperty(value = "Card Type")
  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public EmvNotificationEvent paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Payment Method
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "Payment Method")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public EmvNotificationEvent accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Masked Account Number
   * @return accountNumber
  **/
  @ApiModelProperty(value = "Masked Account Number")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public EmvNotificationEvent authCode(String authCode) {
    this.authCode = authCode;
    return this;
  }

   /**
   * Auth Code
   * @return authCode
  **/
  @ApiModelProperty(value = "Auth Code")
  public String getAuthCode() {
    return authCode;
  }

  public void setAuthCode(String authCode) {
    this.authCode = authCode;
  }

  public EmvNotificationEvent providerMessage(String providerMessage) {
    this.providerMessage = providerMessage;
    return this;
  }

   /**
   * Payment Provider Message
   * @return providerMessage
  **/
  @ApiModelProperty(value = "Payment Provider Message")
  public String getProviderMessage() {
    return providerMessage;
  }

  public void setProviderMessage(String providerMessage) {
    this.providerMessage = providerMessage;
  }

  public EmvNotificationEvent flipdishEventId(UUID flipdishEventId) {
    this.flipdishEventId = flipdishEventId;
    return this;
  }

   /**
   * The identitfier of the event
   * @return flipdishEventId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "The identitfier of the event")
  public UUID getFlipdishEventId() {
    return flipdishEventId;
  }

  public void setFlipdishEventId(UUID flipdishEventId) {
    this.flipdishEventId = flipdishEventId;
  }

  public EmvNotificationEvent createTime(OffsetDateTime createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * The time of creation of the event
   * @return createTime
  **/
  @ApiModelProperty(value = "The time of creation of the event")
  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public EmvNotificationEvent position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Position
   * @return position
  **/
  @ApiModelProperty(value = "Position")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public EmvNotificationEvent appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * App id
   * @return appId
  **/
  @ApiModelProperty(value = "App id")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public EmvNotificationEvent ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Ip Address
   * @return ipAddress
  **/
  @ApiModelProperty(value = "Ip Address")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmvNotificationEvent emvNotificationEvent = (EmvNotificationEvent) o;
    return Objects.equals(this.eventName, emvNotificationEvent.eventName) &&
        Objects.equals(this.notification, emvNotificationEvent.notification) &&
        Objects.equals(this.order, emvNotificationEvent.order) &&
        Objects.equals(this.terminalId, emvNotificationEvent.terminalId) &&
        Objects.equals(this.description, emvNotificationEvent.description) &&
        Objects.equals(this.expDate, emvNotificationEvent.expDate) &&
        Objects.equals(this.cardType, emvNotificationEvent.cardType) &&
        Objects.equals(this.paymentMethod, emvNotificationEvent.paymentMethod) &&
        Objects.equals(this.accountNumber, emvNotificationEvent.accountNumber) &&
        Objects.equals(this.authCode, emvNotificationEvent.authCode) &&
        Objects.equals(this.providerMessage, emvNotificationEvent.providerMessage) &&
        Objects.equals(this.flipdishEventId, emvNotificationEvent.flipdishEventId) &&
        Objects.equals(this.createTime, emvNotificationEvent.createTime) &&
        Objects.equals(this.position, emvNotificationEvent.position) &&
        Objects.equals(this.appId, emvNotificationEvent.appId) &&
        Objects.equals(this.ipAddress, emvNotificationEvent.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, notification, order, terminalId, description, expDate, cardType, paymentMethod, accountNumber, authCode, providerMessage, flipdishEventId, createTime, position, appId, ipAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmvNotificationEvent {\n");
    
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expDate: ").append(toIndentedString(expDate)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    authCode: ").append(toIndentedString(authCode)).append("\n");
    sb.append("    providerMessage: ").append(toIndentedString(providerMessage)).append("\n");
    sb.append("    flipdishEventId: ").append(toIndentedString(flipdishEventId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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

