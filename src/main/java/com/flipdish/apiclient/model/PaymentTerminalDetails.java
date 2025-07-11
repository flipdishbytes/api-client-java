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

/**
 * Details of Payment Terminal
 */
@ApiModel(description = "Details of Payment Terminal")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class PaymentTerminalDetails {
  @SerializedName("TerminalId")
  private String terminalId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Currency")
  private String currency = null;

  @SerializedName("Uri")
  private String uri = null;

  public PaymentTerminalDetails terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

   /**
   * Terminal Id (tid)
   * @return terminalId
  **/
  @ApiModelProperty(value = "Terminal Id (tid)")
  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  public PaymentTerminalDetails status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of Terminal
   * @return status
  **/
  @ApiModelProperty(value = "Status of Terminal")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PaymentTerminalDetails currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency configured on the terminal
   * @return currency
  **/
  @ApiModelProperty(value = "Currency configured on the terminal")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PaymentTerminalDetails uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Location to Device
   * @return uri
  **/
  @ApiModelProperty(value = "Location to Device")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTerminalDetails paymentTerminalDetails = (PaymentTerminalDetails) o;
    return Objects.equals(this.terminalId, paymentTerminalDetails.terminalId) &&
        Objects.equals(this.status, paymentTerminalDetails.status) &&
        Objects.equals(this.currency, paymentTerminalDetails.currency) &&
        Objects.equals(this.uri, paymentTerminalDetails.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terminalId, status, currency, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminalDetails {\n");
    
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

