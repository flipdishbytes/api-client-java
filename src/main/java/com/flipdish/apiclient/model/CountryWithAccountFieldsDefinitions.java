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
import com.flipdish.apiclient.model.AccountFieldDefinition;
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
 * List of field definitions per country
 */
@ApiModel(description = "List of field definitions per country")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-02-12T15:58:55.291Z")
public class CountryWithAccountFieldsDefinitions {
  @SerializedName("CountryCode")
  private String countryCode = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("SupportType")
  private String supportType = null;

  @SerializedName("FieldDefinitions")
  private List<AccountFieldDefinition> fieldDefinitions = null;

  public CountryWithAccountFieldsDefinitions countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Country 2-letter ISO code
   * @return countryCode
  **/
  @ApiModelProperty(value = "Country 2-letter ISO code")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public CountryWithAccountFieldsDefinitions displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name of the country
   * @return displayName
  **/
  @ApiModelProperty(value = "Display name of the country")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public CountryWithAccountFieldsDefinitions supportType(String supportType) {
    this.supportType = supportType;
    return this;
  }

   /**
   * Country support type (supported-by-stripe-cc, supported-by-flipdish,not-supported)
   * @return supportType
  **/
  @ApiModelProperty(value = "Country support type (supported-by-stripe-cc, supported-by-flipdish,not-supported)")
  public String getSupportType() {
    return supportType;
  }

  public void setSupportType(String supportType) {
    this.supportType = supportType;
  }

  public CountryWithAccountFieldsDefinitions fieldDefinitions(List<AccountFieldDefinition> fieldDefinitions) {
    this.fieldDefinitions = fieldDefinitions;
    return this;
  }

  public CountryWithAccountFieldsDefinitions addFieldDefinitionsItem(AccountFieldDefinition fieldDefinitionsItem) {
    if (this.fieldDefinitions == null) {
      this.fieldDefinitions = new ArrayList<AccountFieldDefinition>();
    }
    this.fieldDefinitions.add(fieldDefinitionsItem);
    return this;
  }

   /**
   * Bank Account field definitions
   * @return fieldDefinitions
  **/
  @ApiModelProperty(value = "Bank Account field definitions")
  public List<AccountFieldDefinition> getFieldDefinitions() {
    return fieldDefinitions;
  }

  public void setFieldDefinitions(List<AccountFieldDefinition> fieldDefinitions) {
    this.fieldDefinitions = fieldDefinitions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryWithAccountFieldsDefinitions countryWithAccountFieldsDefinitions = (CountryWithAccountFieldsDefinitions) o;
    return Objects.equals(this.countryCode, countryWithAccountFieldsDefinitions.countryCode) &&
        Objects.equals(this.displayName, countryWithAccountFieldsDefinitions.displayName) &&
        Objects.equals(this.supportType, countryWithAccountFieldsDefinitions.supportType) &&
        Objects.equals(this.fieldDefinitions, countryWithAccountFieldsDefinitions.fieldDefinitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, displayName, supportType, fieldDefinitions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryWithAccountFieldsDefinitions {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    supportType: ").append(toIndentedString(supportType)).append("\n");
    sb.append("    fieldDefinitions: ").append(toIndentedString(fieldDefinitions)).append("\n");
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

