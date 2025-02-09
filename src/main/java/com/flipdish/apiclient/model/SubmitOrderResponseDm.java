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
import com.flipdish.apiclient.model.DuringOrderPromotionOptionsDm;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SubmitOrderResponseDm
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-02-05T15:19:42.240Z")
public class SubmitOrderResponseDm {
  @SerializedName("OrderId")
  private Integer orderId = null;

  @SerializedName("LocalOrderId")
  private String localOrderId = null;

  @SerializedName("DeliveryTimeEstimateMinutes")
  private Integer deliveryTimeEstimateMinutes = null;

  @SerializedName("OrderPlacedMessage")
  private String orderPlacedMessage = null;

  @SerializedName("DisplayTipControl")
  private Boolean displayTipControl = null;

  @SerializedName("DisplayRateAppControl")
  private Boolean displayRateAppControl = null;

  @SerializedName("CancelOrderPeriodSeconds")
  private Integer cancelOrderPeriodSeconds = null;

  @SerializedName("RestaurantName")
  private String restaurantName = null;

  @SerializedName("LinkText")
  private String linkText = null;

  @SerializedName("LinkUrl")
  private String linkUrl = null;

  /**
   * Gets or Sets deliveryType
   */
  @JsonAdapter(DeliveryTypeEnum.Adapter.class)
  public enum DeliveryTypeEnum {
    DELIVERY("Delivery"),
    
    PICKUP("Pickup");

    private String value;

    DeliveryTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeliveryTypeEnum fromValue(String text) {
      for (DeliveryTypeEnum b : DeliveryTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DeliveryTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeliveryTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeliveryTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DeliveryTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("DeliveryType")
  private DeliveryTypeEnum deliveryType = null;

  @SerializedName("DuringOrderPromotionOptions")
  private DuringOrderPromotionOptionsDm duringOrderPromotionOptions = null;

  @SerializedName("RedirectUri")
  private String redirectUri = null;

  @SerializedName("PickupCode")
  private String pickupCode = null;

  @SerializedName("RestaurantAddress")
  private String restaurantAddress = null;

  @SerializedName("PaymentIntentClientSecret")
  private String paymentIntentClientSecret = null;

  public SubmitOrderResponseDm orderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(value = "")
  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public SubmitOrderResponseDm localOrderId(String localOrderId) {
    this.localOrderId = localOrderId;
    return this;
  }

   /**
   * Get localOrderId
   * @return localOrderId
  **/
  @ApiModelProperty(value = "")
  public String getLocalOrderId() {
    return localOrderId;
  }

  public void setLocalOrderId(String localOrderId) {
    this.localOrderId = localOrderId;
  }

  public SubmitOrderResponseDm deliveryTimeEstimateMinutes(Integer deliveryTimeEstimateMinutes) {
    this.deliveryTimeEstimateMinutes = deliveryTimeEstimateMinutes;
    return this;
  }

   /**
   * Get deliveryTimeEstimateMinutes
   * @return deliveryTimeEstimateMinutes
  **/
  @ApiModelProperty(value = "")
  public Integer getDeliveryTimeEstimateMinutes() {
    return deliveryTimeEstimateMinutes;
  }

  public void setDeliveryTimeEstimateMinutes(Integer deliveryTimeEstimateMinutes) {
    this.deliveryTimeEstimateMinutes = deliveryTimeEstimateMinutes;
  }

  public SubmitOrderResponseDm orderPlacedMessage(String orderPlacedMessage) {
    this.orderPlacedMessage = orderPlacedMessage;
    return this;
  }

   /**
   * Get orderPlacedMessage
   * @return orderPlacedMessage
  **/
  @ApiModelProperty(value = "")
  public String getOrderPlacedMessage() {
    return orderPlacedMessage;
  }

  public void setOrderPlacedMessage(String orderPlacedMessage) {
    this.orderPlacedMessage = orderPlacedMessage;
  }

  public SubmitOrderResponseDm displayTipControl(Boolean displayTipControl) {
    this.displayTipControl = displayTipControl;
    return this;
  }

   /**
   * Get displayTipControl
   * @return displayTipControl
  **/
  @ApiModelProperty(value = "")
  public Boolean isDisplayTipControl() {
    return displayTipControl;
  }

  public void setDisplayTipControl(Boolean displayTipControl) {
    this.displayTipControl = displayTipControl;
  }

  public SubmitOrderResponseDm displayRateAppControl(Boolean displayRateAppControl) {
    this.displayRateAppControl = displayRateAppControl;
    return this;
  }

   /**
   * Get displayRateAppControl
   * @return displayRateAppControl
  **/
  @ApiModelProperty(value = "")
  public Boolean isDisplayRateAppControl() {
    return displayRateAppControl;
  }

  public void setDisplayRateAppControl(Boolean displayRateAppControl) {
    this.displayRateAppControl = displayRateAppControl;
  }

  public SubmitOrderResponseDm cancelOrderPeriodSeconds(Integer cancelOrderPeriodSeconds) {
    this.cancelOrderPeriodSeconds = cancelOrderPeriodSeconds;
    return this;
  }

   /**
   * Get cancelOrderPeriodSeconds
   * @return cancelOrderPeriodSeconds
  **/
  @ApiModelProperty(value = "")
  public Integer getCancelOrderPeriodSeconds() {
    return cancelOrderPeriodSeconds;
  }

  public void setCancelOrderPeriodSeconds(Integer cancelOrderPeriodSeconds) {
    this.cancelOrderPeriodSeconds = cancelOrderPeriodSeconds;
  }

  public SubmitOrderResponseDm restaurantName(String restaurantName) {
    this.restaurantName = restaurantName;
    return this;
  }

   /**
   * Get restaurantName
   * @return restaurantName
  **/
  @ApiModelProperty(value = "")
  public String getRestaurantName() {
    return restaurantName;
  }

  public void setRestaurantName(String restaurantName) {
    this.restaurantName = restaurantName;
  }

  public SubmitOrderResponseDm linkText(String linkText) {
    this.linkText = linkText;
    return this;
  }

   /**
   * Get linkText
   * @return linkText
  **/
  @ApiModelProperty(value = "")
  public String getLinkText() {
    return linkText;
  }

  public void setLinkText(String linkText) {
    this.linkText = linkText;
  }

  public SubmitOrderResponseDm linkUrl(String linkUrl) {
    this.linkUrl = linkUrl;
    return this;
  }

   /**
   * Get linkUrl
   * @return linkUrl
  **/
  @ApiModelProperty(value = "")
  public String getLinkUrl() {
    return linkUrl;
  }

  public void setLinkUrl(String linkUrl) {
    this.linkUrl = linkUrl;
  }

  public SubmitOrderResponseDm deliveryType(DeliveryTypeEnum deliveryType) {
    this.deliveryType = deliveryType;
    return this;
  }

   /**
   * Get deliveryType
   * @return deliveryType
  **/
  @ApiModelProperty(value = "")
  public DeliveryTypeEnum getDeliveryType() {
    return deliveryType;
  }

  public void setDeliveryType(DeliveryTypeEnum deliveryType) {
    this.deliveryType = deliveryType;
  }

  public SubmitOrderResponseDm duringOrderPromotionOptions(DuringOrderPromotionOptionsDm duringOrderPromotionOptions) {
    this.duringOrderPromotionOptions = duringOrderPromotionOptions;
    return this;
  }

   /**
   * Get duringOrderPromotionOptions
   * @return duringOrderPromotionOptions
  **/
  @ApiModelProperty(value = "")
  public DuringOrderPromotionOptionsDm getDuringOrderPromotionOptions() {
    return duringOrderPromotionOptions;
  }

  public void setDuringOrderPromotionOptions(DuringOrderPromotionOptionsDm duringOrderPromotionOptions) {
    this.duringOrderPromotionOptions = duringOrderPromotionOptions;
  }

  public SubmitOrderResponseDm redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

   /**
   * Get redirectUri
   * @return redirectUri
  **/
  @ApiModelProperty(value = "")
  public String getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  public SubmitOrderResponseDm pickupCode(String pickupCode) {
    this.pickupCode = pickupCode;
    return this;
  }

   /**
   * Get pickupCode
   * @return pickupCode
  **/
  @ApiModelProperty(value = "")
  public String getPickupCode() {
    return pickupCode;
  }

  public void setPickupCode(String pickupCode) {
    this.pickupCode = pickupCode;
  }

  public SubmitOrderResponseDm restaurantAddress(String restaurantAddress) {
    this.restaurantAddress = restaurantAddress;
    return this;
  }

   /**
   * Get restaurantAddress
   * @return restaurantAddress
  **/
  @ApiModelProperty(value = "")
  public String getRestaurantAddress() {
    return restaurantAddress;
  }

  public void setRestaurantAddress(String restaurantAddress) {
    this.restaurantAddress = restaurantAddress;
  }

  public SubmitOrderResponseDm paymentIntentClientSecret(String paymentIntentClientSecret) {
    this.paymentIntentClientSecret = paymentIntentClientSecret;
    return this;
  }

   /**
   * Get paymentIntentClientSecret
   * @return paymentIntentClientSecret
  **/
  @ApiModelProperty(value = "")
  public String getPaymentIntentClientSecret() {
    return paymentIntentClientSecret;
  }

  public void setPaymentIntentClientSecret(String paymentIntentClientSecret) {
    this.paymentIntentClientSecret = paymentIntentClientSecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitOrderResponseDm submitOrderResponseDm = (SubmitOrderResponseDm) o;
    return Objects.equals(this.orderId, submitOrderResponseDm.orderId) &&
        Objects.equals(this.localOrderId, submitOrderResponseDm.localOrderId) &&
        Objects.equals(this.deliveryTimeEstimateMinutes, submitOrderResponseDm.deliveryTimeEstimateMinutes) &&
        Objects.equals(this.orderPlacedMessage, submitOrderResponseDm.orderPlacedMessage) &&
        Objects.equals(this.displayTipControl, submitOrderResponseDm.displayTipControl) &&
        Objects.equals(this.displayRateAppControl, submitOrderResponseDm.displayRateAppControl) &&
        Objects.equals(this.cancelOrderPeriodSeconds, submitOrderResponseDm.cancelOrderPeriodSeconds) &&
        Objects.equals(this.restaurantName, submitOrderResponseDm.restaurantName) &&
        Objects.equals(this.linkText, submitOrderResponseDm.linkText) &&
        Objects.equals(this.linkUrl, submitOrderResponseDm.linkUrl) &&
        Objects.equals(this.deliveryType, submitOrderResponseDm.deliveryType) &&
        Objects.equals(this.duringOrderPromotionOptions, submitOrderResponseDm.duringOrderPromotionOptions) &&
        Objects.equals(this.redirectUri, submitOrderResponseDm.redirectUri) &&
        Objects.equals(this.pickupCode, submitOrderResponseDm.pickupCode) &&
        Objects.equals(this.restaurantAddress, submitOrderResponseDm.restaurantAddress) &&
        Objects.equals(this.paymentIntentClientSecret, submitOrderResponseDm.paymentIntentClientSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, localOrderId, deliveryTimeEstimateMinutes, orderPlacedMessage, displayTipControl, displayRateAppControl, cancelOrderPeriodSeconds, restaurantName, linkText, linkUrl, deliveryType, duringOrderPromotionOptions, redirectUri, pickupCode, restaurantAddress, paymentIntentClientSecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitOrderResponseDm {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    localOrderId: ").append(toIndentedString(localOrderId)).append("\n");
    sb.append("    deliveryTimeEstimateMinutes: ").append(toIndentedString(deliveryTimeEstimateMinutes)).append("\n");
    sb.append("    orderPlacedMessage: ").append(toIndentedString(orderPlacedMessage)).append("\n");
    sb.append("    displayTipControl: ").append(toIndentedString(displayTipControl)).append("\n");
    sb.append("    displayRateAppControl: ").append(toIndentedString(displayRateAppControl)).append("\n");
    sb.append("    cancelOrderPeriodSeconds: ").append(toIndentedString(cancelOrderPeriodSeconds)).append("\n");
    sb.append("    restaurantName: ").append(toIndentedString(restaurantName)).append("\n");
    sb.append("    linkText: ").append(toIndentedString(linkText)).append("\n");
    sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
    sb.append("    duringOrderPromotionOptions: ").append(toIndentedString(duringOrderPromotionOptions)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    pickupCode: ").append(toIndentedString(pickupCode)).append("\n");
    sb.append("    restaurantAddress: ").append(toIndentedString(restaurantAddress)).append("\n");
    sb.append("    paymentIntentClientSecret: ").append(toIndentedString(paymentIntentClientSecret)).append("\n");
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

