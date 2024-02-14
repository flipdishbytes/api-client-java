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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Store address
 */
@ApiModel(description = "Store address")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-14T11:06:08.488Z")
public class StoreAddress {
  @SerializedName("AddressId")
  private Integer addressId = null;

  @SerializedName("Coordinates")
  private Coordinates coordinates = null;

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

  public StoreAddress addressId(Integer addressId) {
    this.addressId = addressId;
    return this;
  }

   /**
   * Address identifier
   * @return addressId
  **/
  @ApiModelProperty(value = "Address identifier")
  public Integer getAddressId() {
    return addressId;
  }

  public void setAddressId(Integer addressId) {
    this.addressId = addressId;
  }

  public StoreAddress coordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }

   /**
   * Coordinate
   * @return coordinates
  **/
  @ApiModelProperty(value = "Coordinate")
  public Coordinates getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
  }

  public StoreAddress line1(String line1) {
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

  public StoreAddress postcode(String postcode) {
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

  public StoreAddress city(String city) {
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

  public StoreAddress countryCode(String countryCode) {
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

  public StoreAddress displayForCustomer(String displayForCustomer) {
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

  public StoreAddress addressFields(Map<String, Object> addressFields) {
    this.addressFields = addressFields;
    return this;
  }

  public StoreAddress putAddressFieldsItem(String key, Object addressFieldsItem) {
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

  public StoreAddress singleLineDisplay(String singleLineDisplay) {
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

  public StoreAddress twoLinesDisplay(List<String> twoLinesDisplay) {
    this.twoLinesDisplay = twoLinesDisplay;
    return this;
  }

  public StoreAddress addTwoLinesDisplayItem(String twoLinesDisplayItem) {
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
    StoreAddress storeAddress = (StoreAddress) o;
    return Objects.equals(this.addressId, storeAddress.addressId) &&
        Objects.equals(this.coordinates, storeAddress.coordinates) &&
        Objects.equals(this.line1, storeAddress.line1) &&
        Objects.equals(this.postcode, storeAddress.postcode) &&
        Objects.equals(this.city, storeAddress.city) &&
        Objects.equals(this.countryCode, storeAddress.countryCode) &&
        Objects.equals(this.displayForCustomer, storeAddress.displayForCustomer) &&
        Objects.equals(this.addressFields, storeAddress.addressFields) &&
        Objects.equals(this.singleLineDisplay, storeAddress.singleLineDisplay) &&
        Objects.equals(this.twoLinesDisplay, storeAddress.twoLinesDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressId, coordinates, line1, postcode, city, countryCode, displayForCustomer, addressFields, singleLineDisplay, twoLinesDisplay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreAddress {\n");
    
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
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

