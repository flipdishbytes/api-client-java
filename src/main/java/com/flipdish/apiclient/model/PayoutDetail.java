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
import com.flipdish.apiclient.model.PayoutStore;
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
import org.threeten.bp.OffsetDateTime;

/**
 * Holds the information for a whitelabel payout with details broken down by Store
 */
@ApiModel(description = "Holds the information for a whitelabel payout with details broken down by Store")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-11T10:04:11.849Z")
public class PayoutDetail {
  @SerializedName("PayoutId")
  private Integer payoutId = null;

  @SerializedName("BankAccountId")
  private Integer bankAccountId = null;

  @SerializedName("AccountName")
  private String accountName = null;

  /**
   * Status of the payout
   */
  @JsonAdapter(PayoutStatusEnum.Adapter.class)
  public enum PayoutStatusEnum {
    PENDING("Pending"),
    
    INTRANSIT("InTransit"),
    
    PAID("Paid"),
    
    FAILED("Failed"),
    
    CANCELLED("Cancelled");

    private String value;

    PayoutStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PayoutStatusEnum fromValue(String text) {
      for (PayoutStatusEnum b : PayoutStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PayoutStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PayoutStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PayoutStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PayoutStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("PayoutStatus")
  private PayoutStatusEnum payoutStatus = null;

  @SerializedName("CreatedDate")
  private OffsetDateTime createdDate = null;

  @SerializedName("PeriodStartTime")
  private OffsetDateTime periodStartTime = null;

  @SerializedName("PeriodEndTime")
  private OffsetDateTime periodEndTime = null;

  @SerializedName("DestinationBank")
  private String destinationBank = null;

  @SerializedName("DestinationAccount")
  private String destinationAccount = null;

  /**
   * Type of payout source
   */
  @JsonAdapter(PayoutTypeEnum.Adapter.class)
  public enum PayoutTypeEnum {
    INTERNAL("Internal"),
    
    STRIPE("Stripe");

    private String value;

    PayoutTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PayoutTypeEnum fromValue(String text) {
      for (PayoutTypeEnum b : PayoutTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PayoutTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PayoutTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PayoutTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PayoutTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("PayoutType")
  private PayoutTypeEnum payoutType = null;

  /**
   * Payout currency
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

  @SerializedName("PayoutStores")
  private List<PayoutStore> payoutStores = null;

  @SerializedName("Amount")
  private Double amount = null;

  @SerializedName("CutoffDate")
  private OffsetDateTime cutoffDate = null;

  public PayoutDetail payoutId(Integer payoutId) {
    this.payoutId = payoutId;
    return this;
  }

   /**
   * The id of the payout.
   * @return payoutId
  **/
  @ApiModelProperty(value = "The id of the payout.")
  public Integer getPayoutId() {
    return payoutId;
  }

  public void setPayoutId(Integer payoutId) {
    this.payoutId = payoutId;
  }

  public PayoutDetail bankAccountId(Integer bankAccountId) {
    this.bankAccountId = bankAccountId;
    return this;
  }

   /**
   * Bank account identifier
   * @return bankAccountId
  **/
  @ApiModelProperty(value = "Bank account identifier")
  public Integer getBankAccountId() {
    return bankAccountId;
  }

  public void setBankAccountId(Integer bankAccountId) {
    this.bankAccountId = bankAccountId;
  }

  public PayoutDetail accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Account name of the payout destination
   * @return accountName
  **/
  @ApiModelProperty(value = "Account name of the payout destination")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public PayoutDetail payoutStatus(PayoutStatusEnum payoutStatus) {
    this.payoutStatus = payoutStatus;
    return this;
  }

   /**
   * Status of the payout
   * @return payoutStatus
  **/
  @ApiModelProperty(value = "Status of the payout")
  public PayoutStatusEnum getPayoutStatus() {
    return payoutStatus;
  }

  public void setPayoutStatus(PayoutStatusEnum payoutStatus) {
    this.payoutStatus = payoutStatus;
  }

  public PayoutDetail createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Date payout was created
   * @return createdDate
  **/
  @ApiModelProperty(value = "Date payout was created")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public PayoutDetail periodStartTime(OffsetDateTime periodStartTime) {
    this.periodStartTime = periodStartTime;
    return this;
  }

   /**
   * This payout includes operations after at this date (inclusive)
   * @return periodStartTime
  **/
  @ApiModelProperty(value = "This payout includes operations after at this date (inclusive)")
  public OffsetDateTime getPeriodStartTime() {
    return periodStartTime;
  }

  public void setPeriodStartTime(OffsetDateTime periodStartTime) {
    this.periodStartTime = periodStartTime;
  }

  public PayoutDetail periodEndTime(OffsetDateTime periodEndTime) {
    this.periodEndTime = periodEndTime;
    return this;
  }

   /**
   * This payout includes operations before at this date (exclusive)
   * @return periodEndTime
  **/
  @ApiModelProperty(value = "This payout includes operations before at this date (exclusive)")
  public OffsetDateTime getPeriodEndTime() {
    return periodEndTime;
  }

  public void setPeriodEndTime(OffsetDateTime periodEndTime) {
    this.periodEndTime = periodEndTime;
  }

  public PayoutDetail destinationBank(String destinationBank) {
    this.destinationBank = destinationBank;
    return this;
  }

   /**
   * Destination bank name
   * @return destinationBank
  **/
  @ApiModelProperty(value = "Destination bank name")
  public String getDestinationBank() {
    return destinationBank;
  }

  public void setDestinationBank(String destinationBank) {
    this.destinationBank = destinationBank;
  }

  public PayoutDetail destinationAccount(String destinationAccount) {
    this.destinationAccount = destinationAccount;
    return this;
  }

   /**
   * Last 4 digits of the destination bank IBAN
   * @return destinationAccount
  **/
  @ApiModelProperty(value = "Last 4 digits of the destination bank IBAN")
  public String getDestinationAccount() {
    return destinationAccount;
  }

  public void setDestinationAccount(String destinationAccount) {
    this.destinationAccount = destinationAccount;
  }

  public PayoutDetail payoutType(PayoutTypeEnum payoutType) {
    this.payoutType = payoutType;
    return this;
  }

   /**
   * Type of payout source
   * @return payoutType
  **/
  @ApiModelProperty(value = "Type of payout source")
  public PayoutTypeEnum getPayoutType() {
    return payoutType;
  }

  public void setPayoutType(PayoutTypeEnum payoutType) {
    this.payoutType = payoutType;
  }

  public PayoutDetail currency(CurrencyEnum currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Payout currency
   * @return currency
  **/
  @ApiModelProperty(value = "Payout currency")
  public CurrencyEnum getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }

  public PayoutDetail payoutStores(List<PayoutStore> payoutStores) {
    this.payoutStores = payoutStores;
    return this;
  }

  public PayoutDetail addPayoutStoresItem(PayoutStore payoutStoresItem) {
    if (this.payoutStores == null) {
      this.payoutStores = new ArrayList<PayoutStore>();
    }
    this.payoutStores.add(payoutStoresItem);
    return this;
  }

   /**
   * Payout information broken down by Store
   * @return payoutStores
  **/
  @ApiModelProperty(value = "Payout information broken down by Store")
  public List<PayoutStore> getPayoutStores() {
    return payoutStores;
  }

  public void setPayoutStores(List<PayoutStore> payoutStores) {
    this.payoutStores = payoutStores;
  }

  public PayoutDetail amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Payout amount
   * @return amount
  **/
  @ApiModelProperty(value = "Payout amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public PayoutDetail cutoffDate(OffsetDateTime cutoffDate) {
    this.cutoffDate = cutoffDate;
    return this;
  }

   /**
   * Payouts before this date do not have a details breakdown
   * @return cutoffDate
  **/
  @ApiModelProperty(value = "Payouts before this date do not have a details breakdown")
  public OffsetDateTime getCutoffDate() {
    return cutoffDate;
  }

  public void setCutoffDate(OffsetDateTime cutoffDate) {
    this.cutoffDate = cutoffDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutDetail payoutDetail = (PayoutDetail) o;
    return Objects.equals(this.payoutId, payoutDetail.payoutId) &&
        Objects.equals(this.bankAccountId, payoutDetail.bankAccountId) &&
        Objects.equals(this.accountName, payoutDetail.accountName) &&
        Objects.equals(this.payoutStatus, payoutDetail.payoutStatus) &&
        Objects.equals(this.createdDate, payoutDetail.createdDate) &&
        Objects.equals(this.periodStartTime, payoutDetail.periodStartTime) &&
        Objects.equals(this.periodEndTime, payoutDetail.periodEndTime) &&
        Objects.equals(this.destinationBank, payoutDetail.destinationBank) &&
        Objects.equals(this.destinationAccount, payoutDetail.destinationAccount) &&
        Objects.equals(this.payoutType, payoutDetail.payoutType) &&
        Objects.equals(this.currency, payoutDetail.currency) &&
        Objects.equals(this.payoutStores, payoutDetail.payoutStores) &&
        Objects.equals(this.amount, payoutDetail.amount) &&
        Objects.equals(this.cutoffDate, payoutDetail.cutoffDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payoutId, bankAccountId, accountName, payoutStatus, createdDate, periodStartTime, periodEndTime, destinationBank, destinationAccount, payoutType, currency, payoutStores, amount, cutoffDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutDetail {\n");
    
    sb.append("    payoutId: ").append(toIndentedString(payoutId)).append("\n");
    sb.append("    bankAccountId: ").append(toIndentedString(bankAccountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    payoutStatus: ").append(toIndentedString(payoutStatus)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    periodStartTime: ").append(toIndentedString(periodStartTime)).append("\n");
    sb.append("    periodEndTime: ").append(toIndentedString(periodEndTime)).append("\n");
    sb.append("    destinationBank: ").append(toIndentedString(destinationBank)).append("\n");
    sb.append("    destinationAccount: ").append(toIndentedString(destinationAccount)).append("\n");
    sb.append("    payoutType: ").append(toIndentedString(payoutType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    payoutStores: ").append(toIndentedString(payoutStores)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    cutoffDate: ").append(toIndentedString(cutoffDate)).append("\n");
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

