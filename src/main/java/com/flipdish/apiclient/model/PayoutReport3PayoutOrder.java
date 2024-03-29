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
 * PayoutReport3PayoutOrder
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-28T15:30:09.878Z")
public class PayoutReport3PayoutOrder {
  @SerializedName("OrderId")
  private Integer orderId = null;

  @SerializedName("PayoutId")
  private Integer payoutId = null;

  @SerializedName("OrderDate")
  private OffsetDateTime orderDate = null;

  /**
   * Gets or Sets orderType
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

  /**
   * Gets or Sets orderCurrency
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

  @SerializedName("Sales")
  private Double sales = null;

  @SerializedName("SalesTax")
  private Double salesTax = null;

  @SerializedName("DeliveryCharges")
  private Double deliveryCharges = null;

  @SerializedName("Tips")
  private Double tips = null;

  @SerializedName("Voucher")
  private Double voucher = null;

  @SerializedName("FlatFeeExcludingVat")
  private Double flatFeeExcludingVat = null;

  @SerializedName("FlatFeeExcludingVAT")
  private Double flatFeeExcludingVAT = null;

  @SerializedName("FlatFeeIncludingVat")
  private Double flatFeeIncludingVat = null;

  @SerializedName("PercentageFeeExcludingVat")
  private Double percentageFeeExcludingVat = null;

  @SerializedName("PercentageFeeExcludingVAT")
  private Double percentageFeeExcludingVAT = null;

  @SerializedName("Vat")
  private Double vat = null;

  @SerializedName("TotalFees")
  private Double totalFees = null;

  @SerializedName("CashFeeChargedToCustomer")
  private Double cashFeeChargedToCustomer = null;

  @SerializedName("NetSales")
  private Double netSales = null;

  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("StoreName")
  private String storeName = null;

  @SerializedName("ServiceChargeAmount")
  private Double serviceChargeAmount = null;

  @SerializedName("ServiceChargePercentage")
  private Double serviceChargePercentage = null;

  public PayoutReport3PayoutOrder orderId(Integer orderId) {
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

  public PayoutReport3PayoutOrder payoutId(Integer payoutId) {
    this.payoutId = payoutId;
    return this;
  }

   /**
   * Get payoutId
   * @return payoutId
  **/
  @ApiModelProperty(value = "")
  public Integer getPayoutId() {
    return payoutId;
  }

  public void setPayoutId(Integer payoutId) {
    this.payoutId = payoutId;
  }

  public PayoutReport3PayoutOrder orderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
    return this;
  }

   /**
   * Get orderDate
   * @return orderDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
  }

  public PayoutReport3PayoutOrder orderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * Get orderType
   * @return orderType
  **/
  @ApiModelProperty(value = "")
  public OrderTypeEnum getOrderType() {
    return orderType;
  }

  public void setOrderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
  }

  public PayoutReport3PayoutOrder orderCurrency(OrderCurrencyEnum orderCurrency) {
    this.orderCurrency = orderCurrency;
    return this;
  }

   /**
   * Get orderCurrency
   * @return orderCurrency
  **/
  @ApiModelProperty(value = "")
  public OrderCurrencyEnum getOrderCurrency() {
    return orderCurrency;
  }

  public void setOrderCurrency(OrderCurrencyEnum orderCurrency) {
    this.orderCurrency = orderCurrency;
  }

  public PayoutReport3PayoutOrder sales(Double sales) {
    this.sales = sales;
    return this;
  }

   /**
   * Get sales
   * @return sales
  **/
  @ApiModelProperty(value = "")
  public Double getSales() {
    return sales;
  }

  public void setSales(Double sales) {
    this.sales = sales;
  }

  public PayoutReport3PayoutOrder salesTax(Double salesTax) {
    this.salesTax = salesTax;
    return this;
  }

   /**
   * Get salesTax
   * @return salesTax
  **/
  @ApiModelProperty(value = "")
  public Double getSalesTax() {
    return salesTax;
  }

  public void setSalesTax(Double salesTax) {
    this.salesTax = salesTax;
  }

  public PayoutReport3PayoutOrder deliveryCharges(Double deliveryCharges) {
    this.deliveryCharges = deliveryCharges;
    return this;
  }

   /**
   * Get deliveryCharges
   * @return deliveryCharges
  **/
  @ApiModelProperty(value = "")
  public Double getDeliveryCharges() {
    return deliveryCharges;
  }

  public void setDeliveryCharges(Double deliveryCharges) {
    this.deliveryCharges = deliveryCharges;
  }

  public PayoutReport3PayoutOrder tips(Double tips) {
    this.tips = tips;
    return this;
  }

   /**
   * Get tips
   * @return tips
  **/
  @ApiModelProperty(value = "")
  public Double getTips() {
    return tips;
  }

  public void setTips(Double tips) {
    this.tips = tips;
  }

  public PayoutReport3PayoutOrder voucher(Double voucher) {
    this.voucher = voucher;
    return this;
  }

   /**
   * Get voucher
   * @return voucher
  **/
  @ApiModelProperty(value = "")
  public Double getVoucher() {
    return voucher;
  }

  public void setVoucher(Double voucher) {
    this.voucher = voucher;
  }

  public PayoutReport3PayoutOrder flatFeeExcludingVat(Double flatFeeExcludingVat) {
    this.flatFeeExcludingVat = flatFeeExcludingVat;
    return this;
  }

   /**
   * Get flatFeeExcludingVat
   * @return flatFeeExcludingVat
  **/
  @ApiModelProperty(value = "")
  public Double getFlatFeeExcludingVat() {
    return flatFeeExcludingVat;
  }

  public void setFlatFeeExcludingVat(Double flatFeeExcludingVat) {
    this.flatFeeExcludingVat = flatFeeExcludingVat;
  }

  public PayoutReport3PayoutOrder flatFeeExcludingVAT(Double flatFeeExcludingVAT) {
    this.flatFeeExcludingVAT = flatFeeExcludingVAT;
    return this;
  }

   /**
   * Get flatFeeExcludingVAT
   * @return flatFeeExcludingVAT
  **/
  @ApiModelProperty(value = "")
  public Double getFlatFeeExcludingVAT() {
    return flatFeeExcludingVAT;
  }

  public void setFlatFeeExcludingVAT(Double flatFeeExcludingVAT) {
    this.flatFeeExcludingVAT = flatFeeExcludingVAT;
  }

  public PayoutReport3PayoutOrder flatFeeIncludingVat(Double flatFeeIncludingVat) {
    this.flatFeeIncludingVat = flatFeeIncludingVat;
    return this;
  }

   /**
   * Get flatFeeIncludingVat
   * @return flatFeeIncludingVat
  **/
  @ApiModelProperty(value = "")
  public Double getFlatFeeIncludingVat() {
    return flatFeeIncludingVat;
  }

  public void setFlatFeeIncludingVat(Double flatFeeIncludingVat) {
    this.flatFeeIncludingVat = flatFeeIncludingVat;
  }

  public PayoutReport3PayoutOrder percentageFeeExcludingVat(Double percentageFeeExcludingVat) {
    this.percentageFeeExcludingVat = percentageFeeExcludingVat;
    return this;
  }

   /**
   * Get percentageFeeExcludingVat
   * @return percentageFeeExcludingVat
  **/
  @ApiModelProperty(value = "")
  public Double getPercentageFeeExcludingVat() {
    return percentageFeeExcludingVat;
  }

  public void setPercentageFeeExcludingVat(Double percentageFeeExcludingVat) {
    this.percentageFeeExcludingVat = percentageFeeExcludingVat;
  }

  public PayoutReport3PayoutOrder percentageFeeExcludingVAT(Double percentageFeeExcludingVAT) {
    this.percentageFeeExcludingVAT = percentageFeeExcludingVAT;
    return this;
  }

   /**
   * Get percentageFeeExcludingVAT
   * @return percentageFeeExcludingVAT
  **/
  @ApiModelProperty(value = "")
  public Double getPercentageFeeExcludingVAT() {
    return percentageFeeExcludingVAT;
  }

  public void setPercentageFeeExcludingVAT(Double percentageFeeExcludingVAT) {
    this.percentageFeeExcludingVAT = percentageFeeExcludingVAT;
  }

  public PayoutReport3PayoutOrder vat(Double vat) {
    this.vat = vat;
    return this;
  }

   /**
   * Get vat
   * @return vat
  **/
  @ApiModelProperty(value = "")
  public Double getVat() {
    return vat;
  }

  public void setVat(Double vat) {
    this.vat = vat;
  }

  public PayoutReport3PayoutOrder totalFees(Double totalFees) {
    this.totalFees = totalFees;
    return this;
  }

   /**
   * Get totalFees
   * @return totalFees
  **/
  @ApiModelProperty(value = "")
  public Double getTotalFees() {
    return totalFees;
  }

  public void setTotalFees(Double totalFees) {
    this.totalFees = totalFees;
  }

  public PayoutReport3PayoutOrder cashFeeChargedToCustomer(Double cashFeeChargedToCustomer) {
    this.cashFeeChargedToCustomer = cashFeeChargedToCustomer;
    return this;
  }

   /**
   * Get cashFeeChargedToCustomer
   * @return cashFeeChargedToCustomer
  **/
  @ApiModelProperty(value = "")
  public Double getCashFeeChargedToCustomer() {
    return cashFeeChargedToCustomer;
  }

  public void setCashFeeChargedToCustomer(Double cashFeeChargedToCustomer) {
    this.cashFeeChargedToCustomer = cashFeeChargedToCustomer;
  }

  public PayoutReport3PayoutOrder netSales(Double netSales) {
    this.netSales = netSales;
    return this;
  }

   /**
   * Get netSales
   * @return netSales
  **/
  @ApiModelProperty(value = "")
  public Double getNetSales() {
    return netSales;
  }

  public void setNetSales(Double netSales) {
    this.netSales = netSales;
  }

  public PayoutReport3PayoutOrder storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Get storeId
   * @return storeId
  **/
  @ApiModelProperty(value = "")
  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public PayoutReport3PayoutOrder storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

   /**
   * Get storeName
   * @return storeName
  **/
  @ApiModelProperty(value = "")
  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public PayoutReport3PayoutOrder serviceChargeAmount(Double serviceChargeAmount) {
    this.serviceChargeAmount = serviceChargeAmount;
    return this;
  }

   /**
   * Get serviceChargeAmount
   * @return serviceChargeAmount
  **/
  @ApiModelProperty(value = "")
  public Double getServiceChargeAmount() {
    return serviceChargeAmount;
  }

  public void setServiceChargeAmount(Double serviceChargeAmount) {
    this.serviceChargeAmount = serviceChargeAmount;
  }

  public PayoutReport3PayoutOrder serviceChargePercentage(Double serviceChargePercentage) {
    this.serviceChargePercentage = serviceChargePercentage;
    return this;
  }

   /**
   * Get serviceChargePercentage
   * @return serviceChargePercentage
  **/
  @ApiModelProperty(value = "")
  public Double getServiceChargePercentage() {
    return serviceChargePercentage;
  }

  public void setServiceChargePercentage(Double serviceChargePercentage) {
    this.serviceChargePercentage = serviceChargePercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutReport3PayoutOrder payoutReport3PayoutOrder = (PayoutReport3PayoutOrder) o;
    return Objects.equals(this.orderId, payoutReport3PayoutOrder.orderId) &&
        Objects.equals(this.payoutId, payoutReport3PayoutOrder.payoutId) &&
        Objects.equals(this.orderDate, payoutReport3PayoutOrder.orderDate) &&
        Objects.equals(this.orderType, payoutReport3PayoutOrder.orderType) &&
        Objects.equals(this.orderCurrency, payoutReport3PayoutOrder.orderCurrency) &&
        Objects.equals(this.sales, payoutReport3PayoutOrder.sales) &&
        Objects.equals(this.salesTax, payoutReport3PayoutOrder.salesTax) &&
        Objects.equals(this.deliveryCharges, payoutReport3PayoutOrder.deliveryCharges) &&
        Objects.equals(this.tips, payoutReport3PayoutOrder.tips) &&
        Objects.equals(this.voucher, payoutReport3PayoutOrder.voucher) &&
        Objects.equals(this.flatFeeExcludingVat, payoutReport3PayoutOrder.flatFeeExcludingVat) &&
        Objects.equals(this.flatFeeExcludingVAT, payoutReport3PayoutOrder.flatFeeExcludingVAT) &&
        Objects.equals(this.flatFeeIncludingVat, payoutReport3PayoutOrder.flatFeeIncludingVat) &&
        Objects.equals(this.percentageFeeExcludingVat, payoutReport3PayoutOrder.percentageFeeExcludingVat) &&
        Objects.equals(this.percentageFeeExcludingVAT, payoutReport3PayoutOrder.percentageFeeExcludingVAT) &&
        Objects.equals(this.vat, payoutReport3PayoutOrder.vat) &&
        Objects.equals(this.totalFees, payoutReport3PayoutOrder.totalFees) &&
        Objects.equals(this.cashFeeChargedToCustomer, payoutReport3PayoutOrder.cashFeeChargedToCustomer) &&
        Objects.equals(this.netSales, payoutReport3PayoutOrder.netSales) &&
        Objects.equals(this.storeId, payoutReport3PayoutOrder.storeId) &&
        Objects.equals(this.storeName, payoutReport3PayoutOrder.storeName) &&
        Objects.equals(this.serviceChargeAmount, payoutReport3PayoutOrder.serviceChargeAmount) &&
        Objects.equals(this.serviceChargePercentage, payoutReport3PayoutOrder.serviceChargePercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, payoutId, orderDate, orderType, orderCurrency, sales, salesTax, deliveryCharges, tips, voucher, flatFeeExcludingVat, flatFeeExcludingVAT, flatFeeIncludingVat, percentageFeeExcludingVat, percentageFeeExcludingVAT, vat, totalFees, cashFeeChargedToCustomer, netSales, storeId, storeName, serviceChargeAmount, serviceChargePercentage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutReport3PayoutOrder {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    payoutId: ").append(toIndentedString(payoutId)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    orderCurrency: ").append(toIndentedString(orderCurrency)).append("\n");
    sb.append("    sales: ").append(toIndentedString(sales)).append("\n");
    sb.append("    salesTax: ").append(toIndentedString(salesTax)).append("\n");
    sb.append("    deliveryCharges: ").append(toIndentedString(deliveryCharges)).append("\n");
    sb.append("    tips: ").append(toIndentedString(tips)).append("\n");
    sb.append("    voucher: ").append(toIndentedString(voucher)).append("\n");
    sb.append("    flatFeeExcludingVat: ").append(toIndentedString(flatFeeExcludingVat)).append("\n");
    sb.append("    flatFeeExcludingVAT: ").append(toIndentedString(flatFeeExcludingVAT)).append("\n");
    sb.append("    flatFeeIncludingVat: ").append(toIndentedString(flatFeeIncludingVat)).append("\n");
    sb.append("    percentageFeeExcludingVat: ").append(toIndentedString(percentageFeeExcludingVat)).append("\n");
    sb.append("    percentageFeeExcludingVAT: ").append(toIndentedString(percentageFeeExcludingVAT)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
    sb.append("    totalFees: ").append(toIndentedString(totalFees)).append("\n");
    sb.append("    cashFeeChargedToCustomer: ").append(toIndentedString(cashFeeChargedToCustomer)).append("\n");
    sb.append("    netSales: ").append(toIndentedString(netSales)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    serviceChargeAmount: ").append(toIndentedString(serviceChargeAmount)).append("\n");
    sb.append("    serviceChargePercentage: ").append(toIndentedString(serviceChargePercentage)).append("\n");
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

