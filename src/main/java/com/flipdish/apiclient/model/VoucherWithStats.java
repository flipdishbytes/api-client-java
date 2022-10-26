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
import com.flipdish.apiclient.model.AddItemDetails;
import com.flipdish.apiclient.model.CreditNoteDetails;
import com.flipdish.apiclient.model.LumpDiscountDetails;
import com.flipdish.apiclient.model.PercentDiscountDetails;
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
 * Voucher With Statistics
 */
@ApiModel(description = "Voucher With Statistics")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-10-26T11:07:35.559+01:00")
public class VoucherWithStats {
  @SerializedName("TotalUsed")
  private Integer totalUsed = null;

  @SerializedName("TotalCustomers")
  private Integer totalCustomers = null;

  @SerializedName("TotalAmountFromOrders")
  private Double totalAmountFromOrders = null;

  @SerializedName("TotalDiscounted")
  private Double totalDiscounted = null;

  @SerializedName("AverageOrderSize")
  private Double averageOrderSize = null;

  @SerializedName("VoucherId")
  private Integer voucherId = null;

  /**
   * Voucher Status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    VALID("Valid"),
    
    NOTYETVALID("NotYetValid"),
    
    EXPIRED("Expired"),
    
    USED("Used"),
    
    DISABLED("Disabled");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Status")
  private StatusEnum status = null;

  /**
   * Voucher Type
   */
  @JsonAdapter(VoucherTypeEnum.Adapter.class)
  public enum VoucherTypeEnum {
    PERCENTAGEDISCOUNT("PercentageDiscount"),
    
    LUMPDISCOUNT("LumpDiscount"),
    
    ADDITEM("AddItem"),
    
    CREDITNOTE("CreditNote");

    private String value;

    VoucherTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VoucherTypeEnum fromValue(String text) {
      for (VoucherTypeEnum b : VoucherTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VoucherTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VoucherTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VoucherTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VoucherTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("VoucherType")
  private VoucherTypeEnum voucherType = null;

  /**
   * Voucher Sub Type
   */
  @JsonAdapter(VoucherSubTypeEnum.Adapter.class)
  public enum VoucherSubTypeEnum {
    NONE("None"),
    
    SIGNUP("SignUp"),
    
    LOYALTY("Loyalty"),
    
    LOYALTY25("Loyalty25"),
    
    RETENTION("Retention"),
    
    SECONDARYRETENTION("SecondaryRetention"),
    
    CUSTOM("Custom");

    private String value;

    VoucherSubTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VoucherSubTypeEnum fromValue(String text) {
      for (VoucherSubTypeEnum b : VoucherSubTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VoucherSubTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VoucherSubTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VoucherSubTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VoucherSubTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("VoucherSubType")
  private VoucherSubTypeEnum voucherSubType = null;

  /**
   * Currency of the voucher
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

  @SerializedName("Stores")
  private List<Integer> stores = null;

  @SerializedName("StoreNames")
  private List<String> storeNames = null;

  @SerializedName("AddItemDetails")
  private AddItemDetails addItemDetails = null;

  @SerializedName("CreditNoteDetails")
  private CreditNoteDetails creditNoteDetails = null;

  @SerializedName("LumpDiscountDetails")
  private LumpDiscountDetails lumpDiscountDetails = null;

  @SerializedName("PercentDiscountDetails")
  private PercentDiscountDetails percentDiscountDetails = null;

  @SerializedName("Code")
  private String code = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ValidOnOrdersOver")
  private Double validOnOrdersOver = null;

  @SerializedName("TakesPriority")
  private Boolean takesPriority = null;

  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  @SerializedName("IsAutomaticallyApplied")
  private Boolean isAutomaticallyApplied = null;

  @SerializedName("IncludeDeliveryFee")
  private Boolean includeDeliveryFee = null;

  @SerializedName("IsValidForDeliveryOrders")
  private Boolean isValidForDeliveryOrders = null;

  @SerializedName("IsValidForPickupOrders")
  private Boolean isValidForPickupOrders = null;

  @SerializedName("IsValidForOrdersPayedOnline")
  private Boolean isValidForOrdersPayedOnline = null;

  @SerializedName("IsValidForOrdersPayedByCash")
  private Boolean isValidForOrdersPayedByCash = null;

  @SerializedName("IsValidForFirstOrderOnly")
  private Boolean isValidForFirstOrderOnly = null;

  @SerializedName("IsValidOncePerCustomer")
  private Boolean isValidOncePerCustomer = null;

  @SerializedName("IsValidOnlyOnce")
  private Boolean isValidOnlyOnce = null;

  @SerializedName("StartDate")
  private OffsetDateTime startDate = null;

  @SerializedName("ExpiryDate")
  private OffsetDateTime expiryDate = null;

  public VoucherWithStats totalUsed(Integer totalUsed) {
    this.totalUsed = totalUsed;
    return this;
  }

   /**
   * Total times the voucher was used
   * @return totalUsed
  **/
  @ApiModelProperty(value = "Total times the voucher was used")
  public Integer getTotalUsed() {
    return totalUsed;
  }

  public void setTotalUsed(Integer totalUsed) {
    this.totalUsed = totalUsed;
  }

  public VoucherWithStats totalCustomers(Integer totalCustomers) {
    this.totalCustomers = totalCustomers;
    return this;
  }

   /**
   * Total amount of customers who used this voucher
   * @return totalCustomers
  **/
  @ApiModelProperty(value = "Total amount of customers who used this voucher")
  public Integer getTotalCustomers() {
    return totalCustomers;
  }

  public void setTotalCustomers(Integer totalCustomers) {
    this.totalCustomers = totalCustomers;
  }

  public VoucherWithStats totalAmountFromOrders(Double totalAmountFromOrders) {
    this.totalAmountFromOrders = totalAmountFromOrders;
    return this;
  }

   /**
   * Total amount of money from orders
   * @return totalAmountFromOrders
  **/
  @ApiModelProperty(value = "Total amount of money from orders")
  public Double getTotalAmountFromOrders() {
    return totalAmountFromOrders;
  }

  public void setTotalAmountFromOrders(Double totalAmountFromOrders) {
    this.totalAmountFromOrders = totalAmountFromOrders;
  }

  public VoucherWithStats totalDiscounted(Double totalDiscounted) {
    this.totalDiscounted = totalDiscounted;
    return this;
  }

   /**
   * Total amount of money given away
   * @return totalDiscounted
  **/
  @ApiModelProperty(value = "Total amount of money given away")
  public Double getTotalDiscounted() {
    return totalDiscounted;
  }

  public void setTotalDiscounted(Double totalDiscounted) {
    this.totalDiscounted = totalDiscounted;
  }

  public VoucherWithStats averageOrderSize(Double averageOrderSize) {
    this.averageOrderSize = averageOrderSize;
    return this;
  }

   /**
   * Average Order Size
   * @return averageOrderSize
  **/
  @ApiModelProperty(value = "Average Order Size")
  public Double getAverageOrderSize() {
    return averageOrderSize;
  }

  public void setAverageOrderSize(Double averageOrderSize) {
    this.averageOrderSize = averageOrderSize;
  }

  public VoucherWithStats voucherId(Integer voucherId) {
    this.voucherId = voucherId;
    return this;
  }

   /**
   * Voucher Id
   * @return voucherId
  **/
  @ApiModelProperty(value = "Voucher Id")
  public Integer getVoucherId() {
    return voucherId;
  }

  public void setVoucherId(Integer voucherId) {
    this.voucherId = voucherId;
  }

  public VoucherWithStats status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Voucher Status
   * @return status
  **/
  @ApiModelProperty(value = "Voucher Status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public VoucherWithStats voucherType(VoucherTypeEnum voucherType) {
    this.voucherType = voucherType;
    return this;
  }

   /**
   * Voucher Type
   * @return voucherType
  **/
  @ApiModelProperty(value = "Voucher Type")
  public VoucherTypeEnum getVoucherType() {
    return voucherType;
  }

  public void setVoucherType(VoucherTypeEnum voucherType) {
    this.voucherType = voucherType;
  }

  public VoucherWithStats voucherSubType(VoucherSubTypeEnum voucherSubType) {
    this.voucherSubType = voucherSubType;
    return this;
  }

   /**
   * Voucher Sub Type
   * @return voucherSubType
  **/
  @ApiModelProperty(value = "Voucher Sub Type")
  public VoucherSubTypeEnum getVoucherSubType() {
    return voucherSubType;
  }

  public void setVoucherSubType(VoucherSubTypeEnum voucherSubType) {
    this.voucherSubType = voucherSubType;
  }

  public VoucherWithStats currency(CurrencyEnum currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency of the voucher
   * @return currency
  **/
  @ApiModelProperty(value = "Currency of the voucher")
  public CurrencyEnum getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }

  public VoucherWithStats stores(List<Integer> stores) {
    this.stores = stores;
    return this;
  }

  public VoucherWithStats addStoresItem(Integer storesItem) {
    if (this.stores == null) {
      this.stores = new ArrayList<Integer>();
    }
    this.stores.add(storesItem);
    return this;
  }

   /**
   * Stores that this voucher applies to
   * @return stores
  **/
  @ApiModelProperty(value = "Stores that this voucher applies to")
  public List<Integer> getStores() {
    return stores;
  }

  public void setStores(List<Integer> stores) {
    this.stores = stores;
  }

  public VoucherWithStats storeNames(List<String> storeNames) {
    this.storeNames = storeNames;
    return this;
  }

  public VoucherWithStats addStoreNamesItem(String storeNamesItem) {
    if (this.storeNames == null) {
      this.storeNames = new ArrayList<String>();
    }
    this.storeNames.add(storeNamesItem);
    return this;
  }

   /**
   * Stores that this voucher applies to
   * @return storeNames
  **/
  @ApiModelProperty(value = "Stores that this voucher applies to")
  public List<String> getStoreNames() {
    return storeNames;
  }

  public void setStoreNames(List<String> storeNames) {
    this.storeNames = storeNames;
  }

  public VoucherWithStats addItemDetails(AddItemDetails addItemDetails) {
    this.addItemDetails = addItemDetails;
    return this;
  }

   /**
   * Add item details
   * @return addItemDetails
  **/
  @ApiModelProperty(value = "Add item details")
  public AddItemDetails getAddItemDetails() {
    return addItemDetails;
  }

  public void setAddItemDetails(AddItemDetails addItemDetails) {
    this.addItemDetails = addItemDetails;
  }

  public VoucherWithStats creditNoteDetails(CreditNoteDetails creditNoteDetails) {
    this.creditNoteDetails = creditNoteDetails;
    return this;
  }

   /**
   * Credit note details
   * @return creditNoteDetails
  **/
  @ApiModelProperty(value = "Credit note details")
  public CreditNoteDetails getCreditNoteDetails() {
    return creditNoteDetails;
  }

  public void setCreditNoteDetails(CreditNoteDetails creditNoteDetails) {
    this.creditNoteDetails = creditNoteDetails;
  }

  public VoucherWithStats lumpDiscountDetails(LumpDiscountDetails lumpDiscountDetails) {
    this.lumpDiscountDetails = lumpDiscountDetails;
    return this;
  }

   /**
   * Lump discount details
   * @return lumpDiscountDetails
  **/
  @ApiModelProperty(value = "Lump discount details")
  public LumpDiscountDetails getLumpDiscountDetails() {
    return lumpDiscountDetails;
  }

  public void setLumpDiscountDetails(LumpDiscountDetails lumpDiscountDetails) {
    this.lumpDiscountDetails = lumpDiscountDetails;
  }

  public VoucherWithStats percentDiscountDetails(PercentDiscountDetails percentDiscountDetails) {
    this.percentDiscountDetails = percentDiscountDetails;
    return this;
  }

   /**
   * Percent discount details
   * @return percentDiscountDetails
  **/
  @ApiModelProperty(value = "Percent discount details")
  public PercentDiscountDetails getPercentDiscountDetails() {
    return percentDiscountDetails;
  }

  public void setPercentDiscountDetails(PercentDiscountDetails percentDiscountDetails) {
    this.percentDiscountDetails = percentDiscountDetails;
  }

  public VoucherWithStats code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Voucher Code
   * @return code
  **/
  @ApiModelProperty(value = "Voucher Code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public VoucherWithStats description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Voucher Description (Visible on printout)
   * @return description
  **/
  @ApiModelProperty(value = "Voucher Description (Visible on printout)")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VoucherWithStats validOnOrdersOver(Double validOnOrdersOver) {
    this.validOnOrdersOver = validOnOrdersOver;
    return this;
  }

   /**
   * Valid on orders on or above
   * @return validOnOrdersOver
  **/
  @ApiModelProperty(value = "Valid on orders on or above")
  public Double getValidOnOrdersOver() {
    return validOnOrdersOver;
  }

  public void setValidOnOrdersOver(Double validOnOrdersOver) {
    this.validOnOrdersOver = validOnOrdersOver;
  }

  public VoucherWithStats takesPriority(Boolean takesPriority) {
    this.takesPriority = takesPriority;
    return this;
  }

   /**
   * Takes priority
   * @return takesPriority
  **/
  @ApiModelProperty(value = "Takes priority")
  public Boolean isTakesPriority() {
    return takesPriority;
  }

  public void setTakesPriority(Boolean takesPriority) {
    this.takesPriority = takesPriority;
  }

  public VoucherWithStats isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Is voucher enabled
   * @return isEnabled
  **/
  @ApiModelProperty(value = "Is voucher enabled")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public VoucherWithStats isAutomaticallyApplied(Boolean isAutomaticallyApplied) {
    this.isAutomaticallyApplied = isAutomaticallyApplied;
    return this;
  }

   /**
   * Is voucher automatically applied
   * @return isAutomaticallyApplied
  **/
  @ApiModelProperty(value = "Is voucher automatically applied")
  public Boolean isIsAutomaticallyApplied() {
    return isAutomaticallyApplied;
  }

  public void setIsAutomaticallyApplied(Boolean isAutomaticallyApplied) {
    this.isAutomaticallyApplied = isAutomaticallyApplied;
  }

  public VoucherWithStats includeDeliveryFee(Boolean includeDeliveryFee) {
    this.includeDeliveryFee = includeDeliveryFee;
    return this;
  }

   /**
   * Include delivery fees
   * @return includeDeliveryFee
  **/
  @ApiModelProperty(value = "Include delivery fees")
  public Boolean isIncludeDeliveryFee() {
    return includeDeliveryFee;
  }

  public void setIncludeDeliveryFee(Boolean includeDeliveryFee) {
    this.includeDeliveryFee = includeDeliveryFee;
  }

  public VoucherWithStats isValidForDeliveryOrders(Boolean isValidForDeliveryOrders) {
    this.isValidForDeliveryOrders = isValidForDeliveryOrders;
    return this;
  }

   /**
   * Valid for delivery orders
   * @return isValidForDeliveryOrders
  **/
  @ApiModelProperty(value = "Valid for delivery orders")
  public Boolean isIsValidForDeliveryOrders() {
    return isValidForDeliveryOrders;
  }

  public void setIsValidForDeliveryOrders(Boolean isValidForDeliveryOrders) {
    this.isValidForDeliveryOrders = isValidForDeliveryOrders;
  }

  public VoucherWithStats isValidForPickupOrders(Boolean isValidForPickupOrders) {
    this.isValidForPickupOrders = isValidForPickupOrders;
    return this;
  }

   /**
   * Valid for pickup orders
   * @return isValidForPickupOrders
  **/
  @ApiModelProperty(value = "Valid for pickup orders")
  public Boolean isIsValidForPickupOrders() {
    return isValidForPickupOrders;
  }

  public void setIsValidForPickupOrders(Boolean isValidForPickupOrders) {
    this.isValidForPickupOrders = isValidForPickupOrders;
  }

  public VoucherWithStats isValidForOrdersPayedOnline(Boolean isValidForOrdersPayedOnline) {
    this.isValidForOrdersPayedOnline = isValidForOrdersPayedOnline;
    return this;
  }

   /**
   * Valid for orders payed online
   * @return isValidForOrdersPayedOnline
  **/
  @ApiModelProperty(value = "Valid for orders payed online")
  public Boolean isIsValidForOrdersPayedOnline() {
    return isValidForOrdersPayedOnline;
  }

  public void setIsValidForOrdersPayedOnline(Boolean isValidForOrdersPayedOnline) {
    this.isValidForOrdersPayedOnline = isValidForOrdersPayedOnline;
  }

  public VoucherWithStats isValidForOrdersPayedByCash(Boolean isValidForOrdersPayedByCash) {
    this.isValidForOrdersPayedByCash = isValidForOrdersPayedByCash;
    return this;
  }

   /**
   * Valid for orders payed in cash
   * @return isValidForOrdersPayedByCash
  **/
  @ApiModelProperty(value = "Valid for orders payed in cash")
  public Boolean isIsValidForOrdersPayedByCash() {
    return isValidForOrdersPayedByCash;
  }

  public void setIsValidForOrdersPayedByCash(Boolean isValidForOrdersPayedByCash) {
    this.isValidForOrdersPayedByCash = isValidForOrdersPayedByCash;
  }

  public VoucherWithStats isValidForFirstOrderOnly(Boolean isValidForFirstOrderOnly) {
    this.isValidForFirstOrderOnly = isValidForFirstOrderOnly;
    return this;
  }

   /**
   * Valid only on the first order by the customer
   * @return isValidForFirstOrderOnly
  **/
  @ApiModelProperty(value = "Valid only on the first order by the customer")
  public Boolean isIsValidForFirstOrderOnly() {
    return isValidForFirstOrderOnly;
  }

  public void setIsValidForFirstOrderOnly(Boolean isValidForFirstOrderOnly) {
    this.isValidForFirstOrderOnly = isValidForFirstOrderOnly;
  }

  public VoucherWithStats isValidOncePerCustomer(Boolean isValidOncePerCustomer) {
    this.isValidOncePerCustomer = isValidOncePerCustomer;
    return this;
  }

   /**
   * Valid once per customer
   * @return isValidOncePerCustomer
  **/
  @ApiModelProperty(value = "Valid once per customer")
  public Boolean isIsValidOncePerCustomer() {
    return isValidOncePerCustomer;
  }

  public void setIsValidOncePerCustomer(Boolean isValidOncePerCustomer) {
    this.isValidOncePerCustomer = isValidOncePerCustomer;
  }

  public VoucherWithStats isValidOnlyOnce(Boolean isValidOnlyOnce) {
    this.isValidOnlyOnce = isValidOnlyOnce;
    return this;
  }

   /**
   * Valid only once, by any customer (once used cannot be used again by any other customer)
   * @return isValidOnlyOnce
  **/
  @ApiModelProperty(value = "Valid only once, by any customer (once used cannot be used again by any other customer)")
  public Boolean isIsValidOnlyOnce() {
    return isValidOnlyOnce;
  }

  public void setIsValidOnlyOnce(Boolean isValidOnlyOnce) {
    this.isValidOnlyOnce = isValidOnlyOnce;
  }

  public VoucherWithStats startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Voucher Starts On (Time in UTC)
   * @return startDate
  **/
  @ApiModelProperty(value = "Voucher Starts On (Time in UTC)")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public VoucherWithStats expiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Voucher Expires On (Time in UTC)
   * @return expiryDate
  **/
  @ApiModelProperty(value = "Voucher Expires On (Time in UTC)")
  public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherWithStats voucherWithStats = (VoucherWithStats) o;
    return Objects.equals(this.totalUsed, voucherWithStats.totalUsed) &&
        Objects.equals(this.totalCustomers, voucherWithStats.totalCustomers) &&
        Objects.equals(this.totalAmountFromOrders, voucherWithStats.totalAmountFromOrders) &&
        Objects.equals(this.totalDiscounted, voucherWithStats.totalDiscounted) &&
        Objects.equals(this.averageOrderSize, voucherWithStats.averageOrderSize) &&
        Objects.equals(this.voucherId, voucherWithStats.voucherId) &&
        Objects.equals(this.status, voucherWithStats.status) &&
        Objects.equals(this.voucherType, voucherWithStats.voucherType) &&
        Objects.equals(this.voucherSubType, voucherWithStats.voucherSubType) &&
        Objects.equals(this.currency, voucherWithStats.currency) &&
        Objects.equals(this.stores, voucherWithStats.stores) &&
        Objects.equals(this.storeNames, voucherWithStats.storeNames) &&
        Objects.equals(this.addItemDetails, voucherWithStats.addItemDetails) &&
        Objects.equals(this.creditNoteDetails, voucherWithStats.creditNoteDetails) &&
        Objects.equals(this.lumpDiscountDetails, voucherWithStats.lumpDiscountDetails) &&
        Objects.equals(this.percentDiscountDetails, voucherWithStats.percentDiscountDetails) &&
        Objects.equals(this.code, voucherWithStats.code) &&
        Objects.equals(this.description, voucherWithStats.description) &&
        Objects.equals(this.validOnOrdersOver, voucherWithStats.validOnOrdersOver) &&
        Objects.equals(this.takesPriority, voucherWithStats.takesPriority) &&
        Objects.equals(this.isEnabled, voucherWithStats.isEnabled) &&
        Objects.equals(this.isAutomaticallyApplied, voucherWithStats.isAutomaticallyApplied) &&
        Objects.equals(this.includeDeliveryFee, voucherWithStats.includeDeliveryFee) &&
        Objects.equals(this.isValidForDeliveryOrders, voucherWithStats.isValidForDeliveryOrders) &&
        Objects.equals(this.isValidForPickupOrders, voucherWithStats.isValidForPickupOrders) &&
        Objects.equals(this.isValidForOrdersPayedOnline, voucherWithStats.isValidForOrdersPayedOnline) &&
        Objects.equals(this.isValidForOrdersPayedByCash, voucherWithStats.isValidForOrdersPayedByCash) &&
        Objects.equals(this.isValidForFirstOrderOnly, voucherWithStats.isValidForFirstOrderOnly) &&
        Objects.equals(this.isValidOncePerCustomer, voucherWithStats.isValidOncePerCustomer) &&
        Objects.equals(this.isValidOnlyOnce, voucherWithStats.isValidOnlyOnce) &&
        Objects.equals(this.startDate, voucherWithStats.startDate) &&
        Objects.equals(this.expiryDate, voucherWithStats.expiryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalUsed, totalCustomers, totalAmountFromOrders, totalDiscounted, averageOrderSize, voucherId, status, voucherType, voucherSubType, currency, stores, storeNames, addItemDetails, creditNoteDetails, lumpDiscountDetails, percentDiscountDetails, code, description, validOnOrdersOver, takesPriority, isEnabled, isAutomaticallyApplied, includeDeliveryFee, isValidForDeliveryOrders, isValidForPickupOrders, isValidForOrdersPayedOnline, isValidForOrdersPayedByCash, isValidForFirstOrderOnly, isValidOncePerCustomer, isValidOnlyOnce, startDate, expiryDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherWithStats {\n");
    
    sb.append("    totalUsed: ").append(toIndentedString(totalUsed)).append("\n");
    sb.append("    totalCustomers: ").append(toIndentedString(totalCustomers)).append("\n");
    sb.append("    totalAmountFromOrders: ").append(toIndentedString(totalAmountFromOrders)).append("\n");
    sb.append("    totalDiscounted: ").append(toIndentedString(totalDiscounted)).append("\n");
    sb.append("    averageOrderSize: ").append(toIndentedString(averageOrderSize)).append("\n");
    sb.append("    voucherId: ").append(toIndentedString(voucherId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    voucherType: ").append(toIndentedString(voucherType)).append("\n");
    sb.append("    voucherSubType: ").append(toIndentedString(voucherSubType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    stores: ").append(toIndentedString(stores)).append("\n");
    sb.append("    storeNames: ").append(toIndentedString(storeNames)).append("\n");
    sb.append("    addItemDetails: ").append(toIndentedString(addItemDetails)).append("\n");
    sb.append("    creditNoteDetails: ").append(toIndentedString(creditNoteDetails)).append("\n");
    sb.append("    lumpDiscountDetails: ").append(toIndentedString(lumpDiscountDetails)).append("\n");
    sb.append("    percentDiscountDetails: ").append(toIndentedString(percentDiscountDetails)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    validOnOrdersOver: ").append(toIndentedString(validOnOrdersOver)).append("\n");
    sb.append("    takesPriority: ").append(toIndentedString(takesPriority)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isAutomaticallyApplied: ").append(toIndentedString(isAutomaticallyApplied)).append("\n");
    sb.append("    includeDeliveryFee: ").append(toIndentedString(includeDeliveryFee)).append("\n");
    sb.append("    isValidForDeliveryOrders: ").append(toIndentedString(isValidForDeliveryOrders)).append("\n");
    sb.append("    isValidForPickupOrders: ").append(toIndentedString(isValidForPickupOrders)).append("\n");
    sb.append("    isValidForOrdersPayedOnline: ").append(toIndentedString(isValidForOrdersPayedOnline)).append("\n");
    sb.append("    isValidForOrdersPayedByCash: ").append(toIndentedString(isValidForOrdersPayedByCash)).append("\n");
    sb.append("    isValidForFirstOrderOnly: ").append(toIndentedString(isValidForFirstOrderOnly)).append("\n");
    sb.append("    isValidOncePerCustomer: ").append(toIndentedString(isValidOncePerCustomer)).append("\n");
    sb.append("    isValidOnlyOnce: ").append(toIndentedString(isValidOnlyOnce)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
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

