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
import com.flipdish.apiclient.model.TelemetrySeriesProperty;
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
import org.threeten.bp.OffsetDateTime;

/**
 * TelemetrySeriesResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-19T12:03:09.347Z")
public class TelemetrySeriesResult {
  @SerializedName("Timestamps")
  private List<OffsetDateTime> timestamps = null;

  @SerializedName("Properties")
  private List<TelemetrySeriesProperty> properties = null;

  public TelemetrySeriesResult timestamps(List<OffsetDateTime> timestamps) {
    this.timestamps = timestamps;
    return this;
  }

  public TelemetrySeriesResult addTimestampsItem(OffsetDateTime timestampsItem) {
    if (this.timestamps == null) {
      this.timestamps = new ArrayList<OffsetDateTime>();
    }
    this.timestamps.add(timestampsItem);
    return this;
  }

   /**
   * Get timestamps
   * @return timestamps
  **/
  @ApiModelProperty(value = "")
  public List<OffsetDateTime> getTimestamps() {
    return timestamps;
  }

  public void setTimestamps(List<OffsetDateTime> timestamps) {
    this.timestamps = timestamps;
  }

  public TelemetrySeriesResult properties(List<TelemetrySeriesProperty> properties) {
    this.properties = properties;
    return this;
  }

  public TelemetrySeriesResult addPropertiesItem(TelemetrySeriesProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<TelemetrySeriesProperty>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public List<TelemetrySeriesProperty> getProperties() {
    return properties;
  }

  public void setProperties(List<TelemetrySeriesProperty> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelemetrySeriesResult telemetrySeriesResult = (TelemetrySeriesResult) o;
    return Objects.equals(this.timestamps, telemetrySeriesResult.timestamps) &&
        Objects.equals(this.properties, telemetrySeriesResult.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamps, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelemetrySeriesResult {\n");
    
    sb.append("    timestamps: ").append(toIndentedString(timestamps)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

