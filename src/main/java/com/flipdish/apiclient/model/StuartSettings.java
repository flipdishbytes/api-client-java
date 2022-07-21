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
import com.flipdish.apiclient.model.StuartSettingsTransportPrices;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Stuart settings
 */
@ApiModel(description = "Stuart settings")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-21T13:38:20.864+01:00")
public class StuartSettings {
  @SerializedName("ClientId")
  private String clientId = null;

  @SerializedName("ClientSecret")
  private String clientSecret = null;

  @SerializedName("Enabled")
  private Boolean enabled = null;

  @SerializedName("WebhookUrlBasicAuthentication")
  private String webhookUrlBasicAuthentication = null;

  @SerializedName("OverrideWebhookUrl")
  private Boolean overrideWebhookUrl = null;

  @SerializedName("MinutesToPickupBeforeThanDeliveryTime")
  private Integer minutesToPickupBeforeThanDeliveryTime = null;

  /**
   * Package type
   */
  @JsonAdapter(PackageTypeEnum.Adapter.class)
  public enum PackageTypeEnum {
    XSMALL("Xsmall"),
    
    SMALL("Small"),
    
    MEDIUM("Medium"),
    
    LARGE("Large"),
    
    XLARGE("Xlarge");

    private String value;

    PackageTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PackageTypeEnum fromValue(String text) {
      for (PackageTypeEnum b : PackageTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PackageTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PackageTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PackageTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PackageTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("PackageType")
  private PackageTypeEnum packageType = null;

  /**
   * Transport type
   */
  @JsonAdapter(TransportTypeEnum.Adapter.class)
  public enum TransportTypeEnum {
    BIKE("Bike"),
    
    CARGOBIKE("Cargobike"),
    
    CARGOBIKEXL("Cargobikexl"),
    
    MOTORBIKE("Motorbike"),
    
    MOTORBIKEXL("Motorbikexl"),
    
    CAR("Car"),
    
    VAN("Van");

    private String value;

    TransportTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransportTypeEnum fromValue(String text) {
      for (TransportTypeEnum b : TransportTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TransportTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransportTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransportTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TransportTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("TransportType")
  private TransportTypeEnum transportType = null;

  @SerializedName("CancelOrderIfStuartCancelDelivery")
  private Boolean cancelOrderIfStuartCancelDelivery = null;

  @SerializedName("TransportPrices")
  private StuartSettingsTransportPrices transportPrices = null;

  public StuartSettings clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Client Id
   * @return clientId
  **/
  @ApiModelProperty(value = "Client Id")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public StuartSettings clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Client Secret
   * @return clientSecret
  **/
  @ApiModelProperty(value = "Client Secret")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public StuartSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "Enabled")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public StuartSettings webhookUrlBasicAuthentication(String webhookUrlBasicAuthentication) {
    this.webhookUrlBasicAuthentication = webhookUrlBasicAuthentication;
    return this;
  }

   /**
   * Webhook url to settle in the Stuart portal
   * @return webhookUrlBasicAuthentication
  **/
  @ApiModelProperty(value = "Webhook url to settle in the Stuart portal")
  public String getWebhookUrlBasicAuthentication() {
    return webhookUrlBasicAuthentication;
  }

  public void setWebhookUrlBasicAuthentication(String webhookUrlBasicAuthentication) {
    this.webhookUrlBasicAuthentication = webhookUrlBasicAuthentication;
  }

  public StuartSettings overrideWebhookUrl(Boolean overrideWebhookUrl) {
    this.overrideWebhookUrl = overrideWebhookUrl;
    return this;
  }

   /**
   * Override Flipdish Webhook Url
   * @return overrideWebhookUrl
  **/
  @ApiModelProperty(value = "Override Flipdish Webhook Url")
  public Boolean isOverrideWebhookUrl() {
    return overrideWebhookUrl;
  }

  public void setOverrideWebhookUrl(Boolean overrideWebhookUrl) {
    this.overrideWebhookUrl = overrideWebhookUrl;
  }

  public StuartSettings minutesToPickupBeforeThanDeliveryTime(Integer minutesToPickupBeforeThanDeliveryTime) {
    this.minutesToPickupBeforeThanDeliveryTime = minutesToPickupBeforeThanDeliveryTime;
    return this;
  }

   /**
   * MinutesToPickupBeforeThanDeliveryTime
   * @return minutesToPickupBeforeThanDeliveryTime
  **/
  @ApiModelProperty(value = "MinutesToPickupBeforeThanDeliveryTime")
  public Integer getMinutesToPickupBeforeThanDeliveryTime() {
    return minutesToPickupBeforeThanDeliveryTime;
  }

  public void setMinutesToPickupBeforeThanDeliveryTime(Integer minutesToPickupBeforeThanDeliveryTime) {
    this.minutesToPickupBeforeThanDeliveryTime = minutesToPickupBeforeThanDeliveryTime;
  }

  public StuartSettings packageType(PackageTypeEnum packageType) {
    this.packageType = packageType;
    return this;
  }

   /**
   * Package type
   * @return packageType
  **/
  @ApiModelProperty(value = "Package type")
  public PackageTypeEnum getPackageType() {
    return packageType;
  }

  public void setPackageType(PackageTypeEnum packageType) {
    this.packageType = packageType;
  }

  public StuartSettings transportType(TransportTypeEnum transportType) {
    this.transportType = transportType;
    return this;
  }

   /**
   * Transport type
   * @return transportType
  **/
  @ApiModelProperty(value = "Transport type")
  public TransportTypeEnum getTransportType() {
    return transportType;
  }

  public void setTransportType(TransportTypeEnum transportType) {
    this.transportType = transportType;
  }

  public StuartSettings cancelOrderIfStuartCancelDelivery(Boolean cancelOrderIfStuartCancelDelivery) {
    this.cancelOrderIfStuartCancelDelivery = cancelOrderIfStuartCancelDelivery;
    return this;
  }

   /**
   * Determines if Flipdish order should be cancel when Stuart cancels delivery
   * @return cancelOrderIfStuartCancelDelivery
  **/
  @ApiModelProperty(value = "Determines if Flipdish order should be cancel when Stuart cancels delivery")
  public Boolean isCancelOrderIfStuartCancelDelivery() {
    return cancelOrderIfStuartCancelDelivery;
  }

  public void setCancelOrderIfStuartCancelDelivery(Boolean cancelOrderIfStuartCancelDelivery) {
    this.cancelOrderIfStuartCancelDelivery = cancelOrderIfStuartCancelDelivery;
  }

  public StuartSettings transportPrices(StuartSettingsTransportPrices transportPrices) {
    this.transportPrices = transportPrices;
    return this;
  }

   /**
   * Get transportPrices
   * @return transportPrices
  **/
  @ApiModelProperty(value = "")
  public StuartSettingsTransportPrices getTransportPrices() {
    return transportPrices;
  }

  public void setTransportPrices(StuartSettingsTransportPrices transportPrices) {
    this.transportPrices = transportPrices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StuartSettings stuartSettings = (StuartSettings) o;
    return Objects.equals(this.clientId, stuartSettings.clientId) &&
        Objects.equals(this.clientSecret, stuartSettings.clientSecret) &&
        Objects.equals(this.enabled, stuartSettings.enabled) &&
        Objects.equals(this.webhookUrlBasicAuthentication, stuartSettings.webhookUrlBasicAuthentication) &&
        Objects.equals(this.overrideWebhookUrl, stuartSettings.overrideWebhookUrl) &&
        Objects.equals(this.minutesToPickupBeforeThanDeliveryTime, stuartSettings.minutesToPickupBeforeThanDeliveryTime) &&
        Objects.equals(this.packageType, stuartSettings.packageType) &&
        Objects.equals(this.transportType, stuartSettings.transportType) &&
        Objects.equals(this.cancelOrderIfStuartCancelDelivery, stuartSettings.cancelOrderIfStuartCancelDelivery) &&
        Objects.equals(this.transportPrices, stuartSettings.transportPrices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, enabled, webhookUrlBasicAuthentication, overrideWebhookUrl, minutesToPickupBeforeThanDeliveryTime, packageType, transportType, cancelOrderIfStuartCancelDelivery, transportPrices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StuartSettings {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    webhookUrlBasicAuthentication: ").append(toIndentedString(webhookUrlBasicAuthentication)).append("\n");
    sb.append("    overrideWebhookUrl: ").append(toIndentedString(overrideWebhookUrl)).append("\n");
    sb.append("    minutesToPickupBeforeThanDeliveryTime: ").append(toIndentedString(minutesToPickupBeforeThanDeliveryTime)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
    sb.append("    transportType: ").append(toIndentedString(transportType)).append("\n");
    sb.append("    cancelOrderIfStuartCancelDelivery: ").append(toIndentedString(cancelOrderIfStuartCancelDelivery)).append("\n");
    sb.append("    transportPrices: ").append(toIndentedString(transportPrices)).append("\n");
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

