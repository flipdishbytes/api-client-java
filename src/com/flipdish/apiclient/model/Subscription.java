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
import com.flipdish.apiclient.model.Card;
import com.flipdish.apiclient.model.SubscriptionPlan;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * Subscription
 */
@ApiModel(description = "Subscription")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-21T10:37:59.975Z")
public class Subscription implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("SubscriptionId")
  private Integer subscriptionId = null;

  @SerializedName("StartDate")
  private OffsetDateTime startDate = null;

  /**
   * Status of the subscription (TrialPeriod, Ongoing, Unpaid, Canceled)
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    TRIALPERIOD("TrialPeriod"),
    
    ONGOING("Ongoing"),
    
    UNPAID("Unpaid"),
    
    CANCELED("Canceled");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Status")
  private StatusEnum status = null;

  @SerializedName("UserId")
  private Integer userId = null;

  @SerializedName("SubscriptionPlan")
  private SubscriptionPlan subscriptionPlan = null;

  @SerializedName("Card")
  private Card card = null;

  @SerializedName("AppId")
  private String appId = null;

  @SerializedName("VatNumber")
  private String vatNumber = null;

  @SerializedName("VatCountryCode")
  private String vatCountryCode = null;

  @SerializedName("Quantity")
  private Integer quantity = null;

  @SerializedName("SubscriptionPlanId")
  private Integer subscriptionPlanId = null;

  public Subscription subscriptionId(Integer subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * The subscription identifier
   * @return subscriptionId
  **/
  @ApiModelProperty(value = "The subscription identifier")
  public Integer getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(Integer subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public Subscription startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Starting date of the subscription
   * @return startDate
  **/
  @ApiModelProperty(value = "Starting date of the subscription")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public Subscription status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the subscription (TrialPeriod, Ongoing, Unpaid, Canceled)
   * @return status
  **/
  @ApiModelProperty(value = "Status of the subscription (TrialPeriod, Ongoing, Unpaid, Canceled)")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Subscription userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Flipdish user identifier
   * @return userId
  **/
  @ApiModelProperty(value = "Flipdish user identifier")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Subscription subscriptionPlan(SubscriptionPlan subscriptionPlan) {
    this.subscriptionPlan = subscriptionPlan;
    return this;
  }

   /**
   * Subscription Plan
   * @return subscriptionPlan
  **/
  @ApiModelProperty(value = "Subscription Plan")
  public SubscriptionPlan getSubscriptionPlan() {
    return subscriptionPlan;
  }

  public void setSubscriptionPlan(SubscriptionPlan subscriptionPlan) {
    this.subscriptionPlan = subscriptionPlan;
  }

  public Subscription card(Card card) {
    this.card = card;
    return this;
  }

   /**
   * Card
   * @return card
  **/
  @ApiModelProperty(value = "Card")
  public Card getCard() {
    return card;
  }

  public void setCard(Card card) {
    this.card = card;
  }

  public Subscription appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * App name Id of the subscription
   * @return appId
  **/
  @ApiModelProperty(required = true, value = "App name Id of the subscription")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public Subscription vatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
    return this;
  }

   /**
   * Last 4 digits of the card
   * @return vatNumber
  **/
  @ApiModelProperty(value = "Last 4 digits of the card")
  public String getVatNumber() {
    return vatNumber;
  }

  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }

  public Subscription vatCountryCode(String vatCountryCode) {
    this.vatCountryCode = vatCountryCode;
    return this;
  }

   /**
   * Expiry date of the card
   * @return vatCountryCode
  **/
  @ApiModelProperty(required = true, value = "Expiry date of the card")
  public String getVatCountryCode() {
    return vatCountryCode;
  }

  public void setVatCountryCode(String vatCountryCode) {
    this.vatCountryCode = vatCountryCode;
  }

  public Subscription quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Number of physical restaurants
   * @return quantity
  **/
  @ApiModelProperty(value = "Number of physical restaurants")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Subscription subscriptionPlanId(Integer subscriptionPlanId) {
    this.subscriptionPlanId = subscriptionPlanId;
    return this;
  }

   /**
   * Subscription plan identifier
   * @return subscriptionPlanId
  **/
  @ApiModelProperty(value = "Subscription plan identifier")
  public Integer getSubscriptionPlanId() {
    return subscriptionPlanId;
  }

  public void setSubscriptionPlanId(Integer subscriptionPlanId) {
    this.subscriptionPlanId = subscriptionPlanId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.subscriptionId, subscription.subscriptionId) &&
        Objects.equals(this.startDate, subscription.startDate) &&
        Objects.equals(this.status, subscription.status) &&
        Objects.equals(this.userId, subscription.userId) &&
        Objects.equals(this.subscriptionPlan, subscription.subscriptionPlan) &&
        Objects.equals(this.card, subscription.card) &&
        Objects.equals(this.appId, subscription.appId) &&
        Objects.equals(this.vatNumber, subscription.vatNumber) &&
        Objects.equals(this.vatCountryCode, subscription.vatCountryCode) &&
        Objects.equals(this.quantity, subscription.quantity) &&
        Objects.equals(this.subscriptionPlanId, subscription.subscriptionPlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, startDate, status, userId, subscriptionPlan, card, appId, vatNumber, vatCountryCode, quantity, subscriptionPlanId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    subscriptionPlan: ").append(toIndentedString(subscriptionPlan)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
    sb.append("    vatCountryCode: ").append(toIndentedString(vatCountryCode)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    subscriptionPlanId: ").append(toIndentedString(subscriptionPlanId)).append("\n");
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

