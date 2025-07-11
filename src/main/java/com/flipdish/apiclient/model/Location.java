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

/**
 * Location to deliver to
 */
@ApiModel(description = "Location to deliver to")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class Location {
  @SerializedName("AddressLine1")
  private String addressLine1 = null;

  @SerializedName("AddressLine2")
  private String addressLine2 = null;

  @SerializedName("FormattedAddress")
  private String formattedAddress = null;

  @SerializedName("PostalCode")
  private String postalCode = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("Coordinates")
  private Coordinates coordinates = null;

  @SerializedName("Notes")
  private String notes = null;

  public Location addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Line 1 of the address
   * @return addressLine1
  **/
  @ApiModelProperty(value = "Line 1 of the address")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public Location addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Line 2 of the address
   * @return addressLine2
  **/
  @ApiModelProperty(value = "Line 2 of the address")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public Location formattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
    return this;
  }

   /**
   * Formatted Address
   * @return formattedAddress
  **/
  @ApiModelProperty(value = "Formatted Address")
  public String getFormattedAddress() {
    return formattedAddress;
  }

  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
  }

  public Location postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal / Zip Code
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal / Zip Code")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Location city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City to deliver to
   * @return city
  **/
  @ApiModelProperty(value = "City to deliver to")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Location coordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }

   /**
   * Coordinates to deliver to
   * @return coordinates
  **/
  @ApiModelProperty(value = "Coordinates to deliver to")
  public Coordinates getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
  }

  public Location notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Notes for delivery
   * @return notes
  **/
  @ApiModelProperty(value = "Notes for delivery")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.addressLine1, location.addressLine1) &&
        Objects.equals(this.addressLine2, location.addressLine2) &&
        Objects.equals(this.formattedAddress, location.formattedAddress) &&
        Objects.equals(this.postalCode, location.postalCode) &&
        Objects.equals(this.city, location.city) &&
        Objects.equals(this.coordinates, location.coordinates) &&
        Objects.equals(this.notes, location.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2, formattedAddress, postalCode, city, coordinates, notes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    formattedAddress: ").append(toIndentedString(formattedAddress)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

