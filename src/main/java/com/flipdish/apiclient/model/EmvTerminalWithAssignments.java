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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-13T14:26:54.618+01:00")
public class EmvTerminalWithAssignments {
  @SerializedName("EmvTerminalId")
  private String emvTerminalId = null;

  @SerializedName("TerminalId")
  private String terminalId = null;

  @SerializedName("IsAssignedToHydraDevice")
  private Boolean isAssignedToHydraDevice = null;

  @SerializedName("HydraConfigId")
  private Integer hydraConfigId = null;

  @SerializedName("HydraDeviceId")
  private String hydraDeviceId = null;

  @SerializedName("HydraName")
  private String hydraName = null;

  public EmvTerminalWithAssignments emvTerminalId(String emvTerminalId) {
    this.emvTerminalId = emvTerminalId;
    return this;
  }

   /**
   * Flipdish Internal identifier of the Terminal
   * @return emvTerminalId
  **/
  @ApiModelProperty(value = "Flipdish Internal identifier of the Terminal")
  public String getEmvTerminalId() {
    return emvTerminalId;
  }

  public void setEmvTerminalId(String emvTerminalId) {
    this.emvTerminalId = emvTerminalId;
  }

  public EmvTerminalWithAssignments terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

   /**
   * External Identifier of the Terminal
   * @return terminalId
  **/
  @ApiModelProperty(value = "External Identifier of the Terminal")
  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  public EmvTerminalWithAssignments isAssignedToHydraDevice(Boolean isAssignedToHydraDevice) {
    this.isAssignedToHydraDevice = isAssignedToHydraDevice;
    return this;
  }

   /**
   * true if the terminal is assigned to a hydra device (e.g. a kiosk)
   * @return isAssignedToHydraDevice
  **/
  @ApiModelProperty(value = "true if the terminal is assigned to a hydra device (e.g. a kiosk)")
  public Boolean isIsAssignedToHydraDevice() {
    return isAssignedToHydraDevice;
  }

  public void setIsAssignedToHydraDevice(Boolean isAssignedToHydraDevice) {
    this.isAssignedToHydraDevice = isAssignedToHydraDevice;
  }

  public EmvTerminalWithAssignments hydraConfigId(Integer hydraConfigId) {
    this.hydraConfigId = hydraConfigId;
    return this;
  }

   /**
   * hydra device id (null if the terminal is not assigned to any hydra device)
   * @return hydraConfigId
  **/
  @ApiModelProperty(value = "hydra device id (null if the terminal is not assigned to any hydra device)")
  public Integer getHydraConfigId() {
    return hydraConfigId;
  }

  public void setHydraConfigId(Integer hydraConfigId) {
    this.hydraConfigId = hydraConfigId;
  }

  public EmvTerminalWithAssignments hydraDeviceId(String hydraDeviceId) {
    this.hydraDeviceId = hydraDeviceId;
    return this;
  }

   /**
   * external hydra device id (null if the terminal is not assigned to any hydra device)
   * @return hydraDeviceId
  **/
  @ApiModelProperty(value = "external hydra device id (null if the terminal is not assigned to any hydra device)")
  public String getHydraDeviceId() {
    return hydraDeviceId;
  }

  public void setHydraDeviceId(String hydraDeviceId) {
    this.hydraDeviceId = hydraDeviceId;
  }

  public EmvTerminalWithAssignments hydraName(String hydraName) {
    this.hydraName = hydraName;
    return this;
  }

   /**
   * hydra device name (null if the terminal is not assigned to any hydra device)
   * @return hydraName
  **/
  @ApiModelProperty(value = "hydra device name (null if the terminal is not assigned to any hydra device)")
  public String getHydraName() {
    return hydraName;
  }

  public void setHydraName(String hydraName) {
    this.hydraName = hydraName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmvTerminalWithAssignments emvTerminalWithAssignments = (EmvTerminalWithAssignments) o;
    return Objects.equals(this.emvTerminalId, emvTerminalWithAssignments.emvTerminalId) &&
        Objects.equals(this.terminalId, emvTerminalWithAssignments.terminalId) &&
        Objects.equals(this.isAssignedToHydraDevice, emvTerminalWithAssignments.isAssignedToHydraDevice) &&
        Objects.equals(this.hydraConfigId, emvTerminalWithAssignments.hydraConfigId) &&
        Objects.equals(this.hydraDeviceId, emvTerminalWithAssignments.hydraDeviceId) &&
        Objects.equals(this.hydraName, emvTerminalWithAssignments.hydraName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emvTerminalId, terminalId, isAssignedToHydraDevice, hydraConfigId, hydraDeviceId, hydraName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmvTerminalWithAssignments {\n");
    
    sb.append("    emvTerminalId: ").append(toIndentedString(emvTerminalId)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    isAssignedToHydraDevice: ").append(toIndentedString(isAssignedToHydraDevice)).append("\n");
    sb.append("    hydraConfigId: ").append(toIndentedString(hydraConfigId)).append("\n");
    sb.append("    hydraDeviceId: ").append(toIndentedString(hydraDeviceId)).append("\n");
    sb.append("    hydraName: ").append(toIndentedString(hydraName)).append("\n");
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

