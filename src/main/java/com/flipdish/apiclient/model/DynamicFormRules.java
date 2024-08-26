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
import com.flipdish.apiclient.model.DynamicFormFieldOption;
import com.flipdish.apiclient.model.DynamicFormRule;
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
 * DynamicFormRules
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-08-26T14:15:08.808Z")
public class DynamicFormRules {
  @SerializedName("MaxLength")
  private DynamicFormRule maxLength = null;

  @SerializedName("MinLength")
  private DynamicFormRule minLength = null;

  @SerializedName("Required")
  private DynamicFormRule required = null;

  @SerializedName("Pattern")
  private DynamicFormRule pattern = null;

  @SerializedName("Predefined")
  private List<DynamicFormFieldOption> predefined = null;

  public DynamicFormRules maxLength(DynamicFormRule maxLength) {
    this.maxLength = maxLength;
    return this;
  }

   /**
   * Get maxLength
   * @return maxLength
  **/
  @ApiModelProperty(value = "")
  public DynamicFormRule getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(DynamicFormRule maxLength) {
    this.maxLength = maxLength;
  }

  public DynamicFormRules minLength(DynamicFormRule minLength) {
    this.minLength = minLength;
    return this;
  }

   /**
   * Get minLength
   * @return minLength
  **/
  @ApiModelProperty(value = "")
  public DynamicFormRule getMinLength() {
    return minLength;
  }

  public void setMinLength(DynamicFormRule minLength) {
    this.minLength = minLength;
  }

  public DynamicFormRules required(DynamicFormRule required) {
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @ApiModelProperty(value = "")
  public DynamicFormRule getRequired() {
    return required;
  }

  public void setRequired(DynamicFormRule required) {
    this.required = required;
  }

  public DynamicFormRules pattern(DynamicFormRule pattern) {
    this.pattern = pattern;
    return this;
  }

   /**
   * Get pattern
   * @return pattern
  **/
  @ApiModelProperty(value = "")
  public DynamicFormRule getPattern() {
    return pattern;
  }

  public void setPattern(DynamicFormRule pattern) {
    this.pattern = pattern;
  }

  public DynamicFormRules predefined(List<DynamicFormFieldOption> predefined) {
    this.predefined = predefined;
    return this;
  }

  public DynamicFormRules addPredefinedItem(DynamicFormFieldOption predefinedItem) {
    if (this.predefined == null) {
      this.predefined = new ArrayList<DynamicFormFieldOption>();
    }
    this.predefined.add(predefinedItem);
    return this;
  }

   /**
   * Get predefined
   * @return predefined
  **/
  @ApiModelProperty(value = "")
  public List<DynamicFormFieldOption> getPredefined() {
    return predefined;
  }

  public void setPredefined(List<DynamicFormFieldOption> predefined) {
    this.predefined = predefined;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicFormRules dynamicFormRules = (DynamicFormRules) o;
    return Objects.equals(this.maxLength, dynamicFormRules.maxLength) &&
        Objects.equals(this.minLength, dynamicFormRules.minLength) &&
        Objects.equals(this.required, dynamicFormRules.required) &&
        Objects.equals(this.pattern, dynamicFormRules.pattern) &&
        Objects.equals(this.predefined, dynamicFormRules.predefined);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxLength, minLength, required, pattern, predefined);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicFormRules {\n");
    
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    predefined: ").append(toIndentedString(predefined)).append("\n");
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

