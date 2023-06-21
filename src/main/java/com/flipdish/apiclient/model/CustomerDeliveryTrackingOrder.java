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
import com.flipdish.apiclient.model.CustomerDeliveryTrackingOrderLine;
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
 * Defines the order data required for customer driver tracking
 */
@ApiModel(description = "Defines the order data required for customer driver tracking")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-21T12:49:34.092+01:00")
public class CustomerDeliveryTrackingOrder {
  @SerializedName("OrderId")
  private Integer orderId = null;

  @SerializedName("Address")
  private String address = null;

  @SerializedName("DeliveryNotes")
  private String deliveryNotes = null;

  @SerializedName("StorePhoneNumber")
  private String storePhoneNumber = null;

  @SerializedName("AppIconUrl")
  private String appIconUrl = null;

  @SerializedName("OrderTrackingCode")
  private String orderTrackingCode = null;

  @SerializedName("PaymentMethodDescription")
  private String paymentMethodDescription = null;

  @SerializedName("LastFourDigits")
  private String lastFourDigits = null;

  @SerializedName("OrderLines")
  private List<CustomerDeliveryTrackingOrderLine> orderLines = null;

  @SerializedName("TotalAmount")
  private Double totalAmount = null;

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

  @SerializedName("Latitude")
  private Double latitude = null;

  @SerializedName("Longitude")
  private Double longitude = null;

  @SerializedName("Placed")
  private OffsetDateTime placed = null;

  @SerializedName("RequestedFor")
  private OffsetDateTime requestedFor = null;

  @SerializedName("DriverId")
  private Integer driverId = null;

  @SerializedName("DriverName")
  private String driverName = null;

  @SerializedName("DriverImage")
  private String driverImage = null;

  @SerializedName("EstimatedMinutesForDelivery")
  private Integer estimatedMinutesForDelivery = null;

  public CustomerDeliveryTrackingOrder orderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Order Id
   * @return orderId
  **/
  @ApiModelProperty(value = "Order Id")
  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public CustomerDeliveryTrackingOrder address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Pretified address string in country format
   * @return address
  **/
  @ApiModelProperty(value = "Pretified address string in country format")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public CustomerDeliveryTrackingOrder deliveryNotes(String deliveryNotes) {
    this.deliveryNotes = deliveryNotes;
    return this;
  }

   /**
   * Delivery Notes
   * @return deliveryNotes
  **/
  @ApiModelProperty(value = "Delivery Notes")
  public String getDeliveryNotes() {
    return deliveryNotes;
  }

  public void setDeliveryNotes(String deliveryNotes) {
    this.deliveryNotes = deliveryNotes;
  }

  public CustomerDeliveryTrackingOrder storePhoneNumber(String storePhoneNumber) {
    this.storePhoneNumber = storePhoneNumber;
    return this;
  }

   /**
   * Phone number of the store
   * @return storePhoneNumber
  **/
  @ApiModelProperty(value = "Phone number of the store")
  public String getStorePhoneNumber() {
    return storePhoneNumber;
  }

  public void setStorePhoneNumber(String storePhoneNumber) {
    this.storePhoneNumber = storePhoneNumber;
  }

  public CustomerDeliveryTrackingOrder appIconUrl(String appIconUrl) {
    this.appIconUrl = appIconUrl;
    return this;
  }

   /**
   * App Icon of the store
   * @return appIconUrl
  **/
  @ApiModelProperty(value = "App Icon of the store")
  public String getAppIconUrl() {
    return appIconUrl;
  }

  public void setAppIconUrl(String appIconUrl) {
    this.appIconUrl = appIconUrl;
  }

  public CustomerDeliveryTrackingOrder orderTrackingCode(String orderTrackingCode) {
    this.orderTrackingCode = orderTrackingCode;
    return this;
  }

   /**
   * Order Tracking Code
   * @return orderTrackingCode
  **/
  @ApiModelProperty(value = "Order Tracking Code")
  public String getOrderTrackingCode() {
    return orderTrackingCode;
  }

  public void setOrderTrackingCode(String orderTrackingCode) {
    this.orderTrackingCode = orderTrackingCode;
  }

  public CustomerDeliveryTrackingOrder paymentMethodDescription(String paymentMethodDescription) {
    this.paymentMethodDescription = paymentMethodDescription;
    return this;
  }

   /**
   * Payment method description i.e Cash/Card/iDeal/Paypal
   * @return paymentMethodDescription
  **/
  @ApiModelProperty(value = "Payment method description i.e Cash/Card/iDeal/Paypal")
  public String getPaymentMethodDescription() {
    return paymentMethodDescription;
  }

  public void setPaymentMethodDescription(String paymentMethodDescription) {
    this.paymentMethodDescription = paymentMethodDescription;
  }

  public CustomerDeliveryTrackingOrder lastFourDigits(String lastFourDigits) {
    this.lastFourDigits = lastFourDigits;
    return this;
  }

   /**
   * Last 4 digits of the card if applicable otherwise null
   * @return lastFourDigits
  **/
  @ApiModelProperty(value = "Last 4 digits of the card if applicable otherwise null")
  public String getLastFourDigits() {
    return lastFourDigits;
  }

  public void setLastFourDigits(String lastFourDigits) {
    this.lastFourDigits = lastFourDigits;
  }

  public CustomerDeliveryTrackingOrder orderLines(List<CustomerDeliveryTrackingOrderLine> orderLines) {
    this.orderLines = orderLines;
    return this;
  }

  public CustomerDeliveryTrackingOrder addOrderLinesItem(CustomerDeliveryTrackingOrderLine orderLinesItem) {
    if (this.orderLines == null) {
      this.orderLines = new ArrayList<CustomerDeliveryTrackingOrderLine>();
    }
    this.orderLines.add(orderLinesItem);
    return this;
  }

   /**
   * Order lines of the order
   * @return orderLines
  **/
  @ApiModelProperty(value = "Order lines of the order")
  public List<CustomerDeliveryTrackingOrderLine> getOrderLines() {
    return orderLines;
  }

  public void setOrderLines(List<CustomerDeliveryTrackingOrderLine> orderLines) {
    this.orderLines = orderLines;
  }

  public CustomerDeliveryTrackingOrder totalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Total amount for the order including tax
   * @return totalAmount
  **/
  @ApiModelProperty(value = "Total amount for the order including tax")
  public Double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public CustomerDeliveryTrackingOrder currency(CurrencyEnum currency) {
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

  public CustomerDeliveryTrackingOrder latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Customer Location Latitude
   * @return latitude
  **/
  @ApiModelProperty(value = "Customer Location Latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public CustomerDeliveryTrackingOrder longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Customer Location Longitude
   * @return longitude
  **/
  @ApiModelProperty(value = "Customer Location Longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public CustomerDeliveryTrackingOrder placed(OffsetDateTime placed) {
    this.placed = placed;
    return this;
  }

   /**
   * Order placed time
   * @return placed
  **/
  @ApiModelProperty(value = "Order placed time")
  public OffsetDateTime getPlaced() {
    return placed;
  }

  public void setPlaced(OffsetDateTime placed) {
    this.placed = placed;
  }

  public CustomerDeliveryTrackingOrder requestedFor(OffsetDateTime requestedFor) {
    this.requestedFor = requestedFor;
    return this;
  }

   /**
   * Order requested for
   * @return requestedFor
  **/
  @ApiModelProperty(value = "Order requested for")
  public OffsetDateTime getRequestedFor() {
    return requestedFor;
  }

  public void setRequestedFor(OffsetDateTime requestedFor) {
    this.requestedFor = requestedFor;
  }

  public CustomerDeliveryTrackingOrder driverId(Integer driverId) {
    this.driverId = driverId;
    return this;
  }

   /**
   * Driver Id
   * @return driverId
  **/
  @ApiModelProperty(value = "Driver Id")
  public Integer getDriverId() {
    return driverId;
  }

  public void setDriverId(Integer driverId) {
    this.driverId = driverId;
  }

  public CustomerDeliveryTrackingOrder driverName(String driverName) {
    this.driverName = driverName;
    return this;
  }

   /**
   * Driver Name
   * @return driverName
  **/
  @ApiModelProperty(value = "Driver Name")
  public String getDriverName() {
    return driverName;
  }

  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

  public CustomerDeliveryTrackingOrder driverImage(String driverImage) {
    this.driverImage = driverImage;
    return this;
  }

   /**
   * Driver Image
   * @return driverImage
  **/
  @ApiModelProperty(value = "Driver Image")
  public String getDriverImage() {
    return driverImage;
  }

  public void setDriverImage(String driverImage) {
    this.driverImage = driverImage;
  }

  public CustomerDeliveryTrackingOrder estimatedMinutesForDelivery(Integer estimatedMinutesForDelivery) {
    this.estimatedMinutesForDelivery = estimatedMinutesForDelivery;
    return this;
  }

   /**
   * 
   * @return estimatedMinutesForDelivery
  **/
  @ApiModelProperty(value = "")
  public Integer getEstimatedMinutesForDelivery() {
    return estimatedMinutesForDelivery;
  }

  public void setEstimatedMinutesForDelivery(Integer estimatedMinutesForDelivery) {
    this.estimatedMinutesForDelivery = estimatedMinutesForDelivery;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerDeliveryTrackingOrder customerDeliveryTrackingOrder = (CustomerDeliveryTrackingOrder) o;
    return Objects.equals(this.orderId, customerDeliveryTrackingOrder.orderId) &&
        Objects.equals(this.address, customerDeliveryTrackingOrder.address) &&
        Objects.equals(this.deliveryNotes, customerDeliveryTrackingOrder.deliveryNotes) &&
        Objects.equals(this.storePhoneNumber, customerDeliveryTrackingOrder.storePhoneNumber) &&
        Objects.equals(this.appIconUrl, customerDeliveryTrackingOrder.appIconUrl) &&
        Objects.equals(this.orderTrackingCode, customerDeliveryTrackingOrder.orderTrackingCode) &&
        Objects.equals(this.paymentMethodDescription, customerDeliveryTrackingOrder.paymentMethodDescription) &&
        Objects.equals(this.lastFourDigits, customerDeliveryTrackingOrder.lastFourDigits) &&
        Objects.equals(this.orderLines, customerDeliveryTrackingOrder.orderLines) &&
        Objects.equals(this.totalAmount, customerDeliveryTrackingOrder.totalAmount) &&
        Objects.equals(this.currency, customerDeliveryTrackingOrder.currency) &&
        Objects.equals(this.latitude, customerDeliveryTrackingOrder.latitude) &&
        Objects.equals(this.longitude, customerDeliveryTrackingOrder.longitude) &&
        Objects.equals(this.placed, customerDeliveryTrackingOrder.placed) &&
        Objects.equals(this.requestedFor, customerDeliveryTrackingOrder.requestedFor) &&
        Objects.equals(this.driverId, customerDeliveryTrackingOrder.driverId) &&
        Objects.equals(this.driverName, customerDeliveryTrackingOrder.driverName) &&
        Objects.equals(this.driverImage, customerDeliveryTrackingOrder.driverImage) &&
        Objects.equals(this.estimatedMinutesForDelivery, customerDeliveryTrackingOrder.estimatedMinutesForDelivery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, address, deliveryNotes, storePhoneNumber, appIconUrl, orderTrackingCode, paymentMethodDescription, lastFourDigits, orderLines, totalAmount, currency, latitude, longitude, placed, requestedFor, driverId, driverName, driverImage, estimatedMinutesForDelivery);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerDeliveryTrackingOrder {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    deliveryNotes: ").append(toIndentedString(deliveryNotes)).append("\n");
    sb.append("    storePhoneNumber: ").append(toIndentedString(storePhoneNumber)).append("\n");
    sb.append("    appIconUrl: ").append(toIndentedString(appIconUrl)).append("\n");
    sb.append("    orderTrackingCode: ").append(toIndentedString(orderTrackingCode)).append("\n");
    sb.append("    paymentMethodDescription: ").append(toIndentedString(paymentMethodDescription)).append("\n");
    sb.append("    lastFourDigits: ").append(toIndentedString(lastFourDigits)).append("\n");
    sb.append("    orderLines: ").append(toIndentedString(orderLines)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    placed: ").append(toIndentedString(placed)).append("\n");
    sb.append("    requestedFor: ").append(toIndentedString(requestedFor)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    driverName: ").append(toIndentedString(driverName)).append("\n");
    sb.append("    driverImage: ").append(toIndentedString(driverImage)).append("\n");
    sb.append("    estimatedMinutesForDelivery: ").append(toIndentedString(estimatedMinutesForDelivery)).append("\n");
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

