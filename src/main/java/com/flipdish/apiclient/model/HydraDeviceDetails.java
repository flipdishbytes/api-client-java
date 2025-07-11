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
import com.flipdish.apiclient.model.HydraStoreData;
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
 * Hydra device details
 */
@ApiModel(description = "Hydra device details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class HydraDeviceDetails {
  @SerializedName("HydraConfigId")
  private Integer hydraConfigId = null;

  @SerializedName("DeviceId")
  private String deviceId = null;

  @SerializedName("SerialNumber")
  private String serialNumber = null;

  /**
   * Type of the device
   */
  @JsonAdapter(DeviceTypeEnum.Adapter.class)
  public enum DeviceTypeEnum {
    KIOSK("Kiosk"),
    
    TERMINAL("Terminal"),
    
    LEGACYPRINTER("LegacyPrinter");

    private String value;

    DeviceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeviceTypeEnum fromValue(String text) {
      for (DeviceTypeEnum b : DeviceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DeviceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeviceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeviceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DeviceTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("DeviceType")
  private DeviceTypeEnum deviceType = null;

  /**
   * Status of the device
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ONLINE("Online"),
    
    POSSIBLYOFFLINE("PossiblyOffline"),
    
    OFFLINE("Offline");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Status")
  private StatusEnum status = null;

  @SerializedName("DeviceName")
  private String deviceName = null;

  @SerializedName("StoreNames")
  private List<HydraStoreData> storeNames = null;

  @SerializedName("LastPollUtc")
  private OffsetDateTime lastPollUtc = null;

  @SerializedName("Version")
  private String version = null;

  @SerializedName("BuildNumber")
  private String buildNumber = null;

  @SerializedName("GitSha")
  private String gitSha = null;

  @SerializedName("GitBranch")
  private String gitBranch = null;

  public HydraDeviceDetails hydraConfigId(Integer hydraConfigId) {
    this.hydraConfigId = hydraConfigId;
    return this;
  }

   /**
   * Flipdish internal device identifier
   * @return hydraConfigId
  **/
  @ApiModelProperty(value = "Flipdish internal device identifier")
  public Integer getHydraConfigId() {
    return hydraConfigId;
  }

  public void setHydraConfigId(Integer hydraConfigId) {
    this.hydraConfigId = hydraConfigId;
  }

  public HydraDeviceDetails deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Device Id
   * @return deviceId
  **/
  @ApiModelProperty(value = "Device Id")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public HydraDeviceDetails serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Serial Number
   * @return serialNumber
  **/
  @ApiModelProperty(value = "Serial Number")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public HydraDeviceDetails deviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Type of the device
   * @return deviceType
  **/
  @ApiModelProperty(value = "Type of the device")
  public DeviceTypeEnum getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
  }

  public HydraDeviceDetails status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the device
   * @return status
  **/
  @ApiModelProperty(value = "Status of the device")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public HydraDeviceDetails deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

   /**
   * Device Name
   * @return deviceName
  **/
  @ApiModelProperty(value = "Device Name")
  public String getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  public HydraDeviceDetails storeNames(List<HydraStoreData> storeNames) {
    this.storeNames = storeNames;
    return this;
  }

  public HydraDeviceDetails addStoreNamesItem(HydraStoreData storeNamesItem) {
    if (this.storeNames == null) {
      this.storeNames = new ArrayList<HydraStoreData>();
    }
    this.storeNames.add(storeNamesItem);
    return this;
  }

   /**
   * Store Names
   * @return storeNames
  **/
  @ApiModelProperty(value = "Store Names")
  public List<HydraStoreData> getStoreNames() {
    return storeNames;
  }

  public void setStoreNames(List<HydraStoreData> storeNames) {
    this.storeNames = storeNames;
  }

  public HydraDeviceDetails lastPollUtc(OffsetDateTime lastPollUtc) {
    this.lastPollUtc = lastPollUtc;
    return this;
  }

   /**
   * Last poll time in UTC
   * @return lastPollUtc
  **/
  @ApiModelProperty(value = "Last poll time in UTC")
  public OffsetDateTime getLastPollUtc() {
    return lastPollUtc;
  }

  public void setLastPollUtc(OffsetDateTime lastPollUtc) {
    this.lastPollUtc = lastPollUtc;
  }

  public HydraDeviceDetails version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version of the device
   * @return version
  **/
  @ApiModelProperty(value = "Version of the device")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public HydraDeviceDetails buildNumber(String buildNumber) {
    this.buildNumber = buildNumber;
    return this;
  }

   /**
   * Build number of the device
   * @return buildNumber
  **/
  @ApiModelProperty(value = "Build number of the device")
  public String getBuildNumber() {
    return buildNumber;
  }

  public void setBuildNumber(String buildNumber) {
    this.buildNumber = buildNumber;
  }

  public HydraDeviceDetails gitSha(String gitSha) {
    this.gitSha = gitSha;
    return this;
  }

   /**
   * SHA of the commit
   * @return gitSha
  **/
  @ApiModelProperty(value = "SHA of the commit")
  public String getGitSha() {
    return gitSha;
  }

  public void setGitSha(String gitSha) {
    this.gitSha = gitSha;
  }

  public HydraDeviceDetails gitBranch(String gitBranch) {
    this.gitBranch = gitBranch;
    return this;
  }

   /**
   * Build branch
   * @return gitBranch
  **/
  @ApiModelProperty(value = "Build branch")
  public String getGitBranch() {
    return gitBranch;
  }

  public void setGitBranch(String gitBranch) {
    this.gitBranch = gitBranch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HydraDeviceDetails hydraDeviceDetails = (HydraDeviceDetails) o;
    return Objects.equals(this.hydraConfigId, hydraDeviceDetails.hydraConfigId) &&
        Objects.equals(this.deviceId, hydraDeviceDetails.deviceId) &&
        Objects.equals(this.serialNumber, hydraDeviceDetails.serialNumber) &&
        Objects.equals(this.deviceType, hydraDeviceDetails.deviceType) &&
        Objects.equals(this.status, hydraDeviceDetails.status) &&
        Objects.equals(this.deviceName, hydraDeviceDetails.deviceName) &&
        Objects.equals(this.storeNames, hydraDeviceDetails.storeNames) &&
        Objects.equals(this.lastPollUtc, hydraDeviceDetails.lastPollUtc) &&
        Objects.equals(this.version, hydraDeviceDetails.version) &&
        Objects.equals(this.buildNumber, hydraDeviceDetails.buildNumber) &&
        Objects.equals(this.gitSha, hydraDeviceDetails.gitSha) &&
        Objects.equals(this.gitBranch, hydraDeviceDetails.gitBranch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hydraConfigId, deviceId, serialNumber, deviceType, status, deviceName, storeNames, lastPollUtc, version, buildNumber, gitSha, gitBranch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HydraDeviceDetails {\n");
    
    sb.append("    hydraConfigId: ").append(toIndentedString(hydraConfigId)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    storeNames: ").append(toIndentedString(storeNames)).append("\n");
    sb.append("    lastPollUtc: ").append(toIndentedString(lastPollUtc)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    buildNumber: ").append(toIndentedString(buildNumber)).append("\n");
    sb.append("    gitSha: ").append(toIndentedString(gitSha)).append("\n");
    sb.append("    gitBranch: ").append(toIndentedString(gitBranch)).append("\n");
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

