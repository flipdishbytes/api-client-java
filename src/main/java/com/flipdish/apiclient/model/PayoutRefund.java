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
 * Holds the information for a refund related to a payout
 */
@ApiModel(description = "Holds the information for a refund related to a payout")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-16T10:11:06.563Z")
public class PayoutRefund {
  @SerializedName("OrderId")
  private Integer orderId = null;

  /**
   * Order currency
   */
  @JsonAdapter(OrderCurrencyEnum.Adapter.class)
  public enum OrderCurrencyEnum {
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

    OrderCurrencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrderCurrencyEnum fromValue(String text) {
      for (OrderCurrencyEnum b : OrderCurrencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OrderCurrencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrderCurrencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrderCurrencyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OrderCurrencyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("OrderCurrency")
  private OrderCurrencyEnum orderCurrency = null;

  @SerializedName("PayoutId")
  private Integer payoutId = null;

  @SerializedName("OrderDate")
  private OffsetDateTime orderDate = null;

  /**
   * Order type (online or cash)
   */
  @JsonAdapter(OrderTypeEnum.Adapter.class)
  public enum OrderTypeEnum {
    CASH("Cash"),
    
    ONLINE("Online");

    private String value;

    OrderTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrderTypeEnum fromValue(String text) {
      for (OrderTypeEnum b : OrderTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OrderTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrderTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrderTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OrderTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("OrderType")
  private OrderTypeEnum orderType = null;

  @SerializedName("RefundDate")
  private OffsetDateTime refundDate = null;

  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("TotalRefund")
  private Double totalRefund = null;

  @SerializedName("RefundedFees")
  private Double refundedFees = null;

  @SerializedName("RefundedAmount")
  private Double refundedAmount = null;

  @SerializedName("CashFeeRefundedToCustomer")
  private Double cashFeeRefundedToCustomer = null;

  public PayoutRefund orderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * The id of the order the refund was for
   * @return orderId
  **/
  @ApiModelProperty(value = "The id of the order the refund was for")
  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public PayoutRefund orderCurrency(OrderCurrencyEnum orderCurrency) {
    this.orderCurrency = orderCurrency;
    return this;
  }

   /**
   * Order currency
   * @return orderCurrency
  **/
  @ApiModelProperty(value = "Order currency")
  public OrderCurrencyEnum getOrderCurrency() {
    return orderCurrency;
  }

  public void setOrderCurrency(OrderCurrencyEnum orderCurrency) {
    this.orderCurrency = orderCurrency;
  }

  public PayoutRefund payoutId(Integer payoutId) {
    this.payoutId = payoutId;
    return this;
  }

   /**
   * The id of the payout the order is related to
   * @return payoutId
  **/
  @ApiModelProperty(value = "The id of the payout the order is related to")
  public Integer getPayoutId() {
    return payoutId;
  }

  public void setPayoutId(Integer payoutId) {
    this.payoutId = payoutId;
  }

  public PayoutRefund orderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
    return this;
  }

   /**
   * The date the order was placed
   * @return orderDate
  **/
  @ApiModelProperty(value = "The date the order was placed")
  public OffsetDateTime getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
  }

  public PayoutRefund orderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * Order type (online or cash)
   * @return orderType
  **/
  @ApiModelProperty(value = "Order type (online or cash)")
  public OrderTypeEnum getOrderType() {
    return orderType;
  }

  public void setOrderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
  }

  public PayoutRefund refundDate(OffsetDateTime refundDate) {
    this.refundDate = refundDate;
    return this;
  }

   /**
   * The date the refund was done
   * @return refundDate
  **/
  @ApiModelProperty(value = "The date the refund was done")
  public OffsetDateTime getRefundDate() {
    return refundDate;
  }

  public void setRefundDate(OffsetDateTime refundDate) {
    this.refundDate = refundDate;
  }

  public PayoutRefund storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Store id
   * @return storeId
  **/
  @ApiModelProperty(value = "Store id")
  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public PayoutRefund totalRefund(Double totalRefund) {
    this.totalRefund = totalRefund;
    return this;
  }

   /**
   * Total refund amount
   * @return totalRefund
  **/
  @ApiModelProperty(value = "Total refund amount")
  public Double getTotalRefund() {
    return totalRefund;
  }

  public void setTotalRefund(Double totalRefund) {
    this.totalRefund = totalRefund;
  }

  public PayoutRefund refundedFees(Double refundedFees) {
    this.refundedFees = refundedFees;
    return this;
  }

   /**
   * Refunded fees amount
   * @return refundedFees
  **/
  @ApiModelProperty(value = "Refunded fees amount")
  public Double getRefundedFees() {
    return refundedFees;
  }

  public void setRefundedFees(Double refundedFees) {
    this.refundedFees = refundedFees;
  }

  public PayoutRefund refundedAmount(Double refundedAmount) {
    this.refundedAmount = refundedAmount;
    return this;
  }

   /**
   * Refunded amount
   * @return refundedAmount
  **/
  @ApiModelProperty(value = "Refunded amount")
  public Double getRefundedAmount() {
    return refundedAmount;
  }

  public void setRefundedAmount(Double refundedAmount) {
    this.refundedAmount = refundedAmount;
  }

  public PayoutRefund cashFeeRefundedToCustomer(Double cashFeeRefundedToCustomer) {
    this.cashFeeRefundedToCustomer = cashFeeRefundedToCustomer;
    return this;
  }

   /**
   * Cash fee refunded to customer
   * @return cashFeeRefundedToCustomer
  **/
  @ApiModelProperty(value = "Cash fee refunded to customer")
  public Double getCashFeeRefundedToCustomer() {
    return cashFeeRefundedToCustomer;
  }

  public void setCashFeeRefundedToCustomer(Double cashFeeRefundedToCustomer) {
    this.cashFeeRefundedToCustomer = cashFeeRefundedToCustomer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutRefund payoutRefund = (PayoutRefund) o;
    return Objects.equals(this.orderId, payoutRefund.orderId) &&
        Objects.equals(this.orderCurrency, payoutRefund.orderCurrency) &&
        Objects.equals(this.payoutId, payoutRefund.payoutId) &&
        Objects.equals(this.orderDate, payoutRefund.orderDate) &&
        Objects.equals(this.orderType, payoutRefund.orderType) &&
        Objects.equals(this.refundDate, payoutRefund.refundDate) &&
        Objects.equals(this.storeId, payoutRefund.storeId) &&
        Objects.equals(this.totalRefund, payoutRefund.totalRefund) &&
        Objects.equals(this.refundedFees, payoutRefund.refundedFees) &&
        Objects.equals(this.refundedAmount, payoutRefund.refundedAmount) &&
        Objects.equals(this.cashFeeRefundedToCustomer, payoutRefund.cashFeeRefundedToCustomer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, orderCurrency, payoutId, orderDate, orderType, refundDate, storeId, totalRefund, refundedFees, refundedAmount, cashFeeRefundedToCustomer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutRefund {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderCurrency: ").append(toIndentedString(orderCurrency)).append("\n");
    sb.append("    payoutId: ").append(toIndentedString(payoutId)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    refundDate: ").append(toIndentedString(refundDate)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    totalRefund: ").append(toIndentedString(totalRefund)).append("\n");
    sb.append("    refundedFees: ").append(toIndentedString(refundedFees)).append("\n");
    sb.append("    refundedAmount: ").append(toIndentedString(refundedAmount)).append("\n");
    sb.append("    cashFeeRefundedToCustomer: ").append(toIndentedString(cashFeeRefundedToCustomer)).append("\n");
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

