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
 * Represents a Stripe custom connected account
 */
@ApiModel(description = "Represents a Stripe custom connected account")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-08T14:18:50.949Z")
public class StripeConnectedAccount {
  @SerializedName("FlipdishConnectedAccountId")
  private Integer flipdishConnectedAccountId = null;

  @SerializedName("StripeId")
  private String stripeId = null;

  @SerializedName("WhitelabelConfigId")
  private Integer whitelabelConfigId = null;

  /**
   * Card payments capability status (Inactive, Pending, Active, Unrequested)
   */
  @JsonAdapter(CardPaymentsStatusEnum.Adapter.class)
  public enum CardPaymentsStatusEnum {
    INACTIVE("Inactive"),
    
    PENDING("Pending"),
    
    ACTIVE("Active"),
    
    UNREQUESTED("Unrequested");

    private String value;

    CardPaymentsStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CardPaymentsStatusEnum fromValue(String text) {
      for (CardPaymentsStatusEnum b : CardPaymentsStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CardPaymentsStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CardPaymentsStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CardPaymentsStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CardPaymentsStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("CardPaymentsStatus")
  private CardPaymentsStatusEnum cardPaymentsStatus = null;

  /**
   * Transfers capability status (Inactive, Pending, Active, Unrequested)
   */
  @JsonAdapter(TransfersStatusEnum.Adapter.class)
  public enum TransfersStatusEnum {
    INACTIVE("Inactive"),
    
    PENDING("Pending"),
    
    ACTIVE("Active"),
    
    UNREQUESTED("Unrequested");

    private String value;

    TransfersStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransfersStatusEnum fromValue(String text) {
      for (TransfersStatusEnum b : TransfersStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TransfersStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransfersStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransfersStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TransfersStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("TransfersStatus")
  private TransfersStatusEnum transfersStatus = null;

  /**
   * Current status of the account
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

  public StripeConnectedAccount flipdishConnectedAccountId(Integer flipdishConnectedAccountId) {
    this.flipdishConnectedAccountId = flipdishConnectedAccountId;
    return this;
  }

   /**
   * Flipdish connected account identifier
   * @return flipdishConnectedAccountId
  **/
  @ApiModelProperty(value = "Flipdish connected account identifier")
  public Integer getFlipdishConnectedAccountId() {
    return flipdishConnectedAccountId;
  }

  public void setFlipdishConnectedAccountId(Integer flipdishConnectedAccountId) {
    this.flipdishConnectedAccountId = flipdishConnectedAccountId;
  }

  public StripeConnectedAccount stripeId(String stripeId) {
    this.stripeId = stripeId;
    return this;
  }

   /**
   * Stripe&#39;s own connected account identifier
   * @return stripeId
  **/
  @ApiModelProperty(value = "Stripe's own connected account identifier")
  public String getStripeId() {
    return stripeId;
  }

  public void setStripeId(String stripeId) {
    this.stripeId = stripeId;
  }

  public StripeConnectedAccount whitelabelConfigId(Integer whitelabelConfigId) {
    this.whitelabelConfigId = whitelabelConfigId;
    return this;
  }

   /**
   * Id of the WhitelabelConfig the connected account is assigned to
   * @return whitelabelConfigId
  **/
  @ApiModelProperty(value = "Id of the WhitelabelConfig the connected account is assigned to")
  public Integer getWhitelabelConfigId() {
    return whitelabelConfigId;
  }

  public void setWhitelabelConfigId(Integer whitelabelConfigId) {
    this.whitelabelConfigId = whitelabelConfigId;
  }

  public StripeConnectedAccount cardPaymentsStatus(CardPaymentsStatusEnum cardPaymentsStatus) {
    this.cardPaymentsStatus = cardPaymentsStatus;
    return this;
  }

   /**
   * Card payments capability status (Inactive, Pending, Active, Unrequested)
   * @return cardPaymentsStatus
  **/
  @ApiModelProperty(value = "Card payments capability status (Inactive, Pending, Active, Unrequested)")
  public CardPaymentsStatusEnum getCardPaymentsStatus() {
    return cardPaymentsStatus;
  }

  public void setCardPaymentsStatus(CardPaymentsStatusEnum cardPaymentsStatus) {
    this.cardPaymentsStatus = cardPaymentsStatus;
  }

  public StripeConnectedAccount transfersStatus(TransfersStatusEnum transfersStatus) {
    this.transfersStatus = transfersStatus;
    return this;
  }

   /**
   * Transfers capability status (Inactive, Pending, Active, Unrequested)
   * @return transfersStatus
  **/
  @ApiModelProperty(value = "Transfers capability status (Inactive, Pending, Active, Unrequested)")
  public TransfersStatusEnum getTransfersStatus() {
    return transfersStatus;
  }

  public void setTransfersStatus(TransfersStatusEnum transfersStatus) {
    this.transfersStatus = transfersStatus;
  }

  public StripeConnectedAccount accountStatus(AccountStatusEnum accountStatus) {
    this.accountStatus = accountStatus;
    return this;
  }

   /**
   * Current status of the account
   * @return accountStatus
  **/
  @ApiModelProperty(value = "Current status of the account")
  public AccountStatusEnum getAccountStatus() {
    return accountStatus;
  }

  public void setAccountStatus(AccountStatusEnum accountStatus) {
    this.accountStatus = accountStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StripeConnectedAccount stripeConnectedAccount = (StripeConnectedAccount) o;
    return Objects.equals(this.flipdishConnectedAccountId, stripeConnectedAccount.flipdishConnectedAccountId) &&
        Objects.equals(this.stripeId, stripeConnectedAccount.stripeId) &&
        Objects.equals(this.whitelabelConfigId, stripeConnectedAccount.whitelabelConfigId) &&
        Objects.equals(this.cardPaymentsStatus, stripeConnectedAccount.cardPaymentsStatus) &&
        Objects.equals(this.transfersStatus, stripeConnectedAccount.transfersStatus) &&
        Objects.equals(this.accountStatus, stripeConnectedAccount.accountStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flipdishConnectedAccountId, stripeId, whitelabelConfigId, cardPaymentsStatus, transfersStatus, accountStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StripeConnectedAccount {\n");
    
    sb.append("    flipdishConnectedAccountId: ").append(toIndentedString(flipdishConnectedAccountId)).append("\n");
    sb.append("    stripeId: ").append(toIndentedString(stripeId)).append("\n");
    sb.append("    whitelabelConfigId: ").append(toIndentedString(whitelabelConfigId)).append("\n");
    sb.append("    cardPaymentsStatus: ").append(toIndentedString(cardPaymentsStatus)).append("\n");
    sb.append("    transfersStatus: ").append(toIndentedString(transfersStatus)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
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
