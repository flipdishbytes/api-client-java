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
import java.util.ArrayList;
import java.util.List;

/**
 * Store Group
 */
@ApiModel(description = "Store Group")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class StoreGroup {
  @SerializedName("StoreGroupId")
  private Integer storeGroupId = null;

  @SerializedName("GeneralRating")
  private Double generalRating = null;

  @SerializedName("GeneralRatingCount")
  private Integer generalRatingCount = null;

  @SerializedName("DeliveryMenuMessage")
  private String deliveryMenuMessage = null;

  @SerializedName("PickupMenuMessage")
  private String pickupMenuMessage = null;

  @SerializedName("BrandIds")
  private List<String> brandIds = null;

  @SerializedName("Name")
  private String name = null;

  /**
   * Currency used by the stores in this group
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

  public StoreGroup storeGroupId(Integer storeGroupId) {
    this.storeGroupId = storeGroupId;
    return this;
  }

   /**
   * Unique Store Group Identifier
   * @return storeGroupId
  **/
  @ApiModelProperty(value = "Unique Store Group Identifier")
  public Integer getStoreGroupId() {
    return storeGroupId;
  }

  public void setStoreGroupId(Integer storeGroupId) {
    this.storeGroupId = storeGroupId;
  }

  public StoreGroup generalRating(Double generalRating) {
    this.generalRating = generalRating;
    return this;
  }

   /**
   * Store Group rating
   * @return generalRating
  **/
  @ApiModelProperty(value = "Store Group rating")
  public Double getGeneralRating() {
    return generalRating;
  }

  public void setGeneralRating(Double generalRating) {
    this.generalRating = generalRating;
  }

  public StoreGroup generalRatingCount(Integer generalRatingCount) {
    this.generalRatingCount = generalRatingCount;
    return this;
  }

   /**
   * Store Group rating count
   * @return generalRatingCount
  **/
  @ApiModelProperty(value = "Store Group rating count")
  public Integer getGeneralRatingCount() {
    return generalRatingCount;
  }

  public void setGeneralRatingCount(Integer generalRatingCount) {
    this.generalRatingCount = generalRatingCount;
  }

  public StoreGroup deliveryMenuMessage(String deliveryMenuMessage) {
    this.deliveryMenuMessage = deliveryMenuMessage;
    return this;
  }

   /**
   * Delivery menu message
   * @return deliveryMenuMessage
  **/
  @ApiModelProperty(value = "Delivery menu message")
  public String getDeliveryMenuMessage() {
    return deliveryMenuMessage;
  }

  public void setDeliveryMenuMessage(String deliveryMenuMessage) {
    this.deliveryMenuMessage = deliveryMenuMessage;
  }

  public StoreGroup pickupMenuMessage(String pickupMenuMessage) {
    this.pickupMenuMessage = pickupMenuMessage;
    return this;
  }

   /**
   * Pickup menu message
   * @return pickupMenuMessage
  **/
  @ApiModelProperty(value = "Pickup menu message")
  public String getPickupMenuMessage() {
    return pickupMenuMessage;
  }

  public void setPickupMenuMessage(String pickupMenuMessage) {
    this.pickupMenuMessage = pickupMenuMessage;
  }

  public StoreGroup brandIds(List<String> brandIds) {
    this.brandIds = brandIds;
    return this;
  }

  public StoreGroup addBrandIdsItem(String brandIdsItem) {
    if (this.brandIds == null) {
      this.brandIds = new ArrayList<String>();
    }
    this.brandIds.add(brandIdsItem);
    return this;
  }

   /**
   * List of brand ids (AppIds) that are associated with this store group
   * @return brandIds
  **/
  @ApiModelProperty(value = "List of brand ids (AppIds) that are associated with this store group")
  public List<String> getBrandIds() {
    return brandIds;
  }

  public void setBrandIds(List<String> brandIds) {
    this.brandIds = brandIds;
  }

  public StoreGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Store Group Name
   * @return name
  **/
  @ApiModelProperty(value = "Store Group Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StoreGroup currency(CurrencyEnum currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency used by the stores in this group
   * @return currency
  **/
  @ApiModelProperty(value = "Currency used by the stores in this group")
  public CurrencyEnum getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreGroup storeGroup = (StoreGroup) o;
    return Objects.equals(this.storeGroupId, storeGroup.storeGroupId) &&
        Objects.equals(this.generalRating, storeGroup.generalRating) &&
        Objects.equals(this.generalRatingCount, storeGroup.generalRatingCount) &&
        Objects.equals(this.deliveryMenuMessage, storeGroup.deliveryMenuMessage) &&
        Objects.equals(this.pickupMenuMessage, storeGroup.pickupMenuMessage) &&
        Objects.equals(this.brandIds, storeGroup.brandIds) &&
        Objects.equals(this.name, storeGroup.name) &&
        Objects.equals(this.currency, storeGroup.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeGroupId, generalRating, generalRatingCount, deliveryMenuMessage, pickupMenuMessage, brandIds, name, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreGroup {\n");
    
    sb.append("    storeGroupId: ").append(toIndentedString(storeGroupId)).append("\n");
    sb.append("    generalRating: ").append(toIndentedString(generalRating)).append("\n");
    sb.append("    generalRatingCount: ").append(toIndentedString(generalRatingCount)).append("\n");
    sb.append("    deliveryMenuMessage: ").append(toIndentedString(deliveryMenuMessage)).append("\n");
    sb.append("    pickupMenuMessage: ").append(toIndentedString(pickupMenuMessage)).append("\n");
    sb.append("    brandIds: ").append(toIndentedString(brandIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

