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
 * Holds the information for a whitelabel payout.
 */
@ApiModel(description = "Holds the information for a whitelabel payout.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-20T14:43:16.792+01:00")
public class Payout {
  @SerializedName("PayoutId")
  private Integer payoutId = null;

  @SerializedName("PayeeBankAccountId")
  private Integer payeeBankAccountId = null;

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

  @SerializedName("Amount")
  private Double amount = null;

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

  @SerializedName("CutoffDate")
  private OffsetDateTime cutoffDate = null;

  @SerializedName("OnlineSalesAmount")
  private Double onlineSalesAmount = null;

  @SerializedName("OnlineSalesDeliveryCharges")
  private Double onlineSalesDeliveryCharges = null;

  @SerializedName("OnlineSalesTips")
  private Double onlineSalesTips = null;

  @SerializedName("OnlineSalesServiceCharges")
  private Double onlineSalesServiceCharges = null;

  @SerializedName("OnlineSalesRefundedFees")
  private Double onlineSalesRefundedFees = null;

  @SerializedName("OnlineSalesFees")
  private Double onlineSalesFees = null;

  @SerializedName("OnlineSalesRefundedAmount")
  private Double onlineSalesRefundedAmount = null;

  @SerializedName("OnlineSalesTax")
  private Double onlineSalesTax = null;

  @SerializedName("TotalOnlineRevenue")
  private Double totalOnlineRevenue = null;

  @SerializedName("CashSalesFees")
  private Double cashSalesFees = null;

  @SerializedName("CashSalesRefundedFees")
  private Double cashSalesRefundedFees = null;

  @SerializedName("CustomerCashFees")
  private Double customerCashFees = null;

  @SerializedName("SalesFeesVat")
  private Double salesFeesVat = null;

  @SerializedName("TotalFees")
  private Double totalFees = null;

  @SerializedName("TotalOnlineRevenueAdjustments")
  private Double totalOnlineRevenueAdjustments = null;

  @SerializedName("ChargebackAmount")
  private Double chargebackAmount = null;

  @SerializedName("ChargebackRefundedFees")
  private Double chargebackRefundedFees = null;

  @SerializedName("TotalChargebackCost")
  private Double totalChargebackCost = null;

  @SerializedName("TotalOtherCharges")
  private Double totalOtherCharges = null;

  @SerializedName("OpeningBalance")
  private Double openingBalance = null;

  @SerializedName("ClosingBalance")
  private Double closingBalance = null;

  public Payout payoutId(Integer payoutId) {
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

  public Payout payeeBankAccountId(Integer payeeBankAccountId) {
    this.payeeBankAccountId = payeeBankAccountId;
    return this;
  }

   /**
   * Bank account identifier
   * @return payeeBankAccountId
  **/
  @ApiModelProperty(value = "Bank account identifier")
  public Integer getPayeeBankAccountId() {
    return payeeBankAccountId;
  }

  public void setPayeeBankAccountId(Integer payeeBankAccountId) {
    this.payeeBankAccountId = payeeBankAccountId;
  }

  public Payout accountName(String accountName) {
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

  public Payout payoutStatus(PayoutStatusEnum payoutStatus) {
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

  public Payout createdDate(OffsetDateTime createdDate) {
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

  public Payout periodStartTime(OffsetDateTime periodStartTime) {
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

  public Payout periodEndTime(OffsetDateTime periodEndTime) {
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

  public Payout destinationBank(String destinationBank) {
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

  public Payout destinationAccount(String destinationAccount) {
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

  public Payout amount(Double amount) {
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

  public Payout payoutType(PayoutTypeEnum payoutType) {
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

  public Payout currency(CurrencyEnum currency) {
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

  public Payout cutoffDate(OffsetDateTime cutoffDate) {
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

  public Payout onlineSalesAmount(Double onlineSalesAmount) {
    this.onlineSalesAmount = onlineSalesAmount;
    return this;
  }

   /**
   * Payout online sales amount
   * @return onlineSalesAmount
  **/
  @ApiModelProperty(value = "Payout online sales amount")
  public Double getOnlineSalesAmount() {
    return onlineSalesAmount;
  }

  public void setOnlineSalesAmount(Double onlineSalesAmount) {
    this.onlineSalesAmount = onlineSalesAmount;
  }

  public Payout onlineSalesDeliveryCharges(Double onlineSalesDeliveryCharges) {
    this.onlineSalesDeliveryCharges = onlineSalesDeliveryCharges;
    return this;
  }

   /**
   * Payout online sales delivery charges
   * @return onlineSalesDeliveryCharges
  **/
  @ApiModelProperty(value = "Payout online sales delivery charges")
  public Double getOnlineSalesDeliveryCharges() {
    return onlineSalesDeliveryCharges;
  }

  public void setOnlineSalesDeliveryCharges(Double onlineSalesDeliveryCharges) {
    this.onlineSalesDeliveryCharges = onlineSalesDeliveryCharges;
  }

  public Payout onlineSalesTips(Double onlineSalesTips) {
    this.onlineSalesTips = onlineSalesTips;
    return this;
  }

   /**
   * Payout online sales tips
   * @return onlineSalesTips
  **/
  @ApiModelProperty(value = "Payout online sales tips")
  public Double getOnlineSalesTips() {
    return onlineSalesTips;
  }

  public void setOnlineSalesTips(Double onlineSalesTips) {
    this.onlineSalesTips = onlineSalesTips;
  }

  public Payout onlineSalesServiceCharges(Double onlineSalesServiceCharges) {
    this.onlineSalesServiceCharges = onlineSalesServiceCharges;
    return this;
  }

   /**
   * Payout online sales service charges
   * @return onlineSalesServiceCharges
  **/
  @ApiModelProperty(value = "Payout online sales service charges")
  public Double getOnlineSalesServiceCharges() {
    return onlineSalesServiceCharges;
  }

  public void setOnlineSalesServiceCharges(Double onlineSalesServiceCharges) {
    this.onlineSalesServiceCharges = onlineSalesServiceCharges;
  }

  public Payout onlineSalesRefundedFees(Double onlineSalesRefundedFees) {
    this.onlineSalesRefundedFees = onlineSalesRefundedFees;
    return this;
  }

   /**
   * Payout online sales refunded fees
   * @return onlineSalesRefundedFees
  **/
  @ApiModelProperty(value = "Payout online sales refunded fees")
  public Double getOnlineSalesRefundedFees() {
    return onlineSalesRefundedFees;
  }

  public void setOnlineSalesRefundedFees(Double onlineSalesRefundedFees) {
    this.onlineSalesRefundedFees = onlineSalesRefundedFees;
  }

  public Payout onlineSalesFees(Double onlineSalesFees) {
    this.onlineSalesFees = onlineSalesFees;
    return this;
  }

   /**
   * Payout online sales fees
   * @return onlineSalesFees
  **/
  @ApiModelProperty(value = "Payout online sales fees")
  public Double getOnlineSalesFees() {
    return onlineSalesFees;
  }

  public void setOnlineSalesFees(Double onlineSalesFees) {
    this.onlineSalesFees = onlineSalesFees;
  }

  public Payout onlineSalesRefundedAmount(Double onlineSalesRefundedAmount) {
    this.onlineSalesRefundedAmount = onlineSalesRefundedAmount;
    return this;
  }

   /**
   * Payout online sales refunded amount
   * @return onlineSalesRefundedAmount
  **/
  @ApiModelProperty(value = "Payout online sales refunded amount")
  public Double getOnlineSalesRefundedAmount() {
    return onlineSalesRefundedAmount;
  }

  public void setOnlineSalesRefundedAmount(Double onlineSalesRefundedAmount) {
    this.onlineSalesRefundedAmount = onlineSalesRefundedAmount;
  }

  public Payout onlineSalesTax(Double onlineSalesTax) {
    this.onlineSalesTax = onlineSalesTax;
    return this;
  }

   /**
   * Payout online sales tax
   * @return onlineSalesTax
  **/
  @ApiModelProperty(value = "Payout online sales tax")
  public Double getOnlineSalesTax() {
    return onlineSalesTax;
  }

  public void setOnlineSalesTax(Double onlineSalesTax) {
    this.onlineSalesTax = onlineSalesTax;
  }

  public Payout totalOnlineRevenue(Double totalOnlineRevenue) {
    this.totalOnlineRevenue = totalOnlineRevenue;
    return this;
  }

   /**
   * Payout total online revenue
   * @return totalOnlineRevenue
  **/
  @ApiModelProperty(value = "Payout total online revenue")
  public Double getTotalOnlineRevenue() {
    return totalOnlineRevenue;
  }

  public void setTotalOnlineRevenue(Double totalOnlineRevenue) {
    this.totalOnlineRevenue = totalOnlineRevenue;
  }

  public Payout cashSalesFees(Double cashSalesFees) {
    this.cashSalesFees = cashSalesFees;
    return this;
  }

   /**
   * Payout cash sales fees
   * @return cashSalesFees
  **/
  @ApiModelProperty(value = "Payout cash sales fees")
  public Double getCashSalesFees() {
    return cashSalesFees;
  }

  public void setCashSalesFees(Double cashSalesFees) {
    this.cashSalesFees = cashSalesFees;
  }

  public Payout cashSalesRefundedFees(Double cashSalesRefundedFees) {
    this.cashSalesRefundedFees = cashSalesRefundedFees;
    return this;
  }

   /**
   * Payout cash sales refunded fees
   * @return cashSalesRefundedFees
  **/
  @ApiModelProperty(value = "Payout cash sales refunded fees")
  public Double getCashSalesRefundedFees() {
    return cashSalesRefundedFees;
  }

  public void setCashSalesRefundedFees(Double cashSalesRefundedFees) {
    this.cashSalesRefundedFees = cashSalesRefundedFees;
  }

  public Payout customerCashFees(Double customerCashFees) {
    this.customerCashFees = customerCashFees;
    return this;
  }

   /**
   * Payout cash fees charged to customer
   * @return customerCashFees
  **/
  @ApiModelProperty(value = "Payout cash fees charged to customer")
  public Double getCustomerCashFees() {
    return customerCashFees;
  }

  public void setCustomerCashFees(Double customerCashFees) {
    this.customerCashFees = customerCashFees;
  }

  public Payout salesFeesVat(Double salesFeesVat) {
    this.salesFeesVat = salesFeesVat;
    return this;
  }

   /**
   * Payout sales fees vat
   * @return salesFeesVat
  **/
  @ApiModelProperty(value = "Payout sales fees vat")
  public Double getSalesFeesVat() {
    return salesFeesVat;
  }

  public void setSalesFeesVat(Double salesFeesVat) {
    this.salesFeesVat = salesFeesVat;
  }

  public Payout totalFees(Double totalFees) {
    this.totalFees = totalFees;
    return this;
  }

   /**
   * Payout total fees
   * @return totalFees
  **/
  @ApiModelProperty(value = "Payout total fees")
  public Double getTotalFees() {
    return totalFees;
  }

  public void setTotalFees(Double totalFees) {
    this.totalFees = totalFees;
  }

  public Payout totalOnlineRevenueAdjustments(Double totalOnlineRevenueAdjustments) {
    this.totalOnlineRevenueAdjustments = totalOnlineRevenueAdjustments;
    return this;
  }

   /**
   * Payout total online revenue adjustments
   * @return totalOnlineRevenueAdjustments
  **/
  @ApiModelProperty(value = "Payout total online revenue adjustments")
  public Double getTotalOnlineRevenueAdjustments() {
    return totalOnlineRevenueAdjustments;
  }

  public void setTotalOnlineRevenueAdjustments(Double totalOnlineRevenueAdjustments) {
    this.totalOnlineRevenueAdjustments = totalOnlineRevenueAdjustments;
  }

  public Payout chargebackAmount(Double chargebackAmount) {
    this.chargebackAmount = chargebackAmount;
    return this;
  }

   /**
   * Payout chargeback amount
   * @return chargebackAmount
  **/
  @ApiModelProperty(value = "Payout chargeback amount")
  public Double getChargebackAmount() {
    return chargebackAmount;
  }

  public void setChargebackAmount(Double chargebackAmount) {
    this.chargebackAmount = chargebackAmount;
  }

  public Payout chargebackRefundedFees(Double chargebackRefundedFees) {
    this.chargebackRefundedFees = chargebackRefundedFees;
    return this;
  }

   /**
   * Payout chargeback refunded fees
   * @return chargebackRefundedFees
  **/
  @ApiModelProperty(value = "Payout chargeback refunded fees")
  public Double getChargebackRefundedFees() {
    return chargebackRefundedFees;
  }

  public void setChargebackRefundedFees(Double chargebackRefundedFees) {
    this.chargebackRefundedFees = chargebackRefundedFees;
  }

  public Payout totalChargebackCost(Double totalChargebackCost) {
    this.totalChargebackCost = totalChargebackCost;
    return this;
  }

   /**
   * Payout chargebacks total cost
   * @return totalChargebackCost
  **/
  @ApiModelProperty(value = "Payout chargebacks total cost")
  public Double getTotalChargebackCost() {
    return totalChargebackCost;
  }

  public void setTotalChargebackCost(Double totalChargebackCost) {
    this.totalChargebackCost = totalChargebackCost;
  }

  public Payout totalOtherCharges(Double totalOtherCharges) {
    this.totalOtherCharges = totalOtherCharges;
    return this;
  }

   /**
   * Payout other charges total
   * @return totalOtherCharges
  **/
  @ApiModelProperty(value = "Payout other charges total")
  public Double getTotalOtherCharges() {
    return totalOtherCharges;
  }

  public void setTotalOtherCharges(Double totalOtherCharges) {
    this.totalOtherCharges = totalOtherCharges;
  }

  public Payout openingBalance(Double openingBalance) {
    this.openingBalance = openingBalance;
    return this;
  }

   /**
   * Payout opening balance
   * @return openingBalance
  **/
  @ApiModelProperty(value = "Payout opening balance")
  public Double getOpeningBalance() {
    return openingBalance;
  }

  public void setOpeningBalance(Double openingBalance) {
    this.openingBalance = openingBalance;
  }

  public Payout closingBalance(Double closingBalance) {
    this.closingBalance = closingBalance;
    return this;
  }

   /**
   * Payout closing balance
   * @return closingBalance
  **/
  @ApiModelProperty(value = "Payout closing balance")
  public Double getClosingBalance() {
    return closingBalance;
  }

  public void setClosingBalance(Double closingBalance) {
    this.closingBalance = closingBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payout payout = (Payout) o;
    return Objects.equals(this.payoutId, payout.payoutId) &&
        Objects.equals(this.payeeBankAccountId, payout.payeeBankAccountId) &&
        Objects.equals(this.accountName, payout.accountName) &&
        Objects.equals(this.payoutStatus, payout.payoutStatus) &&
        Objects.equals(this.createdDate, payout.createdDate) &&
        Objects.equals(this.periodStartTime, payout.periodStartTime) &&
        Objects.equals(this.periodEndTime, payout.periodEndTime) &&
        Objects.equals(this.destinationBank, payout.destinationBank) &&
        Objects.equals(this.destinationAccount, payout.destinationAccount) &&
        Objects.equals(this.amount, payout.amount) &&
        Objects.equals(this.payoutType, payout.payoutType) &&
        Objects.equals(this.currency, payout.currency) &&
        Objects.equals(this.cutoffDate, payout.cutoffDate) &&
        Objects.equals(this.onlineSalesAmount, payout.onlineSalesAmount) &&
        Objects.equals(this.onlineSalesDeliveryCharges, payout.onlineSalesDeliveryCharges) &&
        Objects.equals(this.onlineSalesTips, payout.onlineSalesTips) &&
        Objects.equals(this.onlineSalesServiceCharges, payout.onlineSalesServiceCharges) &&
        Objects.equals(this.onlineSalesRefundedFees, payout.onlineSalesRefundedFees) &&
        Objects.equals(this.onlineSalesFees, payout.onlineSalesFees) &&
        Objects.equals(this.onlineSalesRefundedAmount, payout.onlineSalesRefundedAmount) &&
        Objects.equals(this.onlineSalesTax, payout.onlineSalesTax) &&
        Objects.equals(this.totalOnlineRevenue, payout.totalOnlineRevenue) &&
        Objects.equals(this.cashSalesFees, payout.cashSalesFees) &&
        Objects.equals(this.cashSalesRefundedFees, payout.cashSalesRefundedFees) &&
        Objects.equals(this.customerCashFees, payout.customerCashFees) &&
        Objects.equals(this.salesFeesVat, payout.salesFeesVat) &&
        Objects.equals(this.totalFees, payout.totalFees) &&
        Objects.equals(this.totalOnlineRevenueAdjustments, payout.totalOnlineRevenueAdjustments) &&
        Objects.equals(this.chargebackAmount, payout.chargebackAmount) &&
        Objects.equals(this.chargebackRefundedFees, payout.chargebackRefundedFees) &&
        Objects.equals(this.totalChargebackCost, payout.totalChargebackCost) &&
        Objects.equals(this.totalOtherCharges, payout.totalOtherCharges) &&
        Objects.equals(this.openingBalance, payout.openingBalance) &&
        Objects.equals(this.closingBalance, payout.closingBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payoutId, payeeBankAccountId, accountName, payoutStatus, createdDate, periodStartTime, periodEndTime, destinationBank, destinationAccount, amount, payoutType, currency, cutoffDate, onlineSalesAmount, onlineSalesDeliveryCharges, onlineSalesTips, onlineSalesServiceCharges, onlineSalesRefundedFees, onlineSalesFees, onlineSalesRefundedAmount, onlineSalesTax, totalOnlineRevenue, cashSalesFees, cashSalesRefundedFees, customerCashFees, salesFeesVat, totalFees, totalOnlineRevenueAdjustments, chargebackAmount, chargebackRefundedFees, totalChargebackCost, totalOtherCharges, openingBalance, closingBalance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payout {\n");
    
    sb.append("    payoutId: ").append(toIndentedString(payoutId)).append("\n");
    sb.append("    payeeBankAccountId: ").append(toIndentedString(payeeBankAccountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    payoutStatus: ").append(toIndentedString(payoutStatus)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    periodStartTime: ").append(toIndentedString(periodStartTime)).append("\n");
    sb.append("    periodEndTime: ").append(toIndentedString(periodEndTime)).append("\n");
    sb.append("    destinationBank: ").append(toIndentedString(destinationBank)).append("\n");
    sb.append("    destinationAccount: ").append(toIndentedString(destinationAccount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    payoutType: ").append(toIndentedString(payoutType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    cutoffDate: ").append(toIndentedString(cutoffDate)).append("\n");
    sb.append("    onlineSalesAmount: ").append(toIndentedString(onlineSalesAmount)).append("\n");
    sb.append("    onlineSalesDeliveryCharges: ").append(toIndentedString(onlineSalesDeliveryCharges)).append("\n");
    sb.append("    onlineSalesTips: ").append(toIndentedString(onlineSalesTips)).append("\n");
    sb.append("    onlineSalesServiceCharges: ").append(toIndentedString(onlineSalesServiceCharges)).append("\n");
    sb.append("    onlineSalesRefundedFees: ").append(toIndentedString(onlineSalesRefundedFees)).append("\n");
    sb.append("    onlineSalesFees: ").append(toIndentedString(onlineSalesFees)).append("\n");
    sb.append("    onlineSalesRefundedAmount: ").append(toIndentedString(onlineSalesRefundedAmount)).append("\n");
    sb.append("    onlineSalesTax: ").append(toIndentedString(onlineSalesTax)).append("\n");
    sb.append("    totalOnlineRevenue: ").append(toIndentedString(totalOnlineRevenue)).append("\n");
    sb.append("    cashSalesFees: ").append(toIndentedString(cashSalesFees)).append("\n");
    sb.append("    cashSalesRefundedFees: ").append(toIndentedString(cashSalesRefundedFees)).append("\n");
    sb.append("    customerCashFees: ").append(toIndentedString(customerCashFees)).append("\n");
    sb.append("    salesFeesVat: ").append(toIndentedString(salesFeesVat)).append("\n");
    sb.append("    totalFees: ").append(toIndentedString(totalFees)).append("\n");
    sb.append("    totalOnlineRevenueAdjustments: ").append(toIndentedString(totalOnlineRevenueAdjustments)).append("\n");
    sb.append("    chargebackAmount: ").append(toIndentedString(chargebackAmount)).append("\n");
    sb.append("    chargebackRefundedFees: ").append(toIndentedString(chargebackRefundedFees)).append("\n");
    sb.append("    totalChargebackCost: ").append(toIndentedString(totalChargebackCost)).append("\n");
    sb.append("    totalOtherCharges: ").append(toIndentedString(totalOtherCharges)).append("\n");
    sb.append("    openingBalance: ").append(toIndentedString(openingBalance)).append("\n");
    sb.append("    closingBalance: ").append(toIndentedString(closingBalance)).append("\n");
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

