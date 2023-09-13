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
 * Delivery location
 */
@ApiModel(description = "Delivery location")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T10:27:27.625Z")
public class DeliveryLocation {
  @SerializedName("Coordinates")
  private Coordinates coordinates = null;

  @SerializedName("Building")
  private String building = null;

  @SerializedName("Street")
  private String street = null;

  @SerializedName("Town")
  private String town = null;

  @SerializedName("PostCode")
  private String postCode = null;

  @SerializedName("DeliveryInstructions")
  private String deliveryInstructions = null;

  @SerializedName("PrettyAddressString")
  private String prettyAddressString = null;

  public DeliveryLocation coordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }

   /**
   * Geo cordinate
   * @return coordinates
  **/
  @ApiModelProperty(value = "Geo cordinate")
  public Coordinates getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
  }

  public DeliveryLocation building(String building) {
    this.building = building;
    return this;
  }

   /**
   * Building
   * @return building
  **/
  @ApiModelProperty(value = "Building")
  public String getBuilding() {
    return building;
  }

  public void setBuilding(String building) {
    this.building = building;
  }

  public DeliveryLocation street(String street) {
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

  public DeliveryLocation town(String town) {
    this.town = town;
    return this;
  }

   /**
   * Town
   * @return town
  **/
  @ApiModelProperty(value = "Town")
  public String getTown() {
    return town;
  }

  public void setTown(String town) {
    this.town = town;
  }

  public DeliveryLocation postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

   /**
   * Post code
   * @return postCode
  **/
  @ApiModelProperty(value = "Post code")
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public DeliveryLocation deliveryInstructions(String deliveryInstructions) {
    this.deliveryInstructions = deliveryInstructions;
    return this;
  }

   /**
   * Delivery instructions
   * @return deliveryInstructions
  **/
  @ApiModelProperty(value = "Delivery instructions")
  public String getDeliveryInstructions() {
    return deliveryInstructions;
  }

  public void setDeliveryInstructions(String deliveryInstructions) {
    this.deliveryInstructions = deliveryInstructions;
  }

  public DeliveryLocation prettyAddressString(String prettyAddressString) {
    this.prettyAddressString = prettyAddressString;
    return this;
  }

   /**
   * Formatted, pretty address string
   * @return prettyAddressString
  **/
  @ApiModelProperty(value = "Formatted, pretty address string")
  public String getPrettyAddressString() {
    return prettyAddressString;
  }

  public void setPrettyAddressString(String prettyAddressString) {
    this.prettyAddressString = prettyAddressString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryLocation deliveryLocation = (DeliveryLocation) o;
    return Objects.equals(this.coordinates, deliveryLocation.coordinates) &&
        Objects.equals(this.building, deliveryLocation.building) &&
        Objects.equals(this.street, deliveryLocation.street) &&
        Objects.equals(this.town, deliveryLocation.town) &&
        Objects.equals(this.postCode, deliveryLocation.postCode) &&
        Objects.equals(this.deliveryInstructions, deliveryLocation.deliveryInstructions) &&
        Objects.equals(this.prettyAddressString, deliveryLocation.prettyAddressString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinates, building, street, town, postCode, deliveryInstructions, prettyAddressString);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryLocation {\n");
    
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    town: ").append(toIndentedString(town)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    deliveryInstructions: ").append(toIndentedString(deliveryInstructions)).append("\n");
    sb.append("    prettyAddressString: ").append(toIndentedString(prettyAddressString)).append("\n");
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

