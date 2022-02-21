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
import com.flipdish.apiclient.model.Coordinates;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Store summary
 */
@ApiModel(description = "Store summary")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-21T10:22:24.124Z")
public class StoreSummary {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("MenuId")
  private Integer menuId = null;

  @SerializedName("Metadata")
  private Map<String, String> metadata = null;

  /**
   * Currency which used by the Store
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

  @SerializedName("Coordinates")
  private Coordinates coordinates = null;

  @SerializedName("StoreTimezone")
  private String storeTimezone = null;

  @SerializedName("StoreGroupId")
  private Integer storeGroupId = null;

  public StoreSummary id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Store identifier
   * @return id
  **/
  @ApiModelProperty(value = "Store identifier")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public StoreSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Store name
   * @return name
  **/
  @ApiModelProperty(value = "Store name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StoreSummary menuId(Integer menuId) {
    this.menuId = menuId;
    return this;
  }

   /**
   * Stores menu identifier
   * @return menuId
  **/
  @ApiModelProperty(value = "Stores menu identifier")
  public Integer getMenuId() {
    return menuId;
  }

  public void setMenuId(Integer menuId) {
    this.menuId = menuId;
  }

  public StoreSummary metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public StoreSummary putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Store metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "Store metadata")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public StoreSummary currency(CurrencyEnum currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency which used by the Store
   * @return currency
  **/
  @ApiModelProperty(value = "Currency which used by the Store")
  public CurrencyEnum getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }

  public StoreSummary coordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }

   /**
   * Latitude and longitude of the store
   * @return coordinates
  **/
  @ApiModelProperty(value = "Latitude and longitude of the store")
  public Coordinates getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
  }

  public StoreSummary storeTimezone(String storeTimezone) {
    this.storeTimezone = storeTimezone;
    return this;
  }

   /**
   * Timezone of store
   * @return storeTimezone
  **/
  @ApiModelProperty(value = "Timezone of store")
  public String getStoreTimezone() {
    return storeTimezone;
  }

  public void setStoreTimezone(String storeTimezone) {
    this.storeTimezone = storeTimezone;
  }

  public StoreSummary storeGroupId(Integer storeGroupId) {
    this.storeGroupId = storeGroupId;
    return this;
  }

   /**
   * Store group id of store
   * @return storeGroupId
  **/
  @ApiModelProperty(value = "Store group id of store")
  public Integer getStoreGroupId() {
    return storeGroupId;
  }

  public void setStoreGroupId(Integer storeGroupId) {
    this.storeGroupId = storeGroupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreSummary storeSummary = (StoreSummary) o;
    return Objects.equals(this.id, storeSummary.id) &&
        Objects.equals(this.name, storeSummary.name) &&
        Objects.equals(this.menuId, storeSummary.menuId) &&
        Objects.equals(this.metadata, storeSummary.metadata) &&
        Objects.equals(this.currency, storeSummary.currency) &&
        Objects.equals(this.coordinates, storeSummary.coordinates) &&
        Objects.equals(this.storeTimezone, storeSummary.storeTimezone) &&
        Objects.equals(this.storeGroupId, storeSummary.storeGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, menuId, metadata, currency, coordinates, storeTimezone, storeGroupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    storeTimezone: ").append(toIndentedString(storeTimezone)).append("\n");
    sb.append("    storeGroupId: ").append(toIndentedString(storeGroupId)).append("\n");
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

