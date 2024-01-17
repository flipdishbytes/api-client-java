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
import java.util.ArrayList;
import java.util.List;

/**
 * TelemetrySeriesProperty
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-17T10:52:00.997Z")
public class TelemetrySeriesProperty {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("IntValues")
  private List<Integer> intValues = null;

  @SerializedName("StringValues")
  private List<String> stringValues = null;

  @SerializedName("DoubleValues")
  private List<Double> doubleValues = null;

  public TelemetrySeriesProperty name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TelemetrySeriesProperty type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TelemetrySeriesProperty intValues(List<Integer> intValues) {
    this.intValues = intValues;
    return this;
  }

  public TelemetrySeriesProperty addIntValuesItem(Integer intValuesItem) {
    if (this.intValues == null) {
      this.intValues = new ArrayList<Integer>();
    }
    this.intValues.add(intValuesItem);
    return this;
  }

   /**
   * Get intValues
   * @return intValues
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getIntValues() {
    return intValues;
  }

  public void setIntValues(List<Integer> intValues) {
    this.intValues = intValues;
  }

  public TelemetrySeriesProperty stringValues(List<String> stringValues) {
    this.stringValues = stringValues;
    return this;
  }

  public TelemetrySeriesProperty addStringValuesItem(String stringValuesItem) {
    if (this.stringValues == null) {
      this.stringValues = new ArrayList<String>();
    }
    this.stringValues.add(stringValuesItem);
    return this;
  }

   /**
   * Get stringValues
   * @return stringValues
  **/
  @ApiModelProperty(value = "")
  public List<String> getStringValues() {
    return stringValues;
  }

  public void setStringValues(List<String> stringValues) {
    this.stringValues = stringValues;
  }

  public TelemetrySeriesProperty doubleValues(List<Double> doubleValues) {
    this.doubleValues = doubleValues;
    return this;
  }

  public TelemetrySeriesProperty addDoubleValuesItem(Double doubleValuesItem) {
    if (this.doubleValues == null) {
      this.doubleValues = new ArrayList<Double>();
    }
    this.doubleValues.add(doubleValuesItem);
    return this;
  }

   /**
   * Get doubleValues
   * @return doubleValues
  **/
  @ApiModelProperty(value = "")
  public List<Double> getDoubleValues() {
    return doubleValues;
  }

  public void setDoubleValues(List<Double> doubleValues) {
    this.doubleValues = doubleValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelemetrySeriesProperty telemetrySeriesProperty = (TelemetrySeriesProperty) o;
    return Objects.equals(this.name, telemetrySeriesProperty.name) &&
        Objects.equals(this.type, telemetrySeriesProperty.type) &&
        Objects.equals(this.intValues, telemetrySeriesProperty.intValues) &&
        Objects.equals(this.stringValues, telemetrySeriesProperty.stringValues) &&
        Objects.equals(this.doubleValues, telemetrySeriesProperty.doubleValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, intValues, stringValues, doubleValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelemetrySeriesProperty {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    intValues: ").append(toIndentedString(intValues)).append("\n");
    sb.append("    stringValues: ").append(toIndentedString(stringValues)).append("\n");
    sb.append("    doubleValues: ").append(toIndentedString(doubleValues)).append("\n");
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

