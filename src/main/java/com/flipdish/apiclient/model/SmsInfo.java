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
 * Sms Info
 */
@ApiModel(description = "Sms Info")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-26T10:46:12.007Z")
public class SmsInfo {
  @SerializedName("From")
  private String from = null;

  @SerializedName("To")
  private String to = null;

  @SerializedName("Text")
  private String text = null;

  public SmsInfo from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Origin phone number
   * @return from
  **/
  @ApiModelProperty(value = "Origin phone number")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public SmsInfo to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Destination phone number
   * @return to
  **/
  @ApiModelProperty(value = "Destination phone number")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public SmsInfo text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text message
   * @return text
  **/
  @ApiModelProperty(value = "Text message")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsInfo smsInfo = (SmsInfo) o;
    return Objects.equals(this.from, smsInfo.from) &&
        Objects.equals(this.to, smsInfo.to) &&
        Objects.equals(this.text, smsInfo.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsInfo {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

