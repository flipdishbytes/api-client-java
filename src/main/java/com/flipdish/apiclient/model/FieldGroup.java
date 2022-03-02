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
import com.flipdish.apiclient.model.Field;
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
 * Field Group
 */
@ApiModel(description = "Field Group")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T15:41:59.208Z")
public class FieldGroup {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Tooltip")
  private String tooltip = null;

  @SerializedName("Position")
  private Integer position = null;

  @SerializedName("Fields")
  private List<Field> fields = null;

  public FieldGroup name(String name) {
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

  public FieldGroup description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @ApiModelProperty(value = "Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FieldGroup tooltip(String tooltip) {
    this.tooltip = tooltip;
    return this;
  }

   /**
   * Tooltip  &lt;remarks&gt;Displays on text hover&lt;/remarks&gt;
   * @return tooltip
  **/
  @ApiModelProperty(value = "Tooltip  <remarks>Displays on text hover</remarks>")
  public String getTooltip() {
    return tooltip;
  }

  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
  }

  public FieldGroup position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Position  &lt;remarks&gt;Position order in the field groups to display&lt;/remarks&gt;
   * minimum: 1
   * maximum: 1000
   * @return position
  **/
  @ApiModelProperty(required = true, value = "Position  <remarks>Position order in the field groups to display</remarks>")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public FieldGroup fields(List<Field> fields) {
    this.fields = fields;
    return this;
  }

  public FieldGroup addFieldsItem(Field fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<Field>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Fields
   * @return fields
  **/
  @ApiModelProperty(value = "Fields")
  public List<Field> getFields() {
    return fields;
  }

  public void setFields(List<Field> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldGroup fieldGroup = (FieldGroup) o;
    return Objects.equals(this.name, fieldGroup.name) &&
        Objects.equals(this.description, fieldGroup.description) &&
        Objects.equals(this.tooltip, fieldGroup.tooltip) &&
        Objects.equals(this.position, fieldGroup.position) &&
        Objects.equals(this.fields, fieldGroup.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, tooltip, position, fields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldGroup {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

