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
 * Holds the information for an order related to a payout
 */
@ApiModel(description = "Holds the information for an order related to a payout")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-10-26T11:54:25.251+01:00")
public class PayoutOrder {
  @SerializedName("OrderId")
  private Integer orderId = null;

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

  @SerializedName("ServiceChargeAmount")
  private Double serviceChargeAmount = null;

  @SerializedName("ServiceChargePercentage")
  private Double serviceChargePercentage = null;

  public PayoutOrder orderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * The id of the order
   * @return orderId
  **/
  @ApiModelProperty(value = "The id of the order")
  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public PayoutOrder payoutId(Integer payoutId) {
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

  public PayoutOrder orderDate(OffsetDateTime orderDate) {
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

  public PayoutOrder orderType(OrderTypeEnum orderType) {
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

  public PayoutOrder orderCurrency(OrderCurrencyEnum orderCurrency) {
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

  public PayoutOrder sales(Double sales) {
    this.sales = sales;
    return this;
  }

   /**
   * Order sales amount
   * @return sales
  **/
  @ApiModelProperty(value = "Order sales amount")
  public Double getSales() {
    return sales;
  }

  public void setSales(Double sales) {
    this.sales = sales;
  }

  public PayoutOrder salesTax(Double salesTax) {
    this.salesTax = salesTax;
    return this;
  }

   /**
   * Order sales tax amount
   * @return salesTax
  **/
  @ApiModelProperty(value = "Order sales tax amount")
  public Double getSalesTax() {
    return salesTax;
  }

  public void setSalesTax(Double salesTax) {
    this.salesTax = salesTax;
  }

  public PayoutOrder deliveryCharges(Double deliveryCharges) {
    this.deliveryCharges = deliveryCharges;
    return this;
  }

   /**
   * Order delivery charges
   * @return deliveryCharges
  **/
  @ApiModelProperty(value = "Order delivery charges")
  public Double getDeliveryCharges() {
    return deliveryCharges;
  }

  public void setDeliveryCharges(Double deliveryCharges) {
    this.deliveryCharges = deliveryCharges;
  }

  public PayoutOrder tips(Double tips) {
    this.tips = tips;
    return this;
  }

   /**
   * Order tips amount
   * @return tips
  **/
  @ApiModelProperty(value = "Order tips amount")
  public Double getTips() {
    return tips;
  }

  public void setTips(Double tips) {
    this.tips = tips;
  }

  public PayoutOrder voucher(Double voucher) {
    this.voucher = voucher;
    return this;
  }

   /**
   * Order voucher amount
   * @return voucher
  **/
  @ApiModelProperty(value = "Order voucher amount")
  public Double getVoucher() {
    return voucher;
  }

  public void setVoucher(Double voucher) {
    this.voucher = voucher;
  }

  public PayoutOrder flatFeeExcludingVat(Double flatFeeExcludingVat) {
    this.flatFeeExcludingVat = flatFeeExcludingVat;
    return this;
  }

   /**
   * Order flat fee amount excluding VAT
   * @return flatFeeExcludingVat
  **/
  @ApiModelProperty(value = "Order flat fee amount excluding VAT")
  public Double getFlatFeeExcludingVat() {
    return flatFeeExcludingVat;
  }

  public void setFlatFeeExcludingVat(Double flatFeeExcludingVat) {
    this.flatFeeExcludingVat = flatFeeExcludingVat;
  }

  public PayoutOrder flatFeeExcludingVAT(Double flatFeeExcludingVAT) {
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

  public PayoutOrder percentageFeeExcludingVat(Double percentageFeeExcludingVat) {
    this.percentageFeeExcludingVat = percentageFeeExcludingVat;
    return this;
  }

   /**
   * Order percentage fee excluding VAT
   * @return percentageFeeExcludingVat
  **/
  @ApiModelProperty(value = "Order percentage fee excluding VAT")
  public Double getPercentageFeeExcludingVat() {
    return percentageFeeExcludingVat;
  }

  public void setPercentageFeeExcludingVat(Double percentageFeeExcludingVat) {
    this.percentageFeeExcludingVat = percentageFeeExcludingVat;
  }

  public PayoutOrder percentageFeeExcludingVAT(Double percentageFeeExcludingVAT) {
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

  public PayoutOrder vat(Double vat) {
    this.vat = vat;
    return this;
  }

   /**
   * Order VAT amount
   * @return vat
  **/
  @ApiModelProperty(value = "Order VAT amount")
  public Double getVat() {
    return vat;
  }

  public void setVat(Double vat) {
    this.vat = vat;
  }

  public PayoutOrder totalFees(Double totalFees) {
    this.totalFees = totalFees;
    return this;
  }

   /**
   * Total order fees amount
   * @return totalFees
  **/
  @ApiModelProperty(value = "Total order fees amount")
  public Double getTotalFees() {
    return totalFees;
  }

  public void setTotalFees(Double totalFees) {
    this.totalFees = totalFees;
  }

  public PayoutOrder cashFeeChargedToCustomer(Double cashFeeChargedToCustomer) {
    this.cashFeeChargedToCustomer = cashFeeChargedToCustomer;
    return this;
  }

   /**
   * Cash fee charged to customer
   * @return cashFeeChargedToCustomer
  **/
  @ApiModelProperty(value = "Cash fee charged to customer")
  public Double getCashFeeChargedToCustomer() {
    return cashFeeChargedToCustomer;
  }

  public void setCashFeeChargedToCustomer(Double cashFeeChargedToCustomer) {
    this.cashFeeChargedToCustomer = cashFeeChargedToCustomer;
  }

  public PayoutOrder netSales(Double netSales) {
    this.netSales = netSales;
    return this;
  }

   /**
   * Order net sales amount
   * @return netSales
  **/
  @ApiModelProperty(value = "Order net sales amount")
  public Double getNetSales() {
    return netSales;
  }

  public void setNetSales(Double netSales) {
    this.netSales = netSales;
  }

  public PayoutOrder storeId(Integer storeId) {
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

  public PayoutOrder serviceChargeAmount(Double serviceChargeAmount) {
    this.serviceChargeAmount = serviceChargeAmount;
    return this;
  }

   /**
   * Order ServiceChargeAmount amount
   * @return serviceChargeAmount
  **/
  @ApiModelProperty(value = "Order ServiceChargeAmount amount")
  public Double getServiceChargeAmount() {
    return serviceChargeAmount;
  }

  public void setServiceChargeAmount(Double serviceChargeAmount) {
    this.serviceChargeAmount = serviceChargeAmount;
  }

  public PayoutOrder serviceChargePercentage(Double serviceChargePercentage) {
    this.serviceChargePercentage = serviceChargePercentage;
    return this;
  }

   /**
   * Order ServiceChargePercentage amount
   * @return serviceChargePercentage
  **/
  @ApiModelProperty(value = "Order ServiceChargePercentage amount")
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
    PayoutOrder payoutOrder = (PayoutOrder) o;
    return Objects.equals(this.orderId, payoutOrder.orderId) &&
        Objects.equals(this.payoutId, payoutOrder.payoutId) &&
        Objects.equals(this.orderDate, payoutOrder.orderDate) &&
        Objects.equals(this.orderType, payoutOrder.orderType) &&
        Objects.equals(this.orderCurrency, payoutOrder.orderCurrency) &&
        Objects.equals(this.sales, payoutOrder.sales) &&
        Objects.equals(this.salesTax, payoutOrder.salesTax) &&
        Objects.equals(this.deliveryCharges, payoutOrder.deliveryCharges) &&
        Objects.equals(this.tips, payoutOrder.tips) &&
        Objects.equals(this.voucher, payoutOrder.voucher) &&
        Objects.equals(this.flatFeeExcludingVat, payoutOrder.flatFeeExcludingVat) &&
        Objects.equals(this.flatFeeExcludingVAT, payoutOrder.flatFeeExcludingVAT) &&
        Objects.equals(this.percentageFeeExcludingVat, payoutOrder.percentageFeeExcludingVat) &&
        Objects.equals(this.percentageFeeExcludingVAT, payoutOrder.percentageFeeExcludingVAT) &&
        Objects.equals(this.vat, payoutOrder.vat) &&
        Objects.equals(this.totalFees, payoutOrder.totalFees) &&
        Objects.equals(this.cashFeeChargedToCustomer, payoutOrder.cashFeeChargedToCustomer) &&
        Objects.equals(this.netSales, payoutOrder.netSales) &&
        Objects.equals(this.storeId, payoutOrder.storeId) &&
        Objects.equals(this.serviceChargeAmount, payoutOrder.serviceChargeAmount) &&
        Objects.equals(this.serviceChargePercentage, payoutOrder.serviceChargePercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, payoutId, orderDate, orderType, orderCurrency, sales, salesTax, deliveryCharges, tips, voucher, flatFeeExcludingVat, flatFeeExcludingVAT, percentageFeeExcludingVat, percentageFeeExcludingVAT, vat, totalFees, cashFeeChargedToCustomer, netSales, storeId, serviceChargeAmount, serviceChargePercentage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutOrder {\n");
    
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
    sb.append("    percentageFeeExcludingVat: ").append(toIndentedString(percentageFeeExcludingVat)).append("\n");
    sb.append("    percentageFeeExcludingVAT: ").append(toIndentedString(percentageFeeExcludingVAT)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
    sb.append("    totalFees: ").append(toIndentedString(totalFees)).append("\n");
    sb.append("    cashFeeChargedToCustomer: ").append(toIndentedString(cashFeeChargedToCustomer)).append("\n");
    sb.append("    netSales: ").append(toIndentedString(netSales)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
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

