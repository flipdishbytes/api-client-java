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
import com.flipdish.apiclient.model.DynamicFormRules;
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
 * DynamicFormField
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-03T10:31:00.711+01:00")
public class DynamicFormField {
  @SerializedName("Identifier")
  private String identifier = null;

  @SerializedName("Label")
  private String label = null;

  @SerializedName("Placeholder")
  private String placeholder = null;

  @SerializedName("Rules")
  private DynamicFormRules rules = null;

  @SerializedName("Mapping")
  private Map<String, String> mapping = null;

  @SerializedName("Modifiers")
  private List<String> modifiers = null;

  @SerializedName("Value")
  private Object value = null;

  public DynamicFormField identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @ApiModelProperty(value = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public DynamicFormField label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public DynamicFormField placeholder(String placeholder) {
    this.placeholder = placeholder;
    return this;
  }

   /**
   * Get placeholder
   * @return placeholder
  **/
  @ApiModelProperty(value = "")
  public String getPlaceholder() {
    return placeholder;
  }

  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }

  public DynamicFormField rules(DynamicFormRules rules) {
    this.rules = rules;
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @ApiModelProperty(value = "")
  public DynamicFormRules getRules() {
    return rules;
  }

  public void setRules(DynamicFormRules rules) {
    this.rules = rules;
  }

  public DynamicFormField mapping(Map<String, String> mapping) {
    this.mapping = mapping;
    return this;
  }

  public DynamicFormField putMappingItem(String key, String mappingItem) {
    if (this.mapping == null) {
      this.mapping = new HashMap<String, String>();
    }
    this.mapping.put(key, mappingItem);
    return this;
  }

   /**
   * Get mapping
   * @return mapping
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getMapping() {
    return mapping;
  }

  public void setMapping(Map<String, String> mapping) {
    this.mapping = mapping;
  }

  public DynamicFormField modifiers(List<String> modifiers) {
    this.modifiers = modifiers;
    return this;
  }

  public DynamicFormField addModifiersItem(String modifiersItem) {
    if (this.modifiers == null) {
      this.modifiers = new ArrayList<String>();
    }
    this.modifiers.add(modifiersItem);
    return this;
  }

   /**
   * Get modifiers
   * @return modifiers
  **/
  @ApiModelProperty(value = "")
  public List<String> getModifiers() {
    return modifiers;
  }

  public void setModifiers(List<String> modifiers) {
    this.modifiers = modifiers;
  }

  public DynamicFormField value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicFormField dynamicFormField = (DynamicFormField) o;
    return Objects.equals(this.identifier, dynamicFormField.identifier) &&
        Objects.equals(this.label, dynamicFormField.label) &&
        Objects.equals(this.placeholder, dynamicFormField.placeholder) &&
        Objects.equals(this.rules, dynamicFormField.rules) &&
        Objects.equals(this.mapping, dynamicFormField.mapping) &&
        Objects.equals(this.modifiers, dynamicFormField.modifiers) &&
        Objects.equals(this.value, dynamicFormField.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, label, placeholder, rules, mapping, modifiers, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicFormField {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
    sb.append("    modifiers: ").append(toIndentedString(modifiers)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

