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
import com.flipdish.apiclient.model.DeviceSettings;
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

/**
 * Hydra configuration
 */
@ApiModel(description = "Hydra configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-20T13:59:48.716+01:00")
public class HydraConfig {
  @SerializedName("MinimumVersion")
  private String minimumVersion = null;

  /**
   * Gets or Sets paymentOptions
   */
  @JsonAdapter(PaymentOptionsEnum.Adapter.class)
  public enum PaymentOptionsEnum {
    ONLINE("Online"),
    
    EMV("Emv"),
    
    COUNTER("Counter");

    private String value;

    PaymentOptionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentOptionsEnum fromValue(String text) {
      for (PaymentOptionsEnum b : PaymentOptionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PaymentOptionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentOptionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentOptionsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PaymentOptionsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("PaymentOptions")
  private List<PaymentOptionsEnum> paymentOptions = new ArrayList<PaymentOptionsEnum>();

  @SerializedName("DeviceSettings")
  private DeviceSettings deviceSettings = null;

  @SerializedName("Version")
  private String version = null;

  @SerializedName("BuildNumber")
  private String buildNumber = null;

  @SerializedName("GitSha")
  private String gitSha = null;

  @SerializedName("GitBranch")
  private String gitBranch = null;

  public HydraConfig minimumVersion(String minimumVersion) {
    this.minimumVersion = minimumVersion;
    return this;
  }

   /**
   * Minimum version
   * @return minimumVersion
  **/
  @ApiModelProperty(required = true, value = "Minimum version")
  public String getMinimumVersion() {
    return minimumVersion;
  }

  public void setMinimumVersion(String minimumVersion) {
    this.minimumVersion = minimumVersion;
  }

  public HydraConfig paymentOptions(List<PaymentOptionsEnum> paymentOptions) {
    this.paymentOptions = paymentOptions;
    return this;
  }

  public HydraConfig addPaymentOptionsItem(PaymentOptionsEnum paymentOptionsItem) {
    this.paymentOptions.add(paymentOptionsItem);
    return this;
  }

   /**
   * Payment options
   * @return paymentOptions
  **/
  @ApiModelProperty(required = true, value = "Payment options")
  public List<PaymentOptionsEnum> getPaymentOptions() {
    return paymentOptions;
  }

  public void setPaymentOptions(List<PaymentOptionsEnum> paymentOptions) {
    this.paymentOptions = paymentOptions;
  }

  public HydraConfig deviceSettings(DeviceSettings deviceSettings) {
    this.deviceSettings = deviceSettings;
    return this;
  }

   /**
   * Device settings
   * @return deviceSettings
  **/
  @ApiModelProperty(required = true, value = "Device settings")
  public DeviceSettings getDeviceSettings() {
    return deviceSettings;
  }

  public void setDeviceSettings(DeviceSettings deviceSettings) {
    this.deviceSettings = deviceSettings;
  }

  public HydraConfig version(String version) {
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

  public HydraConfig buildNumber(String buildNumber) {
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

  public HydraConfig gitSha(String gitSha) {
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

  public HydraConfig gitBranch(String gitBranch) {
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
    HydraConfig hydraConfig = (HydraConfig) o;
    return Objects.equals(this.minimumVersion, hydraConfig.minimumVersion) &&
        Objects.equals(this.paymentOptions, hydraConfig.paymentOptions) &&
        Objects.equals(this.deviceSettings, hydraConfig.deviceSettings) &&
        Objects.equals(this.version, hydraConfig.version) &&
        Objects.equals(this.buildNumber, hydraConfig.buildNumber) &&
        Objects.equals(this.gitSha, hydraConfig.gitSha) &&
        Objects.equals(this.gitBranch, hydraConfig.gitBranch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimumVersion, paymentOptions, deviceSettings, version, buildNumber, gitSha, gitBranch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HydraConfig {\n");
    
    sb.append("    minimumVersion: ").append(toIndentedString(minimumVersion)).append("\n");
    sb.append("    paymentOptions: ").append(toIndentedString(paymentOptions)).append("\n");
    sb.append("    deviceSettings: ").append(toIndentedString(deviceSettings)).append("\n");
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

