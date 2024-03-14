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
 * PayoutReport3DetailsSalesLine
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-14T10:37:35.151Z")
public class PayoutReport3DetailsSalesLine {
  @SerializedName("Online")
  private Double online = null;

  @SerializedName("Pos")
  private Double pos = null;

  @SerializedName("Other")
  private Double other = null;

  @SerializedName("Total")
  private Double total = null;

  public PayoutReport3DetailsSalesLine online(Double online) {
    this.online = online;
    return this;
  }

   /**
   * Get online
   * @return online
  **/
  @ApiModelProperty(value = "")
  public Double getOnline() {
    return online;
  }

  public void setOnline(Double online) {
    this.online = online;
  }

  public PayoutReport3DetailsSalesLine pos(Double pos) {
    this.pos = pos;
    return this;
  }

   /**
   * Get pos
   * @return pos
  **/
  @ApiModelProperty(value = "")
  public Double getPos() {
    return pos;
  }

  public void setPos(Double pos) {
    this.pos = pos;
  }

  public PayoutReport3DetailsSalesLine other(Double other) {
    this.other = other;
    return this;
  }

   /**
   * Get other
   * @return other
  **/
  @ApiModelProperty(value = "")
  public Double getOther() {
    return other;
  }

  public void setOther(Double other) {
    this.other = other;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
  public Double getTotal() {
    return total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutReport3DetailsSalesLine payoutReport3DetailsSalesLine = (PayoutReport3DetailsSalesLine) o;
    return Objects.equals(this.online, payoutReport3DetailsSalesLine.online) &&
        Objects.equals(this.pos, payoutReport3DetailsSalesLine.pos) &&
        Objects.equals(this.other, payoutReport3DetailsSalesLine.other) &&
        Objects.equals(this.total, payoutReport3DetailsSalesLine.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(online, pos, other, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutReport3DetailsSalesLine {\n");
    
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
