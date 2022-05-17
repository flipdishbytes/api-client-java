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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Address form payload.
 */
@ApiModel(description = "Address form payload.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-17T12:59:34.139+01:00")
public class StoreAddressForm {
  @SerializedName("AddressFields")
  private Map<String, Object> addressFields = new HashMap<String, Object>();

  @SerializedName("CountryCode")
  private String countryCode = null;

  public StoreAddressForm addressFields(Map<String, Object> addressFields) {
    this.addressFields = addressFields;
    return this;
  }

  public StoreAddressForm putAddressFieldsItem(String key, Object addressFieldsItem) {
    this.addressFields.put(key, addressFieldsItem);
    return this;
  }

   /**
   * The dynamic fields generated by the address form.
   * @return addressFields
  **/
  @ApiModelProperty(required = true, value = "The dynamic fields generated by the address form.")
  public Map<String, Object> getAddressFields() {
    return addressFields;
  }

  public void setAddressFields(Map<String, Object> addressFields) {
    this.addressFields = addressFields;
  }

  public StoreAddressForm countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * ISO 2 letters code for the country, should be the same as the form that generates the fields.
   * @return countryCode
  **/
  @ApiModelProperty(required = true, value = "ISO 2 letters code for the country, should be the same as the form that generates the fields.")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreAddressForm storeAddressForm = (StoreAddressForm) o;
    return Objects.equals(this.addressFields, storeAddressForm.addressFields) &&
        Objects.equals(this.countryCode, storeAddressForm.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressFields, countryCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreAddressForm {\n");
    
    sb.append("    addressFields: ").append(toIndentedString(addressFields)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

