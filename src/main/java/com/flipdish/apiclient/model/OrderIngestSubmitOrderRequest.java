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
import com.flipdish.apiclient.model.Cart;
import com.flipdish.apiclient.model.Contact;
import com.flipdish.apiclient.model.FulfillmentInfo;
import com.flipdish.apiclient.model.PaymentInfo;
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
 * Generic model for ingesting external orders from   3rd parties into the system
 */
@ApiModel(description = "Generic model for ingesting external orders from   3rd parties into the system")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-26T12:31:40.646+01:00")
public class OrderIngestSubmitOrderRequest {
  /**
   * [Required] Indicated the name from where the request is coming from
   */
  @JsonAdapter(AppTypeEnum.Adapter.class)
  public enum AppTypeEnum {
    UNKNOWN("Unknown"),
    
    IOS("Ios"),
    
    ANDROID("Android"),
    
    WEB("Web"),
    
    KIOSK("Kiosk"),
    
    POS("Pos"),
    
    TELEPHONECALL("TelephoneCall"),
    
    SMS("Sms"),
    
    PWAANDROID("PwaAndroid"),
    
    PWAIOS("PwaIos"),
    
    GOOGLE("Google");

    private String value;

    AppTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AppTypeEnum fromValue(String text) {
      for (AppTypeEnum b : AppTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AppTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AppTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AppTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AppTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("AppType")
  private AppTypeEnum appType = null;

  @SerializedName("StoreId")
  private Integer storeId = null;

  /**
   * [Required] Currency Code  These must match three letter codes ISO 4127 http://en.wikipedia.org/wiki/ISO_4217
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

  @SerializedName("Cart")
  private Cart cart = null;

  @SerializedName("FulfillmentInfo")
  private FulfillmentInfo fulfillmentInfo = null;

  @SerializedName("ChannelOrderId")
  private String channelOrderId = null;

  @SerializedName("ChannelPublicOrderId")
  private String channelPublicOrderId = null;

  @SerializedName("OrderDateUtc")
  private OffsetDateTime orderDateUtc = null;

  @SerializedName("PaymentInfo")
  private PaymentInfo paymentInfo = null;

  @SerializedName("Contact")
  private Contact contact = null;

  @SerializedName("TipAmount")
  private Double tipAmount = null;

  public OrderIngestSubmitOrderRequest appType(AppTypeEnum appType) {
    this.appType = appType;
    return this;
  }

   /**
   * [Required] Indicated the name from where the request is coming from
   * @return appType
  **/
  @ApiModelProperty(value = "[Required] Indicated the name from where the request is coming from")
  public AppTypeEnum getAppType() {
    return appType;
  }

  public void setAppType(AppTypeEnum appType) {
    this.appType = appType;
  }

  public OrderIngestSubmitOrderRequest storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * [Required] Store Id
   * @return storeId
  **/
  @ApiModelProperty(value = "[Required] Store Id")
  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public OrderIngestSubmitOrderRequest currencyCode(CurrencyCodeEnum currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * [Required] Currency Code  These must match three letter codes ISO 4127 http://en.wikipedia.org/wiki/ISO_4217
   * @return currencyCode
  **/
  @ApiModelProperty(value = "[Required] Currency Code  These must match three letter codes ISO 4127 http://en.wikipedia.org/wiki/ISO_4217")
  public CurrencyCodeEnum getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCodeEnum currencyCode) {
    this.currencyCode = currencyCode;
  }

  public OrderIngestSubmitOrderRequest cart(Cart cart) {
    this.cart = cart;
    return this;
  }

   /**
   * [Required] Cart of the user
   * @return cart
  **/
  @ApiModelProperty(value = "[Required] Cart of the user")
  public Cart getCart() {
    return cart;
  }

  public void setCart(Cart cart) {
    this.cart = cart;
  }

  public OrderIngestSubmitOrderRequest fulfillmentInfo(FulfillmentInfo fulfillmentInfo) {
    this.fulfillmentInfo = fulfillmentInfo;
    return this;
  }

   /**
   * [Required] Relevant fulfillment Information
   * @return fulfillmentInfo
  **/
  @ApiModelProperty(value = "[Required] Relevant fulfillment Information")
  public FulfillmentInfo getFulfillmentInfo() {
    return fulfillmentInfo;
  }

  public void setFulfillmentInfo(FulfillmentInfo fulfillmentInfo) {
    this.fulfillmentInfo = fulfillmentInfo;
  }

  public OrderIngestSubmitOrderRequest channelOrderId(String channelOrderId) {
    this.channelOrderId = channelOrderId;
    return this;
  }

   /**
   * [Required] Order ID in the external System
   * @return channelOrderId
  **/
  @ApiModelProperty(value = "[Required] Order ID in the external System")
  public String getChannelOrderId() {
    return channelOrderId;
  }

  public void setChannelOrderId(String channelOrderId) {
    this.channelOrderId = channelOrderId;
  }

  public OrderIngestSubmitOrderRequest channelPublicOrderId(String channelPublicOrderId) {
    this.channelPublicOrderId = channelPublicOrderId;
    return this;
  }

   /**
   * [Optional] Public Order ID in the external System
   * @return channelPublicOrderId
  **/
  @ApiModelProperty(value = "[Optional] Public Order ID in the external System")
  public String getChannelPublicOrderId() {
    return channelPublicOrderId;
  }

  public void setChannelPublicOrderId(String channelPublicOrderId) {
    this.channelPublicOrderId = channelPublicOrderId;
  }

  public OrderIngestSubmitOrderRequest orderDateUtc(OffsetDateTime orderDateUtc) {
    this.orderDateUtc = orderDateUtc;
    return this;
  }

   /**
   * Date the order was placed at in UTC  [Required]
   * @return orderDateUtc
  **/
  @ApiModelProperty(value = "Date the order was placed at in UTC  [Required]")
  public OffsetDateTime getOrderDateUtc() {
    return orderDateUtc;
  }

  public void setOrderDateUtc(OffsetDateTime orderDateUtc) {
    this.orderDateUtc = orderDateUtc;
  }

  public OrderIngestSubmitOrderRequest paymentInfo(PaymentInfo paymentInfo) {
    this.paymentInfo = paymentInfo;
    return this;
  }

   /**
   * Payment Information  [Required]
   * @return paymentInfo
  **/
  @ApiModelProperty(value = "Payment Information  [Required]")
  public PaymentInfo getPaymentInfo() {
    return paymentInfo;
  }

  public void setPaymentInfo(PaymentInfo paymentInfo) {
    this.paymentInfo = paymentInfo;
  }

  public OrderIngestSubmitOrderRequest contact(Contact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Contact Information  [Required]
   * @return contact
  **/
  @ApiModelProperty(value = "Contact Information  [Required]")
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public OrderIngestSubmitOrderRequest tipAmount(Double tipAmount) {
    this.tipAmount = tipAmount;
    return this;
  }

   /**
   * Tip amount
   * @return tipAmount
  **/
  @ApiModelProperty(value = "Tip amount")
  public Double getTipAmount() {
    return tipAmount;
  }

  public void setTipAmount(Double tipAmount) {
    this.tipAmount = tipAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderIngestSubmitOrderRequest orderIngestSubmitOrderRequest = (OrderIngestSubmitOrderRequest) o;
    return Objects.equals(this.appType, orderIngestSubmitOrderRequest.appType) &&
        Objects.equals(this.storeId, orderIngestSubmitOrderRequest.storeId) &&
        Objects.equals(this.currencyCode, orderIngestSubmitOrderRequest.currencyCode) &&
        Objects.equals(this.cart, orderIngestSubmitOrderRequest.cart) &&
        Objects.equals(this.fulfillmentInfo, orderIngestSubmitOrderRequest.fulfillmentInfo) &&
        Objects.equals(this.channelOrderId, orderIngestSubmitOrderRequest.channelOrderId) &&
        Objects.equals(this.channelPublicOrderId, orderIngestSubmitOrderRequest.channelPublicOrderId) &&
        Objects.equals(this.orderDateUtc, orderIngestSubmitOrderRequest.orderDateUtc) &&
        Objects.equals(this.paymentInfo, orderIngestSubmitOrderRequest.paymentInfo) &&
        Objects.equals(this.contact, orderIngestSubmitOrderRequest.contact) &&
        Objects.equals(this.tipAmount, orderIngestSubmitOrderRequest.tipAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appType, storeId, currencyCode, cart, fulfillmentInfo, channelOrderId, channelPublicOrderId, orderDateUtc, paymentInfo, contact, tipAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderIngestSubmitOrderRequest {\n");
    
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    cart: ").append(toIndentedString(cart)).append("\n");
    sb.append("    fulfillmentInfo: ").append(toIndentedString(fulfillmentInfo)).append("\n");
    sb.append("    channelOrderId: ").append(toIndentedString(channelOrderId)).append("\n");
    sb.append("    channelPublicOrderId: ").append(toIndentedString(channelPublicOrderId)).append("\n");
    sb.append("    orderDateUtc: ").append(toIndentedString(orderDateUtc)).append("\n");
    sb.append("    paymentInfo: ").append(toIndentedString(paymentInfo)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    tipAmount: ").append(toIndentedString(tipAmount)).append("\n");
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

