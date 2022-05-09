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
 * Represents information about a Stripe connected account associated with a bank account
 */
@ApiModel(description = "Represents information about a Stripe connected account associated with a bank account")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-09T10:14:50.065+01:00")
public class StripeConnectedAccountInfo {
  /**
   * Stripe connected account status
   */
  @JsonAdapter(AccountStatusEnum.Adapter.class)
  public enum AccountStatusEnum {
    DISABLED("Disabled"),
    
    ENABLED("Enabled"),
    
    ADDITIONALINFORMATIONREQUIRED("AdditionalInformationRequired"),
    
    PENDINGVERIFICATION("PendingVerification"),
    
    UNVERIFIED("Unverified"),
    
    REJECTED("Rejected"),
    
    UPDATEEXTERNALACCOUNT("UpdateExternalAccount");

    private String value;

    AccountStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountStatusEnum fromValue(String text) {
      for (AccountStatusEnum b : AccountStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AccountStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccountStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("AccountStatus")
  private AccountStatusEnum accountStatus = null;

  @SerializedName("StripeId")
  private String stripeId = null;

  /**
   * Current status of the Card Payment capability of the account
   */
  @JsonAdapter(CardPaymentStatusEnum.Adapter.class)
  public enum CardPaymentStatusEnum {
    INACTIVE("Inactive"),
    
    PENDING("Pending"),
    
    ACTIVE("Active"),
    
    UNREQUESTED("Unrequested");

    private String value;

    CardPaymentStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CardPaymentStatusEnum fromValue(String text) {
      for (CardPaymentStatusEnum b : CardPaymentStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CardPaymentStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CardPaymentStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CardPaymentStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CardPaymentStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("CardPaymentStatus")
  private CardPaymentStatusEnum cardPaymentStatus = null;

  public StripeConnectedAccountInfo accountStatus(AccountStatusEnum accountStatus) {
    this.accountStatus = accountStatus;
    return this;
  }

   /**
   * Stripe connected account status
   * @return accountStatus
  **/
  @ApiModelProperty(value = "Stripe connected account status")
  public AccountStatusEnum getAccountStatus() {
    return accountStatus;
  }

  public void setAccountStatus(AccountStatusEnum accountStatus) {
    this.accountStatus = accountStatus;
  }

  public StripeConnectedAccountInfo stripeId(String stripeId) {
    this.stripeId = stripeId;
    return this;
  }

   /**
   * Stripe connected account id
   * @return stripeId
  **/
  @ApiModelProperty(value = "Stripe connected account id")
  public String getStripeId() {
    return stripeId;
  }

  public void setStripeId(String stripeId) {
    this.stripeId = stripeId;
  }

  public StripeConnectedAccountInfo cardPaymentStatus(CardPaymentStatusEnum cardPaymentStatus) {
    this.cardPaymentStatus = cardPaymentStatus;
    return this;
  }

   /**
   * Current status of the Card Payment capability of the account
   * @return cardPaymentStatus
  **/
  @ApiModelProperty(value = "Current status of the Card Payment capability of the account")
  public CardPaymentStatusEnum getCardPaymentStatus() {
    return cardPaymentStatus;
  }

  public void setCardPaymentStatus(CardPaymentStatusEnum cardPaymentStatus) {
    this.cardPaymentStatus = cardPaymentStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StripeConnectedAccountInfo stripeConnectedAccountInfo = (StripeConnectedAccountInfo) o;
    return Objects.equals(this.accountStatus, stripeConnectedAccountInfo.accountStatus) &&
        Objects.equals(this.stripeId, stripeConnectedAccountInfo.stripeId) &&
        Objects.equals(this.cardPaymentStatus, stripeConnectedAccountInfo.cardPaymentStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountStatus, stripeId, cardPaymentStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StripeConnectedAccountInfo {\n");
    
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    stripeId: ").append(toIndentedString(stripeId)).append("\n");
    sb.append("    cardPaymentStatus: ").append(toIndentedString(cardPaymentStatus)).append("\n");
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

