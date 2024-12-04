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
import org.threeten.bp.OffsetDateTime;

/**
 * TelemetrySeriesQueryParameters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-12-04T10:31:49.133Z")
public class TelemetrySeriesQueryParameters {
  @SerializedName("KioskId")
  private String kioskId = null;

  @SerializedName("Variables")
  private List<String> variables = null;

  @SerializedName("StartDate")
  private OffsetDateTime startDate = null;

  @SerializedName("EndDate")
  private OffsetDateTime endDate = null;

  public TelemetrySeriesQueryParameters kioskId(String kioskId) {
    this.kioskId = kioskId;
    return this;
  }

   /**
   * Get kioskId
   * @return kioskId
  **/
  @ApiModelProperty(value = "")
  public String getKioskId() {
    return kioskId;
  }

  public void setKioskId(String kioskId) {
    this.kioskId = kioskId;
  }

  public TelemetrySeriesQueryParameters variables(List<String> variables) {
    this.variables = variables;
    return this;
  }

  public TelemetrySeriesQueryParameters addVariablesItem(String variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<String>();
    }
    this.variables.add(variablesItem);
    return this;
  }

   /**
   * Get variables
   * @return variables
  **/
  @ApiModelProperty(value = "")
  public List<String> getVariables() {
    return variables;
  }

  public void setVariables(List<String> variables) {
    this.variables = variables;
  }

  public TelemetrySeriesQueryParameters startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public TelemetrySeriesQueryParameters endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelemetrySeriesQueryParameters telemetrySeriesQueryParameters = (TelemetrySeriesQueryParameters) o;
    return Objects.equals(this.kioskId, telemetrySeriesQueryParameters.kioskId) &&
        Objects.equals(this.variables, telemetrySeriesQueryParameters.variables) &&
        Objects.equals(this.startDate, telemetrySeriesQueryParameters.startDate) &&
        Objects.equals(this.endDate, telemetrySeriesQueryParameters.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kioskId, variables, startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelemetrySeriesQueryParameters {\n");
    
    sb.append("    kioskId: ").append(toIndentedString(kioskId)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

