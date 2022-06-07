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

/**
 * Job Address
 */
@ApiModel(description = "Job Address")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-07T08:19:41.202+01:00")
public class JobAddress {
  @SerializedName("Street")
  private String street = null;

  @SerializedName("Postcode")
  private String postcode = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("Country")
  private String country = null;

  @SerializedName("Zone")
  private String zone = null;

  @SerializedName("FormattedAddress")
  private String formattedAddress = null;

  public JobAddress street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Street
   * @return street
  **/
  @ApiModelProperty(value = "Street")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public JobAddress postcode(String postcode) {
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

  public JobAddress city(String city) {
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

  public JobAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country
   * @return country
  **/
  @ApiModelProperty(value = "Country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public JobAddress zone(String zone) {
    this.zone = zone;
    return this;
  }

   /**
   * Zone
   * @return zone
  **/
  @ApiModelProperty(value = "Zone")
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }

  public JobAddress formattedAddress(String formattedAddress) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobAddress jobAddress = (JobAddress) o;
    return Objects.equals(this.street, jobAddress.street) &&
        Objects.equals(this.postcode, jobAddress.postcode) &&
        Objects.equals(this.city, jobAddress.city) &&
        Objects.equals(this.country, jobAddress.country) &&
        Objects.equals(this.zone, jobAddress.zone) &&
        Objects.equals(this.formattedAddress, jobAddress.formattedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, postcode, city, country, zone, formattedAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobAddress {\n");
    
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    formattedAddress: ").append(toIndentedString(formattedAddress)).append("\n");
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

