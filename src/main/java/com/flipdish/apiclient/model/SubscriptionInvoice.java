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
 * Invoice
 */
@ApiModel(description = "Invoice")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-11-13T12:22:11.768Z")
public class SubscriptionInvoice {
  @SerializedName("InvoiceId")
  private String invoiceId = null;

  @SerializedName("Number")
  private String number = null;

  @SerializedName("Total")
  private Double total = null;

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

  /**
   * Status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    DRAFT("Draft"),
    
    OPEN("Open"),
    
    PAID("Paid"),
    
    UNCOLLECTIBLE("UnCollectible"),
    
    VOID("Void");

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

  @SerializedName("SubscriptionId")
  private String subscriptionId = null;

  @SerializedName("PaidAt")
  private OffsetDateTime paidAt = null;

  @SerializedName("FinalisedAt")
  private OffsetDateTime finalisedAt = null;

  @SerializedName("PdfLink")
  private String pdfLink = null;

  @SerializedName("HostedUrl")
  private String hostedUrl = null;

  @SerializedName("Overdue")
  private Boolean overdue = null;

  public SubscriptionInvoice invoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * The invoice identifier
   * @return invoiceId
  **/
  @ApiModelProperty(required = true, value = "The invoice identifier")
  public String getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }

  public SubscriptionInvoice number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Invoice number
   * @return number
  **/
  @ApiModelProperty(required = true, value = "Invoice number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public SubscriptionInvoice total(Double total) {
    this.total = total;
    return this;
  }

   /**
   * Total
   * @return total
  **/
  @ApiModelProperty(value = "Total")
  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  public SubscriptionInvoice currency(CurrencyEnum currency) {
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

  public SubscriptionInvoice status(StatusEnum status) {
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

  public SubscriptionInvoice subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * The subscription identifier
   * @return subscriptionId
  **/
  @ApiModelProperty(value = "The subscription identifier")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public SubscriptionInvoice paidAt(OffsetDateTime paidAt) {
    this.paidAt = paidAt;
    return this;
  }

   /**
   * Paid At
   * @return paidAt
  **/
  @ApiModelProperty(value = "Paid At")
  public OffsetDateTime getPaidAt() {
    return paidAt;
  }

  public void setPaidAt(OffsetDateTime paidAt) {
    this.paidAt = paidAt;
  }

  public SubscriptionInvoice finalisedAt(OffsetDateTime finalisedAt) {
    this.finalisedAt = finalisedAt;
    return this;
  }

   /**
   * Finalised At
   * @return finalisedAt
  **/
  @ApiModelProperty(value = "Finalised At")
  public OffsetDateTime getFinalisedAt() {
    return finalisedAt;
  }

  public void setFinalisedAt(OffsetDateTime finalisedAt) {
    this.finalisedAt = finalisedAt;
  }

  public SubscriptionInvoice pdfLink(String pdfLink) {
    this.pdfLink = pdfLink;
    return this;
  }

   /**
   * Pdf Link
   * @return pdfLink
  **/
  @ApiModelProperty(required = true, value = "Pdf Link")
  public String getPdfLink() {
    return pdfLink;
  }

  public void setPdfLink(String pdfLink) {
    this.pdfLink = pdfLink;
  }

  public SubscriptionInvoice hostedUrl(String hostedUrl) {
    this.hostedUrl = hostedUrl;
    return this;
  }

   /**
   * Hosted Url
   * @return hostedUrl
  **/
  @ApiModelProperty(required = true, value = "Hosted Url")
  public String getHostedUrl() {
    return hostedUrl;
  }

  public void setHostedUrl(String hostedUrl) {
    this.hostedUrl = hostedUrl;
  }

  public SubscriptionInvoice overdue(Boolean overdue) {
    this.overdue = overdue;
    return this;
  }

   /**
   * Overdue
   * @return overdue
  **/
  @ApiModelProperty(required = true, value = "Overdue")
  public Boolean isOverdue() {
    return overdue;
  }

  public void setOverdue(Boolean overdue) {
    this.overdue = overdue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionInvoice subscriptionInvoice = (SubscriptionInvoice) o;
    return Objects.equals(this.invoiceId, subscriptionInvoice.invoiceId) &&
        Objects.equals(this.number, subscriptionInvoice.number) &&
        Objects.equals(this.total, subscriptionInvoice.total) &&
        Objects.equals(this.currency, subscriptionInvoice.currency) &&
        Objects.equals(this.status, subscriptionInvoice.status) &&
        Objects.equals(this.subscriptionId, subscriptionInvoice.subscriptionId) &&
        Objects.equals(this.paidAt, subscriptionInvoice.paidAt) &&
        Objects.equals(this.finalisedAt, subscriptionInvoice.finalisedAt) &&
        Objects.equals(this.pdfLink, subscriptionInvoice.pdfLink) &&
        Objects.equals(this.hostedUrl, subscriptionInvoice.hostedUrl) &&
        Objects.equals(this.overdue, subscriptionInvoice.overdue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceId, number, total, currency, status, subscriptionId, paidAt, finalisedAt, pdfLink, hostedUrl, overdue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionInvoice {\n");
    
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    paidAt: ").append(toIndentedString(paidAt)).append("\n");
    sb.append("    finalisedAt: ").append(toIndentedString(finalisedAt)).append("\n");
    sb.append("    pdfLink: ").append(toIndentedString(pdfLink)).append("\n");
    sb.append("    hostedUrl: ").append(toIndentedString(hostedUrl)).append("\n");
    sb.append("    overdue: ").append(toIndentedString(overdue)).append("\n");
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

