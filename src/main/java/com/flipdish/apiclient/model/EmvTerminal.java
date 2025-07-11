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
 * EMV Payment Terminal
 */
@ApiModel(description = "EMV Payment Terminal")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class EmvTerminal {
  @SerializedName("EmvTerminalId")
  private Integer emvTerminalId = null;

  @SerializedName("TerminalId")
  private String terminalId = null;

  @SerializedName("Url")
  private String url = null;

  @SerializedName("Token")
  private String token = null;

  @SerializedName("SoftwareHouseId")
  private String softwareHouseId = null;

  @SerializedName("InstallerId")
  private String installerId = null;

  public EmvTerminal emvTerminalId(Integer emvTerminalId) {
    this.emvTerminalId = emvTerminalId;
    return this;
  }

   /**
   * Flipdish Identifier of Terminal
   * @return emvTerminalId
  **/
  @ApiModelProperty(value = "Flipdish Identifier of Terminal")
  public Integer getEmvTerminalId() {
    return emvTerminalId;
  }

  public void setEmvTerminalId(Integer emvTerminalId) {
    this.emvTerminalId = emvTerminalId;
  }

  public EmvTerminal terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

   /**
   * External Identifier of Terminal
   * @return terminalId
  **/
  @ApiModelProperty(value = "External Identifier of Terminal")
  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  public EmvTerminal url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL at which terminal can be accessed
   * @return url
  **/
  @ApiModelProperty(value = "URL at which terminal can be accessed")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public EmvTerminal token(String token) {
    this.token = token;
    return this;
  }

   /**
   * TOKEN required to access terminal
   * @return token
  **/
  @ApiModelProperty(value = "TOKEN required to access terminal")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public EmvTerminal softwareHouseId(String softwareHouseId) {
    this.softwareHouseId = softwareHouseId;
    return this;
  }

   /**
   * Identifies us to Provider
   * @return softwareHouseId
  **/
  @ApiModelProperty(value = "Identifies us to Provider")
  public String getSoftwareHouseId() {
    return softwareHouseId;
  }

  public void setSoftwareHouseId(String softwareHouseId) {
    this.softwareHouseId = softwareHouseId;
  }

  public EmvTerminal installerId(String installerId) {
    this.installerId = installerId;
    return this;
  }

   /**
   * Identifies installer of terminal
   * @return installerId
  **/
  @ApiModelProperty(value = "Identifies installer of terminal")
  public String getInstallerId() {
    return installerId;
  }

  public void setInstallerId(String installerId) {
    this.installerId = installerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmvTerminal emvTerminal = (EmvTerminal) o;
    return Objects.equals(this.emvTerminalId, emvTerminal.emvTerminalId) &&
        Objects.equals(this.terminalId, emvTerminal.terminalId) &&
        Objects.equals(this.url, emvTerminal.url) &&
        Objects.equals(this.token, emvTerminal.token) &&
        Objects.equals(this.softwareHouseId, emvTerminal.softwareHouseId) &&
        Objects.equals(this.installerId, emvTerminal.installerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emvTerminalId, terminalId, url, token, softwareHouseId, installerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmvTerminal {\n");
    
    sb.append("    emvTerminalId: ").append(toIndentedString(emvTerminalId)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    softwareHouseId: ").append(toIndentedString(softwareHouseId)).append("\n");
    sb.append("    installerId: ").append(toIndentedString(installerId)).append("\n");
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

