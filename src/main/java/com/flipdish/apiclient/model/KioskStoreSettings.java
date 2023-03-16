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
import com.flipdish.apiclient.model.StoreKioskSetting;
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
 * Details of a kiosks store settings
 */
@ApiModel(description = "Details of a kiosks store settings")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-03-16T09:12:36.543Z")
public class KioskStoreSettings {
  @SerializedName("StoreKioskSettings")
  private List<StoreKioskSetting> storeKioskSettings = null;

  @SerializedName("Timezone")
  private String timezone = null;

  @SerializedName("CurrentUtcTime")
  private OffsetDateTime currentUtcTime = null;

  public KioskStoreSettings storeKioskSettings(List<StoreKioskSetting> storeKioskSettings) {
    this.storeKioskSettings = storeKioskSettings;
    return this;
  }

  public KioskStoreSettings addStoreKioskSettingsItem(StoreKioskSetting storeKioskSettingsItem) {
    if (this.storeKioskSettings == null) {
      this.storeKioskSettings = new ArrayList<StoreKioskSetting>();
    }
    this.storeKioskSettings.add(storeKioskSettingsItem);
    return this;
  }

   /**
   * Kiosks store settings
   * @return storeKioskSettings
  **/
  @ApiModelProperty(value = "Kiosks store settings")
  public List<StoreKioskSetting> getStoreKioskSettings() {
    return storeKioskSettings;
  }

  public void setStoreKioskSettings(List<StoreKioskSetting> storeKioskSettings) {
    this.storeKioskSettings = storeKioskSettings;
  }

  public KioskStoreSettings timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Kiosks timezone
   * @return timezone
  **/
  @ApiModelProperty(value = "Kiosks timezone")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public KioskStoreSettings currentUtcTime(OffsetDateTime currentUtcTime) {
    this.currentUtcTime = currentUtcTime;
    return this;
  }

   /**
   * Servers current Utc time
   * @return currentUtcTime
  **/
  @ApiModelProperty(value = "Servers current Utc time")
  public OffsetDateTime getCurrentUtcTime() {
    return currentUtcTime;
  }

  public void setCurrentUtcTime(OffsetDateTime currentUtcTime) {
    this.currentUtcTime = currentUtcTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KioskStoreSettings kioskStoreSettings = (KioskStoreSettings) o;
    return Objects.equals(this.storeKioskSettings, kioskStoreSettings.storeKioskSettings) &&
        Objects.equals(this.timezone, kioskStoreSettings.timezone) &&
        Objects.equals(this.currentUtcTime, kioskStoreSettings.currentUtcTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeKioskSettings, timezone, currentUtcTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KioskStoreSettings {\n");
    
    sb.append("    storeKioskSettings: ").append(toIndentedString(storeKioskSettings)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    currentUtcTime: ").append(toIndentedString(currentUtcTime)).append("\n");
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

