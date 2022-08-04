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
 * Device settings for Hydra
 */
@ApiModel(description = "Device settings for Hydra")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-04T09:49:23.182+01:00")
public class DeviceSettings {
  @SerializedName("Volume")
  private Integer volume = null;

  @SerializedName("FontSize")
  private Double fontSize = null;

  @SerializedName("Brightness")
  private Integer brightness = null;

  public DeviceSettings volume(Integer volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Gets or sets the device volume
   * minimum: 0
   * maximum: 10
   * @return volume
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the device volume")
  public Integer getVolume() {
    return volume;
  }

  public void setVolume(Integer volume) {
    this.volume = volume;
  }

  public DeviceSettings fontSize(Double fontSize) {
    this.fontSize = fontSize;
    return this;
  }

   /**
   * Gets or sets the font size used on the device
   * minimum: 1
   * maximum: 100
   * @return fontSize
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the font size used on the device")
  public Double getFontSize() {
    return fontSize;
  }

  public void setFontSize(Double fontSize) {
    this.fontSize = fontSize;
  }

  public DeviceSettings brightness(Integer brightness) {
    this.brightness = brightness;
    return this;
  }

   /**
   * Gets or sets the display brightness on the device
   * minimum: 0
   * maximum: 100
   * @return brightness
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the display brightness on the device")
  public Integer getBrightness() {
    return brightness;
  }

  public void setBrightness(Integer brightness) {
    this.brightness = brightness;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceSettings deviceSettings = (DeviceSettings) o;
    return Objects.equals(this.volume, deviceSettings.volume) &&
        Objects.equals(this.fontSize, deviceSettings.fontSize) &&
        Objects.equals(this.brightness, deviceSettings.brightness);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volume, fontSize, brightness);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceSettings {\n");
    
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    brightness: ").append(toIndentedString(brightness)).append("\n");
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

