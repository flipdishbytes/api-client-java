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
 * Represents an ordering invoice for a period of time.
 */
@ApiModel(description = "Represents an ordering invoice for a period of time.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-03-19T14:39:19.264Z")
public class Invoice {
  @SerializedName("InvoiceNumber")
  private String invoiceNumber = null;

  @SerializedName("StartDay")
  private OffsetDateTime startDay = null;

  @SerializedName("EndDay")
  private OffsetDateTime endDay = null;

  public Invoice invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Invoice Number
   * @return invoiceNumber
  **/
  @ApiModelProperty(value = "Invoice Number")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public Invoice startDay(OffsetDateTime startDay) {
    this.startDay = startDay;
    return this;
  }

   /**
   * The start day of the invoice period.
   * @return startDay
  **/
  @ApiModelProperty(value = "The start day of the invoice period.")
  public OffsetDateTime getStartDay() {
    return startDay;
  }

  public void setStartDay(OffsetDateTime startDay) {
    this.startDay = startDay;
  }

  public Invoice endDay(OffsetDateTime endDay) {
    this.endDay = endDay;
    return this;
  }

   /**
   * The end day of the invoice period.
   * @return endDay
  **/
  @ApiModelProperty(value = "The end day of the invoice period.")
  public OffsetDateTime getEndDay() {
    return endDay;
  }

  public void setEndDay(OffsetDateTime endDay) {
    this.endDay = endDay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.invoiceNumber, invoice.invoiceNumber) &&
        Objects.equals(this.startDay, invoice.startDay) &&
        Objects.equals(this.endDay, invoice.endDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceNumber, startDay, endDay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    startDay: ").append(toIndentedString(startDay)).append("\n");
    sb.append("    endDay: ").append(toIndentedString(endDay)).append("\n");
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

