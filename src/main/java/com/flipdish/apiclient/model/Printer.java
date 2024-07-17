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
import org.threeten.bp.OffsetDateTime;

/**
 * Printer
 */
@ApiModel(description = "Printer")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-17T15:53:22.758Z")
public class Printer {
  @SerializedName("SerialNumber")
  private String serialNumber = null;

  @SerializedName("LastPollTime")
  private OffsetDateTime lastPollTime = null;

  public Printer serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Unique serial number of the printer
   * @return serialNumber
  **/
  @ApiModelProperty(value = "Unique serial number of the printer")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public Printer lastPollTime(OffsetDateTime lastPollTime) {
    this.lastPollTime = lastPollTime;
    return this;
  }

   /**
   * Date and time when the printer last polled Flipdish for new orders.
   * @return lastPollTime
  **/
  @ApiModelProperty(value = "Date and time when the printer last polled Flipdish for new orders.")
  public OffsetDateTime getLastPollTime() {
    return lastPollTime;
  }

  public void setLastPollTime(OffsetDateTime lastPollTime) {
    this.lastPollTime = lastPollTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Printer printer = (Printer) o;
    return Objects.equals(this.serialNumber, printer.serialNumber) &&
        Objects.equals(this.lastPollTime, printer.lastPollTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serialNumber, lastPollTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Printer {\n");
    
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    lastPollTime: ").append(toIndentedString(lastPollTime)).append("\n");
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

