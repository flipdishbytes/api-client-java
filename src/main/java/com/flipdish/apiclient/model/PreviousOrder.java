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
import com.flipdish.apiclient.model.PreviousOrderItem;
import com.flipdish.apiclient.model.TaxRate;
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

/**
 * PreviousOrder
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-27T13:36:47.136Z")
public class PreviousOrder {
  @SerializedName("DeliveryType")
  private String deliveryType = null;

  @SerializedName("DeliveryLocationAddressString")
  private String deliveryLocationAddressString = null;

  @SerializedName("PaymentAccountType")
  private String paymentAccountType = null;

  @SerializedName("OrderId")
  private Integer orderId = null;

  @SerializedName("RestaurantName")
  private String restaurantName = null;

  @SerializedName("LocalOrderId")
  private String localOrderId = null;

  @SerializedName("TableServiceCategory")
  private String tableServiceCategory = null;

  @SerializedName("PickupLocationOptionValue")
  private String pickupLocationOptionValue = null;

  @SerializedName("CustomerName")
  private String customerName = null;

  @SerializedName("PhoneNumberInternationalFormatString")
  private String phoneNumberInternationalFormatString = null;

  @SerializedName("DeliveryInstructions")
  private String deliveryInstructions = null;

  /**
   * Gets or Sets currency
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

  @SerializedName("ProcessingFee")
  private Double processingFee = null;

  @SerializedName("ServiceChargePercentage")
  private Double serviceChargePercentage = null;

  @SerializedName("ServiceChargeAmount")
  private Double serviceChargeAmount = null;

  @SerializedName("TipAmount")
  private Double tipAmount = null;

  @SerializedName("DeliveryAmount")
  private Double deliveryAmount = null;

  @SerializedName("DepositReturnFeeAmount")
  private Double depositReturnFeeAmount = null;

  @SerializedName("TotalTax")
  private Double totalTax = null;

  @SerializedName("TotalAmount")
  private Double totalAmount = null;

  @SerializedName("Items")
  private List<PreviousOrderItem> items = null;

  @SerializedName("TaxRates")
  private List<TaxRate> taxRates = null;

  @SerializedName("WhiteLabelId")
  private Integer whiteLabelId = null;

  public PreviousOrder deliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
    return this;
  }

   /**
   * Get deliveryType
   * @return deliveryType
  **/
  @ApiModelProperty(value = "")
  public String getDeliveryType() {
    return deliveryType;
  }

  public void setDeliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
  }

  public PreviousOrder deliveryLocationAddressString(String deliveryLocationAddressString) {
    this.deliveryLocationAddressString = deliveryLocationAddressString;
    return this;
  }

   /**
   * Get deliveryLocationAddressString
   * @return deliveryLocationAddressString
  **/
  @ApiModelProperty(value = "")
  public String getDeliveryLocationAddressString() {
    return deliveryLocationAddressString;
  }

  public void setDeliveryLocationAddressString(String deliveryLocationAddressString) {
    this.deliveryLocationAddressString = deliveryLocationAddressString;
  }

  public PreviousOrder paymentAccountType(String paymentAccountType) {
    this.paymentAccountType = paymentAccountType;
    return this;
  }

   /**
   * Get paymentAccountType
   * @return paymentAccountType
  **/
  @ApiModelProperty(value = "")
  public String getPaymentAccountType() {
    return paymentAccountType;
  }

  public void setPaymentAccountType(String paymentAccountType) {
    this.paymentAccountType = paymentAccountType;
  }

  public PreviousOrder orderId(Integer orderId) {
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

  public PreviousOrder restaurantName(String restaurantName) {
    this.restaurantName = restaurantName;
    return this;
  }

   /**
   * Get restaurantName
   * @return restaurantName
  **/
  @ApiModelProperty(value = "")
  public String getRestaurantName() {
    return restaurantName;
  }

  public void setRestaurantName(String restaurantName) {
    this.restaurantName = restaurantName;
  }

  public PreviousOrder localOrderId(String localOrderId) {
    this.localOrderId = localOrderId;
    return this;
  }

   /**
   * Get localOrderId
   * @return localOrderId
  **/
  @ApiModelProperty(value = "")
  public String getLocalOrderId() {
    return localOrderId;
  }

  public void setLocalOrderId(String localOrderId) {
    this.localOrderId = localOrderId;
  }

  public PreviousOrder tableServiceCategory(String tableServiceCategory) {
    this.tableServiceCategory = tableServiceCategory;
    return this;
  }

   /**
   * Get tableServiceCategory
   * @return tableServiceCategory
  **/
  @ApiModelProperty(value = "")
  public String getTableServiceCategory() {
    return tableServiceCategory;
  }

  public void setTableServiceCategory(String tableServiceCategory) {
    this.tableServiceCategory = tableServiceCategory;
  }

  public PreviousOrder pickupLocationOptionValue(String pickupLocationOptionValue) {
    this.pickupLocationOptionValue = pickupLocationOptionValue;
    return this;
  }

   /**
   * Get pickupLocationOptionValue
   * @return pickupLocationOptionValue
  **/
  @ApiModelProperty(value = "")
  public String getPickupLocationOptionValue() {
    return pickupLocationOptionValue;
  }

  public void setPickupLocationOptionValue(String pickupLocationOptionValue) {
    this.pickupLocationOptionValue = pickupLocationOptionValue;
  }

  public PreviousOrder customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

   /**
   * Get customerName
   * @return customerName
  **/
  @ApiModelProperty(value = "")
  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public PreviousOrder phoneNumberInternationalFormatString(String phoneNumberInternationalFormatString) {
    this.phoneNumberInternationalFormatString = phoneNumberInternationalFormatString;
    return this;
  }

   /**
   * Get phoneNumberInternationalFormatString
   * @return phoneNumberInternationalFormatString
  **/
  @ApiModelProperty(value = "")
  public String getPhoneNumberInternationalFormatString() {
    return phoneNumberInternationalFormatString;
  }

  public void setPhoneNumberInternationalFormatString(String phoneNumberInternationalFormatString) {
    this.phoneNumberInternationalFormatString = phoneNumberInternationalFormatString;
  }

  public PreviousOrder deliveryInstructions(String deliveryInstructions) {
    this.deliveryInstructions = deliveryInstructions;
    return this;
  }

   /**
   * Get deliveryInstructions
   * @return deliveryInstructions
  **/
  @ApiModelProperty(value = "")
  public String getDeliveryInstructions() {
    return deliveryInstructions;
  }

  public void setDeliveryInstructions(String deliveryInstructions) {
    this.deliveryInstructions = deliveryInstructions;
  }

  public PreviousOrder currency(CurrencyEnum currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public CurrencyEnum getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }

  public PreviousOrder processingFee(Double processingFee) {
    this.processingFee = processingFee;
    return this;
  }

   /**
   * Get processingFee
   * @return processingFee
  **/
  @ApiModelProperty(value = "")
  public Double getProcessingFee() {
    return processingFee;
  }

  public void setProcessingFee(Double processingFee) {
    this.processingFee = processingFee;
  }

  public PreviousOrder serviceChargePercentage(Double serviceChargePercentage) {
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

  public PreviousOrder serviceChargeAmount(Double serviceChargeAmount) {
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

  public PreviousOrder tipAmount(Double tipAmount) {
    this.tipAmount = tipAmount;
    return this;
  }

   /**
   * Get tipAmount
   * @return tipAmount
  **/
  @ApiModelProperty(value = "")
  public Double getTipAmount() {
    return tipAmount;
  }

  public void setTipAmount(Double tipAmount) {
    this.tipAmount = tipAmount;
  }

  public PreviousOrder deliveryAmount(Double deliveryAmount) {
    this.deliveryAmount = deliveryAmount;
    return this;
  }

   /**
   * Get deliveryAmount
   * @return deliveryAmount
  **/
  @ApiModelProperty(value = "")
  public Double getDeliveryAmount() {
    return deliveryAmount;
  }

  public void setDeliveryAmount(Double deliveryAmount) {
    this.deliveryAmount = deliveryAmount;
  }

  public PreviousOrder depositReturnFeeAmount(Double depositReturnFeeAmount) {
    this.depositReturnFeeAmount = depositReturnFeeAmount;
    return this;
  }

   /**
   * Get depositReturnFeeAmount
   * @return depositReturnFeeAmount
  **/
  @ApiModelProperty(value = "")
  public Double getDepositReturnFeeAmount() {
    return depositReturnFeeAmount;
  }

  public void setDepositReturnFeeAmount(Double depositReturnFeeAmount) {
    this.depositReturnFeeAmount = depositReturnFeeAmount;
  }

  public PreviousOrder totalTax(Double totalTax) {
    this.totalTax = totalTax;
    return this;
  }

   /**
   * Get totalTax
   * @return totalTax
  **/
  @ApiModelProperty(value = "")
  public Double getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(Double totalTax) {
    this.totalTax = totalTax;
  }

  public PreviousOrder totalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  @ApiModelProperty(value = "")
  public Double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public PreviousOrder items(List<PreviousOrderItem> items) {
    this.items = items;
    return this;
  }

  public PreviousOrder addItemsItem(PreviousOrderItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<PreviousOrderItem>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<PreviousOrderItem> getItems() {
    return items;
  }

  public void setItems(List<PreviousOrderItem> items) {
    this.items = items;
  }

  public PreviousOrder taxRates(List<TaxRate> taxRates) {
    this.taxRates = taxRates;
    return this;
  }

  public PreviousOrder addTaxRatesItem(TaxRate taxRatesItem) {
    if (this.taxRates == null) {
      this.taxRates = new ArrayList<TaxRate>();
    }
    this.taxRates.add(taxRatesItem);
    return this;
  }

   /**
   * Get taxRates
   * @return taxRates
  **/
  @ApiModelProperty(value = "")
  public List<TaxRate> getTaxRates() {
    return taxRates;
  }

  public void setTaxRates(List<TaxRate> taxRates) {
    this.taxRates = taxRates;
  }

  public PreviousOrder whiteLabelId(Integer whiteLabelId) {
    this.whiteLabelId = whiteLabelId;
    return this;
  }

   /**
   * Get whiteLabelId
   * @return whiteLabelId
  **/
  @ApiModelProperty(value = "")
  public Integer getWhiteLabelId() {
    return whiteLabelId;
  }

  public void setWhiteLabelId(Integer whiteLabelId) {
    this.whiteLabelId = whiteLabelId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreviousOrder previousOrder = (PreviousOrder) o;
    return Objects.equals(this.deliveryType, previousOrder.deliveryType) &&
        Objects.equals(this.deliveryLocationAddressString, previousOrder.deliveryLocationAddressString) &&
        Objects.equals(this.paymentAccountType, previousOrder.paymentAccountType) &&
        Objects.equals(this.orderId, previousOrder.orderId) &&
        Objects.equals(this.restaurantName, previousOrder.restaurantName) &&
        Objects.equals(this.localOrderId, previousOrder.localOrderId) &&
        Objects.equals(this.tableServiceCategory, previousOrder.tableServiceCategory) &&
        Objects.equals(this.pickupLocationOptionValue, previousOrder.pickupLocationOptionValue) &&
        Objects.equals(this.customerName, previousOrder.customerName) &&
        Objects.equals(this.phoneNumberInternationalFormatString, previousOrder.phoneNumberInternationalFormatString) &&
        Objects.equals(this.deliveryInstructions, previousOrder.deliveryInstructions) &&
        Objects.equals(this.currency, previousOrder.currency) &&
        Objects.equals(this.processingFee, previousOrder.processingFee) &&
        Objects.equals(this.serviceChargePercentage, previousOrder.serviceChargePercentage) &&
        Objects.equals(this.serviceChargeAmount, previousOrder.serviceChargeAmount) &&
        Objects.equals(this.tipAmount, previousOrder.tipAmount) &&
        Objects.equals(this.deliveryAmount, previousOrder.deliveryAmount) &&
        Objects.equals(this.depositReturnFeeAmount, previousOrder.depositReturnFeeAmount) &&
        Objects.equals(this.totalTax, previousOrder.totalTax) &&
        Objects.equals(this.totalAmount, previousOrder.totalAmount) &&
        Objects.equals(this.items, previousOrder.items) &&
        Objects.equals(this.taxRates, previousOrder.taxRates) &&
        Objects.equals(this.whiteLabelId, previousOrder.whiteLabelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryType, deliveryLocationAddressString, paymentAccountType, orderId, restaurantName, localOrderId, tableServiceCategory, pickupLocationOptionValue, customerName, phoneNumberInternationalFormatString, deliveryInstructions, currency, processingFee, serviceChargePercentage, serviceChargeAmount, tipAmount, deliveryAmount, depositReturnFeeAmount, totalTax, totalAmount, items, taxRates, whiteLabelId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreviousOrder {\n");
    
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
    sb.append("    deliveryLocationAddressString: ").append(toIndentedString(deliveryLocationAddressString)).append("\n");
    sb.append("    paymentAccountType: ").append(toIndentedString(paymentAccountType)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    restaurantName: ").append(toIndentedString(restaurantName)).append("\n");
    sb.append("    localOrderId: ").append(toIndentedString(localOrderId)).append("\n");
    sb.append("    tableServiceCategory: ").append(toIndentedString(tableServiceCategory)).append("\n");
    sb.append("    pickupLocationOptionValue: ").append(toIndentedString(pickupLocationOptionValue)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    phoneNumberInternationalFormatString: ").append(toIndentedString(phoneNumberInternationalFormatString)).append("\n");
    sb.append("    deliveryInstructions: ").append(toIndentedString(deliveryInstructions)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    processingFee: ").append(toIndentedString(processingFee)).append("\n");
    sb.append("    serviceChargePercentage: ").append(toIndentedString(serviceChargePercentage)).append("\n");
    sb.append("    serviceChargeAmount: ").append(toIndentedString(serviceChargeAmount)).append("\n");
    sb.append("    tipAmount: ").append(toIndentedString(tipAmount)).append("\n");
    sb.append("    deliveryAmount: ").append(toIndentedString(deliveryAmount)).append("\n");
    sb.append("    depositReturnFeeAmount: ").append(toIndentedString(depositReturnFeeAmount)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    taxRates: ").append(toIndentedString(taxRates)).append("\n");
    sb.append("    whiteLabelId: ").append(toIndentedString(whiteLabelId)).append("\n");
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

