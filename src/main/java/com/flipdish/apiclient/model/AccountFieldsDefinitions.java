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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * List of field definitions per country
 */
@ApiModel(description = "List of field definitions per country")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-19T19:41:16.384+01:00")
public class AccountFieldsDefinitions {
  @SerializedName("DefinitionsPerCountry")
  private Map<String, List<AccountFieldDefinition>> definitionsPerCountry = null;

  public AccountFieldsDefinitions definitionsPerCountry(Map<String, List<AccountFieldDefinition>> definitionsPerCountry) {
    this.definitionsPerCountry = definitionsPerCountry;
    return this;
  }

  public AccountFieldsDefinitions putDefinitionsPerCountryItem(String key, List<AccountFieldDefinition> definitionsPerCountryItem) {
    if (this.definitionsPerCountry == null) {
      this.definitionsPerCountry = new HashMap<String, List<AccountFieldDefinition>>();
    }
    this.definitionsPerCountry.put(key, definitionsPerCountryItem);
    return this;
  }

   /**
   * List of field definitions per country
   * @return definitionsPerCountry
  **/
  @ApiModelProperty(value = "List of field definitions per country")
  public Map<String, List<AccountFieldDefinition>> getDefinitionsPerCountry() {
    return definitionsPerCountry;
  }

  public void setDefinitionsPerCountry(Map<String, List<AccountFieldDefinition>> definitionsPerCountry) {
    this.definitionsPerCountry = definitionsPerCountry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountFieldsDefinitions accountFieldsDefinitions = (AccountFieldsDefinitions) o;
    return Objects.equals(this.definitionsPerCountry, accountFieldsDefinitions.definitionsPerCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definitionsPerCountry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountFieldsDefinitions {\n");
    
    sb.append("    definitionsPerCountry: ").append(toIndentedString(definitionsPerCountry)).append("\n");
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

