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
import com.flipdish.apiclient.model.ValidValue;
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
 * Field
 */
@ApiModel(description = "Field")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-05T08:07:14.758+01:00")
public class Field {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Key")
  private String key = null;

  @SerializedName("Tooltip")
  private String tooltip = null;

  @SerializedName("Position")
  private Integer position = null;

  @SerializedName("DefaultValue")
  private String defaultValue = null;

  @SerializedName("ValidValues")
  private List<ValidValue> validValues = null;

  @SerializedName("ValidationRegex")
  private String validationRegex = null;

  /**
   * Field Type
   */
  @JsonAdapter(FieldTypeEnum.Adapter.class)
  public enum FieldTypeEnum {
    TEXT("Text"),
    
    TEXTAREA("TextArea"),
    
    INTEGER("Integer"),
    
    DECIMAL("Decimal"),
    
    DATE("Date"),
    
    DATETIME("DateTime"),
    
    TIME("Time"),
    
    SELECT("Select"),
    
    BOOLEAN("Boolean");

    private String value;

    FieldTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FieldTypeEnum fromValue(String text) {
      for (FieldTypeEnum b : FieldTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FieldTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FieldTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FieldTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FieldTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("FieldType")
  private FieldTypeEnum fieldType = null;

  public Field name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Field description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Field key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Key
   * @return key
  **/
  @ApiModelProperty(required = true, value = "Key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Field tooltip(String tooltip) {
    this.tooltip = tooltip;
    return this;
  }

   /**
   * Tooltip
   * @return tooltip
  **/
  @ApiModelProperty(value = "Tooltip")
  public String getTooltip() {
    return tooltip;
  }

  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
  }

  public Field position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Position
   * minimum: 1
   * maximum: 1000
   * @return position
  **/
  @ApiModelProperty(required = true, value = "Position")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public Field defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Default Value
   * @return defaultValue
  **/
  @ApiModelProperty(value = "Default Value")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public Field validValues(List<ValidValue> validValues) {
    this.validValues = validValues;
    return this;
  }

  public Field addValidValuesItem(ValidValue validValuesItem) {
    if (this.validValues == null) {
      this.validValues = new ArrayList<ValidValue>();
    }
    this.validValues.add(validValuesItem);
    return this;
  }

   /**
   * Valid Values  &lt;remarks&gt;Used typically for dropdown/select&lt;/remarks&gt;
   * @return validValues
  **/
  @ApiModelProperty(value = "Valid Values  <remarks>Used typically for dropdown/select</remarks>")
  public List<ValidValue> getValidValues() {
    return validValues;
  }

  public void setValidValues(List<ValidValue> validValues) {
    this.validValues = validValues;
  }

  public Field validationRegex(String validationRegex) {
    this.validationRegex = validationRegex;
    return this;
  }

   /**
   * Validation Regex
   * @return validationRegex
  **/
  @ApiModelProperty(value = "Validation Regex")
  public String getValidationRegex() {
    return validationRegex;
  }

  public void setValidationRegex(String validationRegex) {
    this.validationRegex = validationRegex;
  }

  public Field fieldType(FieldTypeEnum fieldType) {
    this.fieldType = fieldType;
    return this;
  }

   /**
   * Field Type
   * @return fieldType
  **/
  @ApiModelProperty(required = true, value = "Field Type")
  public FieldTypeEnum getFieldType() {
    return fieldType;
  }

  public void setFieldType(FieldTypeEnum fieldType) {
    this.fieldType = fieldType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Field field = (Field) o;
    return Objects.equals(this.name, field.name) &&
        Objects.equals(this.description, field.description) &&
        Objects.equals(this.key, field.key) &&
        Objects.equals(this.tooltip, field.tooltip) &&
        Objects.equals(this.position, field.position) &&
        Objects.equals(this.defaultValue, field.defaultValue) &&
        Objects.equals(this.validValues, field.validValues) &&
        Objects.equals(this.validationRegex, field.validationRegex) &&
        Objects.equals(this.fieldType, field.fieldType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, key, tooltip, position, defaultValue, validValues, validationRegex, fieldType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Field {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    validValues: ").append(toIndentedString(validValues)).append("\n");
    sb.append("    validationRegex: ").append(toIndentedString(validationRegex)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
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

