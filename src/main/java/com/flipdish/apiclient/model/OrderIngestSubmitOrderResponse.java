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
import com.flipdish.apiclient.model.Price;
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
 * OrderIngestSubmitOrderResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-17T10:52:00.997Z")
public class OrderIngestSubmitOrderResponse {
  @SerializedName("OrderId")
  private Integer orderId = null;

  @SerializedName("ReceiptUrl")
  private String receiptUrl = null;

  /**
   * Gets or Sets currencyCode
   */
  @JsonAdapter(CurrencyCodeEnum.Adapter.class)
  public enum CurrencyCodeEnum {
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

    CurrencyCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CurrencyCodeEnum fromValue(String text) {
      for (CurrencyCodeEnum b : CurrencyCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CurrencyCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CurrencyCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CurrencyCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CurrencyCodeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("CurrencyCode")
  private CurrencyCodeEnum currencyCode = null;

  @SerializedName("TotalPrice")
  private Price totalPrice = null;

  @SerializedName("DeliveryFee")
  private Price deliveryFee = null;

  @SerializedName("EstimatedDeliveryTime")
  private OffsetDateTime estimatedDeliveryTime = null;

  @SerializedName("ChannelOrderId")
  private String channelOrderId = null;

  public OrderIngestSubmitOrderResponse orderId(Integer orderId) {
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

  public OrderIngestSubmitOrderResponse receiptUrl(String receiptUrl) {
    this.receiptUrl = receiptUrl;
    return this;
  }

   /**
   * Get receiptUrl
   * @return receiptUrl
  **/
  @ApiModelProperty(value = "")
  public String getReceiptUrl() {
    return receiptUrl;
  }

  public void setReceiptUrl(String receiptUrl) {
    this.receiptUrl = receiptUrl;
  }

  public OrderIngestSubmitOrderResponse currencyCode(CurrencyCodeEnum currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(value = "")
  public CurrencyCodeEnum getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCodeEnum currencyCode) {
    this.currencyCode = currencyCode;
  }

  public OrderIngestSubmitOrderResponse totalPrice(Price totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * Get totalPrice
   * @return totalPrice
  **/
  @ApiModelProperty(value = "")
  public Price getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Price totalPrice) {
    this.totalPrice = totalPrice;
  }

  public OrderIngestSubmitOrderResponse deliveryFee(Price deliveryFee) {
    this.deliveryFee = deliveryFee;
    return this;
  }

   /**
   * Get deliveryFee
   * @return deliveryFee
  **/
  @ApiModelProperty(value = "")
  public Price getDeliveryFee() {
    return deliveryFee;
  }

  public void setDeliveryFee(Price deliveryFee) {
    this.deliveryFee = deliveryFee;
  }

  public OrderIngestSubmitOrderResponse estimatedDeliveryTime(OffsetDateTime estimatedDeliveryTime) {
    this.estimatedDeliveryTime = estimatedDeliveryTime;
    return this;
  }

   /**
   * Get estimatedDeliveryTime
   * @return estimatedDeliveryTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEstimatedDeliveryTime() {
    return estimatedDeliveryTime;
  }

  public void setEstimatedDeliveryTime(OffsetDateTime estimatedDeliveryTime) {
    this.estimatedDeliveryTime = estimatedDeliveryTime;
  }

  public OrderIngestSubmitOrderResponse channelOrderId(String channelOrderId) {
    this.channelOrderId = channelOrderId;
    return this;
  }

   /**
   * Get channelOrderId
   * @return channelOrderId
  **/
  @ApiModelProperty(value = "")
  public String getChannelOrderId() {
    return channelOrderId;
  }

  public void setChannelOrderId(String channelOrderId) {
    this.channelOrderId = channelOrderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderIngestSubmitOrderResponse orderIngestSubmitOrderResponse = (OrderIngestSubmitOrderResponse) o;
    return Objects.equals(this.orderId, orderIngestSubmitOrderResponse.orderId) &&
        Objects.equals(this.receiptUrl, orderIngestSubmitOrderResponse.receiptUrl) &&
        Objects.equals(this.currencyCode, orderIngestSubmitOrderResponse.currencyCode) &&
        Objects.equals(this.totalPrice, orderIngestSubmitOrderResponse.totalPrice) &&
        Objects.equals(this.deliveryFee, orderIngestSubmitOrderResponse.deliveryFee) &&
        Objects.equals(this.estimatedDeliveryTime, orderIngestSubmitOrderResponse.estimatedDeliveryTime) &&
        Objects.equals(this.channelOrderId, orderIngestSubmitOrderResponse.channelOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, receiptUrl, currencyCode, totalPrice, deliveryFee, estimatedDeliveryTime, channelOrderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderIngestSubmitOrderResponse {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    receiptUrl: ").append(toIndentedString(receiptUrl)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    deliveryFee: ").append(toIndentedString(deliveryFee)).append("\n");
    sb.append("    estimatedDeliveryTime: ").append(toIndentedString(estimatedDeliveryTime)).append("\n");
    sb.append("    channelOrderId: ").append(toIndentedString(channelOrderId)).append("\n");
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

