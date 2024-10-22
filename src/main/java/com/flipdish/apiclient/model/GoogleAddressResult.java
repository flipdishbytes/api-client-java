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
import com.flipdish.apiclient.model.GoogleAddressComponent;
import com.flipdish.apiclient.model.GoogleGeometry;
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
 * GoogleAddressResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-22T14:01:52.558Z")
public class GoogleAddressResult {
  @SerializedName("Address_components")
  private List<GoogleAddressComponent> addressComponents = null;

  @SerializedName("Formatted_address")
  private String formattedAddress = null;

  @SerializedName("Geometry")
  private GoogleGeometry geometry = null;

  @SerializedName("Place_id")
  private String placeId = null;

  @SerializedName("Types")
  private List<String> types = null;

  public GoogleAddressResult addressComponents(List<GoogleAddressComponent> addressComponents) {
    this.addressComponents = addressComponents;
    return this;
  }

  public GoogleAddressResult addAddressComponentsItem(GoogleAddressComponent addressComponentsItem) {
    if (this.addressComponents == null) {
      this.addressComponents = new ArrayList<GoogleAddressComponent>();
    }
    this.addressComponents.add(addressComponentsItem);
    return this;
  }

   /**
   * Get addressComponents
   * @return addressComponents
  **/
  @ApiModelProperty(value = "")
  public List<GoogleAddressComponent> getAddressComponents() {
    return addressComponents;
  }

  public void setAddressComponents(List<GoogleAddressComponent> addressComponents) {
    this.addressComponents = addressComponents;
  }

  public GoogleAddressResult formattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
    return this;
  }

   /**
   * Get formattedAddress
   * @return formattedAddress
  **/
  @ApiModelProperty(value = "")
  public String getFormattedAddress() {
    return formattedAddress;
  }

  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
  }

  public GoogleAddressResult geometry(GoogleGeometry geometry) {
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @ApiModelProperty(value = "")
  public GoogleGeometry getGeometry() {
    return geometry;
  }

  public void setGeometry(GoogleGeometry geometry) {
    this.geometry = geometry;
  }

  public GoogleAddressResult placeId(String placeId) {
    this.placeId = placeId;
    return this;
  }

   /**
   * Get placeId
   * @return placeId
  **/
  @ApiModelProperty(value = "")
  public String getPlaceId() {
    return placeId;
  }

  public void setPlaceId(String placeId) {
    this.placeId = placeId;
  }

  public GoogleAddressResult types(List<String> types) {
    this.types = types;
    return this;
  }

  public GoogleAddressResult addTypesItem(String typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<String>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  @ApiModelProperty(value = "")
  public List<String> getTypes() {
    return types;
  }

  public void setTypes(List<String> types) {
    this.types = types;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleAddressResult googleAddressResult = (GoogleAddressResult) o;
    return Objects.equals(this.addressComponents, googleAddressResult.addressComponents) &&
        Objects.equals(this.formattedAddress, googleAddressResult.formattedAddress) &&
        Objects.equals(this.geometry, googleAddressResult.geometry) &&
        Objects.equals(this.placeId, googleAddressResult.placeId) &&
        Objects.equals(this.types, googleAddressResult.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressComponents, formattedAddress, geometry, placeId, types);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleAddressResult {\n");
    
    sb.append("    addressComponents: ").append(toIndentedString(addressComponents)).append("\n");
    sb.append("    formattedAddress: ").append(toIndentedString(formattedAddress)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    placeId: ").append(toIndentedString(placeId)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

