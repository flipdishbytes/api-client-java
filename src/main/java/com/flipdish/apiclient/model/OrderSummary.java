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
import com.flipdish.apiclient.model.Channel;
import com.flipdish.apiclient.model.DeliveryLocation;
import com.flipdish.apiclient.model.OrderBatchSummary;
import com.flipdish.apiclient.model.OrderDropOffLocation;
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
 * Order summary
 */
@ApiModel(description = "Order summary")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-07T13:15:00.892Z")
public class OrderSummary {
  @SerializedName("OrderId")
  private Integer orderId = null;

  /**
   * Delivery type
   */
  @JsonAdapter(DeliveryTypeEnum.Adapter.class)
  public enum DeliveryTypeEnum {
    DELIVERY("Delivery"),
    
    PICKUP("Pickup");

    private String value;

    DeliveryTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeliveryTypeEnum fromValue(String text) {
      for (DeliveryTypeEnum b : DeliveryTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DeliveryTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeliveryTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeliveryTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DeliveryTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("DeliveryType")
  private DeliveryTypeEnum deliveryType = null;

  /**
   * Pickup location type
   */
  @JsonAdapter(PickupLocationTypeEnum.Adapter.class)
  public enum PickupLocationTypeEnum {
    TAKEOUT("TakeOut"),
    
    TABLESERVICE("TableService"),
    
    DINEIN("DineIn");

    private String value;

    PickupLocationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PickupLocationTypeEnum fromValue(String text) {
      for (PickupLocationTypeEnum b : PickupLocationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PickupLocationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PickupLocationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PickupLocationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PickupLocationTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("PickupLocationType")
  private PickupLocationTypeEnum pickupLocationType = null;

  /**
   * Table service category
   */
  @JsonAdapter(TableServiceCatagoryEnum.Adapter.class)
  public enum TableServiceCatagoryEnum {
    GENERIC("Generic"),
    
    VILLA("Villa"),
    
    HOUSE("House"),
    
    ROOM("Room"),
    
    AREA("Area"),
    
    TABLE("Table"),
    
    PARKINGBAY("ParkingBay"),
    
    GATE("Gate"),
    
    DRIVETHROUGH("DriveThrough"),
    
    TEAM("Team");

    private String value;

    TableServiceCatagoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TableServiceCatagoryEnum fromValue(String text) {
      for (TableServiceCatagoryEnum b : TableServiceCatagoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TableServiceCatagoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TableServiceCatagoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TableServiceCatagoryEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TableServiceCatagoryEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("TableServiceCatagory")
  private TableServiceCatagoryEnum tableServiceCatagory = null;

  /**
   * Order state
   */
  @JsonAdapter(OrderStateEnum.Adapter.class)
  public enum OrderStateEnum {
    CREATED("Created"),
    
    PLACEDCANBECANCELLED("PlacedCanBeCancelled"),
    
    READYTOPROCESS("ReadyToProcess"),
    
    ACCEPTEDBYRESTAURANT("AcceptedByRestaurant"),
    
    DISPATCHED("Dispatched"),
    
    DELIVERED("Delivered"),
    
    CANCELLED("Cancelled"),
    
    MANUALREVIEW("ManualReview"),
    
    REJECTEDBYSTORE("RejectedByStore"),
    
    REJECTEDBYFLIPDISH("RejectedByFlipdish"),
    
    REJECTEDAUTOMATICALLY("RejectedAutomatically"),
    
    REJECTEDAFTERBEINGACCEPTED("RejectedAfterBeingAccepted"),
    
    ACCEPTEDANDREFUNDED("AcceptedAndRefunded");

    private String value;

    OrderStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrderStateEnum fromValue(String text) {
      for (OrderStateEnum b : OrderStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OrderStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrderStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrderStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OrderStateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("OrderState")
  private OrderStateEnum orderState = null;

  @SerializedName("RequestedForTime")
  private OffsetDateTime requestedForTime = null;

  @SerializedName("StoreName")
  private String storeName = null;

  @SerializedName("StoreIanaTimeZone")
  private String storeIanaTimeZone = null;

  @SerializedName("CustomerName")
  private String customerName = null;

  @SerializedName("CustomerPhoneNumber")
  private String customerPhoneNumber = null;

  @SerializedName("Amount")
  private Double amount = null;

  @SerializedName("RefundedAmount")
  private Double refundedAmount = null;

  /**
   * Payment Account
   */
  @JsonAdapter(PaymentAccountTypeEnum.Adapter.class)
  public enum PaymentAccountTypeEnum {
    CARD("Card"),
    
    CASH("Cash"),
    
    IDEAL("Ideal"),
    
    BANCONTACT("Bancontact"),
    
    GIROPAY("Giropay"),
    
    EPS("Eps"),
    
    EMV("Emv"),
    
    PAYPAL("PayPal"),
    
    PAYGREEN("PayGreen"),
    
    GOOGLEWALLETTOKEN("GoogleWalletToken");

    private String value;

    PaymentAccountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentAccountTypeEnum fromValue(String text) {
      for (PaymentAccountTypeEnum b : PaymentAccountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PaymentAccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentAccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentAccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PaymentAccountTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("PaymentAccountType")
  private PaymentAccountTypeEnum paymentAccountType = null;

  /**
   * Status of the payment
   */
  @JsonAdapter(PaymentStatusEnum.Adapter.class)
  public enum PaymentStatusEnum {
    PAID("Paid"),
    
    UNPAID("Unpaid"),
    
    REFUNDED("Refunded"),
    
    PARTIALLYREFUNDED("PartiallyRefunded"),
    
    DISPUTED("Disputed");

    private String value;

    PaymentStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentStatusEnum fromValue(String text) {
      for (PaymentStatusEnum b : PaymentStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PaymentStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PaymentStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("PaymentStatus")
  private PaymentStatusEnum paymentStatus = null;

  /**
   * Currency of payment
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
   * Type of app end user is on
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

  @SerializedName("LocalOrderId")
  private String localOrderId = null;

  @SerializedName("DropOffLocationId")
  private Integer dropOffLocationId = null;

  @SerializedName("DropOffLocation")
  private String dropOffLocation = null;

  @SerializedName("AcceptedFor")
  private OffsetDateTime acceptedFor = null;

  @SerializedName("Channel")
  private Channel channel = null;

  @SerializedName("InFraudZone")
  private Boolean inFraudZone = null;

  @SerializedName("UnusualHighValueOrder")
  private Boolean unusualHighValueOrder = null;

  @SerializedName("ChannelOrderId")
  private String channelOrderId = null;

  @SerializedName("ChannelOrderDisplayId")
  private String channelOrderDisplayId = null;

  @SerializedName("OrderDropOffLocation")
  private OrderDropOffLocation orderDropOffLocation = null;

  @SerializedName("OrderBatchInfo")
  private OrderBatchSummary orderBatchInfo = null;

  @SerializedName("DeliveryLocation")
  private DeliveryLocation deliveryLocation = null;

  public OrderSummary orderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Order identifier
   * @return orderId
  **/
  @ApiModelProperty(value = "Order identifier")
  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public OrderSummary deliveryType(DeliveryTypeEnum deliveryType) {
    this.deliveryType = deliveryType;
    return this;
  }

   /**
   * Delivery type
   * @return deliveryType
  **/
  @ApiModelProperty(value = "Delivery type")
  public DeliveryTypeEnum getDeliveryType() {
    return deliveryType;
  }

  public void setDeliveryType(DeliveryTypeEnum deliveryType) {
    this.deliveryType = deliveryType;
  }

  public OrderSummary pickupLocationType(PickupLocationTypeEnum pickupLocationType) {
    this.pickupLocationType = pickupLocationType;
    return this;
  }

   /**
   * Pickup location type
   * @return pickupLocationType
  **/
  @ApiModelProperty(value = "Pickup location type")
  public PickupLocationTypeEnum getPickupLocationType() {
    return pickupLocationType;
  }

  public void setPickupLocationType(PickupLocationTypeEnum pickupLocationType) {
    this.pickupLocationType = pickupLocationType;
  }

  public OrderSummary tableServiceCatagory(TableServiceCatagoryEnum tableServiceCatagory) {
    this.tableServiceCatagory = tableServiceCatagory;
    return this;
  }

   /**
   * Table service category
   * @return tableServiceCatagory
  **/
  @ApiModelProperty(value = "Table service category")
  public TableServiceCatagoryEnum getTableServiceCatagory() {
    return tableServiceCatagory;
  }

  public void setTableServiceCatagory(TableServiceCatagoryEnum tableServiceCatagory) {
    this.tableServiceCatagory = tableServiceCatagory;
  }

  public OrderSummary orderState(OrderStateEnum orderState) {
    this.orderState = orderState;
    return this;
  }

   /**
   * Order state
   * @return orderState
  **/
  @ApiModelProperty(value = "Order state")
  public OrderStateEnum getOrderState() {
    return orderState;
  }

  public void setOrderState(OrderStateEnum orderState) {
    this.orderState = orderState;
  }

  public OrderSummary requestedForTime(OffsetDateTime requestedForTime) {
    this.requestedForTime = requestedForTime;
    return this;
  }

   /**
   * Order requested for
   * @return requestedForTime
  **/
  @ApiModelProperty(value = "Order requested for")
  public OffsetDateTime getRequestedForTime() {
    return requestedForTime;
  }

  public void setRequestedForTime(OffsetDateTime requestedForTime) {
    this.requestedForTime = requestedForTime;
  }

  public OrderSummary storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

   /**
   * Name of the store
   * @return storeName
  **/
  @ApiModelProperty(value = "Name of the store")
  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public OrderSummary storeIanaTimeZone(String storeIanaTimeZone) {
    this.storeIanaTimeZone = storeIanaTimeZone;
    return this;
  }

   /**
   * Store IANA time zone
   * @return storeIanaTimeZone
  **/
  @ApiModelProperty(value = "Store IANA time zone")
  public String getStoreIanaTimeZone() {
    return storeIanaTimeZone;
  }

  public void setStoreIanaTimeZone(String storeIanaTimeZone) {
    this.storeIanaTimeZone = storeIanaTimeZone;
  }

  public OrderSummary customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

   /**
   * Name of the customer
   * @return customerName
  **/
  @ApiModelProperty(value = "Name of the customer")
  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public OrderSummary customerPhoneNumber(String customerPhoneNumber) {
    this.customerPhoneNumber = customerPhoneNumber;
    return this;
  }

   /**
   * Phone number of customer
   * @return customerPhoneNumber
  **/
  @ApiModelProperty(value = "Phone number of customer")
  public String getCustomerPhoneNumber() {
    return customerPhoneNumber;
  }

  public void setCustomerPhoneNumber(String customerPhoneNumber) {
    this.customerPhoneNumber = customerPhoneNumber;
  }

  public OrderSummary amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * This is the sum of the OrderItemsAmount, DeliveryAmount, TipAmount and Voucher.Amount (which is usually negative) and OnlineOrderingFee  It does include the OnlineOrderingFee
   * @return amount
  **/
  @ApiModelProperty(value = "This is the sum of the OrderItemsAmount, DeliveryAmount, TipAmount and Voucher.Amount (which is usually negative) and OnlineOrderingFee  It does include the OnlineOrderingFee")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public OrderSummary refundedAmount(Double refundedAmount) {
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

  public OrderSummary paymentAccountType(PaymentAccountTypeEnum paymentAccountType) {
    this.paymentAccountType = paymentAccountType;
    return this;
  }

   /**
   * Payment Account
   * @return paymentAccountType
  **/
  @ApiModelProperty(value = "Payment Account")
  public PaymentAccountTypeEnum getPaymentAccountType() {
    return paymentAccountType;
  }

  public void setPaymentAccountType(PaymentAccountTypeEnum paymentAccountType) {
    this.paymentAccountType = paymentAccountType;
  }

  public OrderSummary paymentStatus(PaymentStatusEnum paymentStatus) {
    this.paymentStatus = paymentStatus;
    return this;
  }

   /**
   * Status of the payment
   * @return paymentStatus
  **/
  @ApiModelProperty(value = "Status of the payment")
  public PaymentStatusEnum getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(PaymentStatusEnum paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  public OrderSummary currency(CurrencyEnum currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency of payment
   * @return currency
  **/
  @ApiModelProperty(value = "Currency of payment")
  public CurrencyEnum getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }

  public OrderSummary appType(AppTypeEnum appType) {
    this.appType = appType;
    return this;
  }

   /**
   * Type of app end user is on
   * @return appType
  **/
  @ApiModelProperty(value = "Type of app end user is on")
  public AppTypeEnum getAppType() {
    return appType;
  }

  public void setAppType(AppTypeEnum appType) {
    this.appType = appType;
  }

  public OrderSummary localOrderId(String localOrderId) {
    this.localOrderId = localOrderId;
    return this;
  }

   /**
   * Local order Id. This is used for displaying a \&quot;shorter\&quot; order ID for customers (eg. Kiosk orders)
   * @return localOrderId
  **/
  @ApiModelProperty(value = "Local order Id. This is used for displaying a \"shorter\" order ID for customers (eg. Kiosk orders)")
  public String getLocalOrderId() {
    return localOrderId;
  }

  public void setLocalOrderId(String localOrderId) {
    this.localOrderId = localOrderId;
  }

  public OrderSummary dropOffLocationId(Integer dropOffLocationId) {
    this.dropOffLocationId = dropOffLocationId;
    return this;
  }

   /**
   * id of the collection/drop off location
   * @return dropOffLocationId
  **/
  @ApiModelProperty(value = "id of the collection/drop off location")
  public Integer getDropOffLocationId() {
    return dropOffLocationId;
  }

  public void setDropOffLocationId(Integer dropOffLocationId) {
    this.dropOffLocationId = dropOffLocationId;
  }

  public OrderSummary dropOffLocation(String dropOffLocation) {
    this.dropOffLocation = dropOffLocation;
    return this;
  }

   /**
   * Represents table service drop off location
   * @return dropOffLocation
  **/
  @ApiModelProperty(value = "Represents table service drop off location")
  public String getDropOffLocation() {
    return dropOffLocation;
  }

  public void setDropOffLocation(String dropOffLocation) {
    this.dropOffLocation = dropOffLocation;
  }

  public OrderSummary acceptedFor(OffsetDateTime acceptedFor) {
    this.acceptedFor = acceptedFor;
    return this;
  }

   /**
   * Time store has accepted the order for
   * @return acceptedFor
  **/
  @ApiModelProperty(value = "Time store has accepted the order for")
  public OffsetDateTime getAcceptedFor() {
    return acceptedFor;
  }

  public void setAcceptedFor(OffsetDateTime acceptedFor) {
    this.acceptedFor = acceptedFor;
  }

  public OrderSummary channel(Channel channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Channel where the Order comes from
   * @return channel
  **/
  @ApiModelProperty(value = "Channel where the Order comes from")
  public Channel getChannel() {
    return channel;
  }

  public void setChannel(Channel channel) {
    this.channel = channel;
  }

  public OrderSummary inFraudZone(Boolean inFraudZone) {
    this.inFraudZone = inFraudZone;
    return this;
  }

   /**
   * Was order made within a fraud zone
   * @return inFraudZone
  **/
  @ApiModelProperty(value = "Was order made within a fraud zone")
  public Boolean isInFraudZone() {
    return inFraudZone;
  }

  public void setInFraudZone(Boolean inFraudZone) {
    this.inFraudZone = inFraudZone;
  }

  public OrderSummary unusualHighValueOrder(Boolean unusualHighValueOrder) {
    this.unusualHighValueOrder = unusualHighValueOrder;
    return this;
  }

   /**
   * Is order of unusually high value
   * @return unusualHighValueOrder
  **/
  @ApiModelProperty(value = "Is order of unusually high value")
  public Boolean isUnusualHighValueOrder() {
    return unusualHighValueOrder;
  }

  public void setUnusualHighValueOrder(Boolean unusualHighValueOrder) {
    this.unusualHighValueOrder = unusualHighValueOrder;
  }

  public OrderSummary channelOrderId(String channelOrderId) {
    this.channelOrderId = channelOrderId;
    return this;
  }

   /**
   * ChannelOrderId from external channel
   * @return channelOrderId
  **/
  @ApiModelProperty(value = "ChannelOrderId from external channel")
  public String getChannelOrderId() {
    return channelOrderId;
  }

  public void setChannelOrderId(String channelOrderId) {
    this.channelOrderId = channelOrderId;
  }

  public OrderSummary channelOrderDisplayId(String channelOrderDisplayId) {
    this.channelOrderDisplayId = channelOrderDisplayId;
    return this;
  }

   /**
   * ChannelOrderDisplayId from external channel
   * @return channelOrderDisplayId
  **/
  @ApiModelProperty(value = "ChannelOrderDisplayId from external channel")
  public String getChannelOrderDisplayId() {
    return channelOrderDisplayId;
  }

  public void setChannelOrderDisplayId(String channelOrderDisplayId) {
    this.channelOrderDisplayId = channelOrderDisplayId;
  }

  public OrderSummary orderDropOffLocation(OrderDropOffLocation orderDropOffLocation) {
    this.orderDropOffLocation = orderDropOffLocation;
    return this;
  }

   /**
   * DropOffLocation selected for this order
   * @return orderDropOffLocation
  **/
  @ApiModelProperty(value = "DropOffLocation selected for this order")
  public OrderDropOffLocation getOrderDropOffLocation() {
    return orderDropOffLocation;
  }

  public void setOrderDropOffLocation(OrderDropOffLocation orderDropOffLocation) {
    this.orderDropOffLocation = orderDropOffLocation;
  }

  public OrderSummary orderBatchInfo(OrderBatchSummary orderBatchInfo) {
    this.orderBatchInfo = orderBatchInfo;
    return this;
  }

   /**
   * OrderBatch information
   * @return orderBatchInfo
  **/
  @ApiModelProperty(value = "OrderBatch information")
  public OrderBatchSummary getOrderBatchInfo() {
    return orderBatchInfo;
  }

  public void setOrderBatchInfo(OrderBatchSummary orderBatchInfo) {
    this.orderBatchInfo = orderBatchInfo;
  }

  public OrderSummary deliveryLocation(DeliveryLocation deliveryLocation) {
    this.deliveryLocation = deliveryLocation;
    return this;
  }

   /**
   * Get deliveryLocation
   * @return deliveryLocation
  **/
  @ApiModelProperty(value = "")
  public DeliveryLocation getDeliveryLocation() {
    return deliveryLocation;
  }

  public void setDeliveryLocation(DeliveryLocation deliveryLocation) {
    this.deliveryLocation = deliveryLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderSummary orderSummary = (OrderSummary) o;
    return Objects.equals(this.orderId, orderSummary.orderId) &&
        Objects.equals(this.deliveryType, orderSummary.deliveryType) &&
        Objects.equals(this.pickupLocationType, orderSummary.pickupLocationType) &&
        Objects.equals(this.tableServiceCatagory, orderSummary.tableServiceCatagory) &&
        Objects.equals(this.orderState, orderSummary.orderState) &&
        Objects.equals(this.requestedForTime, orderSummary.requestedForTime) &&
        Objects.equals(this.storeName, orderSummary.storeName) &&
        Objects.equals(this.storeIanaTimeZone, orderSummary.storeIanaTimeZone) &&
        Objects.equals(this.customerName, orderSummary.customerName) &&
        Objects.equals(this.customerPhoneNumber, orderSummary.customerPhoneNumber) &&
        Objects.equals(this.amount, orderSummary.amount) &&
        Objects.equals(this.refundedAmount, orderSummary.refundedAmount) &&
        Objects.equals(this.paymentAccountType, orderSummary.paymentAccountType) &&
        Objects.equals(this.paymentStatus, orderSummary.paymentStatus) &&
        Objects.equals(this.currency, orderSummary.currency) &&
        Objects.equals(this.appType, orderSummary.appType) &&
        Objects.equals(this.localOrderId, orderSummary.localOrderId) &&
        Objects.equals(this.dropOffLocationId, orderSummary.dropOffLocationId) &&
        Objects.equals(this.dropOffLocation, orderSummary.dropOffLocation) &&
        Objects.equals(this.acceptedFor, orderSummary.acceptedFor) &&
        Objects.equals(this.channel, orderSummary.channel) &&
        Objects.equals(this.inFraudZone, orderSummary.inFraudZone) &&
        Objects.equals(this.unusualHighValueOrder, orderSummary.unusualHighValueOrder) &&
        Objects.equals(this.channelOrderId, orderSummary.channelOrderId) &&
        Objects.equals(this.channelOrderDisplayId, orderSummary.channelOrderDisplayId) &&
        Objects.equals(this.orderDropOffLocation, orderSummary.orderDropOffLocation) &&
        Objects.equals(this.orderBatchInfo, orderSummary.orderBatchInfo) &&
        Objects.equals(this.deliveryLocation, orderSummary.deliveryLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, deliveryType, pickupLocationType, tableServiceCatagory, orderState, requestedForTime, storeName, storeIanaTimeZone, customerName, customerPhoneNumber, amount, refundedAmount, paymentAccountType, paymentStatus, currency, appType, localOrderId, dropOffLocationId, dropOffLocation, acceptedFor, channel, inFraudZone, unusualHighValueOrder, channelOrderId, channelOrderDisplayId, orderDropOffLocation, orderBatchInfo, deliveryLocation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSummary {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
    sb.append("    pickupLocationType: ").append(toIndentedString(pickupLocationType)).append("\n");
    sb.append("    tableServiceCatagory: ").append(toIndentedString(tableServiceCatagory)).append("\n");
    sb.append("    orderState: ").append(toIndentedString(orderState)).append("\n");
    sb.append("    requestedForTime: ").append(toIndentedString(requestedForTime)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    storeIanaTimeZone: ").append(toIndentedString(storeIanaTimeZone)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    customerPhoneNumber: ").append(toIndentedString(customerPhoneNumber)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    refundedAmount: ").append(toIndentedString(refundedAmount)).append("\n");
    sb.append("    paymentAccountType: ").append(toIndentedString(paymentAccountType)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    localOrderId: ").append(toIndentedString(localOrderId)).append("\n");
    sb.append("    dropOffLocationId: ").append(toIndentedString(dropOffLocationId)).append("\n");
    sb.append("    dropOffLocation: ").append(toIndentedString(dropOffLocation)).append("\n");
    sb.append("    acceptedFor: ").append(toIndentedString(acceptedFor)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    inFraudZone: ").append(toIndentedString(inFraudZone)).append("\n");
    sb.append("    unusualHighValueOrder: ").append(toIndentedString(unusualHighValueOrder)).append("\n");
    sb.append("    channelOrderId: ").append(toIndentedString(channelOrderId)).append("\n");
    sb.append("    channelOrderDisplayId: ").append(toIndentedString(channelOrderDisplayId)).append("\n");
    sb.append("    orderDropOffLocation: ").append(toIndentedString(orderDropOffLocation)).append("\n");
    sb.append("    orderBatchInfo: ").append(toIndentedString(orderBatchInfo)).append("\n");
    sb.append("    deliveryLocation: ").append(toIndentedString(deliveryLocation)).append("\n");
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

