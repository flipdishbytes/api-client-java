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
 * Store end of day report
 */
@ApiModel(description = "Store end of day report")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class StoreEndOfDayReport {
  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("StoreName")
  private String storeName = null;

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

  @SerializedName("OrderCount")
  private Integer orderCount = null;

  @SerializedName("OrderValue")
  private Double orderValue = null;

  @SerializedName("OrderValueExcludingDeliveryFees")
  private Double orderValueExcludingDeliveryFees = null;

  @SerializedName("CollectionOrderCount")
  private Integer collectionOrderCount = null;

  @SerializedName("CollectionCashOrderCount")
  private Integer collectionCashOrderCount = null;

  @SerializedName("CollectionPaidOnlineOrderCount")
  private Integer collectionPaidOnlineOrderCount = null;

  @SerializedName("CollectionOrderValue")
  private Double collectionOrderValue = null;

  @SerializedName("CollectionCashOrderValue")
  private Double collectionCashOrderValue = null;

  @SerializedName("CollectionPaidOnlineOrderValue")
  private Double collectionPaidOnlineOrderValue = null;

  @SerializedName("DeliveryOrderCount")
  private Integer deliveryOrderCount = null;

  @SerializedName("DeliveryCashOrderCount")
  private Integer deliveryCashOrderCount = null;

  @SerializedName("DeliveryPaidOnlineOrderCount")
  private Integer deliveryPaidOnlineOrderCount = null;

  @SerializedName("DeliveryOrderValue")
  private Double deliveryOrderValue = null;

  @SerializedName("DeliveryCashOrderValue")
  private Double deliveryCashOrderValue = null;

  @SerializedName("DeliveryPaidOnlineOrderValue")
  private Double deliveryPaidOnlineOrderValue = null;

  @SerializedName("PaidOnlineOrderCount")
  private Integer paidOnlineOrderCount = null;

  @SerializedName("CashOrderCount")
  private Integer cashOrderCount = null;

  @SerializedName("PaidOnlineOrderValue")
  private Double paidOnlineOrderValue = null;

  @SerializedName("CashOrderValue")
  private Double cashOrderValue = null;

  @SerializedName("PaidOnlineOrderValueExcludingDeliveryFees")
  private Double paidOnlineOrderValueExcludingDeliveryFees = null;

  @SerializedName("CashOrderValueExcludingDeliveryFees")
  private Double cashOrderValueExcludingDeliveryFees = null;

  @SerializedName("StartTime")
  private OffsetDateTime startTime = null;

  @SerializedName("EndTime")
  private OffsetDateTime endTime = null;

  public StoreEndOfDayReport storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Store Id
   * @return storeId
  **/
  @ApiModelProperty(value = "Store Id")
  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public StoreEndOfDayReport storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

   /**
   * Store name
   * @return storeName
  **/
  @ApiModelProperty(value = "Store name")
  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public StoreEndOfDayReport currency(CurrencyEnum currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency
   * @return currency
  **/
  @ApiModelProperty(value = "Currency")
  public CurrencyEnum getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }

  public StoreEndOfDayReport orderCount(Integer orderCount) {
    this.orderCount = orderCount;
    return this;
  }

   /**
   * Order Count
   * @return orderCount
  **/
  @ApiModelProperty(value = "Order Count")
  public Integer getOrderCount() {
    return orderCount;
  }

  public void setOrderCount(Integer orderCount) {
    this.orderCount = orderCount;
  }

  public StoreEndOfDayReport orderValue(Double orderValue) {
    this.orderValue = orderValue;
    return this;
  }

   /**
   * Order Value
   * @return orderValue
  **/
  @ApiModelProperty(value = "Order Value")
  public Double getOrderValue() {
    return orderValue;
  }

  public void setOrderValue(Double orderValue) {
    this.orderValue = orderValue;
  }

  public StoreEndOfDayReport orderValueExcludingDeliveryFees(Double orderValueExcludingDeliveryFees) {
    this.orderValueExcludingDeliveryFees = orderValueExcludingDeliveryFees;
    return this;
  }

   /**
   * Order Value Excluding Delivery Fees
   * @return orderValueExcludingDeliveryFees
  **/
  @ApiModelProperty(value = "Order Value Excluding Delivery Fees")
  public Double getOrderValueExcludingDeliveryFees() {
    return orderValueExcludingDeliveryFees;
  }

  public void setOrderValueExcludingDeliveryFees(Double orderValueExcludingDeliveryFees) {
    this.orderValueExcludingDeliveryFees = orderValueExcludingDeliveryFees;
  }

  public StoreEndOfDayReport collectionOrderCount(Integer collectionOrderCount) {
    this.collectionOrderCount = collectionOrderCount;
    return this;
  }

   /**
   * Collection Order Count
   * @return collectionOrderCount
  **/
  @ApiModelProperty(value = "Collection Order Count")
  public Integer getCollectionOrderCount() {
    return collectionOrderCount;
  }

  public void setCollectionOrderCount(Integer collectionOrderCount) {
    this.collectionOrderCount = collectionOrderCount;
  }

  public StoreEndOfDayReport collectionCashOrderCount(Integer collectionCashOrderCount) {
    this.collectionCashOrderCount = collectionCashOrderCount;
    return this;
  }

   /**
   * Collection Cash Order Count
   * @return collectionCashOrderCount
  **/
  @ApiModelProperty(value = "Collection Cash Order Count")
  public Integer getCollectionCashOrderCount() {
    return collectionCashOrderCount;
  }

  public void setCollectionCashOrderCount(Integer collectionCashOrderCount) {
    this.collectionCashOrderCount = collectionCashOrderCount;
  }

  public StoreEndOfDayReport collectionPaidOnlineOrderCount(Integer collectionPaidOnlineOrderCount) {
    this.collectionPaidOnlineOrderCount = collectionPaidOnlineOrderCount;
    return this;
  }

   /**
   * Collection Paid Online Order Count
   * @return collectionPaidOnlineOrderCount
  **/
  @ApiModelProperty(value = "Collection Paid Online Order Count")
  public Integer getCollectionPaidOnlineOrderCount() {
    return collectionPaidOnlineOrderCount;
  }

  public void setCollectionPaidOnlineOrderCount(Integer collectionPaidOnlineOrderCount) {
    this.collectionPaidOnlineOrderCount = collectionPaidOnlineOrderCount;
  }

  public StoreEndOfDayReport collectionOrderValue(Double collectionOrderValue) {
    this.collectionOrderValue = collectionOrderValue;
    return this;
  }

   /**
   * Collection Order Value
   * @return collectionOrderValue
  **/
  @ApiModelProperty(value = "Collection Order Value")
  public Double getCollectionOrderValue() {
    return collectionOrderValue;
  }

  public void setCollectionOrderValue(Double collectionOrderValue) {
    this.collectionOrderValue = collectionOrderValue;
  }

  public StoreEndOfDayReport collectionCashOrderValue(Double collectionCashOrderValue) {
    this.collectionCashOrderValue = collectionCashOrderValue;
    return this;
  }

   /**
   * Collection Cash Order Value
   * @return collectionCashOrderValue
  **/
  @ApiModelProperty(value = "Collection Cash Order Value")
  public Double getCollectionCashOrderValue() {
    return collectionCashOrderValue;
  }

  public void setCollectionCashOrderValue(Double collectionCashOrderValue) {
    this.collectionCashOrderValue = collectionCashOrderValue;
  }

  public StoreEndOfDayReport collectionPaidOnlineOrderValue(Double collectionPaidOnlineOrderValue) {
    this.collectionPaidOnlineOrderValue = collectionPaidOnlineOrderValue;
    return this;
  }

   /**
   * Collection Paid Online Order Value
   * @return collectionPaidOnlineOrderValue
  **/
  @ApiModelProperty(value = "Collection Paid Online Order Value")
  public Double getCollectionPaidOnlineOrderValue() {
    return collectionPaidOnlineOrderValue;
  }

  public void setCollectionPaidOnlineOrderValue(Double collectionPaidOnlineOrderValue) {
    this.collectionPaidOnlineOrderValue = collectionPaidOnlineOrderValue;
  }

  public StoreEndOfDayReport deliveryOrderCount(Integer deliveryOrderCount) {
    this.deliveryOrderCount = deliveryOrderCount;
    return this;
  }

   /**
   * Delivery Order Count
   * @return deliveryOrderCount
  **/
  @ApiModelProperty(value = "Delivery Order Count")
  public Integer getDeliveryOrderCount() {
    return deliveryOrderCount;
  }

  public void setDeliveryOrderCount(Integer deliveryOrderCount) {
    this.deliveryOrderCount = deliveryOrderCount;
  }

  public StoreEndOfDayReport deliveryCashOrderCount(Integer deliveryCashOrderCount) {
    this.deliveryCashOrderCount = deliveryCashOrderCount;
    return this;
  }

   /**
   * Delivery Cash Order Count
   * @return deliveryCashOrderCount
  **/
  @ApiModelProperty(value = "Delivery Cash Order Count")
  public Integer getDeliveryCashOrderCount() {
    return deliveryCashOrderCount;
  }

  public void setDeliveryCashOrderCount(Integer deliveryCashOrderCount) {
    this.deliveryCashOrderCount = deliveryCashOrderCount;
  }

  public StoreEndOfDayReport deliveryPaidOnlineOrderCount(Integer deliveryPaidOnlineOrderCount) {
    this.deliveryPaidOnlineOrderCount = deliveryPaidOnlineOrderCount;
    return this;
  }

   /**
   * Delivery Paid Online Order Count
   * @return deliveryPaidOnlineOrderCount
  **/
  @ApiModelProperty(value = "Delivery Paid Online Order Count")
  public Integer getDeliveryPaidOnlineOrderCount() {
    return deliveryPaidOnlineOrderCount;
  }

  public void setDeliveryPaidOnlineOrderCount(Integer deliveryPaidOnlineOrderCount) {
    this.deliveryPaidOnlineOrderCount = deliveryPaidOnlineOrderCount;
  }

  public StoreEndOfDayReport deliveryOrderValue(Double deliveryOrderValue) {
    this.deliveryOrderValue = deliveryOrderValue;
    return this;
  }

   /**
   * Delivery Order Value
   * @return deliveryOrderValue
  **/
  @ApiModelProperty(value = "Delivery Order Value")
  public Double getDeliveryOrderValue() {
    return deliveryOrderValue;
  }

  public void setDeliveryOrderValue(Double deliveryOrderValue) {
    this.deliveryOrderValue = deliveryOrderValue;
  }

  public StoreEndOfDayReport deliveryCashOrderValue(Double deliveryCashOrderValue) {
    this.deliveryCashOrderValue = deliveryCashOrderValue;
    return this;
  }

   /**
   * Delivery Cash Order Value
   * @return deliveryCashOrderValue
  **/
  @ApiModelProperty(value = "Delivery Cash Order Value")
  public Double getDeliveryCashOrderValue() {
    return deliveryCashOrderValue;
  }

  public void setDeliveryCashOrderValue(Double deliveryCashOrderValue) {
    this.deliveryCashOrderValue = deliveryCashOrderValue;
  }

  public StoreEndOfDayReport deliveryPaidOnlineOrderValue(Double deliveryPaidOnlineOrderValue) {
    this.deliveryPaidOnlineOrderValue = deliveryPaidOnlineOrderValue;
    return this;
  }

   /**
   * Delivery Paid Online Order Value
   * @return deliveryPaidOnlineOrderValue
  **/
  @ApiModelProperty(value = "Delivery Paid Online Order Value")
  public Double getDeliveryPaidOnlineOrderValue() {
    return deliveryPaidOnlineOrderValue;
  }

  public void setDeliveryPaidOnlineOrderValue(Double deliveryPaidOnlineOrderValue) {
    this.deliveryPaidOnlineOrderValue = deliveryPaidOnlineOrderValue;
  }

  public StoreEndOfDayReport paidOnlineOrderCount(Integer paidOnlineOrderCount) {
    this.paidOnlineOrderCount = paidOnlineOrderCount;
    return this;
  }

   /**
   * Paid Online Order Count
   * @return paidOnlineOrderCount
  **/
  @ApiModelProperty(value = "Paid Online Order Count")
  public Integer getPaidOnlineOrderCount() {
    return paidOnlineOrderCount;
  }

  public void setPaidOnlineOrderCount(Integer paidOnlineOrderCount) {
    this.paidOnlineOrderCount = paidOnlineOrderCount;
  }

  public StoreEndOfDayReport cashOrderCount(Integer cashOrderCount) {
    this.cashOrderCount = cashOrderCount;
    return this;
  }

   /**
   * Cash Order Count
   * @return cashOrderCount
  **/
  @ApiModelProperty(value = "Cash Order Count")
  public Integer getCashOrderCount() {
    return cashOrderCount;
  }

  public void setCashOrderCount(Integer cashOrderCount) {
    this.cashOrderCount = cashOrderCount;
  }

  public StoreEndOfDayReport paidOnlineOrderValue(Double paidOnlineOrderValue) {
    this.paidOnlineOrderValue = paidOnlineOrderValue;
    return this;
  }

   /**
   * Paid Online Order Value
   * @return paidOnlineOrderValue
  **/
  @ApiModelProperty(value = "Paid Online Order Value")
  public Double getPaidOnlineOrderValue() {
    return paidOnlineOrderValue;
  }

  public void setPaidOnlineOrderValue(Double paidOnlineOrderValue) {
    this.paidOnlineOrderValue = paidOnlineOrderValue;
  }

  public StoreEndOfDayReport cashOrderValue(Double cashOrderValue) {
    this.cashOrderValue = cashOrderValue;
    return this;
  }

   /**
   * Cash Order Value
   * @return cashOrderValue
  **/
  @ApiModelProperty(value = "Cash Order Value")
  public Double getCashOrderValue() {
    return cashOrderValue;
  }

  public void setCashOrderValue(Double cashOrderValue) {
    this.cashOrderValue = cashOrderValue;
  }

  public StoreEndOfDayReport paidOnlineOrderValueExcludingDeliveryFees(Double paidOnlineOrderValueExcludingDeliveryFees) {
    this.paidOnlineOrderValueExcludingDeliveryFees = paidOnlineOrderValueExcludingDeliveryFees;
    return this;
  }

   /**
   * Paid Online Order Value Excluding Delivery Fees
   * @return paidOnlineOrderValueExcludingDeliveryFees
  **/
  @ApiModelProperty(value = "Paid Online Order Value Excluding Delivery Fees")
  public Double getPaidOnlineOrderValueExcludingDeliveryFees() {
    return paidOnlineOrderValueExcludingDeliveryFees;
  }

  public void setPaidOnlineOrderValueExcludingDeliveryFees(Double paidOnlineOrderValueExcludingDeliveryFees) {
    this.paidOnlineOrderValueExcludingDeliveryFees = paidOnlineOrderValueExcludingDeliveryFees;
  }

  public StoreEndOfDayReport cashOrderValueExcludingDeliveryFees(Double cashOrderValueExcludingDeliveryFees) {
    this.cashOrderValueExcludingDeliveryFees = cashOrderValueExcludingDeliveryFees;
    return this;
  }

   /**
   * Cash Order Value Excluding Delivery Fees
   * @return cashOrderValueExcludingDeliveryFees
  **/
  @ApiModelProperty(value = "Cash Order Value Excluding Delivery Fees")
  public Double getCashOrderValueExcludingDeliveryFees() {
    return cashOrderValueExcludingDeliveryFees;
  }

  public void setCashOrderValueExcludingDeliveryFees(Double cashOrderValueExcludingDeliveryFees) {
    this.cashOrderValueExcludingDeliveryFees = cashOrderValueExcludingDeliveryFees;
  }

  public StoreEndOfDayReport startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Start Time
   * @return startTime
  **/
  @ApiModelProperty(value = "Start Time")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public StoreEndOfDayReport endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * End Time
   * @return endTime
  **/
  @ApiModelProperty(value = "End Time")
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreEndOfDayReport storeEndOfDayReport = (StoreEndOfDayReport) o;
    return Objects.equals(this.storeId, storeEndOfDayReport.storeId) &&
        Objects.equals(this.storeName, storeEndOfDayReport.storeName) &&
        Objects.equals(this.currency, storeEndOfDayReport.currency) &&
        Objects.equals(this.orderCount, storeEndOfDayReport.orderCount) &&
        Objects.equals(this.orderValue, storeEndOfDayReport.orderValue) &&
        Objects.equals(this.orderValueExcludingDeliveryFees, storeEndOfDayReport.orderValueExcludingDeliveryFees) &&
        Objects.equals(this.collectionOrderCount, storeEndOfDayReport.collectionOrderCount) &&
        Objects.equals(this.collectionCashOrderCount, storeEndOfDayReport.collectionCashOrderCount) &&
        Objects.equals(this.collectionPaidOnlineOrderCount, storeEndOfDayReport.collectionPaidOnlineOrderCount) &&
        Objects.equals(this.collectionOrderValue, storeEndOfDayReport.collectionOrderValue) &&
        Objects.equals(this.collectionCashOrderValue, storeEndOfDayReport.collectionCashOrderValue) &&
        Objects.equals(this.collectionPaidOnlineOrderValue, storeEndOfDayReport.collectionPaidOnlineOrderValue) &&
        Objects.equals(this.deliveryOrderCount, storeEndOfDayReport.deliveryOrderCount) &&
        Objects.equals(this.deliveryCashOrderCount, storeEndOfDayReport.deliveryCashOrderCount) &&
        Objects.equals(this.deliveryPaidOnlineOrderCount, storeEndOfDayReport.deliveryPaidOnlineOrderCount) &&
        Objects.equals(this.deliveryOrderValue, storeEndOfDayReport.deliveryOrderValue) &&
        Objects.equals(this.deliveryCashOrderValue, storeEndOfDayReport.deliveryCashOrderValue) &&
        Objects.equals(this.deliveryPaidOnlineOrderValue, storeEndOfDayReport.deliveryPaidOnlineOrderValue) &&
        Objects.equals(this.paidOnlineOrderCount, storeEndOfDayReport.paidOnlineOrderCount) &&
        Objects.equals(this.cashOrderCount, storeEndOfDayReport.cashOrderCount) &&
        Objects.equals(this.paidOnlineOrderValue, storeEndOfDayReport.paidOnlineOrderValue) &&
        Objects.equals(this.cashOrderValue, storeEndOfDayReport.cashOrderValue) &&
        Objects.equals(this.paidOnlineOrderValueExcludingDeliveryFees, storeEndOfDayReport.paidOnlineOrderValueExcludingDeliveryFees) &&
        Objects.equals(this.cashOrderValueExcludingDeliveryFees, storeEndOfDayReport.cashOrderValueExcludingDeliveryFees) &&
        Objects.equals(this.startTime, storeEndOfDayReport.startTime) &&
        Objects.equals(this.endTime, storeEndOfDayReport.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, storeName, currency, orderCount, orderValue, orderValueExcludingDeliveryFees, collectionOrderCount, collectionCashOrderCount, collectionPaidOnlineOrderCount, collectionOrderValue, collectionCashOrderValue, collectionPaidOnlineOrderValue, deliveryOrderCount, deliveryCashOrderCount, deliveryPaidOnlineOrderCount, deliveryOrderValue, deliveryCashOrderValue, deliveryPaidOnlineOrderValue, paidOnlineOrderCount, cashOrderCount, paidOnlineOrderValue, cashOrderValue, paidOnlineOrderValueExcludingDeliveryFees, cashOrderValueExcludingDeliveryFees, startTime, endTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreEndOfDayReport {\n");
    
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    orderCount: ").append(toIndentedString(orderCount)).append("\n");
    sb.append("    orderValue: ").append(toIndentedString(orderValue)).append("\n");
    sb.append("    orderValueExcludingDeliveryFees: ").append(toIndentedString(orderValueExcludingDeliveryFees)).append("\n");
    sb.append("    collectionOrderCount: ").append(toIndentedString(collectionOrderCount)).append("\n");
    sb.append("    collectionCashOrderCount: ").append(toIndentedString(collectionCashOrderCount)).append("\n");
    sb.append("    collectionPaidOnlineOrderCount: ").append(toIndentedString(collectionPaidOnlineOrderCount)).append("\n");
    sb.append("    collectionOrderValue: ").append(toIndentedString(collectionOrderValue)).append("\n");
    sb.append("    collectionCashOrderValue: ").append(toIndentedString(collectionCashOrderValue)).append("\n");
    sb.append("    collectionPaidOnlineOrderValue: ").append(toIndentedString(collectionPaidOnlineOrderValue)).append("\n");
    sb.append("    deliveryOrderCount: ").append(toIndentedString(deliveryOrderCount)).append("\n");
    sb.append("    deliveryCashOrderCount: ").append(toIndentedString(deliveryCashOrderCount)).append("\n");
    sb.append("    deliveryPaidOnlineOrderCount: ").append(toIndentedString(deliveryPaidOnlineOrderCount)).append("\n");
    sb.append("    deliveryOrderValue: ").append(toIndentedString(deliveryOrderValue)).append("\n");
    sb.append("    deliveryCashOrderValue: ").append(toIndentedString(deliveryCashOrderValue)).append("\n");
    sb.append("    deliveryPaidOnlineOrderValue: ").append(toIndentedString(deliveryPaidOnlineOrderValue)).append("\n");
    sb.append("    paidOnlineOrderCount: ").append(toIndentedString(paidOnlineOrderCount)).append("\n");
    sb.append("    cashOrderCount: ").append(toIndentedString(cashOrderCount)).append("\n");
    sb.append("    paidOnlineOrderValue: ").append(toIndentedString(paidOnlineOrderValue)).append("\n");
    sb.append("    cashOrderValue: ").append(toIndentedString(cashOrderValue)).append("\n");
    sb.append("    paidOnlineOrderValueExcludingDeliveryFees: ").append(toIndentedString(paidOnlineOrderValueExcludingDeliveryFees)).append("\n");
    sb.append("    cashOrderValueExcludingDeliveryFees: ").append(toIndentedString(cashOrderValueExcludingDeliveryFees)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

