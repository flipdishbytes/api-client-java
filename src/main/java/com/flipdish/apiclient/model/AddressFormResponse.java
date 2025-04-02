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
import com.flipdish.apiclient.model.AddressFormDisplayFormat;
import com.flipdish.apiclient.model.DynamicFormField;
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
 * A response of a dyanmic form definition.
 */
@ApiModel(description = "A response of a dyanmic form definition.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-02T09:34:05.773Z")
public class AddressFormResponse {
  @SerializedName("FormData")
  private List<DynamicFormField> formData = null;

  @SerializedName("CountryCode")
  private String countryCode = null;

  @SerializedName("Language")
  private String language = null;

  @SerializedName("DisplayFormat")
  private AddressFormDisplayFormat displayFormat = null;

  public AddressFormResponse formData(List<DynamicFormField> formData) {
    this.formData = formData;
    return this;
  }

  public AddressFormResponse addFormDataItem(DynamicFormField formDataItem) {
    if (this.formData == null) {
      this.formData = new ArrayList<DynamicFormField>();
    }
    this.formData.add(formDataItem);
    return this;
  }

   /**
   * List of field definitions.
   * @return formData
  **/
  @ApiModelProperty(value = "List of field definitions.")
  public List<DynamicFormField> getFormData() {
    return formData;
  }

  public void setFormData(List<DynamicFormField> formData) {
    this.formData = formData;
  }

  public AddressFormResponse countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * ISO two letter code.
   * @return countryCode
  **/
  @ApiModelProperty(value = "ISO two letter code.")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public AddressFormResponse language(String language) {
    this.language = language;
    return this;
  }

   /**
   * ISO culture code.
   * @return language
  **/
  @ApiModelProperty(value = "ISO culture code.")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public AddressFormResponse displayFormat(AddressFormDisplayFormat displayFormat) {
    this.displayFormat = displayFormat;
    return this;
  }

   /**
   * Templates used to format form fields when displaying items in a list.
   * @return displayFormat
  **/
  @ApiModelProperty(value = "Templates used to format form fields when displaying items in a list.")
  public AddressFormDisplayFormat getDisplayFormat() {
    return displayFormat;
  }

  public void setDisplayFormat(AddressFormDisplayFormat displayFormat) {
    this.displayFormat = displayFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressFormResponse addressFormResponse = (AddressFormResponse) o;
    return Objects.equals(this.formData, addressFormResponse.formData) &&
        Objects.equals(this.countryCode, addressFormResponse.countryCode) &&
        Objects.equals(this.language, addressFormResponse.language) &&
        Objects.equals(this.displayFormat, addressFormResponse.displayFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formData, countryCode, language, displayFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressFormResponse {\n");
    
    sb.append("    formData: ").append(toIndentedString(formData)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    displayFormat: ").append(toIndentedString(displayFormat)).append("\n");
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

