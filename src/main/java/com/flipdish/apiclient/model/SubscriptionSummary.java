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
import org.threeten.bp.OffsetDateTime;

/**
 * Subscription Summary
 */
@ApiModel(description = "Subscription Summary")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-03-16T11:32:15.881Z")
public class SubscriptionSummary {
  @SerializedName("SubscriptionId")
  private String subscriptionId = null;

  @SerializedName("Name")
  private String name = null;

  /**
   * Status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    INCOMPLETE("incomplete"),
    
    INCOMPLETE_EXPIRED("incomplete_expired"),
    
    TRIALING("trialing"),
    
    ACTIVE("active"),
    
    PAST_DUE("past_due"),
    
    CANCELED("canceled"),
    
    UNPAID("unpaid");

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

  /**
   * Currency
   */
  @JsonAdapter(CurrencyEnum.Adapter.class)
  public enum CurrencyEnum {
    EUR("EUR"),
    
    USD("USD"),
    
    GBP("GBP"),
    
    CAD("CAD"),
    
    AUD("AUD"),
    
    DJF("DJF"),
    
    ZAR("ZAR"),
    
    ETB("ETB"),
    
    AED("AED"),
    
    BHD("BHD"),
    
    DZD("DZD"),
    
    EGP("EGP"),
    
    IQD("IQD"),
    
    JOD("JOD"),
    
    KWD("KWD"),
    
    LBP("LBP"),
    
    LYD("LYD"),
    
    MAD("MAD"),
    
    OMR("OMR"),
    
    QAR("QAR"),
    
    SAR("SAR"),
    
    SYP("SYP"),
    
    TND("TND"),
    
    YER("YER"),
    
    CLP("CLP"),
    
    INR("INR"),
    
    AZN("AZN"),
    
    RUB("RUB"),
    
    BYN("BYN"),
    
    BGN("BGN"),
    
    NGN("NGN"),
    
    BDT("BDT"),
    
    CNY("CNY"),
    
    BAM("BAM"),
    
    CZK("CZK"),
    
    DKK("DKK"),
    
    CHF("CHF"),
    
    MVR("MVR"),
    
    BTN("BTN"),
    
    XCD("XCD"),
    
    BZD("BZD"),
    
    HKD("HKD"),
    
    IDR("IDR"),
    
    JMD("JMD"),
    
    MYR("MYR"),
    
    NZD("NZD"),
    
    PHP("PHP"),
    
    SGD("SGD"),
    
    TTD("TTD"),
    
    XDR("XDR"),
    
    ARS("ARS"),
    
    BOB("BOB"),
    
    COP("COP"),
    
    CRC("CRC"),
    
    CUP("CUP"),
    
    DOP("DOP"),
    
    GTQ("GTQ"),
    
    HNL("HNL"),
    
    MXN("MXN"),
    
    NIO("NIO"),
    
    PAB("PAB"),
    
    PEN("PEN"),
    
    PYG("PYG"),
    
    UYU("UYU"),
    
    VEF("VEF"),
    
    IRR("IRR"),
    
    XOF("XOF"),
    
    CDF("CDF"),
    
    XAF("XAF"),
    
    HTG("HTG"),
    
    ILS("ILS"),
    
    HRK("HRK"),
    
    HUF("HUF"),
    
    AMD("AMD"),
    
    ISK("ISK"),
    
    JPY("JPY"),
    
    GEL("GEL"),
    
    KZT("KZT"),
    
    KHR("KHR"),
    
    KRW("KRW"),
    
    KGS("KGS"),
    
    LAK("LAK"),
    
    MKD("MKD"),
    
    MNT("MNT"),
    
    BND("BND"),
    
    MMK("MMK"),
    
    NOK("NOK"),
    
    NPR("NPR"),
    
    PKR("PKR"),
    
    PLN("PLN"),
    
    AFN("AFN"),
    
    BRL("BRL"),
    
    MDL("MDL"),
    
    RON("RON"),
    
    RWF("RWF"),
    
    SEK("SEK"),
    
    LKR("LKR"),
    
    SOS("SOS"),
    
    ALL("ALL"),
    
    RSD("RSD"),
    
    KES("KES"),
    
    TJS("TJS"),
    
    THB("THB"),
    
    ERN("ERN"),
    
    TMT("TMT"),
    
    BWP("BWP"),
    
    TRY("TRY"),
    
    UAH("UAH"),
    
    UZS("UZS"),
    
    VND("VND"),
    
    MOP("MOP"),
    
    TWD("TWD"),
    
    BMD("BMD");

    private String value;

    CurrencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CurrencyEnum fromValue(String text) {
      for (CurrencyEnum b : CurrencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CurrencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CurrencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CurrencyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CurrencyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Currency")
  private CurrencyEnum currency = null;

  @SerializedName("NextInvoiceAmount")
  private Double nextInvoiceAmount = null;

  @SerializedName("NextInvoiceBillingDate")
  private OffsetDateTime nextInvoiceBillingDate = null;

  @SerializedName("User")
  private String user = null;

  @SerializedName("DefaultPaymentDescription")
  private String defaultPaymentDescription = null;

  public SubscriptionSummary subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * The subscription identifier
   * @return subscriptionId
  **/
  @ApiModelProperty(required = true, value = "The subscription identifier")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public SubscriptionSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SubscriptionSummary status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public SubscriptionSummary currency(CurrencyEnum currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "Currency")
  public CurrencyEnum getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }

  public SubscriptionSummary nextInvoiceAmount(Double nextInvoiceAmount) {
    this.nextInvoiceAmount = nextInvoiceAmount;
    return this;
  }

   /**
   * Next invoice amount
   * @return nextInvoiceAmount
  **/
  @ApiModelProperty(value = "Next invoice amount")
  public Double getNextInvoiceAmount() {
    return nextInvoiceAmount;
  }

  public void setNextInvoiceAmount(Double nextInvoiceAmount) {
    this.nextInvoiceAmount = nextInvoiceAmount;
  }

  public SubscriptionSummary nextInvoiceBillingDate(OffsetDateTime nextInvoiceBillingDate) {
    this.nextInvoiceBillingDate = nextInvoiceBillingDate;
    return this;
  }

   /**
   * Next invoice billing date
   * @return nextInvoiceBillingDate
  **/
  @ApiModelProperty(value = "Next invoice billing date")
  public OffsetDateTime getNextInvoiceBillingDate() {
    return nextInvoiceBillingDate;
  }

  public void setNextInvoiceBillingDate(OffsetDateTime nextInvoiceBillingDate) {
    this.nextInvoiceBillingDate = nextInvoiceBillingDate;
  }

  public SubscriptionSummary user(String user) {
    this.user = user;
    return this;
  }

   /**
   * User
   * @return user
  **/
  @ApiModelProperty(required = true, value = "User")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public SubscriptionSummary defaultPaymentDescription(String defaultPaymentDescription) {
    this.defaultPaymentDescription = defaultPaymentDescription;
    return this;
  }

   /**
   * Default payment description
   * @return defaultPaymentDescription
  **/
  @ApiModelProperty(required = true, value = "Default payment description")
  public String getDefaultPaymentDescription() {
    return defaultPaymentDescription;
  }

  public void setDefaultPaymentDescription(String defaultPaymentDescription) {
    this.defaultPaymentDescription = defaultPaymentDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionSummary subscriptionSummary = (SubscriptionSummary) o;
    return Objects.equals(this.subscriptionId, subscriptionSummary.subscriptionId) &&
        Objects.equals(this.name, subscriptionSummary.name) &&
        Objects.equals(this.status, subscriptionSummary.status) &&
        Objects.equals(this.currency, subscriptionSummary.currency) &&
        Objects.equals(this.nextInvoiceAmount, subscriptionSummary.nextInvoiceAmount) &&
        Objects.equals(this.nextInvoiceBillingDate, subscriptionSummary.nextInvoiceBillingDate) &&
        Objects.equals(this.user, subscriptionSummary.user) &&
        Objects.equals(this.defaultPaymentDescription, subscriptionSummary.defaultPaymentDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, name, status, currency, nextInvoiceAmount, nextInvoiceBillingDate, user, defaultPaymentDescription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionSummary {\n");
    
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    nextInvoiceAmount: ").append(toIndentedString(nextInvoiceAmount)).append("\n");
    sb.append("    nextInvoiceBillingDate: ").append(toIndentedString(nextInvoiceBillingDate)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    defaultPaymentDescription: ").append(toIndentedString(defaultPaymentDescription)).append("\n");
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

