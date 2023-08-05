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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Store address base
 */
@ApiModel(description = "Store address base")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-08-05T11:32:36.536+01:00")
public class StoreAddressBase {
  @SerializedName("Line1")
  private String line1 = null;

  @SerializedName("Postcode")
  private String postcode = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("CountryCode")
  private String countryCode = null;

  @SerializedName("DisplayForCustomer")
  private String displayForCustomer = null;

  @SerializedName("AddressFields")
  private Map<String, Object> addressFields = null;

  @SerializedName("SingleLineDisplay")
  private String singleLineDisplay = null;

  @SerializedName("TwoLinesDisplay")
  private List<String> twoLinesDisplay = null;

  public StoreAddressBase line1(String line1) {
    this.line1 = line1;
    return this;
  }

   /**
   * Address line 1
   * @return line1
  **/
  @ApiModelProperty(value = "Address line 1")
  public String getLine1() {
    return line1;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }

  public StoreAddressBase postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

   /**
   * Postcode
   * @return postcode
  **/
  @ApiModelProperty(value = "Postcode")
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public StoreAddressBase city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City
   * @return city
  **/
  @ApiModelProperty(value = "City")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public StoreAddressBase countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Country code (ISO-alpha2)
   * @return countryCode
  **/
  @ApiModelProperty(value = "Country code (ISO-alpha2)")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public StoreAddressBase displayForCustomer(String displayForCustomer) {
    this.displayForCustomer = displayForCustomer;
    return this;
  }

   /**
   * Display for customer
   * @return displayForCustomer
  **/
  @ApiModelProperty(value = "Display for customer")
  public String getDisplayForCustomer() {
    return displayForCustomer;
  }

  public void setDisplayForCustomer(String displayForCustomer) {
    this.displayForCustomer = displayForCustomer;
  }

  public StoreAddressBase addressFields(Map<String, Object> addressFields) {
    this.addressFields = addressFields;
    return this;
  }

  public StoreAddressBase putAddressFieldsItem(String key, Object addressFieldsItem) {
    if (this.addressFields == null) {
      this.addressFields = new HashMap<String, Object>();
    }
    this.addressFields.put(key, addressFieldsItem);
    return this;
  }

   /**
   * Dyanmic field/value pairs, defined by the form assigned to the given country code.
   * @return addressFields
  **/
  @ApiModelProperty(value = "Dyanmic field/value pairs, defined by the form assigned to the given country code.")
  public Map<String, Object> getAddressFields() {
    return addressFields;
  }

  public void setAddressFields(Map<String, Object> addressFields) {
    this.addressFields = addressFields;
  }

  public StoreAddressBase singleLineDisplay(String singleLineDisplay) {
    this.singleLineDisplay = singleLineDisplay;
    return this;
  }

   /**
   * Single line display i18n, may be empty for not supported countries
   * @return singleLineDisplay
  **/
  @ApiModelProperty(value = "Single line display i18n, may be empty for not supported countries")
  public String getSingleLineDisplay() {
    return singleLineDisplay;
  }

  public void setSingleLineDisplay(String singleLineDisplay) {
    this.singleLineDisplay = singleLineDisplay;
  }

  public StoreAddressBase twoLinesDisplay(List<String> twoLinesDisplay) {
    this.twoLinesDisplay = twoLinesDisplay;
    return this;
  }

  public StoreAddressBase addTwoLinesDisplayItem(String twoLinesDisplayItem) {
    if (this.twoLinesDisplay == null) {
      this.twoLinesDisplay = new ArrayList<String>();
    }
    this.twoLinesDisplay.add(twoLinesDisplayItem);
    return this;
  }

   /**
   * Two line display i18n, may be empty for not supported countries
   * @return twoLinesDisplay
  **/
  @ApiModelProperty(value = "Two line display i18n, may be empty for not supported countries")
  public List<String> getTwoLinesDisplay() {
    return twoLinesDisplay;
  }

  public void setTwoLinesDisplay(List<String> twoLinesDisplay) {
    this.twoLinesDisplay = twoLinesDisplay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreAddressBase storeAddressBase = (StoreAddressBase) o;
    return Objects.equals(this.line1, storeAddressBase.line1) &&
        Objects.equals(this.postcode, storeAddressBase.postcode) &&
        Objects.equals(this.city, storeAddressBase.city) &&
        Objects.equals(this.countryCode, storeAddressBase.countryCode) &&
        Objects.equals(this.displayForCustomer, storeAddressBase.displayForCustomer) &&
        Objects.equals(this.addressFields, storeAddressBase.addressFields) &&
        Objects.equals(this.singleLineDisplay, storeAddressBase.singleLineDisplay) &&
        Objects.equals(this.twoLinesDisplay, storeAddressBase.twoLinesDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(line1, postcode, city, countryCode, displayForCustomer, addressFields, singleLineDisplay, twoLinesDisplay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreAddressBase {\n");
    
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    displayForCustomer: ").append(toIndentedString(displayForCustomer)).append("\n");
    sb.append("    addressFields: ").append(toIndentedString(addressFields)).append("\n");
    sb.append("    singleLineDisplay: ").append(toIndentedString(singleLineDisplay)).append("\n");
    sb.append("    twoLinesDisplay: ").append(toIndentedString(twoLinesDisplay)).append("\n");
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

